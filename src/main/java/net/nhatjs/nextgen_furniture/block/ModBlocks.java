package net.nhatjs.nextgen_furniture.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
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
            (properties) -> new ChairBlock(properties.mapColor(MapColor.STONE).strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> CHAIR_WOOD_OAK = registerBlock("chair_wood_oak",
            (properties) -> new ChairBlock(properties.mapColor(MapColor.STONE).strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> TABLE_2X1_BLACK = registerBlock("table_2x1_black",
            (properties) -> new Table2x1CenterBlock(properties.mapColor(MapColor.STONE).strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> TABLE_2X1_BLACK_ALT = registerBlock("table_2x1_black_alt",
            (properties) -> new Table2x1LeftBlock(properties.mapColor(MapColor.STONE).strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> TABLE_2X1_BLACK_ALT_2 = registerBlock("table_2x1_black_alt_2",
            (properties) -> new Table2x1RightBlock(properties.mapColor(MapColor.STONE).strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> TABLE_2X1_WHITE = registerBlock("table_2x1_white",
            (properties) -> new Table2x1CenterBlock(properties.mapColor(MapColor.STONE).strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> TABLE_2X1_WHITE_ALT = registerBlock("table_2x1_white_alt",
            (properties) -> new Table2x1LeftBlock(properties.mapColor(MapColor.STONE).strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> TABLE_2X1_WHITE_ALT_2 = registerBlock("table_2x1_white_alt_2",
            (properties) -> new Table2x1RightBlock(properties.mapColor(MapColor.STONE).strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> TABLE_3X1_BLACK = registerBlock("table_3x1_black",
            (properties) -> new Table3x1Block(properties.mapColor(MapColor.STONE).strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> TABLE_3X1_WHITE = registerBlock("table_3x1_white",
            (properties) -> new Table3x1Block(properties.mapColor(MapColor.STONE).strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> COFFEE_TABLE_WHITE = registerBlock("coffee_table_white",
            (properties) -> new CoffeeTableBlock(properties.mapColor(MapColor.STONE).strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> TABLE_DINING_WHITE = registerBlock("table_dining_white",
            (properties) -> new DiningTableBlock(properties.mapColor(MapColor.STONE).strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> TABLE_DINING_WOOD_OAK = registerBlock("table_dining_wood_oak",
            (properties) -> new DiningTableBlock(properties.mapColor(MapColor.STONE).strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> TV_STAND_WOOD_OAK = registerBlock("tv_stand_wood_oak",
            (properties) -> new TVStandBlock(properties.mapColor(MapColor.STONE).strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> PICTURE_FRAME = registerBlock("picture_frame",
            (properties) -> new PictureFrameBlock(properties.mapColor(MapColor.STONE).strength(0.2F).noOcclusion()));
    public static final DeferredBlock<Block> TRASH_CAN_BLACK = registerBlock("trash_can_black",
            (properties) -> new TrashCanBlock(properties.mapColor(MapColor.STONE).strength(0.2F).noOcclusion()));
    public static final DeferredBlock<Block> TRASH_CAN_WHITE = registerBlock("trash_can_white",
            (properties) -> new TrashCanBlock(properties.mapColor(MapColor.STONE).strength(0.2F).noOcclusion()));
    public static final DeferredBlock<Block> SOFA = registerBlock("sofa",
            (properties) -> new SofaBlock(properties.mapColor(MapColor.STONE).strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> FLOOR_LAMP = registerBlock("floor_lamp",
            (properties) -> new FloorLampBlock(properties.mapColor(MapColor.STONE).strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> LAPTOP = registerBlock("laptop",
            (properties) -> new LaptopBlock(properties.mapColor(MapColor.STONE).strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> TV_OLED = registerBlock("tv_oled",
            (properties) -> new TVBlock(properties.mapColor(MapColor.STONE).strength(1.0F).noOcclusion()));

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
