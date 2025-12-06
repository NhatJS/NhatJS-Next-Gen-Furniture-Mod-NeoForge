package net.nhatjs.nextgen_furniture.blockentity;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.nhatjs.nextgen_furniture.NhatJSNextGenFurnitureMod;
import net.nhatjs.nextgen_furniture.block.ModBlocks;
import net.nhatjs.nextgen_furniture.blockentity.client.LaptopBlockEntity;

import java.util.function.Supplier;

public final class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE,
            NhatJSNextGenFurnitureMod.MOD_ID);

    public static final Supplier<BlockEntityType<LaptopBlockEntity>> LAPTOP = BLOCK_ENTITIES.register("laptop",
            () -> new BlockEntityType<>(LaptopBlockEntity::new, ModBlocks.LAPTOP.get()));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}