package net.nhatjs.nextgen_furniture.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.nhatjs.nextgen_furniture.block.ModBlocks;

import static net.nhatjs.nextgen_furniture.NhatJSNextGenFurnitureMod.MOD_ID;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> NEXTGEN_FURNITURE_ITEMS_GROUP = REGISTRY.register("nextgen_furniture_tab",
            () -> CreativeModeTab.builder().title(Component.translatable("itemgroup.nextgen_furniture.nextgen_furniture_tab"))
                    .icon(() -> new ItemStack(ModItems.NEXTGEN_FURNITURE_LOGO.get()))
                    .displayItems((parameters, tabData) -> {
                        tabData.accept(ModBlocks.CHAIR_WHITE.get().asItem());
                        tabData.accept(ModBlocks.CHAIR_WOOD_OAK.get().asItem());
                        tabData.accept(ModBlocks.CHAIR_WOOD_BIRCH.get().asItem());
                        tabData.accept(ModBlocks.CHAIR_2_WHITE_GRAY.get().asItem());
                        tabData.accept(ModBlocks.CHAIR_2_WHITE_WHITE.get().asItem());
                        tabData.accept(ModBlocks.CHAIR_2_WOOD_OAK_GRAY.get().asItem());
                        tabData.accept(ModBlocks.CHAIR_2_WOOD_OAK_WHITE.get().asItem());
                        tabData.accept(ModBlocks.CHAIR_2_WOOD_BIRCH_GRAY.get().asItem());
                        tabData.accept(ModBlocks.CHAIR_2_WOOD_BIRCH_WHITE.get().asItem());
                        tabData.accept(ModBlocks.TABLE_1X1_BLACK.get().asItem());
                        tabData.accept(ModBlocks.TABLE_1X1_WHITE.get().asItem());
                        tabData.accept(ModBlocks.TABLE_2X1_BLACK.get().asItem());
                        tabData.accept(ModBlocks.TABLE_2X1_WHITE.get().asItem());
                        tabData.accept(ModBlocks.TABLE_3X1_BLACK.get().asItem());
                        tabData.accept(ModBlocks.TABLE_3X1_WHITE.get().asItem());
                        tabData.accept(ModBlocks.COFFEE_TABLE_WHITE.get().asItem());
                        tabData.accept(ModBlocks.TABLE_DINING_WHITE.get().asItem());
                        tabData.accept(ModBlocks.TABLE_DINING_WOOD_OAK.get().asItem());
                        tabData.accept(ModBlocks.TABLE_DINING_WOOD_BIRCH.get().asItem());
                        tabData.accept(ModBlocks.TV_STAND_WOOD_OAK.get().asItem());
                        tabData.accept(ModBlocks.TV_STAND_WOOD_BIRCH.get().asItem());
                        tabData.accept(ModBlocks.BED_GRAY_WOOD_OAK.get().asItem());
                        tabData.accept(ModBlocks.BED_GRAY_WOOD_BIRCH.get().asItem());
                        tabData.accept(ModBlocks.BED_WHITE_WOOD_OAK.get().asItem());
                        tabData.accept(ModBlocks.BED_WHITE_WOOD_BIRCH.get().asItem());
                        tabData.accept(ModBlocks.WARDROBE_MODERN_WOOD_OAK_LEFT.get().asItem());
                        tabData.accept(ModBlocks.WARDROBE_MODERN_WOOD_OAK_RIGHT.get().asItem());
                        tabData.accept(ModBlocks.WARDROBE_MODERN_WOOD_BIRCH_LEFT.get().asItem());
                        tabData.accept(ModBlocks.WARDROBE_MODERN_WOOD_BIRCH_RIGHT.get().asItem());
                        tabData.accept(ModBlocks.PICTURE_FRAME.get().asItem());
                        tabData.accept(ModBlocks.TRASH_CAN_BLACK.get().asItem());
                        tabData.accept(ModBlocks.TRASH_CAN_WHITE.get().asItem());
                        tabData.accept(ModBlocks.SOFA_GRAY.get().asItem());
                        tabData.accept(ModBlocks.SOFA_WHITE.get().asItem());
                        tabData.accept(ModBlocks.FLOOR_LAMP.get().asItem());
                        tabData.accept(ModBlocks.FLOOR_LAMP_B.get().asItem());
                        tabData.accept(ModBlocks.MONITOR.get().asItem());
                        tabData.accept(ModBlocks.MONITOR_DUAL.get().asItem());
                        tabData.accept(ModBlocks.MONITOR_GAMING_MINIMALIST.get().asItem());
                        tabData.accept(ModBlocks.KEYBOARD_MECHANICAL_BLACK.get().asItem());
                        tabData.accept(ModBlocks.KEYBOARD_MECHANICAL_BLACK_WOOD_OAK.get().asItem());
                        tabData.accept(ModBlocks.KEYBOARD_MECHANICAL_BLACK_WOOD_BIRCH.get().asItem());
                        tabData.accept(ModBlocks.MOUSE_GAMING_BLACK.get().asItem());
                        tabData.accept(ModBlocks.PC_GAMING.get().asItem());
                        tabData.accept(ModBlocks.LAPTOP.get().asItem());
                        tabData.accept(ModBlocks.TV_OLED.get().asItem());
                        tabData.accept(ModBlocks.GAME_CONSOLE.get().asItem());
                        tabData.accept(ModBlocks.COMPUTER_CASE_GAMING);
                        tabData.accept(ModItems.COMPUTER_FAN_BLADE_WHITE);
                        tabData.accept(ModItems.COMPUTER_RAM_GAMING);
                        tabData.accept(ModBlocks.COMPUTER_POWER_SUPPLY);
                        tabData.accept(ModBlocks.MAINBOARD_GAMING);
                        tabData.accept(ModBlocks.GRAPHICS_CARD_GAMING);
                        tabData.accept(ModBlocks.AIO_COOLER_3_FANS);
                        tabData.accept(ModItems.COMPUTER_CPU);
                    }).build());
}
