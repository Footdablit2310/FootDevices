package com.footdablit2310.footdevices.blockentity;

import com.footdablit2310.footdevices.registry.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class FootDeviceBlockEntity extends BlockEntity {

    public FootDeviceBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.FOOT_DEVICE_BE.get(), pos, state);
    }
}