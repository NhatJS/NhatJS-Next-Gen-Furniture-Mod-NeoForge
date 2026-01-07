package net.nhatjs.nextgen_furniture.datagen;

import com.mojang.math.Quadrant;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.MultiVariant;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.blockstates.PropertyDispatch;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.renderer.block.model.VariantMutator;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.nhatjs.nextgen_furniture.NhatJSNextGenFurnitureMod;
import net.nhatjs.nextgen_furniture.block.*;
import net.nhatjs.nextgen_furniture.item.ModItems;

import java.util.stream.Stream;

public class ModModelProvider extends ModelProvider {
    public ModModelProvider(PackOutput output) {
        super(output, NhatJSNextGenFurnitureMod.MOD_ID);
    }

    Identifier chair2WhiteGray = id("chair_2_white_gray");
    Identifier chair2WhiteGrayMoved = id("chair_2_white_gray_moved");
    Identifier chair2WhiteWhite = id("chair_2_white_white");
    Identifier chair2WhiteWhiteMoved = id("chair_2_white_white_moved");
    Identifier chair2WoodBirchGray = id("chair_2_wood_birch_gray");
    Identifier chair2WoodBirchGrayMoved = id("chair_2_wood_birch_gray_moved");
    Identifier chair2WoodBirchWhite = id("chair_2_wood_birch_white");
    Identifier chair2WoodBirchWhiteMoved = id("chair_2_wood_birch_white_moved");
    Identifier chair2WoodOakGray = id("chair_2_wood_oak_gray");
    Identifier chair2WoodOakGrayMoved = id("chair_2_wood_oak_gray_moved");
    Identifier chair2WoodOakWhite = id("chair_2_wood_oak_white");
    Identifier chair2WoodOakWhiteMoved = id("chair_2_wood_oak_white_moved");
    Identifier chairWhite = id("chair_white");
    Identifier chairWhiteMoved = id("chair_white_moved");
    Identifier chairWoodBirch = id("chair_wood_birch");
    Identifier chairWoodBirchMoved = id("chair_wood_birch_moved");
    Identifier chairWoodOak = id("chair_wood_oak");
    Identifier chairWoodOakMoved = id("chair_wood_oak_moved");
    Identifier floorLampOff = id("floor_lamp");
    Identifier floorLampOn = id("floor_lamp_on");
    Identifier floorLampBOff = id("floor_lamp_b");
    Identifier floorLampBOn = id("floor_lamp_b_on");
    Identifier gameConsole = id("game_console");
    Identifier gameConsoleOn = id("game_console_on");
    Identifier laptop = id("laptop_base");
    Identifier laptopOn = id("laptop_base_on");
    Identifier monitor = id("monitor_off");
    Identifier monitorOn = id("monitor_on");
    Identifier monitorDual = id("monitor_dual_off");
    Identifier monitorDualOn = id("monitor_dual_on");
    Identifier monitorDualAlternate = id("monitor_dual_alt_off");
    Identifier monitorDualAlternateOn = id("monitor_dual_alt_on");
    Identifier monitorDualAlternate2 = id("monitor_dual_alt_2_off");
    Identifier monitorDualAlternate2On = id("monitor_dual_alt_2_on");
    static Identifier pcGaming = id("pc_gaming");
    static Identifier pcGamingBoot = id("pc_gaming_boot");
    static Identifier pcGamingOn = id("pc_gaming_on");
    Identifier pictureFrame = id("picture_frame");
    static Identifier sofaGray = id("sofa_single_gray");
    static Identifier sofaLeftGray = id("sofa_left_gray");
    static Identifier sofaRightGray = id("sofa_right_gray");
    static Identifier sofaMiddleGray = id("sofa_middle_gray");;
    static Identifier sofaCornerLeftGray = id("sofa_corner_left_gray");
    static Identifier sofaCornerRightGray = id("sofa_corner_right_gray");
    static Identifier sofaWhite = id("sofa_single_white");
    static Identifier sofaLeftWhite = id("sofa_left_white");
    static Identifier sofaRightWhite = id("sofa_right_white");
    static Identifier sofaMiddleWhite = id("sofa_middle_white");;
    static Identifier sofaCornerLeftWhite = id("sofa_corner_left_white");
    static Identifier sofaCornerRightWhite = id("sofa_corner_right_white");
    static Identifier tvOled = id("tv_oled_off");
    static Identifier tvOledOn = id("tv_oled_on");
    static Identifier tvOledMount = id("tv_oled_mount_off");
    static Identifier tvOledMountOn = id("tv_oled_mount_on");

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        itemModels.generateFlatItem(ModItems.COMPUTER_CPU.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.COMPUTER_FAN_BLADE_WHITE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.COMPUTER_RAM_GAMING.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.DRAWER_WHITE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModBlocks.LIGHT_MODERN.get().asItem(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.NEXTGEN_FURNITURE_LOGO.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.SCREWDRIVER.get(), ModelTemplates.FLAT_ITEM);

        blockModels.createNonTemplateHorizontalBlock(ModBlocks.AIO_COOLER_3_FANS.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.BED_GRAY_WOOD_BIRCH.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.BED_GRAY_WOOD_OAK.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.BED_WHITE_WOOD_BIRCH.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.BED_WHITE_WOOD_OAK.get());

        registerHorizontalWithBoolean(blockModels, ModBlocks.CHAIR_2_WHITE_GRAY,
                BlockStateProperties.HORIZONTAL_FACING, ChairBlock.MOVE, chair2WhiteGray, chair2WhiteGrayMoved);

        registerHorizontalWithBoolean(blockModels, ModBlocks.CHAIR_2_WHITE_WHITE,
                BlockStateProperties.HORIZONTAL_FACING, ChairBlock.MOVE, chair2WhiteWhite, chair2WhiteWhiteMoved);

        registerHorizontalWithBoolean(blockModels, ModBlocks.CHAIR_2_WOOD_BIRCH_GRAY,
                BlockStateProperties.HORIZONTAL_FACING, ChairBlock.MOVE, chair2WoodBirchGray, chair2WoodBirchGrayMoved);

        registerHorizontalWithBoolean(blockModels, ModBlocks.CHAIR_2_WOOD_BIRCH_WHITE,
                BlockStateProperties.HORIZONTAL_FACING, ChairBlock.MOVE, chair2WoodBirchWhite, chair2WoodBirchWhiteMoved);

        registerHorizontalWithBoolean(blockModels, ModBlocks.CHAIR_2_WOOD_OAK_GRAY,
                BlockStateProperties.HORIZONTAL_FACING, ChairBlock.MOVE, chair2WoodOakGray, chair2WoodOakGrayMoved);

        registerHorizontalWithBoolean(blockModels, ModBlocks.CHAIR_2_WOOD_OAK_WHITE,
                BlockStateProperties.HORIZONTAL_FACING, ChairBlock.MOVE, chair2WoodOakWhite, chair2WoodOakWhiteMoved);

        registerHorizontalWithBoolean(blockModels, ModBlocks.CHAIR_WHITE,
                BlockStateProperties.HORIZONTAL_FACING, ChairBlock.MOVE, chairWhite, chairWhiteMoved);

        registerHorizontalWithBoolean(blockModels, ModBlocks.CHAIR_WOOD_BIRCH,
                BlockStateProperties.HORIZONTAL_FACING, ChairBlock.MOVE, chairWoodBirch, chairWoodBirchMoved);

        registerHorizontalWithBoolean(blockModels, ModBlocks.CHAIR_WOOD_OAK,
                BlockStateProperties.HORIZONTAL_FACING, ChairBlock.MOVE, chairWoodOak, chairWoodOakMoved);

        blockModels.createNonTemplateHorizontalBlock(ModBlocks.COFFEE_TABLE_WHITE.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.COMPUTER_CASE_GAMING.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.COMPUTER_POWER_SUPPLY.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.DRAWER_2_K_M_WOOD_BIRCH.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.DRAWER_2_K_M_WOOD_OAK.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.DRAWER_2_K_M_WOOD_BIRCH_BASE.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.DRAWER_2_K_M_WOOD_OAK_BASE.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.DRAWER_3_K_M_WOOD_BIRCH.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.DRAWER_3_K_M_WOOD_OAK.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.DRAWER_3_K_M_WOOD_BIRCH_BASE.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.DRAWER_3_K_M_WOOD_OAK_BASE.get());

        registerHorizontalWithBoolean(blockModels, ModBlocks.FLOOR_LAMP,
                BlockStateProperties.HORIZONTAL_FACING, FloorLampBlock.LIT, floorLampOff, floorLampOn);

        registerHorizontalWithBoolean(blockModels, ModBlocks.FLOOR_LAMP_B,
                BlockStateProperties.HORIZONTAL_FACING, FloorLampBlock.LIT, floorLampBOff, floorLampBOn);

        registerHorizontalWithBoolean(blockModels, ModBlocks.GAME_CONSOLE,
                BlockStateProperties.HORIZONTAL_FACING, ConsoleBlock.TURN_ON, gameConsole, gameConsoleOn);

        blockModels.createNonTemplateHorizontalBlock(ModBlocks.GRAPHICS_CARD_GAMING.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.KEYBOARD_MECHANICAL_BLACK.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.KEYBOARD_MECHANICAL_BLACK_WOOD_BIRCH.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.KEYBOARD_MECHANICAL_BLACK_WOOD_OAK.get());

        registerHorizontalWithBoolean(blockModels, ModBlocks.LAPTOP,
                BlockStateProperties.HORIZONTAL_FACING, LaptopBlock.TURN_ON, laptop, laptopOn);

        registerDirectionalWithBoolean(blockModels, ModBlocks.LIGHT_MODERN, BlockStateProperties.FACING,
                ModernLightBlock.LIT, id("light_modern"), id("light_modern"));

        blockModels.createNonTemplateHorizontalBlock(ModBlocks.MAINBOARD_GAMING.get());

        registerHorizontalWithBoolean(blockModels, ModBlocks.MONITOR,
                BlockStateProperties.HORIZONTAL_FACING, MonitorBlock.TURN_ON, monitor, monitorOn);
        blockModels.registerSimpleItemModel(ModBlocks.MONITOR.get(), monitor);

        registerHorizontalWithBoolean(blockModels, ModBlocks.MONITOR_DUAL,
                BlockStateProperties.HORIZONTAL_FACING, DualMonitorBlock.TURN_ON, monitorDual, monitorDualOn);
        blockModels.registerSimpleItemModel(ModBlocks.MONITOR_DUAL.get(), monitorDual);

        registerHorizontalWithBoolean(blockModels, ModBlocks.MONITOR_DUAL_ALT,
                BlockStateProperties.HORIZONTAL_FACING, DualMonitorAlternateBlock.TURN_ON, monitorDualAlternate, monitorDualAlternateOn);
        blockModels.registerSimpleItemModel(ModBlocks.MONITOR_DUAL_ALT.get(), monitorDualAlternate);

        registerHorizontalWithBoolean(blockModels, ModBlocks.MONITOR_DUAL_ALT_2,
                BlockStateProperties.HORIZONTAL_FACING, DualMonitorAlternate2Block.TURN_ON, monitorDualAlternate2, monitorDualAlternate2On);
        blockModels.registerSimpleItemModel(ModBlocks.MONITOR_DUAL_ALT_2.get(), monitorDualAlternate2);

        blockModels.createNonTemplateHorizontalBlock(ModBlocks.MONITOR_GAMING_MINIMALIST.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.MOUSE_GAMING_BLACK.get());

        registerGamingPCState(blockModels, ModBlocks.PC_GAMING, BlockStateProperties.HORIZONTAL_FACING, DesktopBlock.TURN_ON,
                DesktopBlock.PC_BOOTING, pcGaming, pcGamingBoot, pcGamingOn);

        blockModels.createNonTemplateHorizontalBlock(ModBlocks.PC_GAMING_ADDED_1.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.PC_GAMING_ADDED_2.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.PC_GAMING_ADDED_3.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.PC_GAMING_ADDED_4.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.PC_GAMING_ADDED_5.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.PC_GAMING_ADDED_6.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.PC_GAMING_ADDED_7.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.PC_GAMING_ADDED_8.get());

        facingBlockWithItem(blockModels, ModBlocks.PICTURE_FRAME, pictureFrame);

        blockModels.createNonTemplateHorizontalBlock(ModBlocks.TABLE_1X1_BLACK.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.TABLE_1X1_WHITE.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.TABLE_1X1_WOOD_OAK.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.TABLE_1X1_WOOD_BIRCH.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.TABLE_2X1_BLACK.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.TABLE_2X1_BLACK_ALT.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.TABLE_2X1_BLACK_ALT_2.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.TABLE_2X1_WHITE.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.TABLE_2X1_WHITE_ALT.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.TABLE_2X1_WHITE_ALT_2.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.TABLE_2X1_WOOD_OAK.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.TABLE_2X1_WOOD_OAK_ALT.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.TABLE_2X1_WOOD_OAK_ALT_2.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.TABLE_2X1_WOOD_BIRCH.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.TABLE_2X1_WOOD_BIRCH_ALT.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.TABLE_2X1_WOOD_BIRCH_ALT_2.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.TABLE_3X1_BLACK.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.TABLE_3X1_WHITE.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.TABLE_3X1_WOOD_OAK.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.TABLE_3X1_WOOD_BIRCH.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.TABLE_DINING_WHITE.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.TABLE_DINING_WOOD_BIRCH.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.TABLE_DINING_WOOD_OAK.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.TRASH_CAN_BLACK.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.TRASH_CAN_WHITE.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.TV_STAND_WOOD_BIRCH.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.TV_STAND_WOOD_OAK.get());

        registerSofa(blockModels, ModBlocks.SOFA_GRAY, BlockStateProperties.HORIZONTAL_FACING, SofaBlock.PART,
                sofaGray, sofaLeftGray, sofaRightGray, sofaMiddleGray, sofaCornerLeftGray, sofaCornerRightGray);
        blockModels.registerSimpleItemModel(ModBlocks.SOFA_GRAY.get(), sofaGray);

        registerSofa(blockModels, ModBlocks.SOFA_WHITE, BlockStateProperties.HORIZONTAL_FACING, SofaBlock.PART,
                sofaWhite, sofaLeftWhite, sofaRightWhite, sofaMiddleWhite, sofaCornerLeftWhite, sofaCornerRightWhite);
        blockModels.registerSimpleItemModel(ModBlocks.SOFA_WHITE.get(), sofaWhite);

        registerTVState(blockModels, ModBlocks.TV_OLED);
        blockModels.registerSimpleItemModel(ModBlocks.TV_OLED.get(), tvOled);

        blockModels.createNonTemplateHorizontalBlock(ModBlocks.WARDROBE_MODERN_WOOD_BIRCH_LEFT.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.WARDROBE_MODERN_WOOD_BIRCH_RIGHT.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.WARDROBE_MODERN_WOOD_OAK_LEFT.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.WARDROBE_MODERN_WOOD_OAK_RIGHT.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.WASHING_MACHINE.get());
    }

