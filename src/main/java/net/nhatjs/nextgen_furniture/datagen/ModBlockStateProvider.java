package net.nhatjs.nextgen_furniture.datagen;

import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.neoforged.neoforge.client.model.generators.*;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.nhatjs.nextgen_furniture.NhatJSNextGenFurnitureMod;
import net.nhatjs.nextgen_furniture.block.*;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, NhatJSNextGenFurnitureMod.MOD_ID, exFileHelper);
    }

    @Override
    public void registerStatesAndModels() {
        horizontalBlockWithItem(ModBlocks.AIO_COOLER_3_FANS.get());
        horizontalBlockWithItem(ModBlocks.BED_GRAY_WOOD_BIRCH.get());
        horizontalBlockWithItem(ModBlocks.BED_GRAY_WOOD_OAK.get());
        horizontalBlockWithItem(ModBlocks.BED_WHITE_WOOD_BIRCH.get());
        horizontalBlockWithItem(ModBlocks.BED_WHITE_WOOD_OAK.get());

        horizontalWithBoolean(ModBlocks.CHAIR_2_WHITE_GRAY.get(), ChairBlock.MOVE,
                models().getExistingFile(modLoc("block/chair_2_white_gray")),
                models().getExistingFile(modLoc("block/chair_2_white_gray_moved")));

        horizontalWithBoolean(ModBlocks.CHAIR_2_WHITE_WHITE.get(), ChairBlock.MOVE,
                models().getExistingFile(modLoc("block/chair_2_white_white")),
                models().getExistingFile(modLoc("block/chair_2_white_white_moved")));

        horizontalWithBoolean(ModBlocks.CHAIR_2_WOOD_BIRCH_GRAY.get(), ChairBlock.MOVE,
                models().getExistingFile(modLoc("block/chair_2_wood_birch_gray")),
                models().getExistingFile(modLoc("block/chair_2_wood_birch_gray_moved")));

        horizontalWithBoolean(ModBlocks.CHAIR_2_WOOD_BIRCH_WHITE.get(), ChairBlock.MOVE,
                models().getExistingFile(modLoc("block/chair_2_wood_birch_white")),
                models().getExistingFile(modLoc("block/chair_2_wood_birch_white_moved")));

        horizontalWithBoolean(ModBlocks.CHAIR_2_WOOD_OAK_GRAY.get(), ChairBlock.MOVE,
                models().getExistingFile(modLoc("block/chair_2_wood_oak_gray")),
                models().getExistingFile(modLoc("block/chair_2_wood_oak_gray_moved")));

        horizontalWithBoolean(ModBlocks.CHAIR_2_WOOD_OAK_WHITE.get(), ChairBlock.MOVE,
                models().getExistingFile(modLoc("block/chair_2_wood_oak_white")),
                models().getExistingFile(modLoc("block/chair_2_wood_oak_white_moved")));

        horizontalWithBoolean(ModBlocks.CHAIR_WHITE.get(), ChairBlock.MOVE,
                models().getExistingFile(modLoc("block/chair_white")),
                models().getExistingFile(modLoc("block/chair_white_moved")));

        horizontalWithBoolean(ModBlocks.CHAIR_WOOD_BIRCH.get(), ChairBlock.MOVE,
                models().getExistingFile(modLoc("block/chair_wood_birch")),
                models().getExistingFile(modLoc("block/chair_wood_birch_moved")));

        horizontalWithBoolean(ModBlocks.CHAIR_WOOD_OAK.get(), ChairBlock.MOVE,
                models().getExistingFile(modLoc("block/chair_wood_oak")),
                models().getExistingFile(modLoc("block/chair_wood_oak_moved")));

        horizontalBlockWithItem(ModBlocks.COFFEE_TABLE_WHITE.get());
        horizontalBlockWithItem(ModBlocks.COMPUTER_CASE_GAMING.get());
        horizontalBlockWithItem(ModBlocks.COMPUTER_POWER_SUPPLY.get());
        horizontalBlockWithItem(ModBlocks.DRAWER_2_K_M_WOOD_BIRCH.get());
        horizontalBlockWithItem(ModBlocks.DRAWER_2_K_M_WOOD_OAK.get());
        horizontalBlockWithItem(ModBlocks.DRAWER_2_K_M_WOOD_BIRCH_BASE.get());
        horizontalBlockWithItem(ModBlocks.DRAWER_2_K_M_WOOD_OAK_BASE.get());
        horizontalBlockWithItem(ModBlocks.DRAWER_3_K_M_WOOD_BIRCH.get());
        horizontalBlockWithItem(ModBlocks.DRAWER_3_K_M_WOOD_OAK.get());
        horizontalBlockWithItem(ModBlocks.DRAWER_3_K_M_WOOD_BIRCH_BASE.get());
        horizontalBlockWithItem(ModBlocks.DRAWER_3_K_M_WOOD_OAK_BASE.get());

        horizontalWithBoolean(ModBlocks.FLOOR_LAMP.get(), FloorLampBlock.LIT,
                models().getExistingFile(modLoc("block/floor_lamp")),
                models().getExistingFile(modLoc("block/floor_lamp_on")));

        horizontalWithBoolean(ModBlocks.FLOOR_LAMP_B.get(), FloorLampBlock.LIT,
                models().getExistingFile(modLoc("block/floor_lamp_b")),
                models().getExistingFile(modLoc("block/floor_lamp_b_on")));

        horizontalWithBoolean(ModBlocks.GAME_CONSOLE.get(), ConsoleBlock.TURN_ON,
                models().getExistingFile(modLoc("block/game_console")),
                models().getExistingFile(modLoc("block/game_console_on")));

        horizontalBlockWithItem(ModBlocks.GRAPHICS_CARD_GAMING.get());
        horizontalBlockWithItem(ModBlocks.KEYBOARD_MECHANICAL_BLACK.get());
        horizontalBlockWithItem(ModBlocks.KEYBOARD_MECHANICAL_BLACK_WOOD_BIRCH.get());
        horizontalBlockWithItem(ModBlocks.KEYBOARD_MECHANICAL_BLACK_WOOD_OAK.get());

        horizontalWithBoolean(ModBlocks.LAPTOP.get(), LaptopBlock.TURN_ON,
                models().getExistingFile(modLoc("block/laptop_base")),
                models().getExistingFile(modLoc("block/laptop_base_on")));

        directionalBlockWithBoolean(ModBlocks.LIGHT_MODERN.get(), ModernLightBlock.LIT,
                models().getExistingFile(modLoc("block/light_modern")),
                models().getExistingFile(modLoc("block/light_modern")));

        horizontalBlockWithItem(ModBlocks.MAINBOARD_GAMING.get());

        horizontalWithBoolean(ModBlocks.MONITOR.get(), MonitorBlock.TURN_ON,
                models().getExistingFile(modLoc("block/monitor_off")),
                models().getExistingFile(modLoc("block/monitor_on")));
        horizontalWithBoolean(ModBlocks.MONITOR_DUAL.get(), DualMonitorBlock.TURN_ON,
                models().getExistingFile(modLoc("block/monitor_dual_off")),
                models().getExistingFile(modLoc("block/monitor_dual_on")));
        horizontalWithBoolean(ModBlocks.MONITOR_DUAL_ALT.get(), DualMonitorAlternateBlock.TURN_ON,
                models().getExistingFile(modLoc("block/monitor_dual_alt_off")),
                models().getExistingFile(modLoc("block/monitor_dual_alt_on")));
        horizontalWithBoolean(ModBlocks.MONITOR_DUAL_ALT_2.get(), DualMonitorAlternate2Block.TURN_ON,
                models().getExistingFile(modLoc("block/monitor_dual_alt_2_off")),
                models().getExistingFile(modLoc("block/monitor_dual_alt_2_on")));

        horizontalBlockWithItem(ModBlocks.MONITOR_GAMING_MINIMALIST.get());
        horizontalBlockWithItem(ModBlocks.MOUSE_GAMING_BLACK.get());

        gamingPCStates(ModBlocks.PC_GAMING.get(), DesktopBlock.TURN_ON, DesktopBlock.PC_BOOTING,
                models().getExistingFile(modLoc("block/pc_gaming")),
                models().getExistingFile(modLoc("block/pc_gaming_boot")),
                models().getExistingFile(modLoc("block/pc_gaming_on")));

        horizontalBlockWithItem(ModBlocks.PC_GAMING_ADDED_1.get());
        horizontalBlockWithItem(ModBlocks.PC_GAMING_ADDED_2.get());
        horizontalBlockWithItem(ModBlocks.PC_GAMING_ADDED_3.get());
        horizontalBlockWithItem(ModBlocks.PC_GAMING_ADDED_4.get());
        horizontalBlockWithItem(ModBlocks.PC_GAMING_ADDED_5.get());
        horizontalBlockWithItem(ModBlocks.PC_GAMING_ADDED_6.get());
        horizontalBlockWithItem(ModBlocks.PC_GAMING_ADDED_7.get());
        horizontalBlockWithItem(ModBlocks.PC_GAMING_ADDED_8.get());
        directionalBlockWithItem(ModBlocks.PICTURE_FRAME.get());
        horizontalBlockWithItem(ModBlocks.TABLE_1X1_BLACK.get());
        horizontalBlockWithItem(ModBlocks.TABLE_1X1_WHITE.get());
        horizontalBlockWithItem(ModBlocks.TABLE_1X1_WOOD_OAK.get());
        horizontalBlockWithItem(ModBlocks.TABLE_1X1_WOOD_BIRCH.get());
        horizontalBlockWithItem(ModBlocks.TABLE_2X1_BLACK.get());
        horizontalBlockWithItem(ModBlocks.TABLE_2X1_BLACK_ALT.get());
        horizontalBlockWithItem(ModBlocks.TABLE_2X1_BLACK_ALT_2.get());
        horizontalBlockWithItem(ModBlocks.TABLE_2X1_WHITE.get());
        horizontalBlockWithItem(ModBlocks.TABLE_2X1_WHITE_ALT.get());
        horizontalBlockWithItem(ModBlocks.TABLE_2X1_WHITE_ALT_2.get());
        horizontalBlockWithItem(ModBlocks.TABLE_2X1_WOOD_OAK.get());
        horizontalBlockWithItem(ModBlocks.TABLE_2X1_WOOD_OAK_ALT.get());
        horizontalBlockWithItem(ModBlocks.TABLE_2X1_WOOD_OAK_ALT_2.get());
        horizontalBlockWithItem(ModBlocks.TABLE_2X1_WOOD_BIRCH.get());
        horizontalBlockWithItem(ModBlocks.TABLE_2X1_WOOD_BIRCH_ALT.get());
        horizontalBlockWithItem(ModBlocks.TABLE_2X1_WOOD_BIRCH_ALT_2.get());
        horizontalBlockWithItem(ModBlocks.TABLE_3X1_BLACK.get());
        horizontalBlockWithItem(ModBlocks.TABLE_3X1_WHITE.get());
        horizontalBlockWithItem(ModBlocks.TABLE_3X1_WOOD_OAK.get());
        horizontalBlockWithItem(ModBlocks.TABLE_3X1_WOOD_BIRCH.get());
        horizontalBlockWithItem(ModBlocks.TABLE_DINING_WHITE.get());
        horizontalBlockWithItem(ModBlocks.TABLE_DINING_WOOD_BIRCH.get());
        horizontalBlockWithItem(ModBlocks.TABLE_DINING_WOOD_OAK.get());
        horizontalBlockWithoutItem(ModBlocks.TRASH_CAN_BLACK.get());
        horizontalBlockWithoutItem(ModBlocks.TRASH_CAN_WHITE.get());
        horizontalBlockWithItem(ModBlocks.TV_STAND_WOOD_BIRCH.get());
        horizontalBlockWithItem(ModBlocks.TV_STAND_WOOD_OAK.get());

        sofaStates(ModBlocks.SOFA_GRAY.get(), SofaBlock.PART,
                models().getExistingFile(modLoc("block/sofa_single_gray")),
                models().getExistingFile(modLoc("block/sofa_left_gray")),
                models().getExistingFile(modLoc("block/sofa_right_gray")),
                models().getExistingFile(modLoc("block/sofa_middle_gray")),
                models().getExistingFile(modLoc("block/sofa_corner_left_gray")),
                models().getExistingFile(modLoc("block/sofa_corner_right_gray")));
        sofaStates(ModBlocks.SOFA_WHITE.get(), SofaBlock.PART,
                models().getExistingFile(modLoc("block/sofa_single_white")),
                models().getExistingFile(modLoc("block/sofa_left_white")),
                models().getExistingFile(modLoc("block/sofa_right_white")),
                models().getExistingFile(modLoc("block/sofa_middle_white")),
                models().getExistingFile(modLoc("block/sofa_corner_left_white")),
                models().getExistingFile(modLoc("block/sofa_corner_right_white")));

        tvStates(ModBlocks.TV_OLED.get(), TVBlock.TV_ON, TVBlock.MOUNT,
                models().getExistingFile(modLoc("block/tv_oled_off")),
                models().getExistingFile(modLoc("block/tv_oled_on")),
                models().getExistingFile(modLoc("block/tv_oled_mount_off")),
                models().getExistingFile(modLoc("block/tv_oled_mount_on")));

        horizontalBlockWithItem(ModBlocks.WARDROBE_MODERN_WOOD_BIRCH_LEFT.get());
        horizontalBlockWithItem(ModBlocks.WARDROBE_MODERN_WOOD_BIRCH_RIGHT.get());
        horizontalBlockWithItem(ModBlocks.WARDROBE_MODERN_WOOD_OAK_LEFT.get());
        horizontalBlockWithItem(ModBlocks.WARDROBE_MODERN_WOOD_OAK_RIGHT.get());
        horizontalBlockWithItem(ModBlocks.WASHING_MACHINE.get());
    }

    protected void horizontalBlockWithItem(Block block) {
        ResourceLocation id = BuiltInRegistries.BLOCK.getKey(block);
        ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + id.getPath()));
        horizontalBlock(block, model);
        simpleBlockItem(block, model);
    }

    protected void horizontalBlockWithoutItem(Block block) {
        ResourceLocation id = BuiltInRegistries.BLOCK.getKey(block);
        ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + id.getPath()));
        horizontalBlock(block, model);
    }

    protected void directionalBlockWithItem(Block block) {
        ResourceLocation id = BuiltInRegistries.BLOCK.getKey(block);
        ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + id.getPath()));
        getVariantBuilder(block).forAllStates(state -> {
            Direction direction = state.getValue(BlockStateProperties.FACING);
            return ConfiguredModel.builder().modelFile(model).rotationX(direction == Direction.UP ? 270 :
                    direction == Direction.DOWN ? 90 : 0)
                    .rotationY(switch (direction) {
                        default -> 0;
                        case SOUTH -> 180;
                        case EAST -> 90;
                        case WEST -> 270;
                    }).build();
        });
        simpleBlockItem(block, model);
    }

    protected void directionalBlockWithBoolean(Block block, BooleanProperty property, ModelFile offModel, ModelFile onModel) {
        this.getVariantBuilder(block).forAllStates(state -> {
            Direction dir = state.getValue(BlockStateProperties.FACING);
            boolean flag = state.getValue(property);
            ModelFile model = flag ? onModel : offModel;
            int xRot = dir == Direction.UP ? 270 : dir == Direction.DOWN ? 90 : 0;
            int yRot = switch (dir) {
                case EAST  -> 90;
                case SOUTH -> 180;
                case WEST  -> 270;
                default    -> 0;
            };
            return ConfiguredModel.builder().modelFile(model).rotationX(xRot).rotationY(yRot).build();
        });
    }

    private void horizontalWithBoolean(Block block, BooleanProperty property, ModelFile offModel, ModelFile onModel) {
        this.getVariantBuilder(block).forAllStates(state -> {
                    Direction dir = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                    boolean flag = state.getValue(property);
                    ModelFile model = flag ? onModel : offModel;
                    int yRot = switch (dir) {
                        case EAST  -> 90;
                        case SOUTH -> 180;
                        case WEST  -> 270;
                        default    -> 0;
                    };
                    return ConfiguredModel.builder().modelFile(model).rotationY(yRot).build();
                });
        this.simpleBlockItem(block, offModel);
    }

    private void gamingPCStates(Block block, BooleanProperty property, BooleanProperty property2, ModelFile offModel, ModelFile bootModel, ModelFile onModel) {
        this.getVariantBuilder(block).forAllStates(state -> {
                    Direction dir = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                    boolean on = state.getValue(property);
                    boolean boot = state.getValue(property2);
                    ModelFile model = boot ? bootModel : on ? onModel : offModel;
                    int yRot = switch (dir) {
                        case EAST  -> 90;
                        case SOUTH -> 180;
                        case WEST  -> 270;
                        default    -> 0;
                    };
                    return ConfiguredModel.builder().modelFile(model).rotationY(yRot).build();
                });
        this.simpleBlockItem(block, offModel);
    }

    private void sofaStates(Block block, EnumProperty<SofaBlock.Part> property, ModelFile single, ModelFile left,
                            ModelFile right, ModelFile middle, ModelFile cornerLeft, ModelFile cornerRight) {
        this.getVariantBuilder(block).forAllStates(state -> {
                    Direction dir = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                    SofaBlock.Part part = state.getValue(property);
                    ModelFile model = switch (part) {
                        case SINGLE -> single;
                        case LEFT -> left;
                        case RIGHT -> right;
                        case MIDDLE -> middle;
                        case CORNER_LEFT -> cornerLeft;
                        case CORNER_RIGHT -> cornerRight;
                    };
                    int yRot = switch (dir) {
                        case EAST  -> 90;
                        case SOUTH -> 180;
                        case WEST  -> 270;
                        default    -> 0;
                    };
                    return ConfiguredModel.builder().modelFile(model).rotationY(yRot).build();
                });
        this.simpleBlockItem(block, single);
    }

    private void tvStates(Block block, BooleanProperty property, EnumProperty<TVBlock.Mount> property2, ModelFile offModel, ModelFile onModel, ModelFile offMountModel, ModelFile onMountModel) {
        this.getVariantBuilder(block).forAllStates(state -> {
                    Direction dir = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                    boolean on = state.getValue(property);
                    TVBlock.Mount mount = state.getValue(property2);
                    ModelFile model;
                    if (mount == TVBlock.Mount.WALL) {
                        model = on ? onMountModel : offMountModel;
                    } else {
                        model = on ? onModel : offModel;
                    }
                    int yRot = switch (dir) {
                        case EAST  -> 90;
                        case SOUTH -> 180;
                        case WEST  -> 270;
                        default    -> 0;
                    };
                    return ConfiguredModel.builder().modelFile(model).rotationY(yRot).build();
                });
        this.simpleBlockItem(block, offModel);
    }

    public static ResourceLocation id(String path) {
        return ResourceLocation.parse("block/" + path);
    }
}