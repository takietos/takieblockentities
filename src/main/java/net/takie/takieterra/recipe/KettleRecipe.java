package net.takie.takieterra.recipe;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.recipe.*;
import net.minecraft.registry.DynamicRegistryManager;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonHelper;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.world.World;

public class KettleRecipe implements Recipe<SimpleInventory> {
    private final Identifier ID;
    private final ItemStack Output;
    private final int CookingTime;
    private final int Experience;
    private final DefaultedList<Ingredient> RecipeItems;

    private enum KettleRecipeAttributes {
        INGREDIENTS("ingredients"),
        COOKINGTIME("cookingtime"),
        EXPERIENCE("experience"),
        RESULT("result");

        private String value;
        private KettleRecipeAttributes(String value) {
            this.value = value;
        }
    }

    private static final int NumberOfInputs = 1;
    private static final int NumberOfOutputs = 1;

    public KettleRecipe(Identifier id, ItemStack output, DefaultedList<Ingredient> recipeItems, int cookingtime, int experience) {
        ID = id;
        Output = output;
        RecipeItems = recipeItems;
        CookingTime = cookingtime;
        Experience = experience;
    }

    @Override
    public boolean matches(SimpleInventory inventory, World world) {
        if(world.isClient()) {
            return false;
        }

        return RecipeItems.get(0).test(inventory.getStack(0));
    }

    @Override
    public boolean fits(int width, int height) {
        return true;
    }

    @Override
    public ItemStack getOutput(DynamicRegistryManager registryManager) {
        return Output.copy();
    }

    @Override
    public ItemStack craft(SimpleInventory inventory, DynamicRegistryManager registryManager) {
        return Output.copy();
    }

    public int getCookingTime() {
        return CookingTime;
    }

    public int getExperience() {
        return Experience;
    }

    @Override
    public Identifier getId() {
        return ID;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return KettleRecipe.Serializer.INSTANCE;
    }

    @Override
    public RecipeType<?> getType() {
        return KettleRecipe.Type.INSTANCE;
    }

    public static class Type implements RecipeType<KettleRecipe> {
        private Type() { }
        public static final KettleRecipe.Type INSTANCE = new KettleRecipe.Type();
        public static final String ID = "kettle_block";
    }

    public static class Serializer implements RecipeSerializer<KettleRecipe> {
        public static final KettleRecipe.Serializer INSTANCE = new KettleRecipe.Serializer();
        public static final String ID = "kettle_block"; // name given in the json file

        @Override
        public KettleRecipe read(Identifier id, JsonObject json) {
            DefaultedList<Ingredient> inputs = DefaultedList.ofSize(NumberOfInputs, Ingredient.EMPTY);
            ItemStack output = ShapedRecipe.outputFromJson(JsonHelper.getObject(json, "output"));
            JsonArray ingredients = JsonHelper.getArray(json, "ingredients");
            int cookingtime = JsonHelper.getInt(json, "cookingtime");
            int experience = JsonHelper.getInt(json, "experience");

            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromJson(ingredients.get(i)));
            }

            return new KettleRecipe(id, output, inputs, cookingtime, experience);
        }

        @Override
        public KettleRecipe read(Identifier id, PacketByteBuf buf) {
            DefaultedList<Ingredient> inputs = DefaultedList.ofSize(buf.readInt(), Ingredient.EMPTY);
            int cookingtime = buf.readInt();
            int experience = buf.readInt();

            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromPacket(buf));
            }

            return new KettleRecipe(id, buf.readItemStack(), inputs, cookingtime, experience);
        }

        @Override
        public void write(PacketByteBuf buf, KettleRecipe recipe) {
            buf.writeInt(recipe.getIngredients().size());

            for (Ingredient ingredient : recipe.getIngredients()) {
                ingredient.write(buf);
            }

            buf.writeItemStack(recipe.getOutput(null));

            buf.writeInt(recipe.getCookingTime());
            buf.writeInt(recipe.getExperience());
        }


    }
}