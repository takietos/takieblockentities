package net.takie.takieterra.recipe.backup;

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

public class WeaverBlockRecipeBackup implements Recipe<SimpleInventory> {

    private final Identifier ID;
    private final ItemStack Output;
    private final int CookingTime;
    private final int Experience;
    private final DefaultedList<Ingredient> RecipeItems;

    private enum WeaverBlockRecipeAttributes {
        INGREDIENTS("ingredients"),
        COOKINGTIME("cookingtime"),
        EXPERIENCE("experience"),
        RESULT("result");

        private String value;
        private WeaverBlockRecipeAttributes(String value) {
            this.value = value;
        }
    }

    private static final int NumberOfInputs = 2;
    private static final int NumberOfOutputs = 1;

    public WeaverBlockRecipeBackup(Identifier id, ItemStack output, DefaultedList<Ingredient> recipeItems, int cookingtime, int experience) {
        ID = id;
        Output = output;
        RecipeItems = recipeItems;
        CookingTime = cookingtime;
        Experience = experience;
    }

    @Override
    public boolean matches(SimpleInventory inventory, World world) {
        if (world.isClient()) return false;

        boolean matchA = RecipeItems.get(0).test(inventory.getStack(0 /* 0 is the first slot */)) &&
                RecipeItems.get(1).test(inventory.getStack(1 /* 1 is the second slot */));

        // This is here because the inputs are slot agnostic
        boolean matchB = RecipeItems.get(1).test(inventory.getStack(0 /* 0 is the first slot */)) &&
                RecipeItems.get(0).test(inventory.getStack(1 /* 1 is the second slot */));

        return matchA || matchB;
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
        return Serializer.INSTANCE;
    }

    @Override
    public ItemStack craft(SimpleInventory inventory, DynamicRegistryManager registryManager) {
        return Output.copy();
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
    public RecipeType<?> getType() {
        return Type.INSTANCE;
    }

    @Override
    public DefaultedList<Ingredient> getIngredients() {
        return this.RecipeItems;
    }

    public static class Type implements RecipeType<WeaverBlockRecipeBackup> {
        private Type() {
        }

        public static final Type INSTANCE = new Type();
        public static final String ID = "weaver_block";
    }

    public static class Serializer implements RecipeSerializer<WeaverBlockRecipeBackup> {
        public static final Serializer INSTANCE = new Serializer();
        public static final String ID = "weaver_block";
        // this is the name given in the json file

        @Override
        public WeaverBlockRecipeBackup read(Identifier id, JsonObject json) {
            DefaultedList<Ingredient> inputs = DefaultedList.ofSize(NumberOfInputs, Ingredient.EMPTY);
            ItemStack output = ShapedRecipe.outputFromJson(JsonHelper.getObject(json, WeaverBlockRecipeAttributes.RESULT.value));
            JsonArray ingredients = JsonHelper.getArray(json, WeaverBlockRecipeAttributes.INGREDIENTS.value);
            int cookingtime = JsonHelper.getInt(json, WeaverBlockRecipeAttributes.COOKINGTIME.value);
            int experience = JsonHelper.getInt(json, WeaverBlockRecipeAttributes.EXPERIENCE.value);

            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromJson(ingredients.get(i)));
            }

            return new WeaverBlockRecipeBackup(id, output, inputs, cookingtime, experience);
        }

        @Override
        public WeaverBlockRecipeBackup read(Identifier id, PacketByteBuf buf) {
            DefaultedList<Ingredient> inputs = DefaultedList.ofSize(buf.readInt(), Ingredient.EMPTY);
            int cookingtime = buf.readInt();
            int experience = buf.readInt();

            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromPacket(buf));
            }

            return new WeaverBlockRecipeBackup(id, /* output --> */ buf.readItemStack(), inputs, cookingtime, experience);
        }

        @Override
        public void write(PacketByteBuf buf, WeaverBlockRecipeBackup recipe) {
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