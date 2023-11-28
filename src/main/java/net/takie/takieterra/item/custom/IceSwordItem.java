package net.takie.takieterra.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.takie.takieterra.item.TakieTerraToolMaterials;

public class IceSwordItem extends SwordItem implements WeaponEffectUtils {

    public IceSwordItem(int attackDamage, float attackSpeed, Settings properties) {
        super(TakieTerraToolMaterials.PETRIFIED_ICE, attackDamage, attackSpeed, properties);
    }

    @Override
    public boolean postHit(ItemStack itemStack, LivingEntity target, LivingEntity attacker) {
        addFreezeEffect(target);
        return super.postHit(itemStack, target, attacker);
    }
}
