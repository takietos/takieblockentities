package net.takie.takieterra.item.custom;

import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.takie.takieterra.effect.TakieTerraEffects;
import net.takie.takieterra.item.TakieTerraArmorMaterials;
import net.takie.takieterra.item.TakieTerraItems;

import java.util.Map;

public class TakieTerraArmorItem extends ArmorItem {
    private static final Map<ArmorMaterial, StatusEffectInstance> MATERIAL_TO_EFFECT_MAP =
            new ImmutableMap.Builder<ArmorMaterial, StatusEffectInstance>()
                    .put(TakieTerraArmorMaterials.SEA_OPAL, new StatusEffectInstance(TakieTerraEffects.SHIMMERING_SEA, 14 * 20, 2))
                    .put(TakieTerraArmorMaterials.CINNABAR, new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 14 * 20, 2))
                    .put(TakieTerraArmorMaterials.NEPHRITE, new StatusEffectInstance(StatusEffects.JUMP_BOOST, 14 * 20, 2))
                    .put(TakieTerraArmorMaterials.RUBY, new StatusEffectInstance(StatusEffects.STRENGTH, 14 * 20, 2))
                    .put(TakieTerraArmorMaterials.SAPPHIRE, new StatusEffectInstance(StatusEffects.SPEED, 14 * 20, 2))
                    .put(TakieTerraArmorMaterials.PETRIFIED_FIRE, new StatusEffectInstance(TakieTerraEffects.FIRE_WALKER, 14 * 20, 2))
                    .put(TakieTerraArmorMaterials.PETRIFIED_ICE, new StatusEffectInstance(TakieTerraEffects.FROST_WALKER, 14 * 20, 2))
                    .build();

    public TakieTerraArmorItem(ArmorMaterial material, Type type, Settings settings) {
        super(material, type, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if(!world.isClient() && entity instanceof PlayerEntity player) {
            if(hasFullSuitOfArmorOn(player)) {
                evaluateArmorEffects(player);
            }
        }

        super.inventoryTick(stack, world, entity, slot, selected);
    }

    private void evaluateArmorEffects(PlayerEntity player) {
        for(Map.Entry<ArmorMaterial, StatusEffectInstance> entry : MATERIAL_TO_EFFECT_MAP.entrySet()) {
            ArmorMaterial mapArmorMaterial = entry.getKey();
            StatusEffectInstance mapStatusEffect = entry.getValue();

            if(hasCorrectArmorOn(mapArmorMaterial, player)) {
                addStatusEffectForMaterial(player, mapStatusEffect);
                break;
            }
        }
    }

    private void addStatusEffectForMaterial(PlayerEntity player, StatusEffectInstance mapStatusEffect) {
        boolean hasPlayerEffectAlready = player.hasStatusEffect(mapStatusEffect.getEffectType());

        if(!hasPlayerEffectAlready) {
            player.addStatusEffect(new StatusEffectInstance(mapStatusEffect.getEffectType(),
                    mapStatusEffect.getDuration(), mapStatusEffect.getAmplifier()));
        }
    }

    private boolean hasCorrectArmorOn(ArmorMaterial mapArmorMaterial, PlayerEntity player) {
        for(ItemStack armorStack : player.getArmorItems()) {
            if(!(armorStack.getItem() instanceof ArmorItem)) {
                return false;
            }
        }

        ArmorItem boots = ((ArmorItem) player.getInventory().getArmorStack(0).getItem());
        ArmorItem leggings = ((ArmorItem) player.getInventory().getArmorStack(1).getItem());
        ArmorItem chestplate = ((ArmorItem) player.getInventory().getArmorStack(2).getItem());
        ArmorItem helmet = ((ArmorItem) player.getInventory().getArmorStack(3).getItem());

        return helmet.getMaterial() == mapArmorMaterial && chestplate.getMaterial() == mapArmorMaterial &&
                leggings.getMaterial() == mapArmorMaterial && boots.getMaterial() == mapArmorMaterial;
    }

    private boolean hasFullSuitOfArmorOn(PlayerEntity player) {
        ItemStack boots = player.getInventory().getArmorStack(0);
        ItemStack leggings = player.getInventory().getArmorStack(1);
        ItemStack chestplate = player.getInventory().getArmorStack(2);
        ItemStack helmet = player.getInventory().getArmorStack(3);

        return !boots.isEmpty() && !leggings.isEmpty()
                && !chestplate.isEmpty() && !helmet.isEmpty();
    }
}