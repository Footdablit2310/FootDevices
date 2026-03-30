package com.footdablit2310.footdevices.registry;

import com.footdablit2310.footdevices.FootDevices;
import com.footdablit2310.footdevices.blockentity.FootDeviceBlockEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.bus.api.IEventBus;

public class ModBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, FootDevices.MOD_ID);

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<FootDeviceBlockEntity>> FOOT_DEVICE_BE =
            BLOCK_ENTITIES.register("foot_device",
                    () -> BlockEntityType.Builder.of(
                            FootDeviceBlockEntity::new,
                            ModBlocks.FOOT_DEVICE.get()
                    ).build(null));

    public static void init(IEventBus bus) {
        BLOCK_ENTITIES.register(bus);
    }
}