    //private void horizontalBlockWithCustomItem(BlockModelGenerators blockModelGenerators, DeferredBlock<Block> block, Identifier model) {
    //    PropertyDispatch<MultiVariant> map = PropertyDispatch.initial(BlockStateProperties.HORIZONTAL_FACING)
    //            .select(Direction.NORTH,  BlockModelGenerators.plainVariant(model).with(VariantMutator.MODEL.withValue(model)))
    //            .select(Direction.EAST,  BlockModelGenerators.plainVariant(model).with(VariantMutator.MODEL.withValue(model)).with(VariantMutator.Y_ROT.withValue(Quadrant.R90)))
    //            .select(Direction.SOUTH,  BlockModelGenerators.plainVariant(model).with(VariantMutator.MODEL.withValue(model)).with(VariantMutator.Y_ROT.withValue(Quadrant.R180)))
    //            .select(Direction.WEST,  BlockModelGenerators.plainVariant(model).with(VariantMutator.MODEL.withValue(model)).with(VariantMutator.Y_ROT.withValue(Quadrant.R270)));
    //    blockModelGenerators.blockStateOutput.accept(MultiVariantGenerator.dispatch(block.get()).with(map));

    //    blockModelGenerators.registerSimpleItemModel(block.get(), model);
    //}

    private void facingBlockWithItem(BlockModelGenerators blockModelGenerators, DeferredBlock<Block> block, Identifier model) {
        PropertyDispatch<MultiVariant> map = PropertyDispatch.initial(BlockStateProperties.FACING)
                .select(Direction.NORTH,  BlockModelGenerators.plainVariant(model).with(VariantMutator.MODEL.withValue(model)))
                .select(Direction.EAST,  BlockModelGenerators.plainVariant(model).with(VariantMutator.MODEL.withValue(model)).with(VariantMutator.Y_ROT.withValue(Quadrant.R90)))
                .select(Direction.SOUTH,  BlockModelGenerators.plainVariant(model).with(VariantMutator.MODEL.withValue(model)).with(VariantMutator.Y_ROT.withValue(Quadrant.R180)))
                .select(Direction.WEST,  BlockModelGenerators.plainVariant(model).with(VariantMutator.MODEL.withValue(model)).with(VariantMutator.Y_ROT.withValue(Quadrant.R270)))
                .select(Direction.UP,  BlockModelGenerators.plainVariant(model).with(VariantMutator.MODEL.withValue(model)).with(VariantMutator.X_ROT.withValue(Quadrant.R270)))
                .select(Direction.DOWN,  BlockModelGenerators.plainVariant(model).with(VariantMutator.MODEL.withValue(model)).with(VariantMutator.X_ROT.withValue(Quadrant.R90)));
        blockModelGenerators.blockStateOutput.accept(MultiVariantGenerator.dispatch(block.get()).with(map));

        blockModelGenerators.registerSimpleItemModel(block.get(), model);
    }

