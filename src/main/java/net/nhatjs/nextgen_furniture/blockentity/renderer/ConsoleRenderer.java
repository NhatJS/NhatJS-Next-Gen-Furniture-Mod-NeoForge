package net.nhatjs.nextgen_furniture.blockentity.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.block.ModelBlockRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.nhatjs.nextgen_furniture.NhatJSNextGenFurnitureModClient;
import net.nhatjs.nextgen_furniture.block.ConsoleBlock;
import net.nhatjs.nextgen_furniture.blockentity.client.ConsoleBlockEntity;

public class ConsoleRenderer implements BlockEntityRenderer<ConsoleBlockEntity> {
    private final Minecraft mc = Minecraft.getInstance();

    public ConsoleRenderer(BlockEntityRendererProvider.Context ctx) {}

    @Override
    public void render(ConsoleBlockEntity be, float tickDelta, PoseStack poseStack,
                       MultiBufferSource multiBufferSource, int light, int overlay) {
        Level world = be.getLevel();
        if (world == null) return;

        BlockState state = be.getBlockState();
        Direction facing = state.getValue(ConsoleBlock.FACING);
        float yaw = switch (facing) {
            default -> 0f;
            case SOUTH -> 180f;
            case WEST -> 90f;
            case EAST -> 270f;
        };

        BakedModel screen = mc.getModelManager().getModel(ModelResourceLocation.standalone(NhatJSNextGenFurnitureModClient.GAME_CONSOLE_EXTRA));
        ModelBlockRenderer bmr = mc.getBlockRenderer().getModelRenderer();
        VertexConsumer vc = multiBufferSource.getBuffer(RenderType.cutoutMipped());

        poseStack.pushPose();
        poseStack.translate(0.5, 0.5, 0.5);
        poseStack.mulPose(Axis.YP.rotationDegrees(yaw));
        poseStack.translate(-0.5, -0.5, -0.5);

        poseStack.pushPose();
        poseStack.translate(0.5, 0.5, 0.5);
        poseStack.mulPose(Axis.YP.rotationDegrees(30F));
        poseStack.translate(-0.5, -0.5, -0.5);
        bmr.renderModel(poseStack.last(), vc, null, screen, 1, 1, 1, light, overlay);
        poseStack.popPose();

        poseStack.popPose();
    }
}
