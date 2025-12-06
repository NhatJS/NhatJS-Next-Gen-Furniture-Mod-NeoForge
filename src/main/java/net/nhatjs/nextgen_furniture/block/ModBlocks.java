package net.nhatjs.nextgen_furniture.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.nhatjs.nextgen_furniture.NhatJSNextGenFurnitureMod;
import net.nhatjs.nextgen_furniture.item.ModItems;

import java.util.function.Function;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(NhatJSNextGenFurnitureMod.MOD_ID);

    public static final DeferredBlock<Block> CHAIR_WHITE = registerBlock("chair_white",
            (properties) -> new ChairBlock(properties.strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> CHAIR_WOOD_OAK = registerBlock("chair_wood_oak",
            (properties) -> new ChairBlock(properties.strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> TABLE_2X1_BLACK = registerBlock("table_2x1_black",
            (properties) -> new Table2x1CenterBlock(properties.strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> TABLE_2X1_BLACK_ALT = registerBlock("table_2x1_black_alt",
            (properties) -> new Table2x1LeftBlock(properties.strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> TABLE_2X1_BLACK_ALT_2 = registerBlock("table_2x1_black_alt_2",
            (properties) -> new Table2x1RightBlock(properties.strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> TABLE_2X1_WHITE = registerBlock("table_2x1_white",
            (properties) -> new Table2x1CenterBlock(properties.strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> TABLE_2X1_WHITE_ALT = registerBlock("table_2x1_white_alt",
            (properties) -> new Table2x1LeftBlock(properties.strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> TABLE_2X1_WHITE_ALT_2 = registerBlock("table_2x1_white_alt_2",
            (properties) -> new Table2x1RightBlock(properties.strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> TABLE_3X1_BLACK = registerBlock("table_3x1_black",
            (properties) -> new Table3x1Block(properties.strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> TABLE_3X1_WHITE = registerBlock("table_3x1_white",
            (properties) -> new Table3x1Block(properties.strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> COFFEE_TABLE_WHITE = registerBlock("coffee_table_white",
            (properties) -> new CoffeeTableBlock(properties.strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> TABLE_DINING_WHITE = registerBlock("table_dining_white",
            (properties) -> new DiningTableBlock(properties.strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> TABLE_DINING_WOOD_OAK = registerBlock("table_dining_wood_oak",
            (properties) -> new DiningTableBlock(properties.strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> TV_STAND_WOOD_OAK = registerBlock("tv_stand_wood_oak",
            (properties) -> new TVStandBlock(properties.strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> PICTURE_FRAME = registerBlock("picture_frame",
            (properties) -> new PictureFrameBlock(properties.strength(0.2F).noOcclusion()));
    public static final DeferredBlock<Block> TRASH_CAN_BLACK = registerBlock("trash_can_black",
            (properties) -> new TrashCanBlock(properties.strength(0.2F).noOcclusion()));
    public static final DeferredBlock<Block> TRASH_CAN_WHITE = registerBlock("trash_can_white",
            (properties) -> new TrashCanBlock(properties.strength(0.2F).noOcclusion()));
    public static final DeferredBlock<Block> SOFA_GRAY = registerBlock("sofa_gray",
            (properties) -> new SofaBlock(DyeColor.GRAY, properties.strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> FLOOR_LAMP = registerBlock("floor_lamp",
            (properties) -> new FloorLampBlock(properties.strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> LAPTOP = registerBlock("laptop",
            (properties) -> new LaptopBlock(properties.strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> TV_OLED = registerBlock("tv_oled",
            (properties) -> new TVBlock(properties.strength(1.0F).noOcclusion()));

    public static final DeferredBlock<Block> CHAIR_WOOD_BIRCH = registerBlock("chair_wood_birch",
            (properties) -> new ChairBlock(properties.strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> TV_STAND_WOOD_BIRCH = registerBlock("tv_stand_wood_birch",
            (properties) -> new TVStandBlock(properties.strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> TABLE_DINING_WOOD_BIRCH = registerBlock("table_dining_wood_birch",
            (properties) -> new DiningTableBlock(properties.strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> TABLE_1X1_BLACK = registerBlock("table_1x1_black",
            (properties) -> new Table1x1Block(properties.strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> TABLE_1X1_WHITE = registerBlock("table_1x1_white",
            (properties) -> new Table1x1Block(properties.strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> FLOOR_LAMP_B = registerBlock("floor_lamp_b",
            (properties) -> new FloorLampBlock(properties.strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> SOFA_WHITE = registerBlock("sofa_white",
            (properties) -> new SofaBlock(DyeColor.WHITE, properties.strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> BED_GRAY_WOOD_OAK = registerBlock("bed_gray_wood_oak",
            (properties) -> new BedWoodBlock(properties.strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> BED_GRAY_WOOD_BIRCH = registerBlock("bed_gray_wood_birch",
            (properties) -> new BedWoodBlock(properties.strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> BED_WHITE_WOOD_OAK = registerBlock("bed_white_wood_oak",
            (properties) -> new BedWoodBlock(properties.strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> BED_WHITE_WOOD_BIRCH = registerBlock("bed_white_wood_birch",
            (properties) -> new BedWoodBlock(properties.strength(1.0F).noOcclusion()));

    public static final DeferredBlock<Block> MONITOR = registerBlock("monitor",
            (properties) -> new MonitorBlock(properties.strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> MONITOR_GAMING_MINIMALIST = registerBlock("monitor_gaming_minimalist",
            (properties) -> new MonitorTypesBlock(properties.strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> MOUSE_GAMING_BLACK = registerBlock("mouse_gaming_black",
            (properties) -> new ComputerMouseBlock(properties.strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> KEYBOARD_MECHANICAL_BLACK = registerBlock("keyboard_mechanical_black",
            (properties) -> new KeyboardBlock(properties.strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> GAME_CONSOLE = registerBlock("game_console",
            (properties) -> new ConsoleBlock(properties.strength(1.0F).noOcclusion()));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> function) {
        DeferredBlock<T> toReturn = BLOCKS.registerBlock(name, function);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.registerItem(name, (properties) -> new BlockItem(block.get(), properties.useBlockDescriptionPrefix()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
