package net.nhatjs.nextgen_furniture.blockentity.renderer;

import net.minecraft.client.renderer.blockentity.state.BlockEntityRenderState;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class LightRenderState extends BlockEntityRenderState {
    public BlockState blockState;
    public BlockPos pos;
    public float yaw;
    public float pitch;
    public int light;
    public int overlay;
    public boolean powered;
}