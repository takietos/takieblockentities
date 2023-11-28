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

public class WeaverBlockRecipe implements Recipe<SimpleInventory> {

    private final Identifier id;
    private final ItemStack output;
    private final int cookingTime;
    private final int experience;
    private final DefaultedList<Ingredient> recipeItems;

    public WeaverBlockRecipe(Identifier id, ItemStack output, DefaultedList<Ingredient> recipeItems, int cookingtime, int experience) {
        this.id = id;
        this.output = output;
        this.recipeItems = recipeItems;
        this.cookingTime = cookingtime;
        this.experience = experience;
    }

    @Override
    public boolean matches(SimpleInventory inventory, World world) {
        if (world.isClient()) return false;

        boolean matchA = recipeItems.get(0).test(inventory.getStack(0 /* 0 is the first slot */)) &&
                recipeItems.get(1).test(inventory.getStack(1 /* 1 is the second slot */));

        // This is here because the inputs are slot agnostic
        boolean matchB = recipeItems.get(1).test(inventory.getStack(0 /* 0 is the first slot */)) &&
                recipeItems.get(0).test(inventory.getStack(1 /* 1 is the second slot */));

        return matchA || matchB;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public Identifier getId() {
        return id;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return Serializer.INSTANCE;
    }

    @Override
    public ItemStack craft(SimpleInventory inventory, DynamicRegistryManager registryManager) {
        return output.copy();
    }

    @Override
    public boolean fits(int width, int height) {
        return true;
    }

    @Override
    public ItemStack getOutput(DynamicRegistryManager registryManager) {
        return output.copy();
    }

    @Override
    public RecipeType<?> getType() {
        return Type.INSTANCE;
    }

    @Override
    public DefaultedList<Ingredient> getIngredients() {
        return this.recipeItems;
    }

    public static class Type implements RecipeType<WeaverBlockRecipe> {
        private Type() {
        }

        public static final Type INSTANCE = new Type();
        public static final String ID = "weaver_block";
    }

    public static class Serializer implements RecipeSerializer<WeaverBlockRecipe> {
        public static final Serializer INSTANCE = new Serializer();
        public static final String ID = "weaver_block";
        // this is the name given in the json file

        @Override
        public WeaverBlockRecipe read(Identifier id, JsonObject json) {
            DefaultedList<Ingredient> inputs = DefaultedList.ofSize(2, Ingredient.EMPTY);
            ItemStack output = ShapedRecipe.outputFromJson(JsonHelper.getObject(json, "output"));
            JsonArray ingredients = JsonHelper.getArray(json, "ingredients");
            int cookingtime = JsonHelper.getInt(json, "cookingtime");
            int experience = JsonHelper.getInt(json, "experience");

            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromJson(ingredients.get(i)));
            }

            return new WeaverBlockRecipe(id, output, inputs, cookingtime, experience);
        }

        @Override
        public WeaverBlockRecipe read(Identifier id, PacketByteBuf buf) {
            DefaultedList<Ingredient> inputs = DefaultedList.ofSize(buf.readInt(), Ingredient.EMPTY);
            int cookingtime = buf.readInt();
            int experience = buf.readInt();

            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromPacket(buf));
            }

            ItemStack output = buf.readItemStack();
            return new WeaverBlockRecipe(id, output, inputs, experience, cookingtime);
        }

        @Override
        public void write(PacketByteBuf buf, WeaverBlockRecipe recipe) {
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