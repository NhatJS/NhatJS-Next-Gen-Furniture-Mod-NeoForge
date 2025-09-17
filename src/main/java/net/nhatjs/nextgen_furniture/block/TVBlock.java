package net.nhatjs.nextgen_furniture.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class TVBlock extends Block {
    public static final DirectionProperty DIRECTION = BlockStateProperties.HORIZONTAL_FACING;
    public static final BooleanProperty TV_ON = BooleanProperty.create("tv_on");
    public static final EnumProperty<Mount> MOUNT = EnumProperty.create("mount", Mount.class);

    public enum Mount implements StringRepresentable
    {
        STAND("stand"),
        WALL("wall");

        private final String name;

        Mount(String name)
        {
            this.name = name;
        }

        @Override
        public String getSerializedName()
        {
            return name;
        }
    }

    public TVBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.getStateDefinition().any()
                .setValue(DIRECTION, Direction.NORTH)
                .setValue(TV_ON, false)
                .setValue(MOUNT, Mount.STAND));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(DIRECTION, TV_ON, MOUNT);
    }

    private static final VoxelShape NORTH_MOUNT = Block.box(-10.75, 4.45, 14.6, 26.75, 26.3, 16);
    private static final VoxelShape SOUTH_MOUNT = Block.box(-10.75, 4.45, 0, 26.75, 26.3, 1.4);
    private static final VoxelShape WEST_MOUNT = Block.box(14.6, 4.45, -10.75, 16, 26.3, 26.75);
    private static final VoxelShape EAST_MOUNT = Block.box(0, 4.45, -10.75, 1.4, 26.3, 26.75);

    private static final VoxelShape NORTH_STAND = Block.box(-10.75, 1.75, 12.1, 26.75, 23.8, 13.7);
    private static final VoxelShape SOUTH_STAND = Block.box(-10.75, 1.75, 2.3, 26.75, 23.8, 3.9);
    private static final VoxelShape WEST_STAND = Block.box(12.1, 1.75, -10.75, 13.7, 23.8, 26.75);
    private static final VoxelShape EAST_STAND = Block.box(2.3, 1.75, -10.75, 3.9, 23.8, 26.75);

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        Direction direction = state.getValue(DIRECTION);
        boolean wall = state.getValue(MOUNT) == Mount.WALL;
        return switch (direction) {
            default -> wall ? NORTH_MOUNT : Shapes.or(NORTH_STAND);
            case SOUTH -> wall ? SOUTH_MOUNT : Shapes.or(SOUTH_STAND);
            case EAST -> wall ? EAST_MOUNT : Shapes.or(EAST_STAND);
            case WEST -> wall ? WEST_MOUNT : Shapes.or(WEST_STAND);
        };
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        Direction face = ctx.getClickedFace();
        if (face.getAxis().isHorizontal()) {
            BlockPos back = ctx.getClickedPos().offset(face.getOpposite().getNormal());
            if (hasSupport(ctx.getLevel(), back, face)) {
                return defaultBlockState()
                        .setValue(DIRECTION, face)
                        .setValue(MOUNT, Mount.WALL)
                        .setValue(TV_ON, false);
            }
            return null;
        }
        return defaultBlockState()
                .setValue(DIRECTION, ctx.getHorizontalDirection().getOpposite())
                .setValue(MOUNT, Mount.STAND)
                .setValue(TV_ON, false);
    }

    private boolean hasSupport(LevelAccessor level, BlockPos pos, Direction supportFace) {
        BlockState bs = level.getBlockState(pos);
        return bs.isFaceSturdy(level, pos, supportFace) || bs.isRedstoneConductor(level, pos);
    }

    @Override
    public InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {
        if (!level.isClientSide) {
            boolean next = !state.getValue(TV_ON);
            level.setBlock(pos, state.setValue(TV_ON, next), Block.UPDATE_ALL);
        }
        return InteractionResult.SUCCESS;
    }
}
