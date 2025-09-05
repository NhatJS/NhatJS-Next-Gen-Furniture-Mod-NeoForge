package net.nhatjs.nextgen_furniture;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.nhatjs.nextgen_furniture.block.ModBlocks;

public class NextGenClientInit {
    public static void init(IEventBus eventBus) {
        eventBus.addListener(NextGenClientInit::onClientSetup);
    }

    private static void onClientSetup(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LAPTOP.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TABLE_2X1_BLACK.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TABLE_2X1_WHITE.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TABLE_3X1_BLACK.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TABLE_3X1_WHITE.get(), RenderType.CUTOUT_MIPPED);
        });
    }
}
