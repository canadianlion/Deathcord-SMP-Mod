package net.canadianlion.deathcordsmpmod.effects;

import net.canadianlion.deathcordsmpmod.DeathcordSMPMod;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModEffects {
    public static final RegistryEntry<StatusEffect> ANTI_WATER = registerStatusEffect("anti_water",
        new AntiWaterEffect(StatusEffectCategory.NEUTRAL, 0x19add1));


    private static RegistryEntry<StatusEffect> registerStatusEffect(String name, StatusEffect statusEffect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(DeathcordSMPMod.MOD_ID, name), statusEffect);
    }

    public static void registerEffects() {
        DeathcordSMPMod.LOGGER.info("Registering Mod Effects for " + DeathcordSMPMod.MOD_ID);
    }
}
