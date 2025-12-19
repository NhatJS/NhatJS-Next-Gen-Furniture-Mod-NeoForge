package net.nhatjs.nextgen_furniture.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class MonitorTypesBlock extends Block {
    public static final EnumProperty<Direction> FACING = BlockStateProperties.HORIZONTAL_FACING;

    public MonitorTypesBlock(Properties settings) {
        super(settings);
        registerDefaultState(this.getStateDefinition().any()
                .setValue(FACING, Direction.NORTH));
    }

    private static final VoxelShape NORTH = Shapes.or(
            Block.box(5.275, 0, 9.6, 10.725, 0.225, 15.3),
            Block.box(6.925, 0.225, 13.475, 9.075, 10.575, 15.025),
            Block.box(7.25, 7.425, 12.25, 8.75, 8.725, 13.475),
            Block.box(-0.15, 3.35, 11.075, 16.15, 12.75, 12.25)
    );

    private static final VoxelShape SOUTH = Shapes.or(
            Block.box(5.275, 0, 0.7, 10.725, 0.225, 6.4),
            Block.box(6.925, 0.225, 0.975, 9.075, 10.575, 2.525),
            Block.box(7.25, 7.425, 2.525, 8.75, 8.725, 3.75),
            Block.box(-0.15, 3.35, 3.75, 16.15, 12.75, 4.925)
    );

    private static final VoxelShape EAST = Shapes.or(
            Block.box(0.7, 0, 5.275, 6.4, 0.225, 10.725),
            Block.box(0.975, 0.225, 6.925, 2.525, 10.575, 9.075),
            Block.box(2.525, 7.425, 7.25, 3.75, 8.725, 8.75),
            Block.box(3.75, 3.35, -0.15, 4.925, 12.75, 16.15)
    );

    private static final VoxelShape WEST = Shapes.or(
            Block.box(9.6, 0, 5.275, 15.3, 0.225, 10.725),
            Block.box(13.475, 0.225, 6.925, 15.025, 10.575, 9.075),
            Block.box(12.25, 7.425, 7.25, 13.475, 8.725, 8.75),
            Block.box(11.075, 3.35, -0.15, 12.25, 12.75, 16.15)
    );

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(FACING)) {
            default -> NORTH;
            case SOUTH -> SOUTH;
            case EAST -> EAST;
            case WEST -> WEST;
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
}