    public static void registerHorizontalWithBoolean(BlockModelGenerators blockModelGenerators, DeferredBlock<Block> block, EnumProperty<Direction> facing,
                                                     BooleanProperty booleanProperty, Identifier model, Identifier modelBoolean) {
        PropertyDispatch.C2<MultiVariant, Direction, Boolean> map = PropertyDispatch.C2.initial(facing, booleanProperty);

        map.select(Direction.NORTH, Boolean.FALSE, BlockModelGenerators.plainVariant(model).with(VariantMutator.MODEL.withValue(model)));
        map.select(Direction.NORTH, Boolean.TRUE, BlockModelGenerators.plainVariant(modelBoolean).with(VariantMutator.MODEL.withValue(modelBoolean)));
        map.select(Direction.EAST, Boolean.FALSE, BlockModelGenerators.plainVariant(model).with(VariantMutator.MODEL.withValue(model)).with(VariantMutator.Y_ROT.withValue(Quadrant.R90)));
        map.select(Direction.EAST, Boolean.TRUE, BlockModelGenerators.plainVariant(modelBoolean).with(VariantMutator.MODEL.withValue(modelBoolean)).with(VariantMutator.Y_ROT.withValue(Quadrant.R90)));
        map.select(Direction.SOUTH, Boolean.FALSE, BlockModelGenerators.plainVariant(model).with(VariantMutator.MODEL.withValue(model)).with(VariantMutator.Y_ROT.withValue(Quadrant.R180)));
        map.select(Direction.SOUTH, Boolean.TRUE, BlockModelGenerators.plainVariant(modelBoolean).with(VariantMutator.MODEL.withValue(modelBoolean)).with(VariantMutator.Y_ROT.withValue(Quadrant.R180)));
        map.select(Direction.WEST, Boolean.FALSE, BlockModelGenerators.plainVariant(model).with(VariantMutator.MODEL.withValue(model)).with(VariantMutator.Y_ROT.withValue(Quadrant.R270)));
        map.select(Direction.WEST, Boolean.TRUE, BlockModelGenerators.plainVariant(modelBoolean).with(VariantMutator.MODEL.withValue(modelBoolean)).with(VariantMutator.Y_ROT.withValue(Quadrant.R270)));

        blockModelGenerators.blockStateOutput.accept(MultiVariantGenerator.dispatch(block.get()).with(map));
    }

