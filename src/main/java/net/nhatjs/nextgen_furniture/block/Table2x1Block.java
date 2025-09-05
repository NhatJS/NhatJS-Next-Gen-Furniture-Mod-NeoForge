package net.nhatjs.nextgen_furniture.block;


import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.nhatjs.nextgen_furniture.block.state.Table2x1Position;

public class Table2x1Block extends Block {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final EnumProperty<Table2x1Position> POSITION = EnumProperty.create("position", Table2x1Position.class);

    public Table2x1Block(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(POSITION, Table2x1Position.CENTER).setValue(FACING, Direction.NORTH));
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(FACING)) {
            default -> box(0, 0, 0, 16, 16, 16);
            case NORTH -> box(0, 0, 0, 16, 16, 16);
            case EAST -> box(0, 0, 0, 16, 16, 16);
            case WEST -> box(0, 0, 0, 16, 16, 16);
        };
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> b) {
        b.add(FACING, POSITION);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        return this.defaultBlockState().setValue(FACING, ctx.getHorizontalDirection().getOpposite()).setValue(POSITION, Table2x1Position.CENTER);
    }

    @Override
    public InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos,
                                            Player player, BlockHitResult hit) {
        return handleUse(state, level, pos, player);
    }

    private InteractionResult handleUse(BlockState state, Level level, BlockPos pos, Player player) {
        ItemStack held = player.getMainHandItem();
        if (!player.isShiftKeyDown() || !held.isEmpty()) return InteractionResult.PASS;


        Table2x1Position next = switch (state.getValue(POSITION)) {
                case CENTER -> Table2x1Position.LEFT;
                case LEFT -> Table2x1Position.RIGHT;
                case RIGHT -> Table2x1Position.CENTER;
            };
        if (!level.isClientSide) {
            level.setBlock(pos, state.setValue(POSITION, next), 3);
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.SUCCESS;
    }
}