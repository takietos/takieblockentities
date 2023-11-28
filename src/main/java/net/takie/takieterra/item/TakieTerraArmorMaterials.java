package net.takie.takieterra.item;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.Util;
import net.takie.takieterra.TakieTerraMod;

import java.util.EnumMap;
import java.util.function.Supplier;

public enum TakieTerraArmorMaterials implements ArmorMaterial
    {
                ROSE_GOLD("rose_gold", 15, Util.make(new EnumMap(ArmorItem.Type.class), map -> {
                    map.put(ArmorItem.Type.BOOTS, 2);
                    map.put(ArmorItem.Type.LEGGINGS, 5);
                    map.put(ArmorItem.Type.CHESTPLATE, 6);
                    map.put(ArmorItem.Type.HELMET, 2);
                }), 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0f, 0.0f, () -> Ingredient.ofItems(TakieTerraItems.ROSE_GOLD_INGOT)),

        AMETHYST("amethyst", 10, Util.make(new EnumMap(ArmorItem.Type.class), map -> {
            map.put(ArmorItem.Type.BOOTS, 1);
            map.put(ArmorItem.Type.LEGGINGS, 3);
            map.put(ArmorItem.Type.CHESTPLATE, 4);
            map.put(ArmorItem.Type.HELMET, 2);
        }), 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0f, 0.0f, () -> Ingredient.ofItems(Items.AMETHYST_SHARD)),

        SEA_OPAL("sea_opal", 15, Util.make(new EnumMap(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 2);
        map.put(ArmorItem.Type.LEGGINGS, 5);
        map.put(ArmorItem.Type.CHESTPLATE, 6);
        map.put(ArmorItem.Type.HELMET, 2);
    }), 9, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0f, 0.0f, () -> Ingredient.ofItems(TakieTerraItems.SEA_OPAL)),

        CINNABAR("cinnabar", 8, Util.make(new EnumMap(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 1);
        map.put(ArmorItem.Type.LEGGINGS, 2);
        map.put(ArmorItem.Type.CHESTPLATE, 3);
        map.put(ArmorItem.Type.HELMET, 1);
    }), 15, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0f, 0.0f, () -> Ingredient.ofItems(TakieTerraItems.CINNABAR_STONE)),

        NEPHRITE("nephrite", 8, Util.make(new EnumMap(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 1);
        map.put(ArmorItem.Type.LEGGINGS, 2);
        map.put(ArmorItem.Type.CHESTPLATE, 3);
        map.put(ArmorItem.Type.HELMET, 1);
    }), 15, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0f, 0.0f, () -> Ingredient.ofItems(TakieTerraItems.NEPHRITE_STONE)),

        PETRIFIED_ICE("petrified_ice", 8, Util.make(new EnumMap(ArmorItem.Type.class), map -> {
            map.put(ArmorItem.Type.BOOTS, 1);
            map.put(ArmorItem.Type.LEGGINGS, 2);
            map.put(ArmorItem.Type.CHESTPLATE, 3);
            map.put(ArmorItem.Type.HELMET, 1);
        }), 15, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0f, 0.0f, () -> Ingredient.ofItems(TakieTerraItems.PETRIFIED_ICE_STONE)),
        PETRIFIED_FIRE("petrified_fire", 8, Util.make(new EnumMap(ArmorItem.Type.class), map -> {
            map.put(ArmorItem.Type.BOOTS, 1);
            map.put(ArmorItem.Type.LEGGINGS, 2);
            map.put(ArmorItem.Type.CHESTPLATE, 3);
            map.put(ArmorItem.Type.HELMET, 1);
        }), 15, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0f, 0.0f, () -> Ingredient.ofItems(TakieTerraItems.PETRIFIED_FIRE_STONE)),

        RUBY("ruby", 25, Util.make(new EnumMap(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 2);
        map.put(ArmorItem.Type.LEGGINGS, 5);
        map.put(ArmorItem.Type.CHESTPLATE, 6);
        map.put(ArmorItem.Type.HELMET, 2);
    }), 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f, 0.0f, () -> Ingredient.ofItems(TakieTerraItems.RUBY_STONE)),

        SAPPHIRE("sapphire", 25, Util.make(new EnumMap(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 2);
        map.put(ArmorItem.Type.LEGGINGS, 5);
        map.put(ArmorItem.Type.CHESTPLATE, 6);
        map.put(ArmorItem.Type.HELMET, 2);
    }), 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f, 0.0f, () -> Ingredient.ofItems(TakieTerraItems.SAPPHIRE_STONE));

        public static final StringIdentifiable.Codec<ArmorMaterials> CODEC;
        private static final EnumMap<ArmorItem.Type, Integer> BASE_DURABILITY;
        private final String name;
        private final int durabilityMultiplier;
        private final EnumMap<ArmorItem.Type, Integer> protectionAmounts;
        private final int enchantability;
        private final SoundEvent equipSound;
        private final float toughness;
        private final float knockbackResistance;
        private final Lazy<Ingredient> repairIngredientSupplier;

    private TakieTerraArmorMaterials(String name, int durabilityMultiplier, EnumMap<ArmorItem.Type, Integer> protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredientSupplier) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredientSupplier = new Lazy<Ingredient>(repairIngredientSupplier);
    }

        @Override
        public int getDurability(ArmorItem.Type type) {
        return BASE_DURABILITY.get((Object)type) * this.durabilityMultiplier;
    }

        @Override
        public int getProtection(ArmorItem.Type type) {
        return this.protectionAmounts.get((Object)type);
    }

        @Override
        public int getEnchantability() {
        return this.enchantability;
    }

        @Override
        public SoundEvent getEquipSound() {
        return this.equipSound;
    }

        @Override
        public Ingredient getRepairIngredient() {
        return this.repairIngredientSupplier.get();
    }

        @Override
        public String getName() {
        return TakieTerraMod.MOD_ID + ":" + this.name;
    }

        @Override
        public float getToughness() {
        return this.toughness;
    }

        @Override
        public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

        static {
        CODEC = StringIdentifiable.createCodec(ArmorMaterials::values);
        BASE_DURABILITY = Util.make(new EnumMap(ArmorItem.Type.class), map -> {
            map.put(ArmorItem.Type.BOOTS, 13);
            map.put(ArmorItem.Type.LEGGINGS, 15);
            map.put(ArmorItem.Type.CHESTPLATE, 16);
            map.put(ArmorItem.Type.HELMET, 11);
        });
    }
    }