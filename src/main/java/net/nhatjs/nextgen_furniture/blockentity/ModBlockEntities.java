package net.nhatjs.nextgen_furniture.blockentity;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.nhatjs.nextgen_furniture.NhatJSNextGenFurnitureMod;
import net.nhatjs.nextgen_furniture.block.ModBlocks;
import net.nhatjs.nextgen_furniture.blockentity.client.*;

import java.util.function.Supplier;

public final class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(
            BuiltInRegistries.BLOCK_ENTITY_TYPE, NhatJSNextGenFurnitureMod.MOD_ID);

    public static final Supplier<BlockEntityType<LaptopBlockEntity>> LAPTOP = BLOCK_ENTITIES.register("laptop",
            () -> BlockEntityType.Builder.of(LaptopBlockEntity::new,
                    ModBlocks.LAPTOP.get()).build(null));

    public static final Supplier<BlockEntityType<ConsoleBlockEntity>> CONSOLE = BLOCK_ENTITIES.register("console",
            () -> BlockEntityType.Builder.of(ConsoleBlockEntity::new,
                    ModBlocks.GAME_CONSOLE.get()).build(null));

    public static final Supplier<BlockEntityType<TrashCanBlockEntity>> TRASH_CAN = BLOCK_ENTITIES.register("trash_can",
            () -> BlockEntityType.Builder.of(TrashCanBlockEntity::new,
                    ModBlocks.TRASH_CAN_BLACK.get(),
                    ModBlocks.TRASH_CAN_WHITE.get()).build(null));

    public static final Supplier<BlockEntityType<LightBlockEntity>> LIGHT_EXTRA = BLOCK_ENTITIES.register("light_extra",
            () -> BlockEntityType.Builder.of(LightBlockEntity::new,
                    ModBlocks.LIGHT_MODERN.get()).build(null));

    public static final Supplier<BlockEntityType<DrawerBlockEntity>> DRAWER = BLOCK_ENTITIES.register("drawer",
            () -> BlockEntityType.Builder.of(DrawerBlockEntity::new,
                    ModBlocks.DRAWER_2_K_M_WOOD_OAK.get(),
                    ModBlocks.DRAWER_2_K_M_WOOD_BIRCH.get(),
                    ModBlocks.DRAWER_3_K_M_WOOD_OAK.get(),
                    ModBlocks.DRAWER_3_K_M_WOOD_BIRCH.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}