    public static void registerDirectionalWithBoolean(BlockModelGenerators blockModelGenerators, DeferredBlock<Block> block, EnumProperty<Direction> facing,
                                                      BooleanProperty booleanProperty, Identifier model, Identifier modelBoolean) {
        PropertyDispatch.C2<MultiVariant, Direction, Boolean> map = PropertyDispatch.C2.initial(facing, booleanProperty);

        map.select(Direction.NORTH, Boolean.FALSE, BlockModelGenerators.plainVariant(model).with(VariantMutator.MODEL.withValue(model)));
        map.select(Direction.NORTH, Boolean.TRUE, BlockModelGenerators.plainVariant(modelBoolean).with(VariantMutator.MODEL.withValue(modelBoolean)));
        map.select(Direction.EAST, Boolean.FALSE, BlockModelGenerators.plainVariant(model).with(VariantMutator.MODEL.withValue(model)).with(VariantMutator.Y_ROT.withValue(Quadrant.R90)));
        map.select(Direction.EAST, Boolean.TRUE, BlockModelGenerators.plainVariant(modelBoolean).with(VariantMutator.MODEL.withValue(modelBoolean)).with(VariantMutator.Y_ROT.withValue(Quadrant.R90)));
        map.select(Direction.SOUTH, Boolean.FALSE, BlockModelGenerators.plainVariant(model).with(VariantMutator.MODEL.withValue(model)).with(VariantMutator.Y_ROT.withValue(Quadrant.R180)));
        map.select(Direction.SOUTH, Boolean.TRUE, BlockModelGenerators.plainVariant(modelBoolean).with(VariantMutator.MODEL.withValue(modelBoolean)).with(VariantMutator.Y_ROT.withValue(Quadrant.R180)));
        map.select(Direction.WEST, Boolean.FALSE, BlockModelGenerators.plainVariant(model).with(VariantMutator.MODEL.withValue(model)).with(VariantMutator.Y_ROT.withValue(Quadrant.R270)));
        map.select(Direction.WEST, Boolean.TRUE, BlockModelGenerators.plainVariant(modelBoolean).with(VariantMutator.MODEL.withValue(modelBoolean)).with(VariantMutator.Y_ROT.withValue(Quadrant.R270)));
        map.select(Direction.UP, Boolean.FALSE, BlockModelGenerators.plainVariant(model).with(VariantMutator.MODEL.withValue(model)).with(VariantMutator.X_ROT.withValue(Quadrant.R270)));
        map.select(Direction.UP, Boolean.TRUE, BlockModelGenerators.plainVariant(modelBoolean).with(VariantMutator.MODEL.withValue(modelBoolean)).with(VariantMutator.X_ROT.withValue(Quadrant.R270)));
        map.select(Direction.DOWN, Boolean.FALSE, BlockModelGenerators.plainVariant(model).with(VariantMutator.MODEL.withValue(model)).with(VariantMutator.X_ROT.withValue(Quadrant.R90)));
        map.select(Direction.DOWN, Boolean.TRUE, BlockModelGenerators.plainVariant(modelBoolean).with(VariantMutator.MODEL.withValue(modelBoolean)).with(VariantMutator.X_ROT.withValue(Quadrant.R90)));

        blockModelGenerators.blockStateOutput.accept(MultiVariantGenerator.dispatch(block.get()).with(map));
    }

