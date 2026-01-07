package net.nhatjs.nextgen_furniture.blockentity.client;

import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import net.nhatjs.nextgen_furniture.block.ModernLightBlock;
import net.nhatjs.nextgen_furniture.blockentity.ModBlockEntities;
import org.jetbrains.annotations.Nullable;

public class LightBlockEntity extends BlockEntity {
    private boolean powered;

    public LightBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.LIGHT_EXTRA.get(), pos, state);
    }

    public boolean isPowered() {return powered; }

    public void setPowered(boolean v) {
        if (powered == v) return;
        powered = v;
        setChanged();
        sync();

        if (level != null && !level.isClientSide()) {
            BlockState s = level.getBlockState(worldPosition);
            if (s.getValue(ModernLightBlock.LIT)) {
                level.setBlock(worldPosition, s.setValue(ModernLightBlock.LIT, v), Block.UPDATE_ALL);
            }
        }
    }

    @Override
    protected void saveAdditional(ValueOutput output) {
        super.saveAdditional(output);
        output.putBoolean("powered", powered);
    }

    @Override
    protected void loadAdditional(ValueInput input) {
        super.loadAdditional(input);
        input.getBooleanOr("powered", powered);
    }

    private void sync() {
        if (level instanceof ServerLevel sw) {
            sw.getChunkSource().blockChanged(worldPosition);
            level.sendBlockUpdated(worldPosition, getBlockState(), getBlockState(), Block.UPDATE_ALL);
        }
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