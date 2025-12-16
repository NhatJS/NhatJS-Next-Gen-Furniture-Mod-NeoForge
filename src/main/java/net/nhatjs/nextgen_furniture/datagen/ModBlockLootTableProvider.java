package net.nhatjs.nextgen_furniture.datagen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.nhatjs.nextgen_furniture.block.ModBlocks;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    public ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    public void generate() {
        dropSelf(ModBlocks.CHAIR_WHITE.get());
        dropSelf(ModBlocks.CHAIR_WOOD_OAK.get());
        dropSelf(ModBlocks.TABLE_2X1_BLACK.get());
        dropSelf(ModBlocks.TABLE_2X1_BLACK_ALT.get());
        dropSelf(ModBlocks.TABLE_2X1_BLACK_ALT_2.get());
        dropSelf(ModBlocks.TABLE_2X1_WHITE.get());
        dropSelf(ModBlocks.TABLE_2X1_WHITE_ALT.get());
        dropSelf(ModBlocks.TABLE_2X1_WHITE_ALT_2.get());
        dropSelf(ModBlocks.TABLE_3X1_BLACK.get());
        dropSelf(ModBlocks.TABLE_3X1_WHITE.get());
        dropSelf(ModBlocks.COFFEE_TABLE_WHITE.get());
        dropSelf(ModBlocks.TABLE_DINING_WHITE.get());
        dropSelf(ModBlocks.TABLE_DINING_WOOD_OAK.get());
        dropSelf(ModBlocks.TV_STAND_WOOD_OAK.get());
        dropSelf(ModBlocks.PICTURE_FRAME.get());
        dropSelf(ModBlocks.TRASH_CAN_BLACK.get());
        dropSelf(ModBlocks.TRASH_CAN_WHITE.get());
        dropSelf(ModBlocks.SOFA_GRAY.get());
        dropSelf(ModBlocks.SOFA_WHITE.get());
        dropSelf(ModBlocks.FLOOR_LAMP.get());
        dropSelf(ModBlocks.LAPTOP.get());
        dropSelf(ModBlocks.TV_OLED.get());

        dropSelf(ModBlocks.CHAIR_WOOD_BIRCH.get());
        dropSelf(ModBlocks.TV_STAND_WOOD_BIRCH.get());
        dropSelf(ModBlocks.TABLE_DINING_WOOD_BIRCH.get());
        dropSelf(ModBlocks.TABLE_1X1_BLACK.get());
        dropSelf(ModBlocks.TABLE_1X1_WHITE.get());
        dropSelf(ModBlocks.FLOOR_LAMP_B.get());
        dropSelf(ModBlocks.BED_GRAY_WOOD_OAK.get());
        dropSelf(ModBlocks.BED_GRAY_WOOD_BIRCH.get());;
        dropSelf(ModBlocks.BED_WHITE_WOOD_OAK.get());
        dropSelf(ModBlocks.BED_WHITE_WOOD_BIRCH.get());

        dropSelf(ModBlocks.MONITOR.get());
        dropSelf(ModBlocks.MONITOR_GAMING_MINIMALIST.get());
        dropSelf(ModBlocks.MOUSE_GAMING_BLACK.get());
        dropSelf(ModBlocks.KEYBOARD_MECHANICAL_BLACK.get());
        dropSelf(ModBlocks.GAME_CONSOLE.get());

        dropSelf(ModBlocks.KEYBOARD_MECHANICAL_BLACK_WOOD_OAK.get());
        dropSelf(ModBlocks.KEYBOARD_MECHANICAL_BLACK_WOOD_BIRCH.get());
        dropSelf(ModBlocks.WARDROBE_MODERN_WOOD_OAK_LEFT.get());
        dropSelf(ModBlocks.WARDROBE_MODERN_WOOD_BIRCH_LEFT.get());
        dropSelf(ModBlocks.WARDROBE_MODERN_WOOD_OAK_RIGHT.get());
        dropSelf(ModBlocks.WARDROBE_MODERN_WOOD_BIRCH_RIGHT.get());
        dropSelf(ModBlocks.CHAIR_2_WHITE_GRAY.get());
        dropSelf(ModBlocks.CHAIR_2_WHITE_WHITE.get());
        dropSelf(ModBlocks.CHAIR_2_WOOD_OAK_GRAY.get());
        dropSelf(ModBlocks.CHAIR_2_WOOD_OAK_WHITE.get());
        dropSelf(ModBlocks.CHAIR_2_WOOD_BIRCH_GRAY.get());
        dropSelf(ModBlocks.CHAIR_2_WOOD_BIRCH_WHITE.get());
        dropSelf(ModBlocks.PC_GAMING.get());
        dropSelf(ModBlocks.COMPUTER_CASE_GAMING.get());
        dropSelf(ModBlocks.COMPUTER_POWER_SUPPLY.get());
        dropSelf(ModBlocks.MAINBOARD_GAMING.get());
        dropSelf(ModBlocks.GRAPHICS_CARD_GAMING.get());
        dropSelf(ModBlocks.AIO_COOLER_3_FANS.get());
    }

    @Override
    public Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
