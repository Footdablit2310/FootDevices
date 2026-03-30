package com.footdablit2310.footdevices.registry;

import com.footdablit2310.footdevices.FootDevices;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ModItems {

    public static final DeferredHolder<Item, Item> FOOT_CHIP =
            ModRegistries.ITEMS.register("foot_chip",
                    () -> new Item(new Item.Properties()));

    public static void register() {
        FootDevices.LOGGER.info("Registering items for {}", FootDevices.MOD_ID);
    }
}