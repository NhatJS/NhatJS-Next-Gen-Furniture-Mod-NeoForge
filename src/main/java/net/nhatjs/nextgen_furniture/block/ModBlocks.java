package net.nhatjs.nextgen_furniture.block;

import com.mrcrayfish.framework.api.registry.RegistryContainer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.nhatjs.nextgen_furniture.NhatJSNextGenFurnitureMod;
import net.nhatjs.nextgen_furniture.item.ModItems;

import java.util.function.Supplier;

@RegistryContainer
public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(NhatJSNextGenFurnitureMod.MOD_ID);

    public static final DeferredBlock<Block> LAPTOP = registerBlock("laptop",
            () -> new LaptopBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> TABLE_2X1_BLACK = registerBlock("table_2x1_black",
            () -> new Table2x1Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> TABLE_2X1_WHITE = registerBlock("table_2x1_white",
            () -> new Table2x1Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> TABLE_3X1_BLACK = registerBlock("table_3x1_black",
            () -> new Table3x1Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0F).noOcclusion()));
    public static final DeferredBlock<Block> TABLE_3X1_WHITE = registerBlock("table_3x1_white",
            () -> new Table3x1Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0F).noOcclusion()));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
