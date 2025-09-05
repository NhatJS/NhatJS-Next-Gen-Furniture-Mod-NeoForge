package net.nhatjs.nextgen_furniture.item;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.nhatjs.nextgen_furniture.NhatJSNextGenFurnitureMod;
import net.nhatjs.nextgen_furniture.block.ModBlocks;
import org.w3c.dom.Text;

import java.awt.*;

import static net.nhatjs.nextgen_furniture.NhatJSNextGenFurnitureMod.MOD_ID;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> NEXTGEN_FURNITURE_ITEMS_GROUP = REGISTRY.register("nextgen_furniture_tab",
            () -> CreativeModeTab.builder().title(Component.translatable("item_group.nextgen_furniture.nextgen_furniture_tab"))
                    .icon(() -> new ItemStack(ModBlocks.LAPTOP.get()))
                    .displayItems((parameters, tabData) -> {
                        tabData.accept(ModBlocks.LAPTOP.get().asItem());
                        tabData.accept(ModBlocks.TABLE_2X1_BLACK.get().asItem());
                        tabData.accept(ModBlocks.TABLE_2X1_WHITE.get().asItem());
                        tabData.accept(ModBlocks.TABLE_3X1_BLACK.get().asItem());
                        tabData.accept(ModBlocks.TABLE_3X1_WHITE.get().asItem());
                    }).build());
}
