package net.takie.takieterra.recipe;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.recipe.*;
import net.minecraft.registry.DynamicRegistryManager;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonHelper;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.world.World;
import net.takie.takieterra.util.RecipeMatcher;

import java.util.ArrayList;
import java.util.List;

public class CookingPotRecipe implements Recipe<Inventory> {
    public static final int INPUT_SLOTS = 6;

    private final Identifier id;
    private final String group;
    private final DefaultedList<Ingredient> ingredientList;
    private final ItemStack output;
    private final ItemStack container;
    private final float experience;
    private final int cookTime;

    public CookingPotRecipe(Identifier id, String group, DefaultedList<Ingredient> ingredientList, ItemStack output, ItemStack container,
                            float experience, int cookTime) {
        this.id = id;
        this.group = group;
        this.ingredientList = ingredientList;
        this.output = output;

        if (!container.isEmpty()) {
            this.container = container;
        } else if (output.getItem().getRecipeRemainder() != null) {
            this.container = new ItemStack(output.getItem().getRecipeRemainder());
        } else {
            this.container = ItemStack.EMPTY;
        }

        this.experience = experience;
        this.cookTime = cookTime;
    }

    @Override
    public boolean matches(Inventory inv, World world) {
        List<ItemStack> inputList = new ArrayList<>();
        int slotCount = 0;

        for (int slotOffset = 0; slotOffset < INPUT_SLOTS; ++slotOffset) {
            ItemStack itemStack = inv.getStack(slotOffset);
            if (!itemStack.isEmpty()) {
                ++slotCount;
                inputList.add(itemStack);
            }
        }

        return slotCount == ingredientList.size() && RecipeMatcher.findMatches(inputList, ingredientList) != null;
    }

    @Override
    public ItemStack craft(Inventory inventory, DynamicRegistryManager registryManager) {
        return output.copy();
    }

    @Override
    public boolean fits(int width, int height) {
        return width * height >= ingredientList.size();
    }

    @Override
    public ItemStack getOutput(DynamicRegistryManager registryManager) {
        return output;
    }

    @Override
    public Identifier getId() {
        return id;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return TTRecipeType.COOKING_RECIPE_SERIALIZER.serializer();
    }

    @Override
    public RecipeType<?> getType() {
        return TTRecipeType.COOKING_RECIPE_SERIALIZER.type();
    }

    @Override
    public DefaultedList<Ingredient> getIngredients() {
        return ingredientList;
    }

    @Override
    public String getGroup() {
        return group;
    }

    @Override
    public boolean isIgnoredInRecipeBook() {
        return true;
    }

    public ItemStack getContainer() {
        return container;
    }

    public float getExperience() {
        return experience;
    }

    public int getCookTime() {
        return cookTime;
    }

}