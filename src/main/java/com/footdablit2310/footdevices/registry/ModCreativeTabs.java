package com.footdablit2310.footdevices.registry;

import com.footdablit2310.footdevices.FootDevices;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.bus.api.IEventBus;

public class ModCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FootDevices.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> FOOT_TAB =
            TABS.register("foot_tab", () -> CreativeModeTab.builder()
                    .title(Component.literal("Foot Devices"))
                    .icon(() -> new ItemStack(ModItems.FOOT_CHIP.get()))
                    .displayItems((params, output) -> {
                        output.accept(ModItems.FOOT_CHIP.get());
                        output.accept(ModBlocks.FOOT_DEVICE.get());
                    })
                    .build());

    public static void init(IEventBus bus) {
        TABS.register(bus);
    }
}