    public static void registerGamingPCState(BlockModelGenerators blockStateModelGenerator, DeferredBlock<Block> block, EnumProperty<Direction> facing, BooleanProperty on,
                                             BooleanProperty boot, Identifier pcOff, Identifier pcBoot, Identifier pcOn) {
        PropertyDispatch.C3<MultiVariant, Direction, Boolean, Boolean> state =
                PropertyDispatch.C3.initial(facing, on, boot);

        for (Direction dir : Direction.Plane.HORIZONTAL) {
            Quadrant rot = switch (dir) {
                case EAST -> Quadrant.R90;
                case SOUTH -> Quadrant.R180;
                case WEST -> Quadrant.R270;
                default -> Quadrant.R0;
            };
            state.select(dir, false, false, BlockModelGenerators.plainVariant(pcOff).with(VariantMutator.MODEL.withValue(pcOff)).with(VariantMutator.Y_ROT.withValue(rot)));
            state.select(dir, true, false, BlockModelGenerators.plainVariant(pcOn).with(VariantMutator.MODEL.withValue(pcOn)).with(VariantMutator.Y_ROT.withValue(rot)));
            state.select(dir, false, true, BlockModelGenerators.plainVariant(pcBoot).with(VariantMutator.MODEL.withValue(pcBoot)).with(VariantMutator.Y_ROT.withValue(rot)));
            state.select(dir, true, true, BlockModelGenerators.plainVariant(pcBoot).with(VariantMutator.MODEL.withValue(pcBoot)).with(VariantMutator.Y_ROT.withValue(rot)));
        }
        blockStateModelGenerator.blockStateOutput.accept(MultiVariantGenerator.dispatch(block.get()).with(state)
        );
    }

