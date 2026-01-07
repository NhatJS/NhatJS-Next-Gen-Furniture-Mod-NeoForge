package net.nhatjs.nextgen_furniture;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.block.model.BlockStateModel;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.resources.Identifier;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.model.standalone.StandaloneModelKey;
import net.nhatjs.nextgen_furniture.block.ModBlocks;
import net.nhatjs.nextgen_furniture.blockentity.ModBlockEntities;
import net.nhatjs.nextgen_furniture.blockentity.renderer.LaptopRenderer;
import net.nhatjs.nextgen_furniture.blockentity.renderer.LightRenderer;
import net.nhatjs.nextgen_furniture.entity.ModEntities;
import net.nhatjs.nextgen_furniture.entity.renderer.ChairRenderer;

public class NhatJSNextGenFurnitureModClient {
    public static void init(IEventBus eventBus) {
        eventBus.addListener(NhatJSNextGenFurnitureModClient::onClientSetup);
    }
    public static final Identifier LAPTOP_SCREEN = Identifier.fromNamespaceAndPath(
            NhatJSNextGenFurnitureMod.MOD_ID, "extra/laptop_screen");
    public static final Identifier LAPTOP_SCREEN_ON = Identifier.fromNamespaceAndPath(
            NhatJSNextGenFurnitureMod.MOD_ID, "extra/laptop_screen_on");

    public static final Identifier LIGHT_MODERN_EXTRA = Identifier.fromNamespaceAndPath(
            NhatJSNextGenFurnitureMod.MOD_ID, "extra/light_modern_extra");

    public static final StandaloneModelKey<BlockStateModel> LAPTOP_SCREEN_ID = new StandaloneModelKey<BlockStateModel>(LAPTOP_SCREEN::getPath);
    public static final StandaloneModelKey<BlockStateModel> LAPTOP_SCREEN_ON_ID = new StandaloneModelKey<BlockStateModel>(LAPTOP_SCREEN_ON::getPath);
    public static final StandaloneModelKey<BlockStateModel> LIGHT_MODERN_EXTRA_ID = new StandaloneModelKey<BlockStateModel>(LIGHT_MODERN_EXTRA::getPath);

    private static void onClientSetup(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CHAIR_WHITE.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CHAIR_WOOD_OAK.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TABLE_2X1_BLACK.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TABLE_2X1_BLACK_ALT.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TABLE_2X1_BLACK_ALT_2.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TABLE_2X1_WHITE.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TABLE_2X1_WHITE_ALT.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TABLE_2X1_WHITE_ALT_2.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TABLE_3X1_BLACK.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TABLE_3X1_WHITE.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.COFFEE_TABLE_WHITE.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TABLE_DINING_WHITE.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TABLE_DINING_WOOD_OAK.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TV_STAND_WOOD_OAK.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PICTURE_FRAME.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TRASH_CAN_BLACK.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TRASH_CAN_WHITE.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.SOFA_GRAY.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.SOFA_WHITE.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.FLOOR_LAMP.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LAPTOP.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TV_OLED.get(), ChunkSectionLayer.CUTOUT);

            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CHAIR_WOOD_BIRCH.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TV_STAND_WOOD_BIRCH.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TABLE_DINING_WOOD_BIRCH.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TABLE_1X1_BLACK.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TABLE_1X1_WHITE.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.FLOOR_LAMP_B.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BED_GRAY_WOOD_OAK.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BED_GRAY_WOOD_BIRCH.get(), ChunkSectionLayer.CUTOUT);;
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BED_WHITE_WOOD_OAK.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BED_WHITE_WOOD_BIRCH.get(), ChunkSectionLayer.CUTOUT);

            EntityRenderers.register(ModEntities.CHAIR.get(), ChairRenderer::new);
            EntityRenderers.register(ModEntities.SOFA.get(), ChairRenderer::new);

            BlockEntityRenderers.register(ModBlockEntities.LAPTOP.get(), LaptopRenderer::new);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MONITOR.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MONITOR_GAMING_MINIMALIST.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MOUSE_GAMING_BLACK.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.KEYBOARD_MECHANICAL_BLACK.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.GAME_CONSOLE.get(), ChunkSectionLayer.CUTOUT);

            ItemBlockRenderTypes.setRenderLayer(ModBlocks.KEYBOARD_MECHANICAL_BLACK_WOOD_OAK.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.KEYBOARD_MECHANICAL_BLACK_WOOD_BIRCH.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WARDROBE_MODERN_WOOD_OAK_LEFT.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WARDROBE_MODERN_WOOD_BIRCH_LEFT.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WARDROBE_MODERN_WOOD_OAK_RIGHT.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WARDROBE_MODERN_WOOD_BIRCH_RIGHT.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CHAIR_2_WHITE_GRAY.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CHAIR_2_WHITE_WHITE.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CHAIR_2_WOOD_OAK_GRAY.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CHAIR_2_WOOD_OAK_WHITE.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CHAIR_2_WOOD_BIRCH_GRAY.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CHAIR_2_WOOD_BIRCH_WHITE.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PC_GAMING.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.COMPUTER_CASE_GAMING.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.COMPUTER_POWER_SUPPLY.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAINBOARD_GAMING.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAPHICS_CARD_GAMING.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.AIO_COOLER_3_FANS.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PC_GAMING_ADDED_1.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PC_GAMING_ADDED_2.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PC_GAMING_ADDED_3.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PC_GAMING_ADDED_4.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PC_GAMING_ADDED_5.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PC_GAMING_ADDED_6.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PC_GAMING_ADDED_7.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PC_GAMING_ADDED_8.get(), ChunkSectionLayer.CUTOUT);

            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MONITOR_DUAL.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MONITOR_DUAL_ALT.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MONITOR_DUAL_ALT_2.get(), ChunkSectionLayer.CUTOUT);

            ItemBlockRenderTypes.setRenderLayer(ModBlocks.DRAWER_3_K_M_WOOD_OAK.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.DRAWER_3_K_M_WOOD_BIRCH.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.DRAWER_3_K_M_WOOD_OAK_BASE.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.DRAWER_3_K_M_WOOD_BIRCH_BASE.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.DRAWER_2_K_M_WOOD_OAK.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.DRAWER_2_K_M_WOOD_BIRCH.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.DRAWER_2_K_M_WOOD_OAK_BASE.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.DRAWER_2_K_M_WOOD_BIRCH_BASE.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_MODERN.get(), ChunkSectionLayer.CUTOUT);
            BlockEntityRenderers.register(ModBlockEntities.LIGHT_EXTRA.get(), LightRenderer::new);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TABLE_1X1_WOOD_OAK.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TABLE_1X1_WOOD_BIRCH.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TABLE_2X1_WOOD_OAK.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TABLE_2X1_WOOD_OAK_ALT.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TABLE_2X1_WOOD_OAK_ALT_2.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TABLE_2X1_WOOD_BIRCH.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TABLE_2X1_WOOD_BIRCH_ALT.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TABLE_2X1_WOOD_BIRCH_ALT_2.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TABLE_3X1_WOOD_OAK.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TABLE_3X1_WOOD_BIRCH.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WASHING_MACHINE.get(), ChunkSectionLayer.CUTOUT);
        });
    }
}
