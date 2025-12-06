package net.nhatjs.nextgen_furniture.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.nhatjs.nextgen_furniture.blockentity.ModBlockEntities;
import net.nhatjs.nextgen_furniture.blockentity.client.LaptopBlockEntity;
import org.jetbrains.annotations.Nullable;

public class LaptopBlock extends BaseEntityBlock {
    public static final EnumProperty<Direction> FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final BooleanProperty TURN_ON = BooleanProperty.create("turn_on");

    public LaptopBlock(Properties settings) {
        super(settings);
        registerDefaultState(this.getStateDefinition().any()
                .setValue(FACING, Direction.NORTH)
                .setValue(TURN_ON, false));
    }

    public static final MapCodec<LaptopBlock> CODEC = simpleCodec(LaptopBlock::new);

    @Override
    public MapCodec<LaptopBlock> codec() {
        return CODEC;
    }


    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(FACING)) {
            default -> box(2, 0, 2, 14, 2, 14);
        };
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, TURN_ON);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        return this.defaultBlockState().setValue(FACING, ctx.getHorizontalDirection().getOpposite()).setValue(TURN_ON, false);
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new LaptopBlockEntity(pos, state);
    }

    @Override
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }

    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state,
                                                                  BlockEntityType<T> type) {
        return type == ModBlockEntities.LAPTOP.get() ? (lvl, pos, st, be) -> {
            if (be instanceof LaptopBlockEntity lap) {
                LaptopBlockEntity.tick(lvl, pos, st, lap);
            }
        } : null;
    }

    @Override
    public InteractionResult useWithoutItem(BlockState state, Level world, BlockPos pos,
                              Player player, BlockHitResult hit) {
        if (world.isClientSide()) return InteractionResult.SUCCESS;

        BlockEntity be = world.getBlockEntity(pos);
        if (!(be instanceof LaptopBlockEntity lap)) return InteractionResult.PASS;

        boolean sneaking = player.isShiftKeyDown() || player.isCrouching();

        if (sneaking) {
            if (lap.isPowered()) {
                return InteractionResult.CONSUME;
            }
            lap.setTargetOpen(!lap.isTargetOpen());
            world.sendBlockUpdated(pos, state, state, 3);
            return InteractionResult.CONSUME;
        } else {
            if (lap.isOpenEnough()) {
                lap.setPowered(!lap.isPowered());

                world.setBlock(pos, state.setValue(LaptopBlock.TURN_ON, lap.isPowered()), Block.UPDATE_ALL);

                world.sendBlockUpdated(pos, state, state, 3);
                return InteractionResult.CONSUME;
            }
            return InteractionResult.CONSUME;
        }
    }

}