    public static void registerSofa(BlockModelGenerators blockStateModelGenerator, DeferredBlock<Block> block, EnumProperty<Direction> facing,
                                    EnumProperty<SofaBlock.Part> part,
                                    Identifier single, Identifier left, Identifier right,
                                    Identifier middle, Identifier cornerLeft, Identifier cornerRight) {
        PropertyDispatch.C2<MultiVariant, Direction, SofaBlock.Part> map = PropertyDispatch.C2.initial(facing, part);

        for (Direction dir : Direction.Plane.HORIZONTAL) {
            Quadrant rot = switch (dir) {
                case EAST -> Quadrant.R90;
                case SOUTH -> Quadrant.R180;
                case WEST -> Quadrant.R270;
                default -> Quadrant.R0;
            };
            map.select(dir, SofaBlock.Part.SINGLE, BlockModelGenerators.plainVariant(single).with(VariantMutator.MODEL.withValue(single)).with(VariantMutator.Y_ROT.withValue(rot)));
            map.select(dir, SofaBlock.Part.LEFT, BlockModelGenerators.plainVariant(left).with(VariantMutator.MODEL.withValue(left)).with(VariantMutator.Y_ROT.withValue(rot)));
            map.select(dir, SofaBlock.Part.RIGHT, BlockModelGenerators.plainVariant(right).with(VariantMutator.MODEL.withValue(right)).with(VariantMutator.Y_ROT.withValue(rot)));
            map.select(dir, SofaBlock.Part.MIDDLE, BlockModelGenerators.plainVariant(middle).with(VariantMutator.MODEL.withValue(middle)).with(VariantMutator.Y_ROT.withValue(rot)));
            map.select(dir, SofaBlock.Part.CORNER_LEFT, BlockModelGenerators.plainVariant(cornerLeft).with(VariantMutator.MODEL.withValue(cornerLeft)).with(VariantMutator.Y_ROT.withValue(rot)));
            map.select(dir, SofaBlock.Part.CORNER_RIGHT, BlockModelGenerators.plainVariant(cornerRight).with(VariantMutator.MODEL.withValue(cornerRight)).with(VariantMutator.Y_ROT.withValue(rot)));
        }
        blockStateModelGenerator.blockStateOutput.accept(MultiVariantGenerator.dispatch(block.get()).with(map));
    }

