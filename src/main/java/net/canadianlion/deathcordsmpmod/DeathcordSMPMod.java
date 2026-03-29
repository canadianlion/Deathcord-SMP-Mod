package net.canadianlion.deathcordsmpmod;

import net.canadianlion.deathcordsmpmod.item.ModItems;
import net.canadianlion.deathcordsmpmod.sounds.ModSounds;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DeathcordSMPMod implements ModInitializer {
	public static final String MOD_ID = "deathcordsmpmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModSounds.registerSounds();
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}