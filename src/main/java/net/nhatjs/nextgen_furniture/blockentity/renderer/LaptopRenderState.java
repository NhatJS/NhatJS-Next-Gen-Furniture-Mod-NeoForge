package net.nhatjs.nextgen_furniture.blockentity.renderer;

import net.minecraft.client.renderer.blockentity.state.BlockEntityRenderState;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class LaptopRenderState extends BlockEntityRenderState {
    public float yaw;
    public float openDeg;
    public BlockState blockState;
    public BlockPos pos;
    public int light;
    public int overlay;
    public boolean powered;
}
