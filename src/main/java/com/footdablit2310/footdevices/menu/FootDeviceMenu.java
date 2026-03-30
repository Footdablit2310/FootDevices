package com.footdablit2310.footdevices.menu;

import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.ItemStack;

public class FootDeviceMenu extends AbstractContainerMenu {

    public FootDeviceMenu(int id, Inventory inv, RegistryFriendlyByteBuf buf) {
        super((MenuType<?>) null, id);
        // later: read extra data from buf if needed
    }

    @Override
    public boolean stillValid(Player player) {
        return true;
    }

    @Override
    public ItemStack quickMoveStack(Player player, int index) {
        return ItemStack.EMPTY;
    }
}