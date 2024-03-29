package com.strider.cwm;

import com.strider.cwm.block.ModBlocks;
import com.strider.cwm.block.entity.ModBlockEntities;
import com.strider.cwm.fluid.ModFluids;
import com.strider.cwm.item.ModItems;
import com.strider.cwm.recipe.ModRecipes;
import com.strider.cwm.screen.ModMenuTypes;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ColoredWoodMod.MOD_ID)
public class ColoredWoodMod
{
    public static final String MOD_ID = "cwm";

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public ColoredWoodMod() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        ModFluids.register(eventBus);

        ModBlockEntities.register(eventBus);
        ModMenuTypes.register(eventBus);

        ModRecipes.register(eventBus);

        eventBus.addListener(this::setup);
        // Register the enqueueIMC method for modloading

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}