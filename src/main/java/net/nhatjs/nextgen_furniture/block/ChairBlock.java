package net.nhatjs.nextgen_furniture.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.nhatjs.nextgen_furniture.entity.ModEntities;
import net.nhatjs.nextgen_furniture.entity.client.ChairBlockEntity;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ChairBlock extends Block {
    public static final EnumProperty<Direction> FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final BooleanProperty MOVE = BooleanProperty.create("move");

    public ChairBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.getStateDefinition().any().setValue(FACING, Direction.NORTH).setValue(MOVE, false));
    }

    private static VoxelShape shapeFor(Direction d) {
        return switch (d) {
            default -> Block.box(3, 0, 2.25, 13, 10.65, 13.75);
        };
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext ctx) {
        return state.getValue(MOVE) ? Shapes.empty() : shapeFor(state.getValue(FACING));
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return shapeFor(state.getValue(FACING));
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        return this.defaultBlockState().setValue(FACING, ctx.getHorizontalDirection().getOpposite());
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, MOVE);
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {
        boolean move = state.getValue(MOVE);

        if (player.isShiftKeyDown()) {
            if (move == false) {
                level.setBlock(pos, state.setValue(MOVE, true), Block.UPDATE_ALL);
                return InteractionResult.SUCCESS;
            }
            if (move == true) {
                level.setBlock(pos, state.setValue(MOVE, false), Block.UPDATE_ALL);
                return InteractionResult.SUCCESS;
            }
            return InteractionResult.SUCCESS;
        }
        if (move == true) {
            return InteractionResult.SUCCESS;
        }
        if(!level.isClientSide()) {
            Entity entity = null;
            List<ChairBlockEntity> entities = level.getEntities(ModEntities.CHAIR.get(), new AABB(pos), chair -> true);
            if(entities.isEmpty()) {
                entity = ModEntities.CHAIR.get().spawn(((ServerLevel) level), pos, EntitySpawnReason.TRIGGERED);
            } else {
                entity = entities.get(0);
            }

            player.startRiding(entity);
        }

        return InteractionResult.SUCCESS;
    }
}
