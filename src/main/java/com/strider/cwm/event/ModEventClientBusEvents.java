package com.strider.cwm.event;

import com.strider.cwm.ColoredWoodMod;
import com.strider.cwm.block.ModBlocks;
import com.strider.cwm.fluid.ModFluids;
import com.strider.cwm.screen.ElectricSmelterScreen;
import com.strider.cwm.screen.ModMenuTypes;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = ColoredWoodMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventClientBusEvents {

    @SubscribeEvent
    public static void clientSetup(final FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(ModFluids.SALTWATER_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModFluids.SALTWATER_FLUID.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModFluids.SALTWATER_FLOWING.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ELECTRIC_SMELTER.get(), RenderType.translucent());

        MenuScreens.register(ModMenuTypes.ELECTRIC_SMELTER_MENU.get(), ElectricSmelterScreen::new);
    }

}
