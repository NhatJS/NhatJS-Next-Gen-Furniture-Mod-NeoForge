package net.nhatjs.nextgen_furniture;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.nhatjs.nextgen_furniture.block.ModBlocks;
import net.nhatjs.nextgen_furniture.blockentity.ModBlockEntities;
import net.nhatjs.nextgen_furniture.blockentity.renderer.ConsoleRenderer;
import net.nhatjs.nextgen_furniture.blockentity.renderer.LaptopRenderer;
import net.nhatjs.nextgen_furniture.blockentity.renderer.TrashCanRenderer;
import net.nhatjs.nextgen_furniture.entity.ModEntities;
import net.nhatjs.nextgen_furniture.entity.renderer.ChairRenderer;

public class NhatJSNextGenFurnitureModClient {
    public static void init(IEventBus eventBus) {
        eventBus.addListener(NhatJSNextGenFurnitureModClient::onClientSetup);
    }
    public static final ResourceLocation LAPTOP_SCREEN = ResourceLocation.fromNamespaceAndPath(
            NhatJSNextGenFurnitureMod.MOD_ID, "block/laptop_screen_off");
    public static final ResourceLocation LAPTOP_SCREEN_ON = ResourceLocation.fromNamespaceAndPath(
            NhatJSNextGenFurnitureMod.MOD_ID, "block/laptop_screen_on");

    public static final ResourceLocation GAME_CONSOLE_EXTRA = ResourceLocation.fromNamespaceAndPath(
            NhatJSNextGenFurnitureMod.MOD_ID, "block/model_renderer/game_console_extra");
    public static final ResourceLocation TRASH_CAN_BLACK_EXTRA = ResourceLocation.fromNamespaceAndPath(
            NhatJSNextGenFurnitureMod.MOD_ID, "block/model_renderer/trash_can_black_extra");
    public static final ResourceLocation TRASH_CAN_WHITE_EXTRA = ResourceLocation.fromNamespaceAndPath(
            NhatJSNextGenFurnitureMod.MOD_ID, "block/model_renderer/trash_can_white_extra");

    private static void onClientSetup(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CHAIR_WHITE.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CHAIR_WOOD_OAK.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TABLE_2X1_BLACK.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TABLE_2X1_BLACK_ALT.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TABLE_2X1_BLACK_ALT_2.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TABLE_2X1_WHITE.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TABLE_2X1_WHITE_ALT.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TABLE_2X1_WHITE_ALT_2.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TABLE_3X1_BLACK.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TABLE_3X1_WHITE.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.COFFEE_TABLE_WHITE.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TABLE_DINING_WHITE.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TABLE_DINING_WOOD_OAK.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TV_STAND_WOOD_OAK.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PICTURE_FRAME.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TRASH_CAN_BLACK.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TRASH_CAN_WHITE.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.SOFA_GRAY.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.SOFA_WHITE.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.FLOOR_LAMP.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LAPTOP.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TV_OLED.get(), RenderType.CUTOUT_MIPPED);

            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CHAIR_WOOD_BIRCH.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TV_STAND_WOOD_BIRCH.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TABLE_DINING_WOOD_BIRCH.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TABLE_1X1_BLACK.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TABLE_1X1_WHITE.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.FLOOR_LAMP_B.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BED_GRAY_WOOD_OAK.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BED_GRAY_WOOD_BIRCH.get(), RenderType.CUTOUT_MIPPED);;
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BED_WHITE_WOOD_OAK.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BED_WHITE_WOOD_BIRCH.get(), RenderType.CUTOUT_MIPPED);

            EntityRenderers.register(ModEntities.CHAIR.get(), ChairRenderer::new);
            EntityRenderers.register(ModEntities.SOFA.get(), ChairRenderer::new);

            BlockEntityRenderers.register(ModBlockEntities.LAPTOP.get(), LaptopRenderer::new);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MONITOR.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MONITOR_GAMING_MINIMALIST.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MOUSE_GAMING_BLACK.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.KEYBOARD_MECHANICAL_BLACK.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.GAME_CONSOLE.get(), RenderType.CUTOUT_MIPPED);

            ItemBlockRenderTypes.setRenderLayer(ModBlocks.KEYBOARD_MECHANICAL_BLACK_WOOD_OAK.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.KEYBOARD_MECHANICAL_BLACK_WOOD_BIRCH.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WARDROBE_MODERN_WOOD_OAK_LEFT.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WARDROBE_MODERN_WOOD_BIRCH_LEFT.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WARDROBE_MODERN_WOOD_OAK_RIGHT.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WARDROBE_MODERN_WOOD_BIRCH_RIGHT.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CHAIR_2_WHITE_GRAY.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CHAIR_2_WHITE_WHITE.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CHAIR_2_WOOD_OAK_GRAY.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CHAIR_2_WOOD_OAK_WHITE.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CHAIR_2_WOOD_BIRCH_GRAY.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CHAIR_2_WOOD_BIRCH_WHITE.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PC_GAMING.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.COMPUTER_CASE_GAMING.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.COMPUTER_POWER_SUPPLY.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAINBOARD_GAMING.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAPHICS_CARD_GAMING.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.AIO_COOLER_3_FANS.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PC_GAMING_ADDED_1.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PC_GAMING_ADDED_2.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PC_GAMING_ADDED_3.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PC_GAMING_ADDED_4.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PC_GAMING_ADDED_5.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PC_GAMING_ADDED_6.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PC_GAMING_ADDED_7.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PC_GAMING_ADDED_8.get(), RenderType.CUTOUT_MIPPED);

            BlockEntityRenderers.register(ModBlockEntities.CONSOLE.get(), ConsoleRenderer::new);
            BlockEntityRenderers.register(ModBlockEntities.TRASH_CAN.get(), TrashCanRenderer::new);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MONITOR_DUAL.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MONITOR_DUAL_ALT.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MONITOR_DUAL_ALT_2.get(), RenderType.CUTOUT_MIPPED);
        });
    }
}