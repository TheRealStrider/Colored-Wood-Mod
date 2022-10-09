package com.strider.cwm.fluid;

import com.strider.cwm.ColoredWoodMod;
import com.strider.cwm.block.ModBlocks;
import com.strider.cwm.item.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.awt.*;


public class ModFluids {
    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation WATER_OVERLAY_RL = new ResourceLocation("block/water_overlay");

    public static final DeferredRegister<Fluid> FLUIDS
            = DeferredRegister.create(ForgeRegistries.FLUIDS, ColoredWoodMod.MOD_ID);


    public static final RegistryObject<FlowingFluid> SALTWATER_FLUID
            = FLUIDS.register("saltwater_fluid", () -> new ForgeFlowingFluid.Source(ModFluids.SALTWATER_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SALTWATER_FLOWING
            = FLUIDS.register("saltwater_flowing", () -> new ForgeFlowingFluid.Flowing(ModFluids.SALTWATER_PROPERTIES));


    public static final ForgeFlowingFluid.Properties SALTWATER_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> SALTWATER_FLUID.get(), () -> SALTWATER_FLOWING.get(), FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL)
            .density(15).luminosity(2).viscosity(2).sound(SoundEvents.BUCKET_EMPTY).overlay(WATER_OVERLAY_RL)
            .color(0xcc00a5a0)).slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(() -> ModFluids.SALTWATER_BLOCK.get()).bucket(() -> ModItems.SALTWATER_BUCKET.get());

    public static final RegistryObject<LiquidBlock> SALTWATER_BLOCK = ModBlocks.BLOCKS.register("honey",
            () -> new LiquidBlock(() -> ModFluids.SALTWATER_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
                    .noCollission().strength(100f).noDrops()));



    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
