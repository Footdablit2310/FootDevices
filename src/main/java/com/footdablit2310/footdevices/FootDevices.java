package com.footdablit2310.footdevices;

import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.IEventBus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.footdablit2310.footdevices.registry.ModBlockEntities;
import com.footdablit2310.footdevices.registry.ModBlocks;
import com.footdablit2310.footdevices.registry.ModCreativeTabs;
import com.footdablit2310.footdevices.registry.ModItems;
import com.footdablit2310.footdevices.registry.ModMenus;
import com.footdablit2310.footdevices.registry.ModRegistries;
import com.footdablit2310.footdevices.registry.ModSounds;

@Mod(FootDevices.MOD_ID)
public class FootDevices {

    public static final String MOD_ID = "footdevices";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public FootDevices(IEventBus bus) {
    ModRegistries.init(bus);
    ModItems.register();
    ModBlocks.register();
    ModBlockEntities.init(bus);
    ModCreativeTabs.init(bus);
    ModSounds.init(bus);
    ModMenus.init(bus);
    }
}