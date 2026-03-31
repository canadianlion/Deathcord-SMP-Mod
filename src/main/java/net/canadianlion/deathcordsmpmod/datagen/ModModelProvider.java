package net.canadianlion.deathcordsmpmod.datagen;

import net.canadianlion.deathcordsmpmod.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;


public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.THE_HORSE_AND_THE_INFANT_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.JUST_A_MAN_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.FULL_SPEED_AHEAD_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.OPEN_ARMS_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.WARRIOR_OF_THE_MIND_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.POLYPHEMUS_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.SURVIVE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.REMEMBER_THEM_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.MY_GOODBYE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.STORM_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.LUCK_RUNS_OUT_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.KEEP_YOUR_FRIENDS_CLOSE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUTHLESSNESS_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.PUPPETEER_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.WOULDNT_YOU_LIKE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.DONE_FOR_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.THERE_ARE_OTHER_WAYS_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.THE_UNDERWORLD_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.NO_LONGER_YOU_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.MONSTER_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.SUFFERING_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIFFERENT_BEAST_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.SCYLLA_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUTINY_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.THUNDER_BRINGER_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.LEGENDARY_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.LITTLE_WOLF_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.WELL_BE_FINE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.LOVE_IN_PARADISE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOD_GAMES_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.NOT_SORRY_FOR_LOVING_YOU_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.DANGEROUS_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHARYBDIS_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.GET_IN_THE_WATER_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.SIX_HUNDRED_STRIKE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.THE_CHALLENGE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.HOLD_THEM_DOWN_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.ODYSSEUS_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.I_CANT_HELP_BUT_WONDER_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.WOULD_YOU_FALL_IN_LOVE_WITH_ME_AGAIN_MUSIC_DISC, Models.GENERATED);

    }
}
