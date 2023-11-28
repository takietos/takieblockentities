package net.takie.takieterra.recipe.backup;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.takie.takieterra.TakieTerraMod;

public class TakieTerraRecipesBackup {
    public static void registerRecipes() {
        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(TakieTerraMod.MOD_ID, AlloyForgeRecipeBackup.Serializer.ID),
                AlloyForgeRecipeBackup.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(TakieTerraMod.MOD_ID, AlloyForgeRecipeBackup.Type.ID),
                AlloyForgeRecipeBackup.Type.INSTANCE);

        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(TakieTerraMod.MOD_ID, WoodworkerBlockRecipeBackup.Serializer.ID),
                WoodworkerBlockRecipeBackup.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(TakieTerraMod.MOD_ID, WoodworkerBlockRecipeBackup.Type.ID),
                WoodworkerBlockRecipeBackup.Type.INSTANCE);

        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(TakieTerraMod.MOD_ID, KettleRecipeBackup.Serializer.ID),
                KettleRecipeBackup.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(TakieTerraMod.MOD_ID, KettleRecipeBackup.Type.ID),
                KettleRecipeBackup.Type.INSTANCE);

        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(TakieTerraMod.MOD_ID, WeaverBlockRecipeBackup.Serializer.ID),
                WeaverBlockRecipeBackup.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(TakieTerraMod.MOD_ID, WeaverBlockRecipeBackup.Type.ID),
                WeaverBlockRecipeBackup.Type.INSTANCE);

        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(TakieTerraMod.MOD_ID, BrickOvenRecipeBackup.Serializer.ID),
                BrickOvenRecipeBackup.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(TakieTerraMod.MOD_ID, BrickOvenRecipeBackup.Type.ID),
                BrickOvenRecipeBackup.Type.INSTANCE);



    }
}
