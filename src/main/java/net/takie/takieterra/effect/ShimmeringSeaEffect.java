package net.takie.takieterra.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ShimmeringSeaEffect extends StatusEffect {
    public ShimmeringSeaEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 20, 0, true, false));
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 20, 0, true, false));
        super.applyUpdateEffect(entity, amplifier);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}
