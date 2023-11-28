package net.takie.takieterra.effect;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.takie.takieterra.TakieTerraMod;

public class TakieTerraEffects {
    public static final StatusEffect SPIDER_SCALE = registerStatusEffect("spider_scale",
            new SpiderScaleEffect(StatusEffectCategory.NEUTRAL, 0x36ebab)
                    .addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED,
                            "db43f233-4ba9-4a13-98c7-1bc905dac5b7", -0.25f,
                            EntityAttributeModifier.Operation.MULTIPLY_TOTAL));

    public static final StatusEffect FROST_WALKER = registerStatusEffect("frost_walker",
                new FrostWalkerEffect(StatusEffectCategory.NEUTRAL, 0x5fb2d9));
    public static StatusEffect FIRE_WALKER = registerStatusEffect("fire_walker",
                new FireWalkerEffect(StatusEffectCategory.NEUTRAL, 0x9e3c28));
    public static StatusEffect THORNS = registerStatusEffect("thorns",
                new ThornsEffect(StatusEffectCategory.BENEFICIAL, 0x289e33));
    public static StatusEffect FREEZING = registerStatusEffect("freezing",
            new FreezingEffect());
    public static StatusEffect SHIMMERING_SEA = registerStatusEffect("shimmering_sea",
            new ShimmeringSeaEffect(StatusEffectCategory.BENEFICIAL, 0x5fb2d9));


    private static StatusEffect registerStatusEffect(String name, StatusEffect statusEffect) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(TakieTerraMod.MOD_ID, name), statusEffect);
    }

    public static void registerEffects() {
        TakieTerraMod.LOGGER.info("Registering Mod Effects for " + TakieTerraMod.MOD_ID);
    }
}