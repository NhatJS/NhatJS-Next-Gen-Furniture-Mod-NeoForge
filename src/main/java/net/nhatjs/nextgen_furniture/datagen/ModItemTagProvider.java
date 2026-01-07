package net.nhatjs.nextgen_furniture.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ItemTagsProvider;
import net.nhatjs.nextgen_furniture.NhatJSNextGenFurnitureMod;
import net.nhatjs.nextgen_furniture.block.ModBlocks;
import net.nhatjs.nextgen_furniture.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, NhatJSNextGenFurnitureMod.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Items.TABLE_2X1_BLACK)
                .add(ModBlocks.TABLE_2X1_BLACK.asItem())
                .add(ModBlocks.TABLE_2X1_BLACK_ALT.asItem())
                .add(ModBlocks.TABLE_2X1_BLACK_ALT_2.asItem());

        tag(ModTags.Items.TABLE_2X1_WHITE)
                .add(ModBlocks.TABLE_2X1_WHITE.asItem())
                .add(ModBlocks.TABLE_2X1_WHITE_ALT.asItem())
                .add(ModBlocks.TABLE_2X1_WHITE_ALT_2.asItem());

        tag(ModTags.Items.TABLE_2X1_WOOD_OAK)
                .add(ModBlocks.TABLE_2X1_WOOD_OAK.asItem())
                .add(ModBlocks.TABLE_2X1_WOOD_OAK_ALT.asItem())
                .add(ModBlocks.TABLE_2X1_WOOD_OAK_ALT_2.asItem());

        tag(ModTags.Items.TABLE_2X1_WOOD_BIRCH)
                .add(ModBlocks.TABLE_2X1_WOOD_BIRCH.asItem())
                .add(ModBlocks.TABLE_2X1_WOOD_BIRCH_ALT.asItem())
                .add(ModBlocks.TABLE_2X1_WOOD_BIRCH_ALT_2.asItem());
    }
}
