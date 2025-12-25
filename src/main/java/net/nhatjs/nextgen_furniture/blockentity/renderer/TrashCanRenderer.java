package net.nhatjs.nextgen_furniture.blockentity.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.LevelRenderer;
import net.minecraft.client.renderer.LightTexture;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.block.ModelBlockRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LightLayer;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.client.model.data.ModelData;
import net.nhatjs.nextgen_furniture.NhatJSNextGenFurnitureModClient;
import net.nhatjs.nextgen_furniture.block.ConsoleBlock;
import net.nhatjs.nextgen_furniture.block.ModBlocks;
import net.nhatjs.nextgen_furniture.blockentity.client.TrashCanBlockEntity;

public class TrashCanRenderer implements BlockEntityRenderer<TrashCanBlockEntity> {
    private final Minecraft mc = Minecraft.getInstance();

    public TrashCanRenderer(BlockEntityRendererProvider.Context ctx) {}

    @Override
    public void render(TrashCanBlockEntity be, float tickDelta, PoseStack poseStack,
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

        BakedModel black = mc.getModelManager().getModel(ModelResourceLocation.standalone(NhatJSNextGenFurnitureModClient.TRASH_CAN_BLACK_EXTRA));
        BakedModel white = mc.getModelManager().getModel(ModelResourceLocation.standalone(NhatJSNextGenFurnitureModClient.TRASH_CAN_WHITE_EXTRA));
        ModelBlockRenderer bmr = mc.getBlockRenderer().getModelRenderer();
        VertexConsumer vc = multiBufferSource.getBuffer(RenderType.cutoutMipped());

        poseStack.pushPose();
        poseStack.translate(0.5, 0, 0.5);
        poseStack.mulPose(Axis.YP.rotationDegrees(yaw));
        poseStack.translate(-0.5, -0, -0.5);

        poseStack.pushPose();
        poseStack.translate(0.5, 0.4942, 0.2357);
        poseStack.mulPose(Axis.XP.rotationDegrees(-10F));
        poseStack.translate(-0.5, -0.5, -0.5);
        if (state.getBlock() == ModBlocks.TRASH_CAN_BLACK.get()) {
            bmr.tesselateWithAO(world, black, state, be.getBlockPos(),
                    poseStack, vc, false, world.random, light, overlay);
        }
        else if (state.getBlock() == ModBlocks.TRASH_CAN_WHITE.get()) {
            bmr.tesselateWithAO(world, white, state, be.getBlockPos(),
                    poseStack, vc, false, world.random, light, overlay);
        }
        poseStack.popPose();

        poseStack.pushPose();
        poseStack.translate(0, 0, 1);
        poseStack.mulPose(Axis.YP.rotationDegrees(90F));
        poseStack.translate(0.5, 0.4942, 0.2357);
        poseStack.mulPose(Axis.XP.rotationDegrees(-10F));
        poseStack.translate(-0.5, -0.5, -0.5);
        if (state.getBlock() == ModBlocks.TRASH_CAN_BLACK.get()) {
            bmr.tesselateWithAO(world, black, state, be.getBlockPos(),
                    poseStack, vc, false, world.random, light, overlay);
        }
        else if (state.getBlock() == ModBlocks.TRASH_CAN_WHITE.get()) {
            bmr.tesselateWithAO(world, white, state, be.getBlockPos(),
                    poseStack, vc, false, world.random, light, overlay);
        }
        poseStack.popPose();

        poseStack.pushPose();
        poseStack.translate(1, 0, 1);
        poseStack.mulPose(Axis.YP.rotationDegrees(180F));
        poseStack.translate(0.5, 0.4942, 0.2357);
        poseStack.mulPose(Axis.XP.rotationDegrees(-10F));
        poseStack.translate(-0.5, -0.5, -0.5);
        if (state.getBlock() == ModBlocks.TRASH_CAN_BLACK.get()) {
            bmr.tesselateWithAO(world, black, state, be.getBlockPos(),
                    poseStack, vc, false, world.random, light, overlay);
        }
        else if (state.getBlock() == ModBlocks.TRASH_CAN_WHITE.get()) {
            bmr.tesselateWithAO(world, white, state, be.getBlockPos(),
                    poseStack, vc, false, world.random, light, overlay);
        }
        poseStack.popPose();

        poseStack.pushPose();
        poseStack.translate(1, 0, 0);
        poseStack.mulPose(Axis.YP.rotationDegrees(270F));
        poseStack.translate(0.5, 0.4942, 0.2357);
        poseStack.mulPose(Axis.XP.rotationDegrees(-10F));
        poseStack.translate(-0.5, -0.5, -0.5);
        if (state.getBlock() == ModBlocks.TRASH_CAN_BLACK.get()) {
            bmr.tesselateWithAO(world, black, state, be.getBlockPos(),
                    poseStack, vc, false, world.random, light, overlay);
        }
        else if (state.getBlock() == ModBlocks.TRASH_CAN_WHITE.get()) {
            bmr.tesselateWithAO(world, white, state, be.getBlockPos(),
                    poseStack, vc, false, world.random, light, overlay);
        }
        poseStack.popPose();

        poseStack.popPose();
    }
}
