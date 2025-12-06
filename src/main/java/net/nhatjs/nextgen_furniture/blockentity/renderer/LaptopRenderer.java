package net.nhatjs.nextgen_furniture.blockentity.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.block.ModelBlockRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.blockentity.state.BlockEntityRenderState;
import net.minecraft.client.renderer.feature.ModelFeatureRenderer;
import net.minecraft.client.renderer.state.CameraRenderState;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.core.Direction;
import net.minecraft.util.Mth;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.nhatjs.nextgen_furniture.NhatJSNextGenFurnitureModClient;
import net.nhatjs.nextgen_furniture.block.LaptopBlock;
import net.nhatjs.nextgen_furniture.blockentity.client.LaptopBlockEntity;
import org.jetbrains.annotations.Nullable;

public class LaptopRenderer implements BlockEntityRenderer<LaptopBlockEntity, LaptopRenderState> {
    public LaptopRenderer(BlockEntityRendererProvider.Context ctx) {
    }

    @Override
    public LaptopRenderState createRenderState() {
        return new LaptopRenderState();
    }

    @Override
    public void extractRenderState(LaptopBlockEntity entity,
                                   LaptopRenderState state,
                                   float tickDelta, Vec3 cameraPosition,
                                   @Nullable ModelFeatureRenderer.CrumblingOverlay breakProgress) {
        BlockEntityRenderer.super.extractRenderState(entity, state, tickDelta, cameraPosition, breakProgress);

        Level world = entity.getLevel();
        if (world == null) return;

        state.pos = entity.getBlockPos();
        state.blockState = entity.getBlockState();
        state.yaw = switch (state.blockState.getValue(LaptopBlock.FACING)) {
            default -> 0f;
            case SOUTH -> 180f;
            case WEST -> 90f;
            case EAST -> 270f;
        };
        float t = Mth.lerp(tickDelta, entity.getPrevOpen(), entity.getOpen());
        state.openDeg = t * 110f;
        state.powered = entity.isPowered();

        state.light = LevelRenderer.getLightColor(world, state.pos);
        state.overlay = OverlayTexture.NO_OVERLAY;
    }

    @Override
    public void submit(LaptopRenderState state,
                       PoseStack poseStack,
                       SubmitNodeCollector submitNodeCollector,
                       CameraRenderState cameraRenderState) {
        if (state.blockState == null || state.pos == null) return;

        poseStack.pushPose();
        poseStack.translate(0.5, 0, 0.5);
        poseStack.mulPose(Axis.YP.rotationDegrees(state.yaw));
        poseStack.translate(-0.5, 0, -0.5);

        poseStack.pushPose();
        poseStack.translate(0.1, 0.04, 0.735);
        poseStack.mulPose(Axis.XP.rotationDegrees(state.openDeg));
        poseStack.translate(-0.1, -0.04, -0.735);


        submitNodeCollector.submitBlockModel(poseStack, RenderType.cutout(),
                Minecraft.getInstance().getModelManager().getStandaloneModel(
                        NhatJSNextGenFurnitureModClient.LAPTOP_SCREEN_ID),
                1f, 1f, 1f, state.light, state.overlay, 0);

        if (state.powered) {
            submitNodeCollector.submitBlockModel(poseStack, RenderType.cutout(),
                    Minecraft.getInstance().getModelManager().getStandaloneModel(
                            NhatJSNextGenFurnitureModClient.LAPTOP_SCREEN_ON_ID),
                    1f, 1f, 1f, LightTexture.FULL_BRIGHT, state.overlay, 0);
        }

        poseStack.popPose();
        poseStack.popPose();
    }
}