package net.takie.takieterra.effect;

import net.minecraft.enchantment.FrostWalkerEnchantment;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class FrostWalkerEffect extends StatusEffect {
    public FrostWalkerEffect(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }

    @Override
    public void applyUpdateEffect(LivingEntity pLivingEntity, int pAmplifier) {
        if (!pLivingEntity.getWorld().isClient()) {

            World world = pLivingEntity.getWorld();
            BlockPos pos = pLivingEntity.getBlockPos();

            FrostWalkerEnchantment.freezeWater(pLivingEntity, world, pos, pAmplifier);
        }

        super.applyUpdateEffect(pLivingEntity, pAmplifier);
    }

    @Override
    public boolean canApplyUpdateEffect(int pDuration, int pAmplifier) {
        return true;
    }
}
