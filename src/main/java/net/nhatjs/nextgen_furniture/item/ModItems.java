package net.nhatjs.nextgen_furniture.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static net.nhatjs.nextgen_furniture.NhatJSNextGenFurnitureMod.MOD_ID;

public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(MOD_ID);

    public static final DeferredItem<Item> NEXTGEN_FURNITURE_LOGO = ITEMS.registerItem("nextgen_furniture_logo",
            Item::new, new Item.Properties());
    public static final DeferredItem<Item> COMPUTER_FAN_BLADE_WHITE = ITEMS.registerItem("computer_fan_blade_white",
            Item::new, new Item.Properties());
    public static final DeferredItem<Item> COMPUTER_RAM_GAMING = ITEMS.registerItem("computer_ram_gaming",
            Item::new, new Item.Properties());
    public static final DeferredItem<Item> COMPUTER_CPU = ITEMS.registerItem("computer_cpu",
            Item::new, new Item.Properties());

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}