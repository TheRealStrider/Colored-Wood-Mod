package com.strider.cwm.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class ModCreativeModeTab {
    public static final CreativeModeTab COLOREDWOOD_TAB = new CreativeModeTab("coloredwoodtab") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(ModItems.SALT.get());
        }
    };
}
