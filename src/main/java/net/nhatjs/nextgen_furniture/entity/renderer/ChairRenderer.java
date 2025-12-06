package net.nhatjs.nextgen_furniture.entity.renderer;

import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.EntityRenderState;
import net.nhatjs.nextgen_furniture.entity.client.ChairBlockEntity;

public class ChairRenderer extends EntityRenderer<ChairBlockEntity, EntityRenderState> {
    public ChairRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    public EntityRenderState createRenderState() {
        return new EntityRenderState();
    }

    @Override
    public boolean shouldRender(ChairBlockEntity entity, Frustum frustum, double x, double y, double z) {
        return true;
    }
}
