package net.nhatjs.nextgen_furniture.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.nhatjs.nextgen_furniture.NhatJSNextGenFurnitureMod;
import net.nhatjs.nextgen_furniture.block.ModBlocks;
import net.nhatjs.nextgen_furniture.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, NhatJSNextGenFurnitureMod.MOD_ID, existingFileHelper);
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
