package net.nhatjs.nextgen_furniture.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class DesktopBlock extends Block {
    public static final EnumProperty<Direction> FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final BooleanProperty TURN_ON = BooleanProperty.create("turn_on");
    public static final BooleanProperty PC_BOOTING = BooleanProperty.create("pc_booting");

    public DesktopBlock(Properties settings) {
        super(settings);
        registerDefaultState(this.getStateDefinition().any()
                .setValue(FACING, Direction.NORTH)
                .setValue(TURN_ON, false)
                .setValue(PC_BOOTING, false));
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
        builder.add(FACING, TURN_ON, PC_BOOTING);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        return this.defaultBlockState().setValue(FACING, ctx.getHorizontalDirection().getOpposite());
    }

    @Override
    public InteractionResult useWithoutItem(BlockState state, Level world, BlockPos pos, Player player, BlockHitResult hit) {
        if (world.isClientSide()) return InteractionResult.SUCCESS;

        if (state.getValue(PC_BOOTING)) return InteractionResult.CONSUME;

        world.setBlock(
                pos,
                state.setValue(PC_BOOTING, true),
                Block.UPDATE_ALL
        );

        world.scheduleTick(pos, this, 25);

        return InteractionResult.CONSUME;
    }

    @Override
    public void tick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
        boolean currentlyOn = state.getValue(TURN_ON);

        world.setBlock(
                pos,
                state
                        .setValue(TURN_ON, !currentlyOn)
                        .setValue(PC_BOOTING, false),
                Block.UPDATE_ALL
        );
    }
}
