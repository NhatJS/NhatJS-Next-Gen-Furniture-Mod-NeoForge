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
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class PictureFrameBlock extends Block {
    public static final DirectionProperty FACING = BlockStateProperties.FACING;

    public PictureFrameBlock(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(FACING)) {
            default -> Block.box(3.5, 2, 15.65, 12.5, 14, 16);
            case SOUTH -> Block.box(3.5, 2, 0, 12.5, 14, 0.35);
            case EAST -> Block.box(0, 2, 3.5, 0.35, 14, 12.5);
            case WEST -> Block.box(15.65, 2, 3.5, 16, 14, 12.5);
            case UP -> Block.box(3.5, 0, 2, 12.5, 0.35, 14);
            case DOWN -> Block.box(3.5, 15.65, 2, 12.5, 16, 14);
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