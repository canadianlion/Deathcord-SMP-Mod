package net.canadianlion.deathcordsmpmod.item;

import net.canadianlion.deathcordsmpmod.DeathcordSMPMod;
import net.canadianlion.deathcordsmpmod.sounds.ModSounds;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {

    // Music Discs
    public static final Item THE_HORSE_AND_THE_INFANT_MUSIC_DISC = registerItem("the_horse_and_the_infant_music_disc",
            setting -> new Item(setting.jukeboxPlayable(ModSounds.THE_HORSE_AND_THE_INFANT_KEY).maxCount(1)));
    public static final Item JUST_A_MAN_MUSIC_DISC = registerItem("just_a_man_music_disc",
            setting -> new Item(setting.jukeboxPlayable(ModSounds.JUST_A_MAN_KEY).maxCount(1)));
    public static final Item FULL_SPEED_AHEAD_MUSIC_DISC = registerItem("full_speed_ahead_music_disc",
            setting -> new Item(setting.jukeboxPlayable(ModSounds.FULL_SPEED_AHEAD_KEY).maxCount(1)));
    public static final Item OPEN_ARMS_MUSIC_DISC = registerItem("open_arms_music_disc",
            setting -> new Item(setting.jukeboxPlayable(ModSounds.OPEN_ARMS_KEY).maxCount(1)));
    public static final Item WARRIOR_OF_THE_MIND_MUSIC_DISC = registerItem("warrior_of_the_mind_music_disc",
            setting -> new Item(setting.jukeboxPlayable(ModSounds.WARRIOR_OF_THE_MIND_KEY).maxCount(1)));
    public static final Item POLYPHEMUS_MUSIC_DISC = registerItem("polyphemus_music_disc",
            setting -> new Item(setting.jukeboxPlayable(ModSounds.POLYPHEMUS_KEY).maxCount(1)));
    public static final Item SURVIVE_MUSIC_DISC = registerItem("survive_music_disc",
            setting -> new Item(setting.jukeboxPlayable(ModSounds.SURVIVE_KEY).maxCount(1)));
    public static final Item REMEMBER_THEM_MUSIC_DISC = registerItem("remember_them_music_disc",
            setting -> new Item(setting.jukeboxPlayable(ModSounds.REMEMBER_THEM_KEY).maxCount(1)));
    public static final Item MY_GOODBYE_MUSIC_DISC = registerItem("my_goodbye_music_disc",
            setting -> new Item(setting.jukeboxPlayable(ModSounds.MY_GOODBYE_KEY).maxCount(1)));
    public static final Item STORM_MUSIC_DISC = registerItem("storm_music_disc",
            setting -> new Item(setting.jukeboxPlayable(ModSounds.STORM_KEY).maxCount(1)));
    public static final Item LUCK_RUNS_OUT_MUSIC_DISC = registerItem("luck_runs_out_music_disc",
            setting -> new Item(setting.jukeboxPlayable(ModSounds.LUCK_RUNS_OUT_KEY).maxCount(1)));
    public static final Item KEEP_YOUR_FRIENDS_CLOSE_MUSIC_DISC = registerItem("keep_your_friends_close_music_disc",
            setting -> new Item(setting.jukeboxPlayable(ModSounds.KEEP_YOUR_FRIENDS_CLOSE_KEY).maxCount(1)));
    public static final Item RUTHLESSNESS_MUSIC_DISC = registerItem("ruthlessness_music_disc",
            setting -> new Item(setting.jukeboxPlayable(ModSounds.RUTHLESSNESS_KEY).maxCount(1)));
    public static final Item PUPPETEER_MUSIC_DISC = registerItem("puppeteer_music_disc",
            setting -> new Item(setting.jukeboxPlayable(ModSounds.PUPPETEER_KEY).maxCount(1)));
    public static final Item WOULDNT_YOU_LIKE_MUSIC_DISC = registerItem("wouldnt_you_like_music_disc",
            setting -> new Item(setting.jukeboxPlayable(ModSounds.WOULDNT_YOU_LIKE_KEY).maxCount(1)));
    public static final Item DONE_FOR_MUSIC_DISC = registerItem("done_for_music_disc",
            setting -> new Item(setting.jukeboxPlayable(ModSounds.DONE_FOR_KEY).maxCount(1)));
    public static final Item THERE_ARE_OTHER_WAYS_MUSIC_DISC = registerItem("there_are_other_ways_music_disc",
            setting -> new Item(setting.jukeboxPlayable(ModSounds.THERE_ARE_OTHER_WAYS_KEY).maxCount(1)));
    public static final Item THE_UNDERWORLD_MUSIC_DISC = registerItem("the_underworld_music_disc",
            setting -> new Item(setting.jukeboxPlayable(ModSounds.THE_UNDERWORLD_KEY).maxCount(1)));
    public static final Item NO_LONGER_YOU_MUSIC_DISC = registerItem("no_longer_you_music_disc",
            setting -> new Item(setting.jukeboxPlayable(ModSounds.NO_LONGER_YOU_KEY).maxCount(1)));
    public static final Item MONSTER_MUSIC_DISC = registerItem("monster_music_disc",
            setting -> new Item(setting.jukeboxPlayable(ModSounds.MONSTER_KEY).maxCount(1)));
    public static final Item SUFFERING_MUSIC_DISC = registerItem("suffering_music_disc",
            setting -> new Item(setting.jukeboxPlayable(ModSounds.SUFFERING_KEY).maxCount(1)));
    public static final Item DIFFERENT_BEAST_MUSIC_DISC = registerItem("different_beast_music_disc",
            setting -> new Item(setting.jukeboxPlayable(ModSounds.DIFFERENT_BEAST_KEY).maxCount(1)));
    public static final Item SCYLLA_MUSIC_DISC = registerItem("scylla_music_disc",
            setting -> new Item(setting.jukeboxPlayable(ModSounds.SCYLLA_KEY).maxCount(1)));
    public static final Item MUTINY_MUSIC_DISC = registerItem("mutiny_music_disc",
            setting -> new Item(setting.jukeboxPlayable(ModSounds.MUTINY_KEY).maxCount(1)));
    public static final Item THUNDER_BRINGER_MUSIC_DISC = registerItem("thunder_bringer_music_disc",
            setting -> new Item(setting.jukeboxPlayable(ModSounds.THUNDER_BRINGER_KEY).maxCount(1)));
    public static final Item LEGENDARY_MUSIC_DISC = registerItem("legendary_music_disc",
            setting -> new Item(setting.jukeboxPlayable(ModSounds.LEGENDARY_KEY).maxCount(1)));
    public static final Item LITTLE_WOLF_MUSIC_DISC = registerItem("little_wolf_music_disc",
            setting -> new Item(setting.jukeboxPlayable(ModSounds.LITTLE_WOLF_KEY).maxCount(1)));
    public static final Item WELL_BE_FINE_MUSIC_DISC = registerItem("well_be_fine_music_disc",
            setting -> new Item(setting.jukeboxPlayable(ModSounds.WELL_BE_FINE_KEY).maxCount(1)));
    public static final Item LOVE_IN_PARADISE_MUSIC_DISC = registerItem("love_in_paradise_music_disc",
            setting -> new Item(setting.jukeboxPlayable(ModSounds.LOVE_IN_PARADISE_KEY).maxCount(1)));
    public static final Item GOD_GAMES_MUSIC_DISC = registerItem("god_games_music_disc",
            setting -> new Item(setting.jukeboxPlayable(ModSounds.GOD_GAMES_KEY).maxCount(1)));
    public static final Item NOT_SORRY_FOR_LOVING_YOU_MUSIC_DISC = registerItem("not_sorry_for_loving_you_music_disc",
            setting -> new Item(setting.jukeboxPlayable(ModSounds.NOT_SORRY_FOR_LOVING_YOU_KEY).maxCount(1)));
    public static final Item DANGEROUS_MUSIC_DISC = registerItem("dangerous_music_disc",
            setting -> new Item(setting.jukeboxPlayable(ModSounds.DANGEROUS_KEY).maxCount(1)));
    public static final Item CHARYBDIS_MUSIC_DISC = registerItem("charybdis_music_disc",
            setting -> new Item(setting.jukeboxPlayable(ModSounds.CHARYBDIS_KEY).maxCount(1)));
    public static final Item GET_IN_THE_WATER_MUSIC_DISC = registerItem("get_in_the_water_music_disc",
            setting -> new Item(setting.jukeboxPlayable(ModSounds.GET_IN_THE_WATER_KEY).maxCount(1)));
    public static final Item SIX_HUNDRED_STRIKE_MUSIC_DISC = registerItem("six_hundred_strike_music_disc",
            setting -> new Item(setting.jukeboxPlayable(ModSounds.SIX_HUNDRED_STRIKE_KEY).maxCount(1)));
    public static final Item THE_CHALLENGE_MUSIC_DISC = registerItem("the_challenge_music_disc",
            setting -> new Item(setting.jukeboxPlayable(ModSounds.THE_CHALLENGE_KEY).maxCount(1)));
    public static final Item HOLD_THEM_DOWN_MUSIC_DISC = registerItem("hold_them_down_music_disc",
            setting -> new Item(setting.jukeboxPlayable(ModSounds.HOLD_THEM_DOWN_KEY).maxCount(1)));
    public static final Item ODYSSEUS_MUSIC_DISC = registerItem("odysseus_music_disc",
            setting -> new Item(setting.jukeboxPlayable(ModSounds.ODYSSEUS_KEY).maxCount(1)));
    public static final Item I_CANT_HELP_BUT_WONDER_MUSIC_DISC = registerItem("i_cant_help_but_wonder_music_disc",
            setting -> new Item(setting.jukeboxPlayable(ModSounds.I_CANT_HELP_BUT_WONDER_KEY).maxCount(1)));
    public static final Item WOULD_YOU_FALL_IN_LOVE_WITH_ME_AGAIN_MUSIC_DISC = registerItem("would_you_fall_in_love_with_me_again_music_disc",
            setting -> new Item(setting.jukeboxPlayable(ModSounds.WOULD_YOU_FALL_IN_LOVE_WITH_ME_AGAIN_KEY).maxCount(1)));


    private static Item registerItem(String name, Function<Item.Settings, Item> function) {
        return Registry.register(Registries.ITEM, Identifier.of(DeathcordSMPMod.MOD_ID, name), function.apply(
                new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(
                        DeathcordSMPMod.MOD_ID, name)))));
    }

    public static void registerModItems() {
        DeathcordSMPMod.LOGGER.info("Registering Mod Items for " + DeathcordSMPMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(THE_HORSE_AND_THE_INFANT_MUSIC_DISC);
            entries.add(JUST_A_MAN_MUSIC_DISC);
            entries.add(FULL_SPEED_AHEAD_MUSIC_DISC);
            entries.add(OPEN_ARMS_MUSIC_DISC);
            entries.add(WARRIOR_OF_THE_MIND_MUSIC_DISC);
            entries.add(POLYPHEMUS_MUSIC_DISC);
            entries.add(SURVIVE_MUSIC_DISC);
            entries.add(REMEMBER_THEM_MUSIC_DISC);
            entries.add(MY_GOODBYE_MUSIC_DISC);
            entries.add(STORM_MUSIC_DISC);
            entries.add(LUCK_RUNS_OUT_MUSIC_DISC);
            entries.add(KEEP_YOUR_FRIENDS_CLOSE_MUSIC_DISC);
            entries.add(RUTHLESSNESS_MUSIC_DISC);
            entries.add(PUPPETEER_MUSIC_DISC);
            entries.add(WOULDNT_YOU_LIKE_MUSIC_DISC);
            entries.add(DONE_FOR_MUSIC_DISC);
            entries.add(THERE_ARE_OTHER_WAYS_MUSIC_DISC);
            entries.add(THE_UNDERWORLD_MUSIC_DISC);
            entries.add(NO_LONGER_YOU_MUSIC_DISC);
            entries.add(MONSTER_MUSIC_DISC);
            entries.add(SUFFERING_MUSIC_DISC);
            entries.add(DIFFERENT_BEAST_MUSIC_DISC);
            entries.add(SCYLLA_MUSIC_DISC);
            entries.add(MUTINY_MUSIC_DISC);
            entries.add(THUNDER_BRINGER_MUSIC_DISC);
            entries.add(LEGENDARY_MUSIC_DISC);
            entries.add(LITTLE_WOLF_MUSIC_DISC);
            entries.add(WELL_BE_FINE_MUSIC_DISC);
            entries.add(LOVE_IN_PARADISE_MUSIC_DISC);
            entries.add(GOD_GAMES_MUSIC_DISC);
            entries.add(NOT_SORRY_FOR_LOVING_YOU_MUSIC_DISC);
            entries.add(DANGEROUS_MUSIC_DISC);
            entries.add(CHARYBDIS_MUSIC_DISC);
            entries.add(GET_IN_THE_WATER_MUSIC_DISC);
            entries.add(SIX_HUNDRED_STRIKE_MUSIC_DISC);
            entries.add(THE_CHALLENGE_MUSIC_DISC);
            entries.add(HOLD_THEM_DOWN_MUSIC_DISC);
            entries.add(ODYSSEUS_MUSIC_DISC);
            entries.add(I_CANT_HELP_BUT_WONDER_MUSIC_DISC);
            entries.add(WOULD_YOU_FALL_IN_LOVE_WITH_ME_AGAIN_MUSIC_DISC);
        });
    }
}
