package com.strider.cwm.block.entity;

import com.strider.cwm.ColoredWoodMod;
import com.strider.cwm.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, ColoredWoodMod.MOD_ID);

    public static final RegistryObject<BlockEntityType<ElectricSmelterBlockEntity>> ELECTRIC_SMELTER_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("electric_smelter_block_entity", () ->
                    BlockEntityType.Builder.of(ElectricSmelterBlockEntity::new,
                            ModBlocks.ELECTRIC_SMELTER.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
