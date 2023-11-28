package net.takie.takieterra.recipe;

import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.takie.takieterra.TakieTerraMod;

public class TakieTerraRecipes {
    public static void registerRecipes() {
        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(TakieTerraMod.MOD_ID, AlloyForgeRecipe.Serializer.ID),
                AlloyForgeRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(TakieTerraMod.MOD_ID, AlloyForgeRecipe.Type.ID),
                AlloyForgeRecipe.Type.INSTANCE);

        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(TakieTerraMod.MOD_ID, WoodworkerBlockRecipe.Serializer.ID),
                WoodworkerBlockRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(TakieTerraMod.MOD_ID, WoodworkerBlockRecipe.Type.ID),
                WoodworkerBlockRecipe.Type.INSTANCE);

        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(TakieTerraMod.MOD_ID, KettleRecipe.Serializer.ID),
                KettleRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(TakieTerraMod.MOD_ID, KettleRecipe.Type.ID),
                KettleRecipe.Type.INSTANCE);

        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(TakieTerraMod.MOD_ID, WeaverBlockRecipe.Serializer.ID),
                WeaverBlockRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(TakieTerraMod.MOD_ID, WeaverBlockRecipe.Type.ID),
                WeaverBlockRecipe.Type.INSTANCE);

    }
}
