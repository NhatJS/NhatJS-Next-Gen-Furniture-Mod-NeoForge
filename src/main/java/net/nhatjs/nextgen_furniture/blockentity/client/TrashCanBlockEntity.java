package net.nhatjs.nextgen_furniture.blockentity.client;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.nhatjs.nextgen_furniture.blockentity.ModBlockEntities;

public class TrashCanBlockEntity extends BlockEntity {
    public TrashCanBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.TRASH_CAN.get(), pos, state);
    }
}
