package net.nhatjs.nextgen_furniture.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class DualMonitorAlternateBlock extends Block {
    public static final EnumProperty<Direction> FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final BooleanProperty TURN_ON = BooleanProperty.create("turn_on");

    public DualMonitorAlternateBlock(Properties settings) {
        super(settings);
        registerDefaultState(this.getStateDefinition().any()
                .setValue(FACING, Direction.NORTH)
                .setValue(TURN_ON, false));
    }

    private static final VoxelShape NORTH = Shapes.or(
            Block.box(-8.5, 0, 11, 24.5, 13, 15),
            Block.box(-0.5, 0, 1.25, 16.5, 0.025, 7.75),
            Block.box(5.15, 0.025, 3.025, 14.45, 0.725, 6.5),
            Block.box(1.5, 0.025, 3.475, 3.325, 0.74, 6.025)
    );

    private static final VoxelShape SOUTH = Shapes.or(
            Block.box(-8.5, 0, 1, 24.5, 13, 5),
            Block.box(-0.5, 0, 8.25, 16.5, 0.025, 14.75),
            Block.box(1.55, 0.025, 9.5, 10.85, 0.725, 12.975),
            Block.box(12.675, 0.025, 9.975, 14.5, 0.75, 12.525)
    );

    private static final VoxelShape EAST = Shapes.or(
            Block.box(1, 0, -8.5, 5, 13, 24.5),
            Block.box(8.25, 0, -0.5, 14.75, 0.025, 16.5),
            Block.box(9.5, 0.025, 5.15, 12.975, 0.725, 14.45),
            Block.box(9.975, 0.025, 1.5, 12.525, 0.75, 3.325)
    );

    private static final VoxelShape WEST = Shapes.or(
            Block.box(11, 0, -8.5, 15, 13, 24.5),
            Block.box(1.25, 0, -0.5, 7.75, 0.025, 16.5),
            Block.box(3.025, 0.025, 1.55, 6.5, 0.725, 10.85),
            Block.box(3.475, 0.025, 12.675, 6.025, 0.75, 14.5)
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
        builder.add(FACING, TURN_ON);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        return this.defaultBlockState().setValue(FACING, ctx.getHorizontalDirection().getOpposite());
    }

    @Override
    public InteractionResult useWithoutItem(BlockState state, Level world, BlockPos pos, Player player, BlockHitResult hit) {
        boolean current = state.getValue(TURN_ON);
        if (player.isShiftKeyDown() && !current) {
            Direction facing =  state.getValue(HorizontalDirectionalBlock.FACING);
            world.setBlock(pos, ModBlocks.MONITOR_DUAL_ALT_2.get().defaultBlockState()
                    .setValue(HorizontalDirectionalBlock.FACING, facing)
                    .setValue(DualMonitorAlternate2Block.TURN_ON, false), Block.UPDATE_ALL);
            return InteractionResult.SUCCESS;
        }
        else if (player.getMainHandItem().is(Items.STICK) && !current) {
            Direction facing =  state.getValue(HorizontalDirectionalBlock.FACING);
            world.setBlock(pos, ModBlocks.MONITOR.get().defaultBlockState()
                    .setValue(HorizontalDirectionalBlock.FACING, facing)
                    .setValue(MonitorBlock.TURN_ON, false), Block.UPDATE_ALL);
            popResource(world, pos, new net.minecraft.world.item.ItemStack(ModBlocks.MONITOR_GAMING_MINIMALIST.get().asItem()));
            return InteractionResult.SUCCESS;
        }
        else {
            world.setBlock(pos, state.setValue(TURN_ON, !current), 3);
        }
        return InteractionResult.SUCCESS;
    }
}
