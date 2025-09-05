package net.nhatjs.nextgen_furniture.item;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.nhatjs.nextgen_furniture.block.ModBlocks;

import static net.nhatjs.nextgen_furniture.NhatJSNextGenFurnitureMod.MOD_ID;

public class ModItems {

    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(MOD_ID);

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}