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
            Block.box(5.4, 0, 9.525, 10.6, 0.225, 14.975),
            Block.box(6.975, 0.225, 13.225, 9.025, 10.075, 14.675),
            Block.box(7.275, 7.075, 12.05, 8.725, 8.325, 13.225),
            Block.box(0.225, 3.2, 10.925, 15.775, 12.15, 12.05)
    );

    private static final VoxelShape SOUTH = Shapes.or(
            Block.box(5.4, 0, 1.025, 10.6, 0.225, 6.475),
            Block.box(6.975, 0.225, 1.325, 9.025, 10.075, 2.775),
            Block.box(7.275, 7.075, 2.775, 8.725, 8.325, 3.95),
            Block.box(0.225, 3.2, 3.95, 15.775, 12.15, 5.075)
    );

    private static final VoxelShape EAST = Shapes.or(
            Block.box(1.025, 0, 5.4, 6.475, 0.225, 10.6),
            Block.box(1.325, 0.225, 6.975, 2.775, 10.075, 9.025),
            Block.box(2.775, 7.075, 7.275, 3.95, 8.325, 8.725),
            Block.box(3.95, 3.2, 0.225, 5.075, 12.15, 15.775)
    );

    private static final VoxelShape WEST = Shapes.or(
            Block.box(9.525, 0, 5.4, 14.975, 0.225, 10.6),
            Block.box(13.225, 0.225, 6.975, 14.675, 10.075, 9.025),
            Block.box(12.05, 7.075, 7.275, 13.225, 8.325, 8.725),
            Block.box(10.925, 3.2, 0.225, 12.05, 12.15, 15.775)
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