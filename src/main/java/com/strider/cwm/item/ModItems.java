package com.strider.cwm.item;

import com.strider.cwm.ColoredWoodMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ColoredWoodMod.MOD_ID);

    public static final RegistryObject<Item> SALT = ITEMS.register("salt",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.COLOREDWOOD_TAB)));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
