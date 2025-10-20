package net.nhatjs.nextgen_furniture.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.nhatjs.nextgen_furniture.NhatJSNextGenFurnitureMod;
import net.nhatjs.nextgen_furniture.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(NhatJSNextGenFurnitureMod.MOD_ID);

    public static final DeferredBlock<Block> CHAIR_WHITE = registerBlock("chair_white",
            () -> new ChairBlock(BlockBehaviour.Properties.of().strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> CHAIR_WOOD_OAK = registerBlock("chair_wood_oak",
            () -> new ChairBlock(BlockBehaviour.Properties.of().strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> TABLE_2X1_BLACK = registerBlock("table_2x1_black",
            () -> new Table2x1CenterBlock(BlockBehaviour.Properties.of().strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> TABLE_2X1_BLACK_ALT = registerBlock("table_2x1_black_alt",
            () -> new Table2x1LeftBlock(BlockBehaviour.Properties.of().strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> TABLE_2X1_BLACK_ALT_2 = registerBlock("table_2x1_black_alt_2",
            () -> new Table2x1RightBlock(BlockBehaviour.Properties.of().strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> TABLE_2X1_WHITE = registerBlock("table_2x1_white",
            () -> new Table2x1CenterBlock(BlockBehaviour.Properties.of().strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> TABLE_2X1_WHITE_ALT = registerBlock("table_2x1_white_alt",
            () -> new Table2x1LeftBlock(BlockBehaviour.Properties.of().strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> TABLE_2X1_WHITE_ALT_2 = registerBlock("table_2x1_white_alt_2",
            () -> new Table2x1RightBlock(BlockBehaviour.Properties.of().strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> TABLE_3X1_BLACK = registerBlock("table_3x1_black",
            () -> new Table3x1Block(BlockBehaviour.Properties.of().strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> TABLE_3X1_WHITE = registerBlock("table_3x1_white",
            () -> new Table3x1Block(BlockBehaviour.Properties.of().strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> COFFEE_TABLE_WHITE = registerBlock("coffee_table_white",
            () -> new CoffeeTableBlock(BlockBehaviour.Properties.of().strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> TABLE_DINING_WHITE = registerBlock("table_dining_white",
            () -> new DiningTableBlock(BlockBehaviour.Properties.of().strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> TABLE_DINING_WOOD_OAK = registerBlock("table_dining_wood_oak",
            () -> new DiningTableBlock(BlockBehaviour.Properties.of().strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> TV_STAND_WOOD_OAK = registerBlock("tv_stand_wood_oak",
            () -> new TVStandBlock(BlockBehaviour.Properties.of().strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> PICTURE_FRAME = registerBlock("picture_frame",
            () -> new PictureFrameBlock(BlockBehaviour.Properties.of().strength(0.2F).noOcclusion()));
    public static final DeferredBlock<Block> TRASH_CAN_BLACK = registerBlock("trash_can_black",
            () -> new TrashCanBlock(BlockBehaviour.Properties.of().strength(0.2F).noOcclusion()));
    public static final DeferredBlock<Block> TRASH_CAN_WHITE = registerBlock("trash_can_white",
            () -> new TrashCanBlock(BlockBehaviour.Properties.of().strength(0.2F).noOcclusion()));
    public static final DeferredBlock<Block> SOFA_GRAY = registerBlock("sofa_gray",
            () -> new SofaBlock(DyeColor.GRAY, BlockBehaviour.Properties.of().strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> FLOOR_LAMP = registerBlock("floor_lamp",
            () -> new FloorLampBlock(BlockBehaviour.Properties.of().strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> LAPTOP = registerBlock("laptop",
            () -> new LaptopBlock(BlockBehaviour.Properties.of().strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> TV_OLED = registerBlock("tv_oled",
            () -> new TVBlock(BlockBehaviour.Properties.of().strength(1.0F).noOcclusion()));

    public static final DeferredBlock<Block> CHAIR_WOOD_BIRCH = registerBlock("chair_wood_birch",
            () -> new ChairBlock(BlockBehaviour.Properties.of().strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> TV_STAND_WOOD_BIRCH = registerBlock("tv_stand_wood_birch",
            () -> new TVStandBlock(BlockBehaviour.Properties.of().strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> TABLE_DINING_WOOD_BIRCH = registerBlock("table_dining_wood_birch",
            () -> new DiningTableBlock(BlockBehaviour.Properties.of().strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> TABLE_1X1_BLACK = registerBlock("table_1x1_black",
            () -> new Table1x1Block(BlockBehaviour.Properties.of().strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> TABLE_1X1_WHITE = registerBlock("table_1x1_white",
            () -> new Table1x1Block(BlockBehaviour.Properties.of().strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> FLOOR_LAMP_B = registerBlock("floor_lamp_b",
            () -> new FloorLampBlock(BlockBehaviour.Properties.of().strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> SOFA_WHITE = registerBlock("sofa_white",
            () -> new SofaBlock(DyeColor.WHITE, BlockBehaviour.Properties.of().strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> BED_GRAY_WOOD_OAK = registerBlock("bed_gray_wood_oak",
            () -> new BedWoodBlock(BlockBehaviour.Properties.of().strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> BED_GRAY_WOOD_BIRCH = registerBlock("bed_gray_wood_birch",
            () -> new BedWoodBlock(BlockBehaviour.Properties.of().strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> BED_WHITE_WOOD_OAK = registerBlock("bed_white_wood_oak",
            () -> new BedWoodBlock(BlockBehaviour.Properties.of().strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> BED_WHITE_WOOD_BIRCH = registerBlock("bed_white_wood_birch",
            () -> new BedWoodBlock(BlockBehaviour.Properties.of().strength(1.0F).noOcclusion()));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
