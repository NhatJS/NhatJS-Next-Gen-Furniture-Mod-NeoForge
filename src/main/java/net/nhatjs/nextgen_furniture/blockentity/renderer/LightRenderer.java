package net.nhatjs.nextgen_furniture.blockentity.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.LightTexture;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.block.ModelBlockRenderer;
import net.minecraft.client.renderer.block.model.BlockStateModel;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.nhatjs.nextgen_furniture.NhatJSNextGenFurnitureModClient;
import net.nhatjs.nextgen_furniture.block.ModernLightBlock;
import net.nhatjs.nextgen_furniture.blockentity.client.LightBlockEntity;

public class LightRenderer implements BlockEntityRenderer<LightBlockEntity> {
    private final Minecraft mc = Minecraft.getInstance();
    private final BlockStateModel led;

    public LightRenderer(BlockEntityRendererProvider.Context ctx) {
        led = mc.getModelManager().getStandaloneModel(NhatJSNextGenFurnitureModClient.LIGHT_MODERN_EXTRA_ID);
    }

    @Override
    public void render(LightBlockEntity entity, float tickDelta, PoseStack matrices,
                       MultiBufferSource vertexConsumers, int light, int overlay, Vec3 vec3) {
        Level world = entity.getLevel();
        if (world == null) return;

        BlockState state = entity.getBlockState();
        Direction f = state.getValue(ModernLightBlock.FACING);
        float yaw = 0f;
        float pitch = 0f;
        switch (f) {
            default -> yaw = 0f;
            case SOUTH -> yaw = 180f;
            case WEST -> yaw = 90f;
            case EAST -> yaw = 270f;
            case UP -> pitch = 90f;
            case DOWN -> pitch = -90f;
        };
        boolean powered = entity.isPowered();
        VertexConsumer vc = vertexConsumers.getBuffer(RenderType.cutoutMipped());

        matrices.pushPose();
        matrices.translate(0.5, 0.5, 0.5);
        matrices.mulPose(Axis.XP.rotationDegrees(pitch));
        matrices.mulPose(Axis.YP.rotationDegrees(yaw));
        matrices.translate(-0.5, -0.5, -0.5);

        ModelBlockRenderer.renderModel(matrices.last(), vc, led, 1, 1, 1, light, overlay);
        if (powered) {
            ModelBlockRenderer.renderModel(matrices.last(), vc, led, 1, 1, 1, LightTexture.FULL_BRIGHT, overlay);
        }
        matrices.popPose();
    }
}
