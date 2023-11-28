package net.takie.takieterra.particle;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.takie.takieterra.TakieTerraMod;

public class TakieTerraParticles {

    public static final DefaultParticleType FALLING_SCINTILLA_PARTICLE =
            registerParticle("falling_scintilla_particle", FabricParticleTypes.simple(true));
    public static final DefaultParticleType WINTER_BLOSSOM_SNOW_PARTICLE =
            registerParticle("winter_blossom_snow_particle", FabricParticleTypes.simple(true));
    public static final DefaultParticleType RED_MAPLE_LEAVES_PARTICLE =
            registerParticle("red_maple_leaves_particle", FabricParticleTypes.simple(false));
    public static final DefaultParticleType ORANGE_MAPLE_LEAVES_PARTICLE =
            registerParticle("orange_maple_leaves_particle", FabricParticleTypes.simple(false));
    public static final DefaultParticleType YELLOW_MAPLE_LEAVES_PARTICLE =
            registerParticle("yellow_maple_leaves_particle", FabricParticleTypes.simple(false));

    public static final DefaultParticleType YELLOW_AUTUMN_PARTICLE =
            registerParticle("yellow_autumn_particle", FabricParticleTypes.simple(false));
    public static final DefaultParticleType ORANGE_AUTUMN_PARTICLE =
            registerParticle("orange_autumn_particle", FabricParticleTypes.simple(false));
    public static final DefaultParticleType RED_AUTUMN_PARTICLE =
            registerParticle("red_autumn_particle", FabricParticleTypes.simple(false));

    public static final DefaultParticleType STEAM_PARTICLE =
            registerParticle("steam_particle", FabricParticleTypes.simple());
    private static DefaultParticleType registerParticle(String name, DefaultParticleType particleType) {
        return Registry.register(Registries.PARTICLE_TYPE, new Identifier(TakieTerraMod.MOD_ID, name), particleType);
    }

    public static void registerParticles() {
        TakieTerraMod.LOGGER.info("Registering Particles for " + TakieTerraMod.MOD_ID);
    }
}