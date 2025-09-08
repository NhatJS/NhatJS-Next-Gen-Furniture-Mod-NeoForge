package net.nhatjs.nextgen_furniture.block;


import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

import java.util.Map;

public class Table2x1CenterBlock extends Block {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public Table2x1CenterBlock(Properties properties) {
        super(properties);
    }

    private static final VoxelShape HORIZONTAL = Shapes.or(
            Block.box(-8, 15.25, 0, 24, 16, 16),
            Block.box(-7.5, 0, 0.5, -6.5, 15.25, 1.5),
            Block.box(-7.5, 0, 14.5, -6.5, 15.25, 15.5),
            Block.box(22.5, 0, 0.5, 23.5, 15.25, 1.5),
            Block.box(22.5, 0, 14.5, 23.5, 15.25, 15.5)
    );

    private static final VoxelShape VERTICAL = Shapes.or(
            Block.box(0, 15.25, -8, 16, 16, 24),
            Block.box(14.5, 0, -7.5, 15.5, 15.25, -6.5),
            Block.box(0.5, 0, -7.5, 1.5, 15.25, -6.5),
            Block.box(14.5, 0, 22.5, 15.5, 15.25, 23.5),
            Block.box(0.5, 0, 22.5, 1.5, 15.25, 23.5)
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
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hit) {
        super.useWithoutItem(state, level, pos, player, hit);
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        double hitX = hit.getBlockPos().getX();
        double hitY = hit.getBlockPos().getY();
        double hitZ = hit.getBlockPos().getZ();
        Direction direction = hit.getDirection();
        if (player.isShiftKeyDown()) {
            if ((level.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ModBlocks.TABLE_2X1_BLACK.get()) {
                {
                    BlockPos _bp = BlockPos.containing(x, y, z);
                    BlockState _bs = ModBlocks.TABLE_2X1_BLACK_ALT.get().defaultBlockState();
                    BlockState _bso = level.getBlockState(_bp);
                    for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
                        Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                        if (_property != null && _bs.getValue(_property) != null)
                            try {
                                _bs = _bs.setValue(_property, (Comparable) entry.getValue());
                            } catch (Exception e) {
                            }
                    }
                    level.setBlock(_bp, _bs, 3);
                }
            }
            else if ((level.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ModBlocks.TABLE_2X1_WHITE.get()) {
                {
                    BlockPos _bp = BlockPos.containing(x, y, z);
                    BlockState _bs = ModBlocks.TABLE_2X1_WHITE_ALT.get().defaultBlockState();
                    BlockState _bso = level.getBlockState(_bp);
                    for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
                        Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                        if (_property != null && _bs.getValue(_property) != null)
                            try {
                                _bs = _bs.setValue(_property, (Comparable) entry.getValue());
                            } catch (Exception e) {
                            }
                    }
                    level.setBlock(_bp, _bs, 3);
                }
            }
        }
        else {
            return InteractionResult.PASS;
        }
        return InteractionResult.SUCCESS;
    }
}