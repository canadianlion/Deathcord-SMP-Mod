package net.canadianlion.deathcordsmpmod.potion;

import net.canadianlion.deathcordsmpmod.DeathcordSMPMod;
import net.canadianlion.deathcordsmpmod.effects.ModEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModPotions {
    public static final RegistryEntry<Potion> NO_WATER_POTION = registerPotion("anti_water_potion",
            new Potion("anti_water_potion", new StatusEffectInstance(ModEffects.ANTI_WATER,
                    -1, 0)));

    private static RegistryEntry<Potion> registerPotion(String name, Potion potion) {
        return Registry.registerReference(Registries.POTION, Identifier.of(DeathcordSMPMod.MOD_ID, name), potion);
    }

    public static void registerPotions() {
        DeathcordSMPMod.LOGGER.info("Registering Mod Potions for " + DeathcordSMPMod.MOD_ID);
    }
}