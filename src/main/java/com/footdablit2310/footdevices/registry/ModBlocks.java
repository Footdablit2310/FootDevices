package com.footdablit2310.footdevices.registry;

import com.footdablit2310.footdevices.FootDevices;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ModBlocks {

    public static final DeferredHolder<Block, Block> FOOT_DEVICE =
            ModRegistries.BLOCKS.register("foot_device",
                    () -> new Block(BlockBehaviour.Properties.of()
                            .mapColor(MapColor.METAL)
                            .strength(4.0F)));

    public static void register() {
        FootDevices.LOGGER.info("Registering blocks for {}", FootDevices.MOD_ID);
    }
}