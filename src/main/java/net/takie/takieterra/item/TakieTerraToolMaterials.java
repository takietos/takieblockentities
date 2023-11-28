package net.takie.takieterra.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum TakieTerraToolMaterials implements ToolMaterial {
                ROSE_GOLD(MiningLevels.IRON, 250, 6.0f, 2.0f, 22, () -> Ingredient.ofItems(TakieTerraItems.ROSE_GOLD_INGOT)),
                AMETHYST(MiningLevels.IRON, 200, 6.0f, 2.0f, 22, () -> Ingredient.ofItems(Items.AMETHYST_SHARD)),
                PETRIFIED_ICE(MiningLevels.IRON, 180, 5.0f, 3.0f, 10, () -> Ingredient.ofItems(TakieTerraItems.PETRIFIED_ICE_STONE)),
                PETRIFIED_FIRE(MiningLevels.IRON, 180, 5.0f, 3.0f, 10, () -> Ingredient.ofItems(TakieTerraItems.PETRIFIED_FIRE_STONE));


        private final int miningLevel;
        private final int itemDurability;
        private final float miningSpeed;
        private final float attackDamage;
        private final int enchantability;
        private final Lazy<Ingredient> repairIngredient;

    private TakieTerraToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy<Ingredient>(repairIngredient);
    }

        @Override
        public int getDurability() {
        return this.itemDurability;
    }

        @Override
        public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

        @Override
        public float getAttackDamage() {
        return this.attackDamage;
    }

        @Override
        public int getMiningLevel() {
        return this.miningLevel;
    }

        @Override
        public int getEnchantability() {
        return this.enchantability;
    }

        @Override
        public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
