package net.takie.takieterra.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.takie.takieterra.item.TakieTerraItems;
import net.takie.takieterra.item.TakieTerraToolMaterials;

public class FireSwordItem extends SwordItem implements WeaponEffectUtils {

    public FireSwordItem(int attackDamage, float attackSpeed, Settings properties) {
        super(TakieTerraToolMaterials.PETRIFIED_FIRE, attackDamage, attackSpeed, properties);
    }

    @Override
    public boolean postHit(ItemStack itemStack, LivingEntity target, LivingEntity attacker) {
        addBlazeEffect(target);
        return super.postHit(itemStack, target, attacker);
    }
}
