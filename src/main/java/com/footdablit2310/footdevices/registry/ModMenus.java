package com.footdablit2310.footdevices.registry;

import com.footdablit2310.footdevices.FootDevices;
import com.footdablit2310.footdevices.menu.FootDeviceMenu;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.bus.api.IEventBus;

public class ModMenus {

    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(Registries.MENU, FootDevices.MOD_ID);

    public static final DeferredHolder<MenuType<?>, MenuType<FootDeviceMenu>> FOOT_DEVICE_MENU =
            MENUS.register("foot_device_menu",
                    () -> IMenuTypeExtension.create(
                            (id, inv, buf) -> new FootDeviceMenu(id, inv, buf)
                    ));

    public static void init(IEventBus bus) {
        MENUS.register(bus);
    }
}