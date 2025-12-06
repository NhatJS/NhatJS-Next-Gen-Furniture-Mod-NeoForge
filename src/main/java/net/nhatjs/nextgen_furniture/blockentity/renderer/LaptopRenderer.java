package net.nhatjs.nextgen_furniture.blockentity.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.LightTexture;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.block.ModelBlockRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.core.Direction;
import net.minecraft.util.Mth;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.nhatjs.nextgen_furniture.NhatJSNextGenFurnitureModClient;
import net.nhatjs.nextgen_furniture.block.LaptopBlock;
import net.nhatjs.nextgen_furniture.blockentity.client.LaptopBlockEntity;

public class LaptopRenderer implements BlockEntityRenderer<LaptopBlockEntity> {
    public LaptopRenderer(BlockEntityRendererProvider.Context ctx) {
    }

    @Override
    public void render(LaptopBlockEntity be, float tickDelta, PoseStack poseStack,
                       MultiBufferSource multiBufferSource, int light, int overlay, Vec3 vec3) {

        Level world = be.getLevel();
        if (world == null) return;

        BlockState state = be.getBlockState();
        Direction f = state.getValue(LaptopBlock.FACING);
        float yaw = switch (f) {
            default -> 0f;
            case SOUTH -> 180f;
            case WEST -> 90f;
            case EAST -> 270f;
        };

        float t = Mth.lerp(tickDelta, be.getPrevOpen(), be.getOpen());
        float openDeg = t * 110f;
        boolean powered = be.isPowered();

        poseStack.pushPose();
        poseStack.translate(0.5, 0, 0.5);
        poseStack.mulPose(Axis.YP.rotationDegrees(yaw));
        poseStack.translate(-0.5, 0, -0.5);

        poseStack.pushPose();
        poseStack.translate(0.1, 0.04, 0.735);
        poseStack.mulPose(Axis.XP.rotationDegrees(openDeg));
        poseStack.translate(-0.1, -0.04, -0.735);

        VertexConsumer vc = multiBufferSource.getBuffer(RenderType.cutout());

        ModelBlockRenderer.renderModel(poseStack.last(), vc,
                Minecraft.getInstance().getModelManager().getStandaloneModel(
                        NhatJSNextGenFurnitureModClient.LAPTOP_SCREEN_ID),
                1f, 1f, 1f, light, overlay);

        if (powered) {
            ModelBlockRenderer.renderModel(poseStack.last(), vc,
                    Minecraft.getInstance().getModelManager().getStandaloneModel(
                            NhatJSNextGenFurnitureModClient.LAPTOP_SCREEN_ON_ID),
                    1f, 1f, 1f, LightTexture.FULL_BRIGHT, overlay);
        }

        poseStack.popPose();
        poseStack.popPose();
    }

}