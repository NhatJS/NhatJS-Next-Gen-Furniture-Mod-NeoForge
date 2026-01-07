package net.nhatjs.nextgen_furniture.blockentity;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.nhatjs.nextgen_furniture.NhatJSNextGenFurnitureMod;
import net.nhatjs.nextgen_furniture.block.ModBlocks;
import net.nhatjs.nextgen_furniture.blockentity.client.DrawerBlockEntity;
import net.nhatjs.nextgen_furniture.blockentity.client.LaptopBlockEntity;
import net.nhatjs.nextgen_furniture.blockentity.client.LightBlockEntity;

import java.util.function.Supplier;

public final class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE,
            NhatJSNextGenFurnitureMod.MOD_ID);

    public static final Supplier<BlockEntityType<LaptopBlockEntity>> LAPTOP = BLOCK_ENTITIES.register("laptop",
            () -> new BlockEntityType<>(LaptopBlockEntity::new, ModBlocks.LAPTOP.get()));

    public static final Supplier<BlockEntityType<LightBlockEntity>> LIGHT_EXTRA = BLOCK_ENTITIES.register("light_extra",
            () -> new BlockEntityType<>(LightBlockEntity::new, ModBlocks.LIGHT_MODERN.get()));

    public static final Supplier<BlockEntityType<DrawerBlockEntity>> DRAWER = BLOCK_ENTITIES.register("drawer",
            () -> new BlockEntityType<>(DrawerBlockEntity::new,
                    ModBlocks.DRAWER_3_K_M_WOOD_OAK.get(),
                    ModBlocks.DRAWER_3_K_M_WOOD_BIRCH.get(),
                    ModBlocks.DRAWER_2_K_M_WOOD_OAK.get(),
                    ModBlocks.DRAWER_2_K_M_WOOD_BIRCH.get()));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}