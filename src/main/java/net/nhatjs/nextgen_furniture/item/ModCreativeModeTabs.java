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
            () -> CreativeModeTab.builder().title(Component.translatable("item_group.nextgen_furniture.nextgen_furniture_tab"))
                    .icon(() -> new ItemStack(ModItems.NEXTGEN_FURNITURE_LOGO.get()))
                    .displayItems((parameters, tabData) -> {
                        tabData.accept(ModBlocks.CHAIR_WHITE.get().asItem());
                        tabData.accept(ModBlocks.CHAIR_WOOD_OAK.get().asItem());
                        tabData.accept(ModBlocks.TABLE_2X1_BLACK.get().asItem());
                        tabData.accept(ModBlocks.TABLE_2X1_WHITE.get().asItem());
                        tabData.accept(ModBlocks.TABLE_3X1_BLACK.get().asItem());
                        tabData.accept(ModBlocks.TABLE_3X1_WHITE.get().asItem());
                        tabData.accept(ModBlocks.TABLE_DINING_WHITE.get().asItem());
                        tabData.accept(ModBlocks.TABLE_DINING_WOOD_OAK.get().asItem());
                        tabData.accept(ModBlocks.PICTURE_FRAME.get().asItem());
                        tabData.accept(ModBlocks.LAPTOP.get().asItem());
                    }).build());
}
