package net.takie.takieterra.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.takie.takieterra.effect.TakieTerraEffects;

public interface WeaponEffectUtils {

    default void addBlazeEffect(LivingEntity livingEntity) {
        livingEntity.setOnFireFor(10);
    }

    default void addFreezeEffect(LivingEntity livingEntity) {
        livingEntity.addStatusEffect(new StatusEffectInstance(TakieTerraEffects.FREEZING));
    }
}