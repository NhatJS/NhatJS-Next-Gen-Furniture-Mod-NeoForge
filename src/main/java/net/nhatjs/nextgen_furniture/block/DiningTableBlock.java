package net.nhatjs.nextgen_furniture.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class DiningTableBlock extends Block {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public DiningTableBlock(Properties properties) {
        super(properties);
    }

    private static final VoxelShape HORIZONTAL = Shapes.or(
            Block.box(-16, 13.75, 0, 32, 16, 16),
            Block.box(29.1, 0.1, 1.65, 30.4, 0.75, 14.35),
            Block.box(-14.4, 0.1, 1.65, -13.1, 0.75, 14.35),
            Block.box(-14.5, 0, 0.75, -13, 13.75, 1.65),
            Block.box(-14.5, 0, 14.35, -13, 13.75, 15.25),
            Block.box(29, 0, 14.35, 30.5, 13.75, 15.25),
            Block.box(29, 0, 0.75, 30.5, 13.75, 1.65)
    );


    private static final VoxelShape VERTICAL = Shapes.or(
            Block.box(0, 13.75, -16, 16, 16, 32),
            Block.box(1.65, 0.1, 29.1, 14.35, 0.75, 30.4),
            Block.box(1.65, 0.1, -14.4, 14.35, 0.75, -13.1),
            Block.box(14.3, 0, -14.5, 15.25, 13.75, -13),
            Block.box(0.75, 0, -14.5, 1.65, 13.75, -13),
            Block.box(0.75, 0, 29, 1.65, 13.75, 30.5),
            Block.box(14.35, 0, 29, 15.25, 13.75, 30.5)
    );

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(FACING)) {
            default -> HORIZONTAL;
            case SOUTH -> HORIZONTAL;
            case EAST -> VERTICAL;
            case WEST -> VERTICAL;
        };
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        return this.defaultBlockState().setValue(FACING, ctx.getHorizontalDirection().getOpposite());
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> b) {
        b.add(FACING);
    }
}