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
import net.nhatjs.nextgen_furniture.block.gamingpc.*;
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

    public static final DeferredBlock<Block> MONITOR = registerBlock("monitor",
            () -> new MonitorBlock(BlockBehaviour.Properties.of().strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> MONITOR_GAMING_MINIMALIST = registerBlock("monitor_gaming_minimalist",
            () -> new MonitorTypesBlock(BlockBehaviour.Properties.of().strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> MOUSE_GAMING_BLACK = registerBlock("mouse_gaming_black",
            () -> new ComputerMouseBlock(BlockBehaviour.Properties.of().strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> KEYBOARD_MECHANICAL_BLACK = registerBlock("keyboard_mechanical_black",
            () -> new KeyboardBlock(BlockBehaviour.Properties.of().strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> GAME_CONSOLE = registerBlock("game_console",
            () -> new ConsoleBlock(BlockBehaviour.Properties.of().strength(1.0F).noOcclusion()));

    public static final DeferredBlock<Block> KEYBOARD_MECHANICAL_BLACK_WOOD_OAK = registerBlock("keyboard_mechanical_black_wood_oak",
            () -> new KeyboardBlock(BlockBehaviour.Properties.of().strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> KEYBOARD_MECHANICAL_BLACK_WOOD_BIRCH = registerBlock("keyboard_mechanical_black_wood_birch",
            () -> new KeyboardBlock(BlockBehaviour.Properties.of().strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> WARDROBE_MODERN_WOOD_OAK_LEFT = registerBlock("wardrobe_modern_wood_oak_left",
            () -> new WardrobeBlock(BlockBehaviour.Properties.of().strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> WARDROBE_MODERN_WOOD_BIRCH_LEFT = registerBlock("wardrobe_modern_wood_birch_left",
            () -> new WardrobeBlock(BlockBehaviour.Properties.of().strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> WARDROBE_MODERN_WOOD_OAK_RIGHT = registerBlock("wardrobe_modern_wood_oak_right",
            () -> new WardrobeBlock(BlockBehaviour.Properties.of().strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> WARDROBE_MODERN_WOOD_BIRCH_RIGHT = registerBlock("wardrobe_modern_wood_birch_right",
            () -> new WardrobeBlock(BlockBehaviour.Properties.of().strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> CHAIR_2_WHITE_WHITE = registerBlock("chair_2_white_white",
            () -> new ChairBlock(BlockBehaviour.Properties.of().strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> CHAIR_2_WHITE_GRAY = registerBlock("chair_2_white_gray",
            () -> new ChairBlock(BlockBehaviour.Properties.of().strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> CHAIR_2_WOOD_OAK_WHITE = registerBlock("chair_2_wood_oak_white",
            () -> new ChairBlock(BlockBehaviour.Properties.of().strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> CHAIR_2_WOOD_OAK_GRAY = registerBlock("chair_2_wood_oak_gray",
            () -> new ChairBlock(BlockBehaviour.Properties.of().strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> CHAIR_2_WOOD_BIRCH_WHITE = registerBlock("chair_2_wood_birch_white",
            () -> new ChairBlock(BlockBehaviour.Properties.of().strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> CHAIR_2_WOOD_BIRCH_GRAY = registerBlock("chair_2_wood_birch_gray",
            () -> new ChairBlock(BlockBehaviour.Properties.of().strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> PC_GAMING = registerBlock("pc_gaming",
            () -> new DesktopBlock(BlockBehaviour.Properties.of().strength(2.0F).noOcclusion()));
    public static final DeferredBlock<Block> COMPUTER_CASE_GAMING = registerBlock("computer_case_gaming",
            () -> new ComputerCaseBlock(BlockBehaviour.Properties.of().strength(0.6F).noOcclusion()));
    public static final DeferredBlock<Block> COMPUTER_POWER_SUPPLY = registerBlock("computer_power_supply",
            () -> new PowerSupplyBlock(BlockBehaviour.Properties.of().strength(0.5F).noOcclusion()));
    public static final DeferredBlock<Block> MAINBOARD_GAMING = registerBlock("mainboard_gaming",
            () -> new MainboardBlock(BlockBehaviour.Properties.of().strength(0.75F).noOcclusion()));
    public static final DeferredBlock<Block> GRAPHICS_CARD_GAMING = registerBlock("graphics_card_gaming",
            () -> new GraphicsCardBlock(BlockBehaviour.Properties.of().strength(0.75F).noOcclusion()));
    public static final DeferredBlock<Block> AIO_COOLER_3_FANS = registerBlock("aio_cooler_3_fans",
            () -> new AIOCoolerBlock(BlockBehaviour.Properties.of().strength(0.75F).noOcclusion()));
    public static final DeferredBlock<Block> PC_GAMING_ADDED_1 = registerBlock("pc_gaming_added_1",
            () -> new GamingPCAdded1Block(BlockBehaviour.Properties.of().strength(0.75F).noOcclusion()));
    public static final DeferredBlock<Block> PC_GAMING_ADDED_2 = registerBlock("pc_gaming_added_2",
            () -> new GamingPCAdded2Block(BlockBehaviour.Properties.of().strength(0.75F).noOcclusion()));
    public static final DeferredBlock<Block> PC_GAMING_ADDED_3 = registerBlock("pc_gaming_added_3",
            () -> new GamingPCAdded3Block(BlockBehaviour.Properties.of().strength(0.75F).noOcclusion()));
    public static final DeferredBlock<Block> PC_GAMING_ADDED_4 = registerBlock("pc_gaming_added_4",
            () -> new GamingPCAdded4Block(BlockBehaviour.Properties.of().strength(0.75F).noOcclusion()));
    public static final DeferredBlock<Block> PC_GAMING_ADDED_5 = registerBlock("pc_gaming_added_5",
            () -> new GamingPCAdded5Block(BlockBehaviour.Properties.of().strength(0.75F).noOcclusion()));
    public static final DeferredBlock<Block> PC_GAMING_ADDED_6 = registerBlock("pc_gaming_added_6",
            () -> new GamingPCAdded6Block(BlockBehaviour.Properties.of().strength(0.75F).noOcclusion()));
    public static final DeferredBlock<Block> PC_GAMING_ADDED_7 = registerBlock("pc_gaming_added_7",
            () -> new GamingPCAdded7Block(BlockBehaviour.Properties.of().strength(0.75F).noOcclusion()));
    public static final DeferredBlock<Block> PC_GAMING_ADDED_8 = registerBlock("pc_gaming_added_8",
            () -> new GamingPCAdded8Block(BlockBehaviour.Properties.of().strength(0.75F).noOcclusion()));

    public static final DeferredBlock<Block> MONITOR_DUAL = registerBlock("monitor_dual",
            () -> new DualMonitorBlock(BlockBehaviour.Properties.of().strength(1F).noOcclusion()));
    public static final DeferredBlock<Block> MONITOR_DUAL_ALT = registerBlock("monitor_dual_alt",
            () -> new DualMonitorAlternateBlock(BlockBehaviour.Properties.of().strength(1F).noOcclusion()));
    public static final DeferredBlock<Block> MONITOR_DUAL_ALT_2 = registerBlock("monitor_dual_alt_2",
            () -> new DualMonitorAlternate2Block(BlockBehaviour.Properties.of().strength(1F).noOcclusion()));

    public static final DeferredBlock<Block> DRAWER_3_K_M_WOOD_OAK = registerBlock("drawer_3_k_m_wood_oak",
            () -> new DrawerBlock(BlockBehaviour.Properties.of().strength(1F).noOcclusion()));
    public static final DeferredBlock<Block> DRAWER_3_K_M_WOOD_BIRCH = registerBlock("drawer_3_k_m_wood_birch",
            () -> new DrawerBlock(BlockBehaviour.Properties.of().strength(1F).noOcclusion()));
    public static final DeferredBlock<Block> DRAWER_3_K_M_WOOD_OAK_BASE = registerBlock("drawer_3_k_m_wood_oak_base",
            () -> new DrawerBlock(BlockBehaviour.Properties.of().strength(1F).noOcclusion()));
    public static final DeferredBlock<Block> DRAWER_3_K_M_WOOD_BIRCH_BASE = registerBlock("drawer_3_k_m_wood_birch_base",
            () -> new DrawerBlock(BlockBehaviour.Properties.of().strength(1F).noOcclusion()));
    public static final DeferredBlock<Block> DRAWER_2_K_M_WOOD_OAK = registerBlock("drawer_2_k_m_wood_oak",
            () -> new DrawerBlock(BlockBehaviour.Properties.of().strength(1F).noOcclusion()));
    public static final DeferredBlock<Block> DRAWER_2_K_M_WOOD_BIRCH = registerBlock("drawer_2_k_m_wood_birch",
            () -> new DrawerBlock(BlockBehaviour.Properties.of().strength(1F).noOcclusion()));
    public static final DeferredBlock<Block> DRAWER_2_K_M_WOOD_OAK_BASE = registerBlock("drawer_2_k_m_wood_oak_base",
            () -> new DrawerBlock(BlockBehaviour.Properties.of().strength(1F).noOcclusion()));
    public static final DeferredBlock<Block> DRAWER_2_K_M_WOOD_BIRCH_BASE = registerBlock("drawer_2_k_m_wood_birch_base",
            () -> new DrawerBlock(BlockBehaviour.Properties.of().strength(1F).noOcclusion()));
    public static final DeferredBlock<Block> LIGHT_MODERN = registerBlock("light_modern",
            () -> new ModernLightBlock(BlockBehaviour.Properties.of().strength(1F).noOcclusion()));
    public static final DeferredBlock<Block> TABLE_1X1_WOOD_OAK = registerBlock("table_1x1_wood_oak",
            () -> new Table1x1Block(BlockBehaviour.Properties.of().strength(1F).noOcclusion()));
    public static final DeferredBlock<Block> TABLE_1X1_WOOD_BIRCH = registerBlock("table_1x1_wood_birch",
            () -> new Table1x1Block(BlockBehaviour.Properties.of().strength(1F).noOcclusion()));
    public static final DeferredBlock<Block> TABLE_2X1_WOOD_OAK = registerBlock("table_2x1_wood_oak",
            () -> new Table2x1CenterBlock(BlockBehaviour.Properties.of().strength(1F).noOcclusion()));
    public static final DeferredBlock<Block> TABLE_2X1_WOOD_BIRCH = registerBlock("table_2x1_wood_birch",
            () -> new Table2x1CenterBlock(BlockBehaviour.Properties.of().strength(1F).noOcclusion()));
    public static final DeferredBlock<Block> TABLE_2X1_WOOD_OAK_ALT = registerBlock("table_2x1_wood_oak_alt",
            () -> new Table2x1LeftBlock(BlockBehaviour.Properties.of().strength(1F).noOcclusion()));
    public static final DeferredBlock<Block> TABLE_2X1_WOOD_BIRCH_ALT = registerBlock("table_2x1_wood_birch_alt",
            () -> new Table2x1LeftBlock(BlockBehaviour.Properties.of().strength(1F).noOcclusion()));
    public static final DeferredBlock<Block> TABLE_2X1_WOOD_OAK_ALT_2 = registerBlock("table_2x1_wood_oak_alt_2",
            () -> new Table2x1RightBlock(BlockBehaviour.Properties.of().strength(1F).noOcclusion()));
    public static final DeferredBlock<Block> TABLE_2X1_WOOD_BIRCH_ALT_2 = registerBlock("table_2x1_wood_birch_alt_2",
            () -> new Table2x1RightBlock(BlockBehaviour.Properties.of().strength(1F).noOcclusion()));
    public static final DeferredBlock<Block> TABLE_3X1_WOOD_OAK = registerBlock("table_3x1_wood_oak",
            () -> new Table3x1Block(BlockBehaviour.Properties.of().strength(1F).noOcclusion()));
    public static final DeferredBlock<Block> TABLE_3X1_WOOD_BIRCH = registerBlock("table_3x1_wood_birch",
            () -> new Table3x1Block(BlockBehaviour.Properties.of().strength(1F).noOcclusion()));
    public static final DeferredBlock<Block> WASHING_MACHINE = registerBlock("washing_machine",
            () -> new WashingMachineBlock(BlockBehaviour.Properties.of().strength(1F).noOcclusion()));

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