    public static void registerTVState(BlockModelGenerators blockStateModelGenerator, DeferredBlock<Block> block) {
        PropertyDispatch.C3<MultiVariant, Direction, Boolean, TVBlock.Mount> map =
                PropertyDispatch.C3.initial(TVBlock.DIRECTION, TVBlock.TV_ON, TVBlock.MOUNT);

        for (Direction dir : Direction.Plane.HORIZONTAL) {
            Quadrant rot = switch (dir) {
                case EAST -> Quadrant.R90;
                case SOUTH -> Quadrant.R180;
                case WEST -> Quadrant.R270;
                default -> Quadrant.R0;
            };
            map.select(dir, false, TVBlock.Mount.STAND, BlockModelGenerators.plainVariant(tvOled).with(VariantMutator.MODEL.withValue(tvOled)).with(VariantMutator.Y_ROT.withValue(rot)));
            map.select(dir, true, TVBlock.Mount.STAND, BlockModelGenerators.plainVariant(tvOledOn).with(VariantMutator.MODEL.withValue(tvOledOn)).with(VariantMutator.Y_ROT.withValue(rot)));
            map.select(dir, false, TVBlock.Mount.WALL, BlockModelGenerators.plainVariant(tvOledMount).with(VariantMutator.MODEL.withValue(tvOledMount)).with(VariantMutator.Y_ROT.withValue(rot)));
            map.select(dir, true, TVBlock.Mount.WALL, BlockModelGenerators.plainVariant(tvOledMountOn).with(VariantMutator.MODEL.withValue(tvOledMountOn)).with(VariantMutator.Y_ROT.withValue(rot)));
        }
        blockStateModelGenerator.blockStateOutput.accept(MultiVariantGenerator.dispatch(block.get()).with(map));
    }

    public static Identifier id(String path) {
        return Identifier.fromNamespaceAndPath(NhatJSNextGenFurnitureMod.MOD_ID, "block/" + path);
    }

    @Override
    protected Stream<? extends Holder<Block>> getKnownBlocks() {
        return super.getKnownBlocks();
    }
}