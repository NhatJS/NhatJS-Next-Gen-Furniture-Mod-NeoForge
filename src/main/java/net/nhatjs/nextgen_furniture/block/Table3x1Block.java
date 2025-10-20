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
import org.jetbrains.annotations.Nullable;

public class Table3x1Block extends Block {
    public static final EnumProperty<Direction> FACING = BlockStateProperties.HORIZONTAL_FACING;

    public Table3x1Block(Properties properties) {
        super(properties);
    }

    private static final VoxelShape HORIZONTAL = Shapes.or(
            Block.box(-16, 15.25, 0, 32, 16, 16),
            Block.box(-15.5, 0, 0.5, -14.5, 15.25, 1.5),
            Block.box(-15.5, 0, 14.5, -14.5, 15.25, 15.5),
            Block.box(30.5, 0, 0.5, 31.5, 15.25, 1.5),
            Block.box(30.5, 0, 14.5, 31.5, 15.25, 15.5)
    );


    private static final VoxelShape VERTICAL = Shapes.or(
            Block.box(0, 15.25, -16, 16, 16, 32),
            Block.box(14.5, 0, -15.5, 15.5, 15.25, -14.5),
            Block.box(0.5, 0, -15.5, 1.5, 15.25, -14.5),
            Block.box(14.5, 0, 30.5, 15.5, 15.25, 31.5),
            Block.box(0.5, 0, 30.5, 1.5, 15.25, 31.5)
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