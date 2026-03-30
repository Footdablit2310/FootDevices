package com.footdablit2310.footdevices.registry;

import com.footdablit2310.footdevices.FootDevices;
import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;

public class ModSounds {

    public static final DeferredRegister<SoundEvent> SOUNDS =
            DeferredRegister.create(Registries.SOUND_EVENT, FootDevices.MOD_ID);

    public static final DeferredHolder<SoundEvent, SoundEvent> DEVICE_BEEP =
            SOUNDS.register("device_beep",
                    () -> SoundEvent.createVariableRangeEvent(
                            ResourceLocation.fromNamespaceAndPath(FootDevices.MOD_ID, "device_beep")
                    ));

    public static void init(IEventBus bus) {
        SOUNDS.register(bus);
    }
}