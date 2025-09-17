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

public class CoffeeTableBlock extends Block {
    public static final DirectionProperty DIRECTION = BlockStateProperties.HORIZONTAL_FACING;

    public CoffeeTableBlock(Properties properties) {
        super(properties);
    }

    private static final VoxelShape HORIZONTAL = Shapes.or(
            Block.box(-4, 0, 1, -3, 8.3, 2),
            Block.box(-4, 0, 14, -3, 8.3, 15),
            Block.box(19, 0, 1, 20, 8.3, 2),
            Block.box(-4.2, 8.3, 0.8, 20.2, 9, 15.2),
            Block.box(19, 0, 14, 20, 8.3, 15),
            Block.box(-3.25, 4.45, 1.75, 19.25, 8.3, 14.25)
    );

    private static final VoxelShape VERTICAL = Shapes.or(
            Block.box(14, 0, -4, 15, 8.3, -3),
            Block.box(1, 0, -4, 2, 8.3, -3),
            Block.box(14, 0, 19, 15, 8.3, 20),
            Block.box(0.8, 8.3, -4.2, 15.2, 9, 20.2),
            Block.box(1, 0, 19, 2, 8.3, 20),
            Block.box(1.75, 4.45, -3.25, 14.25, 8.3, 19.25)
    );

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(DIRECTION)) {
            default -> HORIZONTAL;
            case SOUTH -> HORIZONTAL;
            case EAST -> VERTICAL;
            case WEST -> VERTICAL;
        };
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        return this.defaultBlockState().setValue(DIRECTION, ctx.getHorizontalDirection().getOpposite());
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(DIRECTION);
    }
}