package com.strider.cwm.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;

public class ModPlacedFeatures {
    public static final Holder<PlacedFeature> SALT_BLOCK_PLACED = PlacementUtils.register("salt_block_placed",
            ModConfiguredFeatures.SALT_BLOCK, ModOrePlacement.commonOrePlacement(9,
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(50), VerticalAnchor.aboveBottom(200))));
}
