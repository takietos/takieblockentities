package net.takie.takieterra;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.takie.takieterra.datagen.*;

public class TakieTerraModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {

		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(TakieTerraBlockTagProvider::new);
		pack.addProvider(TakieTerraItemTagProvider::new);
		pack.addProvider(TakieTerraBlockLootTableGenerator::new);
		pack.addProvider(TakieTerraModelProvider::new);
		pack.addProvider(TakieTerraRecipeGenerator::new);

	}
}
