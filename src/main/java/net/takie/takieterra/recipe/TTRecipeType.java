package net.takie.takieterra.recipe;

import net.minecraft.inventory.Inventory;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.takie.takieterra.TakieTerraMod;

import java.util.function.Supplier;

public enum TTRecipeType {
    COOKING_RECIPE_SERIALIZER("cooking", CookingPotRecipe.class, CookingPotRecipeSerializer::new);

    private final String pathName;
    private final Class<? extends Recipe<? extends Inventory>> recipeClass;
    private final Supplier<RecipeSerializer<? extends Recipe<? extends Inventory>>> recipeSerializerSupplier;
    private RecipeSerializer<? extends Recipe<? extends Inventory>> serializer;
    private RecipeType<? extends Recipe<? extends Inventory>> type;

    TTRecipeType(String pathName, Class<? extends Recipe<? extends Inventory>> recipeClass,
                        Supplier<RecipeSerializer<? extends Recipe<? extends Inventory>>> recipeSerializerSupplier) {
        this.pathName = pathName;
        this.recipeClass = recipeClass;
        this.recipeSerializerSupplier = recipeSerializerSupplier;
    }

    public static void registerAll() {
        for (TTRecipeType value : values()) {
            Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(TakieTerraMod.MOD_ID, value.pathName), value.serializer());
            value.type();
        }
    }

    public RecipeSerializer<? extends Recipe<? extends Inventory>> serializer() {
        if (serializer == null) {
            serializer = recipeSerializerSupplier.get();
        }

        return serializer;
    }

    @SuppressWarnings("unchecked")
    public <T extends Recipe<? extends Inventory>> RecipeType<T> type() {
        return (RecipeType<T>) type(recipeClass);
    }

    @SuppressWarnings({"unchecked","unused"})
    private <T extends Recipe<? extends Inventory>> RecipeType<T> type(Class<T> clazz) {
        if (type == null) {
            type = RecipeType.register(new Identifier(TakieTerraMod.MOD_ID, pathName).toString());
        }
        return (RecipeType<T>) type;
    }
}
