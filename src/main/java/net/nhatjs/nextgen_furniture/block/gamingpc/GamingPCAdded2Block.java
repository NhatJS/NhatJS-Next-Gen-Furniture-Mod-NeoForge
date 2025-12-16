package net.nhatjs.nextgen_furniture.block.gamingpc;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.nhatjs.nextgen_furniture.block.ModBlocks;
import net.nhatjs.nextgen_furniture.item.ModItems;

public class GamingPCAdded2Block extends Block {
    public static final EnumProperty<Direction> FACING = BlockStateProperties.HORIZONTAL_FACING;

    public GamingPCAdded2Block(Properties settings) {
        super(settings);
        registerDefaultState(this.getStateDefinition().any()
                .setValue(FACING, Direction.NORTH));
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(FACING)) {
            default -> Block.box(5.025, 0, 0.95, 10.975, 13.75, 15.05);
            case SOUTH -> Block.box(5.025, 0, 0.95, 10.975, 13.75, 15.05);
            case EAST -> Block.box(0.95, 0, 5.025, 15.05, 13.75, 10.975);
            case WEST -> Block.box(0.95, 0, 5.025, 15.05, 13.75, 10.975);
        };
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        return this.defaultBlockState().setValue(FACING, ctx.getHorizontalDirection().getOpposite());
    }

    @Override
    public InteractionResult useWithoutItem(BlockState state, Level world, BlockPos pos, Player player, BlockHitResult hit) {
        ItemStack stack = player.getMainHandItem();
        if (stack.is(ModBlocks.AIO_COOLER_3_FANS.asItem())) {
            Direction facing =  state.getValue(HorizontalDirectionalBlock.FACING);
            world.setBlock(pos, ModBlocks.PC_GAMING_ADDED_3.get().defaultBlockState()
                    .setValue(HorizontalDirectionalBlock.FACING, facing), Block.UPDATE_ALL);
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.SUCCESS;
    }
}
