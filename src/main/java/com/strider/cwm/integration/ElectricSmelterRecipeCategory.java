package com.strider.cwm.integration;

import com.strider.cwm.ColoredWoodMod;
import com.strider.cwm.block.ModBlocks;
import com.strider.cwm.recipe.ElectricSmelterRecipe;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnull;

public class ElectricSmelterRecipeCategory implements IRecipeCategory<ElectricSmelterRecipe> {
    public final static ResourceLocation UID = new ResourceLocation(ColoredWoodMod.MOD_ID, "electric_smelter");
    public final static ResourceLocation TEXTURE =
            new ResourceLocation(ColoredWoodMod.MOD_ID, "textures/gui/electric_smelter_gui.png");

    private final IDrawable background;
    private final IDrawable icon;

    public ElectricSmelterRecipeCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 85);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM, new ItemStack(ModBlocks.ELECTRIC_SMELTER.get()));
    }

    @Override
    public ResourceLocation getUid() {
        return UID;
    }

    @Override
    public Class<? extends ElectricSmelterRecipe> getRecipeClass() {
        return ElectricSmelterRecipe.class;
    }

    @Override
    public @NotNull Component getTitle() {
        return new TextComponent("Electric Smelter");
    }

    @Override
    public @NotNull IDrawable getBackground() {
        return this.background;
    }

    @Override
    public @NotNull IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public void setRecipe(@Nonnull IRecipeLayoutBuilder builder, @Nonnull ElectricSmelterRecipe recipe, @Nonnull IFocusGroup focusGroup) {
        builder.addSlot(RecipeIngredientRole.INPUT, 103, 18).addIngredients(recipe.getIngredients().get(1));
        builder.addSlot(RecipeIngredientRole.INPUT, 57, 18).addIngredients(recipe.getIngredients().get(0));

        builder.addSlot(RecipeIngredientRole.OUTPUT, 80, 60).addItemStack(recipe.getResultItem());
    }
}
