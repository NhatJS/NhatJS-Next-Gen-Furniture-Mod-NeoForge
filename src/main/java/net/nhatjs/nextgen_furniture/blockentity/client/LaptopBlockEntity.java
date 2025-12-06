package net.nhatjs.nextgen_furniture.blockentity.client;

import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import net.nhatjs.nextgen_furniture.block.LaptopBlock;
import net.nhatjs.nextgen_furniture.blockentity.ModBlockEntities;
import org.jetbrains.annotations.Nullable;

public class LaptopBlockEntity extends BlockEntity {
    private float open;
    private float prevOpen;
    private boolean targetOpen;
    private boolean powered;

    private static final float OPEN_MIN = 0.2f;

    public LaptopBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.LAPTOP.get(), pos, state);
    }

    public float getOpen() {return open;}
    public float getPrevOpen() {return prevOpen;}
    public boolean isTargetOpen() { return targetOpen; }

    public void setTargetOpen(boolean v) {
        targetOpen = v;
        if (!v) setPowered(false);
        setChanged(); sync();
    }

    public boolean isOpenEnough() {return open >= OPEN_MIN; }

    public boolean isPowered() {return powered; }

    public void setPowered(boolean v) {
        if (powered == v) return;
        powered = v;
        setChanged();
        sync();

        if (level != null && !level.isClientSide()) {
            BlockState s = level.getBlockState(worldPosition);
            if (s.getValue(LaptopBlock.TURN_ON)) {
                level.setBlock(worldPosition, s.setValue(LaptopBlock.TURN_ON, v), Block.UPDATE_ALL);
            }
        }
    }

    public static void tick(Level w, BlockPos p, BlockState s, LaptopBlockEntity lap) {
        lap.prevOpen = lap.open;
        float speed = 0.08f; //speed open/close
        float target = lap.targetOpen ? 1f : 0f;

        if (lap.open < target) lap.open = Math.min(target, lap.open + speed);
        else if (lap.open > target) lap.open = Math.max(target, lap.open - speed);

        if (!w.isClientSide() && Math.abs(lap.open - target) < 1e-3) {
            lap.sync();
        }
    }

    private void sync() {
        if (level instanceof ServerLevel sw) {
            sw.getChunkSource().blockChanged(worldPosition);
            level.sendBlockUpdated(worldPosition, getBlockState(), getBlockState(), 3);
        }
    }

    @Override
    protected void saveAdditional(ValueOutput output) {
        super.saveAdditional(output);
        output.putFloat("open", open);
        output.putFloat("prevOpen", prevOpen);
        output.putBoolean("targetOpen", targetOpen);
        output.putBoolean("powered", powered);
    }

    @Override
    protected void loadAdditional(ValueInput input) {
        super.loadAdditional(input);
        open = input.getFloatOr("open", open);
        float loadedPrev = input.getFloatOr("prevOpen", Float.NaN);
        prevOpen = Float.isNaN(loadedPrev) ? open : loadedPrev;

        targetOpen = input.getBooleanOr("targetOpen", targetOpen);
        powered = input.getBooleanOr("powered", powered);
    }



    @Override
    public @Nullable Packet<ClientGamePacketListener> getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    @Override
    public CompoundTag getUpdateTag(HolderLookup.Provider registries) {
        return saveWithoutMetadata(registries);
    }
}