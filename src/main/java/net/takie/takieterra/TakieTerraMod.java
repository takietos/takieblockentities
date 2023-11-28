package net.takie.takieterra;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.takie.takieterra.block.*;
import net.takie.takieterra.block.custom.PearBlocks;
import net.takie.takieterra.block.entity.TTBlockEntityType;
import net.takie.takieterra.block.entity.TakieTerraBlockEntities;
import net.takie.takieterra.effect.TakieTerraEffects;
import net.takie.takieterra.entity.TakieTerraBoats;
import net.takie.takieterra.init.*;
import net.takie.takieterra.item.TakieTerraItemGroup;
import net.takie.takieterra.item.TakieTerraItems;
import net.takie.takieterra.particle.TakieTerraParticles;
import net.takie.takieterra.recipe.TTRecipeType;
import net.takie.takieterra.recipe.TakieTerraRecipes;
import net.takie.takieterra.screen.TTScreenType;
import net.takie.takieterra.screen.TakieTerraScreenHandlers;
import net.takie.takieterra.util.TTSoundEvents;
import net.takie.takieterra.util.TakieTerraRegistries;
import net.takie.takieterra.villager.TakieTerraPOIType;
import net.takie.takieterra.villager.TakieTerraProfessions;
import net.takie.takieterra.villager.TakieTerraVillagerTrades;
import net.takie.takieterra.villager.TakieTerraWanderingSaplingTrades;
import net.takie.takieterra.world.gen.TakieTerraWorldGeneration;
import net.takie.takieterra.world.gen.TakieWorldGen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TakieTerraMod implements ModInitializer {

	public static final String MOD_ID = "takieterra";
	public static final Logger LOGGER = LoggerFactory.getLogger("takieterra");

	public static MutableText i18n(String key, Object... args) {
		return Text.translatable(MOD_ID + "." + key, args);
	}

	@Override
	public void onInitialize() {

		TakieTerraItemGroup.registerItemGroups();

		TakieTerraItems.registerTakieTerraItems();
		TakieTerraBlocks.registerTakieTerraBlocks();
		TakieTerraTreeBlocks.registerTakieTerraTreeBlocks();
		TakieTerraRockBlocks.registerTakieTerraRockBlocks();
		TakieTerraChippedBlocks.registerTakieTerraChippedBlocks();
		PearBlocks.init();
		TTComplexBlocks.registerAll();
		PearFeatures.init();
		TakieTerraFeatures.init();
		TakieTerraTrunkPlacerTypes.init();
		TakieTerraFoliagePlacerTypes.init();
		TakieTerraTreeDecorators.init();

		TakieTerraRegistries.registerModStuffs();
		TakieTerraParticles.registerParticles();

		TakieTerraBlockEntities.registerBlockEntities();
		TTBlockEntityType.registerAll();
		TTSoundEvents.registerAll();
		TTRecipeType.registerAll();
		TTScreenType.registerAll();

		TakieTerraPOIType.registerPOIs();
		TakieTerraProfessions.registerProfessions();
		TakieTerraVillagerTrades.registerCustomTrades();
		TakieTerraWanderingSaplingTrades.register();

		TakieTerraWorldGeneration.generateTakieTerraWorldGeneration();
		TakieWorldGen.init();

		TakieTerraBoats.registerBoats();

	}
}