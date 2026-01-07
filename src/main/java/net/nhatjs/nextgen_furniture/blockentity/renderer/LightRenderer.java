package net.nhatjs.nextgen_furniture.blockentity.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.block.model.BlockStateModel;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.feature.ModelFeatureRenderer;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.client.renderer.state.CameraRenderState;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.nhatjs.nextgen_furniture.NhatJSNextGenFurnitureModClient;
import net.nhatjs.nextgen_furniture.block.ModernLightBlock;
import net.nhatjs.nextgen_furniture.blockentity.client.LightBlockEntity;
import org.jetbrains.annotations.Nullable;

public class LightRenderer implements BlockEntityRenderer<LightBlockEntity, LightRenderState> {
    private final Minecraft mc = Minecraft.getInstance();
    private final BlockStateModel led;

    public LightRenderer(BlockEntityRendererProvider.Context ctx) {
        led = mc.getModelManager().getStandaloneModel(NhatJSNextGenFurnitureModClient.LIGHT_MODERN_EXTRA_ID);
    }

    @Override
    public LightRenderState createRenderState() {
        return new LightRenderState();
    }

    @Override
    public void extractRenderState(LightBlockEntity entity, LightRenderState renderState,
                                   float partialTick, Vec3 cameraPosition,
                                   @Nullable ModelFeatureRenderer.CrumblingOverlay breakProgress) {
        BlockEntityRenderer.super.extractRenderState(entity, renderState, partialTick, cameraPosition, breakProgress);
        Level world = entity.getLevel();
        if (world == null) return;

        renderState.pos = entity.getBlockPos();
        renderState.blockState = entity.getBlockState();
        BlockState state = entity.getBlockState();
        Direction f = state.getValue(ModernLightBlock.FACING);
        renderState.yaw = 0f;
        renderState.pitch = 0f;
        switch (f) {
            default -> renderState.yaw = 0f;
            case SOUTH -> renderState.yaw = 180f;
            case WEST -> renderState.yaw = 90f;
            case EAST -> renderState.yaw = 270f;
            case UP -> renderState.pitch = 90f;
            case DOWN -> renderState.pitch = -90f;
        };
        renderState.powered = entity.isPowered();
        renderState.light = LevelRenderer.getLightColor(world, renderState.pos);
        renderState.overlay = OverlayTexture.NO_OVERLAY;
    }

    @Override
    public void submit(LightRenderState renderState, PoseStack matrices, SubmitNodeCollector submitNodeCollector, CameraRenderState cameraRenderState) {
        matrices.pushPose();
        matrices.translate(0.5, 0.5, 0.5);
        matrices.mulPose(Axis.XP.rotationDegrees(renderState.pitch));
        matrices.mulPose(Axis.YP.rotationDegrees(renderState.yaw));
        matrices.translate(-0.5, -0.5, -0.5);

        submitNodeCollector.submitBlockModel(matrices, RenderTypes.cutoutMovingBlock(), led, 1, 1, 1, renderState.light, renderState.overlay, 0);
        if (renderState.powered) {
            submitNodeCollector.submitBlockModel(matrices, RenderTypes.cutoutMovingBlock(), led, 1, 1, 1, LightTexture.FULL_BRIGHT, renderState.overlay, 0);
        }
        matrices.popPose();
    }
}