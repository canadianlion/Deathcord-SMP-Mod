package net.canadianlion.deathcordsmpmod;

import net.canadianlion.deathcordsmpmod.datagen.ModModelProvider;
import net.canadianlion.deathcordsmpmod.datagen.ModRegistryDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class DeathcordSMPModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModRegistryDataGenerator::new);
	}
}
