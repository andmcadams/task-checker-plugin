/*
 * Copyright (c) 2021, Andrew McAdams
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.andmcadams.taskchecker;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Varbits
{
	/**
	 * Hallowed Sepulchre
 	 */
	// Can theoretically do ownership of uniques but that'd only see things in Stranger exchange int, not bank
	// Squirrel metamorph?
	FREED_DARKMEYER_SLAVE(10414),
	// Following varbs are *probably* unlock varbs. Visibility adds 5 to each index
	// These likely need to be tested to make sure they match up correctly.
	FREED_KNIGHT_OF_THE_OWL(10396),
	FREED_KNIGHT_OF_THE_LION(10397),
	FREED_KNIGHT_OF_THE_WOLF(10398),
	FREED_KNIGHT_OF_THE_UNICORN(10399),
	FREED_ARCHPRIEST_OF_THE_UNICORN(10400),
	// Fastest run varb?

	/**
	 * Tithe Farm
	 */
	AUTOWEED(5557), // RL name, 0 is not bought, 1 is inactive, 2 is active
	// Bologa's blessings?
	BOLOGA_STATE(5370), // RL name is shitty, 2 is bought the ability to buy blessings


	/**
	 * Motherlode Mine
	 */
	// Upstairs mines access has no varb/varp :(
	// Bigger sack? probably 5556
	UPGRADED_MLM_SACK(5556),

	/**
	 * Mahogany Homes
	 */
	// Hosidius house style?

	/**
	 * Volcanic Mine
	 */
	// Large water container?
	// Fertile soil warning?
	UNLOCKED_LARGE_WATER_CONTAINER(5959),
	// ash covered tome bought is 5960

	/**
	 * Ava's effects
	 */
	// Ava's in CW?
	// Ava's on Range/Max cape?
	// Ava's in SW?
	AVAS_RANGE_MAX_CAPE(8068),

	/**
	 * Damaged books
	 */
	// Unsure if any of these have varbs

	/**
	 * Warrior's Guild
	 */
	// Basement access?

	/**
	 * Ilfeen chants
	 */
	// Unsure about this varb, but the enchant count (8362) goes up to 5, then 9053->1 for right click option

	/**
	 * Shayzien helm (5) on slayer helm
	 */
	SHAYZIEN_HELM_EFFECT_ADDED_TO_SLAYER_HELM(7940),

	/**
	 * Forgotten prayers
	 */
	// Based on https://github.com/RuneStar/cs2-scripts/blob/master/scripts/[proc,prayer_isavailable].cs2
	UNLOCKED_RIGOUR(5451),
	UNLOCKED_AUGURY(5452),
	UNLOCKED_PRESERVE(5453),

	/**
	 * LMS rewards
	 */
	// It's possible that all rewards have varbs since they are displayed in the shop interface

	/**
	 * Graceful outfits
	 */
	// Ability to buy single Agility Arena recolours?
	UNLOCKED_BRIMHAVEN_SINGLE_RECOLORS(5967),

	/**
	 * Bounty Hunter rewards
	 */
	// Unsure if hats will have varbs

	/**
	 * Music cape(t)
	 */
	// Probably varps

	/**
	 * Monkey transformations
	 */
	// Probably not

	/**
	 * Xeric's talisman
	 */
	// Ability to use fifth tp?

	/**
	 * Corrupted Gauntlet
	 */
	// Younglief metamorphosis?

	/**
	 * Kharedst's Memoirs
	 */
	// Secret entry?

	/**
	 * Achievement diary cape(t)
	 */
	// Diary varbs
	// All quests

	/**
	 * Treasure Trails rewards
	 */
	// Can easily check clue scroll completion
	// Can easily check STASH units, although it is tedious
	// Ability to make watches/sextants?
	// Beginner clues are varp 2201
	// Master clues are varp 2353
	// Elites varb 3935?
	EASY_CASKETS_OPENED(3463),
	MEDIUM_CASKETS_OPENED(3465),
	HARD_CASKETS_OPENED(3467),

	/**
	 * Champions Lamps
	 */
	// Bitmap 6278/9
	CHAMPIONS_CHALLENGE_LAMPS_BITMAP(6279),

	/**
	 * Slayer rewards
	 */
	// Thank you beta worlds
	UNLOCKED_GARGOYLE_SMASHER(4027),
	UNLOCKED_SLUG_SALTER(4028),
	UNLOCKED_REPTILE_FREEZER(4029),
	UNLOCKED_SHROOM_SPRAYER(4030),
	UNLOCKED_BROADER_FLETCHING(3208),
	UNLOCKED_MALEVOLENT_MASQUERADE(3202),
	UNLOCKED_RING_BLING(3207),
	UNLOCKED_BIGGER_AND_BADDER(5358),
	UNLOCKED_KING_BLACK_BONNET(5080),
	UNLOCKED_KALPHITE_KHAT(5081),
	UNLOCKED_UNHOLY_HELMET(5082),
	UNLOCKED_DARK_MANTLE(5631),
	UNLOCKED_UNDEAD_HEAD(6096),
	UNLOCKED_USE_MORE_HEAD(6570),
	UNLOCKED_DULY_NOTED(4589),
	UNLOCKED_STOP_THE_WYVERN(240),
	UNLOCKED_TWISTED_VISION(10104),

	/**
	 * Entrances and obstacles
	 */
	UNBLOCKED_LUMBRIDGE_SWAMP_CAVE_HOLE(538),
	// Eagle varbs
	VINE_TO_EAGLE_STATE(3109), // Vine growth goes up to 3 (fully grown)
	MOVED_BOULDER_TO_DESERT_EAGLE(3088),

	// Kourend Catacombs varbs
	UNLOCKED_HOSIDIUS_CATACOMBS_ENTRANCE(5087),
	UNLOCKED_SHAYZIEN_CATACOMBS_ENTRANCE(5088),
	UNLOCKED_ARCEUUS_CATACOMBS_ENTRANCE(5089),
	UNLOCKED_LOVAKENGJ_CATACOMBS_ENTRANCE(5090),

	// Haris
	UNLOCKED_HARIS_RESOURCE_AREA(6076),

	// Kruk's lair passage
	UNBLOCKED_KRUKS_LAIR_PASSAGE(5029),

	// W/E doors require temple key
	// Central door requires pulling lever near Eodan
	UNLOCKED_WEST_FORTHOS_DOOR(8397),
	UNLOCKED_EAST_FORTHOS_DOOR(8398),
	UNLOCKED_CENTRAL_FORTHOS_DOOR(8408),

	// Enakhra entrances
	OPENED_ENAKHRAS_TEMPLE_NW_ENTRANCE(1598),
	OPENED_ENAKHRAS_TEMPLE_NE_ENTRANCE(1599),
	OPENED_ENAKHRAS_TEMPLE_SE_ENTRANCE(1600),
	OPENED_ENAKHRAS_TEMPLE_SW_ENTRANCE(1601),

	// Enakhra doors
	UNLOCKED_ENAKHRAS_TEMPLE_S_DOOR(1611),
	UNLOCKED_ENAKHRAS_TEMPLE_W_DOOR(1612),
	UNLOCKED_ENAKHRAS_TEMPLE_N_DOOR(1613),
	UNLOCKED_ENAKHRAS_TEMPLE_E_DOOR(1614),

	EXCAVATED_STATUE_TO_TUNNEL_OF_CHAOS(3524),
	EXITED_THROUGH_TROLL_STRONGHOLD_SECRET_EXIT(1),

	/**
	 * Dialogue box menu options
	 */
	// I know Fritz doesn't have one.
	// Check farming contract count for jane?
	// Lap count for Ystwyth? No

	/**
	 * Spellbook features
	 */
	// Kourend tele
	// BH target tele
	// Ourania tele
	// 2014 RF tele anim
	// TL tele anim
	// TBZ tele anim
	// NPC contact? Seems possible

	/**
	 * Holiday items
	 */
	// Unsure of how this should be tracked.
	// I have not been paying attention long enough to see if holiday completion varbs are kept around long enough.
	// Some appear to be, could update to newest each time

	/**
	 * Right click options
	 */
	// These should all be possible since these are done by showing/hiding different NPCs
	UNLOCKED_JARVALD_TRAVEL(814),
	UNLOCKED_MARY_TANNING(696),
	UNLOCKED_ILFEEN_ENCHANT(9053),
	UNLOCKED_CONWENNA_AND_REESE_SING(9295),
	UNLOCKED_NORANNA_CONVERT_SHARDS(10448),
	UNLOCKED_MOUNTAIN_GUIDE_TRAVEL(5421),
	// Cloister Bell is a varp
	LAST_JEWELLERY_BOX_TELEPORT(2308), // 0 indicates never used
	LAST_CHARTER_SHIP_DESTINATION(10068), // 0 indicates never used
	LAST_NPC_CONTACT_CONTACT(5006), // 0 indicates never used

	/**
	 * Doomsayer Warnings
	 */
	// All set to 7 when off
	WARNING_DKS_LADDER(3851),
	WARNING_CONTACT_DUNGEON_LADDER(3852),
	WARNING_FALADOR_MOLE_LAIR(3853),
	WARNING_STRONGHOLD_OF_SECURITY_LADDERS(3854),
	WARNING_PLAYER_OWNED_HOUSES(3855),
	WARNING_DROPPED_ITEMS_IN_RANDOM_EVENTS(3856),
	WARNING_WILDERNESS_DITCH(3857),
	WARNING_TROLLHEIM_WILDERNESS_ENTRANCE(3858),
	WARNING_OBSERVATORY_STAIRS(3859),
	WARNING_SHANTAY_PASS(3860),
	WARNING_ICY_PATH_AREA(3861),
	WARNING_WATCHTOWER_SHAMAN_CAVE(3862),
	WARNING_LUMBRIDGE_SWAMP_CAVE_ROPE(3863),
	WARNING_HAM_TUNNEL_FROM_MILL(3864),
	WARNING_FAIRY_RING_TO_DORGESH(3865),
	WARNING_LUMBRIDGE_CELLAR(3866),
	WARNING_ELID_GENIE_CAVE(3867),
	WARNING_DORGESH_TUNNEL_TO_KALPHITES(3868),
	WARNING_DORGESH_CITY_EXIT(3869),
	WARNING_MORT_MYRE(3870),
	WARNING_RANGING_GUILD_TOWER(3871),
	WARNING_DEATH_PLATEAU(3872),
	WARNING_GWD_WILDERNESS_AGILITY_ROUTE(3964),

	/**
	 * Unlimited services
	 */
	CAMULET_CHARGES(1574), // Num charges, 7 when infinite
	// No varb/varp for lyre progress
	PERMANENT_ACCESS_BRIMHAVEN_DUNGEON(8122), // 0 not paid, 1 paid
	PERMANENT_PAYMENT_SLEPE_BOAT(10150),
	// No varb/varp for ghost captain

	/**
	 * Balloon transport
	 */
	// Generally unsure

	/**
	 * Lovakengj Minecart Network
	 */
	// May or may not be varbs for unlocking locations
	// Talking to Meriam initially sets varb to 1, giving dwarves right click travel option
	PAID_MIRIAM_FOR_MINECART_USAGE(5085), // Goes from 1 to 2 on perm payment

	/**
	 * Emotes
	 */
	// Probably a cs2 for this I can dig up

	/**
	 * Utility items
	 */
	// Probably possible since these change the obj ids
	// Kalphite ropes maybe not since you can have those before diary but not permed
	KALPHITE_LAIR_OUTSIDE_ROPE(4586), // Simple switch
	KALPHITE_LAIR_INSIDE_ROPE(11705), // Note that this version has 3 states 0-no rope 1-reg rope 2-ironman rope
	OBSERVATORY_GRAPPLE(5810),
	DARKMEYER_WEST_ROPE(10449),
	DARKMEYER_EAST_ROPE(10450),

	/**
	 * Saradomin's light
	 */
	CONSUMED_SARADOMINS_LIGHT(4733),

	/**
	 * Jar unlocks
	 */
	// None for Kraken

	/**
	 * Buyable respawn locations
	 */
	BOUGHT_EDGEVILLE_RESPAWN(623), //621 is set if active respawn
	// No Ferox varb transmitted

	/**
	 * Miniquests
	 */
	// Easy but tedious. Varbs probably in quest proc cs2

	/**
	 * Miscellaneous dialogue paths
	 */
	UNLOCKED_ROSIE(10586),
	// Phoenix gang progress is a varp
	BOUGHT_STAFF_FROM_EBLIS(391),
	ASKED_BRUNDT_ABOUT_MTN_CAMP(265),
	ASKED_CAT_ABOUT_DESTROYER(447), // incs each time you ask, max at 3
	// ASKED_ZOOKNOCK_ABOUT_BRAZIER - doesn't seem to be transmitted
	ASKED_DWARVEN_BOATMAN_ABOUT_GOLD(312),
	TOLD_THREE_DWARVES_BETWEEN_A_ROCK(307),
	TOLD_THREE_DWARVES_GIANT_DWARF(583),
	TOLD_THREE_DWARVES_FORGETTABLE_TALE(836),
	// INFORMED_MIAZRQA - UNKNOWN
	ASKED_STREET_URCHIN_TO_LURE_AGAIN(319),
	INFORMED_KNIGHT_OF_VARLAMORE(8409),
	MET_FAIRY_AERYKA(3728),
	MET_SILAS_DAHCSNU(3528),
	MET_DAMPE(11774),
	MET_DRUNKEN_DWARF(574),
	RECEIVE_THANKS_FROM_HAMAL(272),
	BOUGHT_CANDLE_FROM_CANDLE_SELLER(284),
	CLAIMED_RAMS_SKULL_HELM(2048),
	CLAIMED_BONESACK(2049),
	ASKED_ABOUT_GUARD_UNIFORM(2495),

	/**
	 * Loot tasks
 	 */
	DADDYS_HOME_PROGRESS(10570), // Last varb val indicates Marlo's crate was opened
	// Mort'ton table is in the varp for that area
	UNDERGROUND_PASS_CRATE(9126),
	ELEMENTAL_WORKSHOP_CRATE(2066),
	MEIYERDITCH_LABS_RUNE_CASE(2584),
	CANIFIS_HIDEOUT_GARLIC_COUNTER(2009), // 0->1->2->3 for all garlic
	KLENTER_PYRAMID_COINS(448),
	ENAKHRAS_TEMPLE_SANDSTONE_COUNTER(8067), // 0->1->2->...->5 for all sandstone
	AGRITH_NAAR_THRONE(354),
	FENKENSTRAIN_CLOCK_LETTER(195),
	GOBLIN_MAIL_NORTH(2379),
	GOBLIN_MAIL_WEST(2380),
	GOBLIN_MAIL_UPSTAIRS(2381),
	// 2326, 9360, 0
	OBSERVATORY_SPIDER_CHEST_1(3829),
	// 2335, 9374, 0
	OBSERVATORY_SPIDER_CHEST_2(3830),
	// 2333, 9405, 0
	OBSERVATORY_SPIDER_CHEST_3(3831),
	// 2356, 9380, 0
	OBSERVATORY_SPIDER_CHEST_4(3832),
	// 2348, 9383, 0
	OBSERVATORY_SPIDER_CHEST_5(3833),
	// 2312, 9400, 0
	OBSERVATORY_SPIDER_CHEST_6(3834),
	// 2310, 9374, 0
	OBSERVATORY_SPIDER_CHEST_7(3835),
	ZEAH_WORKBENCH_NAILS(9684),
	PISCATORIS_BRONZE_PICKAXE(2109),
	PISCATORIS_BRONZE_AXE(2110),
	ANCIENT_LETTER_FORSAKEN_TOWER(7810),
	TATTY_NOTE_KEBOS_LOWLANDS(7951),
	PICKPOCKETED_TEDDY(2559),

	/**
	 * Fire pits
	 */
	// All certainly exist due to multiobj
	MAKING_FRIENDS_WITH_MY_ARM_PROGRESS(6528), // Building this is part of the quest (ish) >= 205 is good enough for the pit
	GWD_ENTRANCE_FIRE_PIT(6531),
	MOLE_HOLE_FIRE_PIT(6532),
	LUMBRIDGE_SWAMP_CAVES_FIRE_PIT(6533),
	MOS_LE_HARMLESS_CAVE_FIRE_PIT(6534),
	MORT_MYRE_SWAMP_FIRE_PIT(6535),

	/**
	 * Payments and instant experience rewards
	 */
	// Likely last states of quest varbs in most cases
	// Obs assistant wine is varp 112
	CABIN_FEVER_REWARD_CLAIMED(1763), // Not sure about this one, 50 in the exact same spot though
	GETTING_AHEAD_REWARD_CLAIMED(694),
	QUEEN_OF_THIEVES_REWARD_CLAIMED(6038), // Also a bit unsure about this one
	MONKEY_MADNESS_II_PROGRESS(5027), // Appears to require 200
	DRAGON_SLAYER_II_REWARD_CLAIMED(6143), // Set to 4 when all xp rewards have been claimed
	MISTHALIN_MYSTERY_REWARD_CLAIMED(4265),
	X_MARKS_THE_SPOT_CLUE_SCROLL_CLAIMED(8258),
	THE_FEUD_BEER_CLAIMED_FROM_ALI(341), // Very unsure about this one, value needs to be 2
	// No varb for clue from monkey
	// No varb for scorpius
	// Probably none for the Tai Bwo Wannai trio since thats a varp


	/**
	 * Hidden shops
	 */
	// Unclear if these are varbs
	// Some might be for multinpcs
	// Uglug is probably either varb 500 or 507
	VANLIGGA_STATE(3326), // 0 is after taxing, 1 is after repaying for tax (or having paid tax for her), 2 is access to shop


	/**
	 * Lost items
	 */
	VEOS_COLLAR_PROGRESS(5627), // 0->1 on wolf bones conv, 1->2 on collar
	// Note that 2397 alone is not enough to tell whether or not the key has been returned
	// Also need to check quest state to make sure the quest is completed. Otherwise the quest might not have been started
	ZEALOT_KEY(2397),
	BROOCH_RETURNED_TO_MISTAG(533),

	/**
	 * Trapped souls and afflicted characters
	 */
	// Note that 449 is not enough to tell whether or not Klenter has been freed
	// Also need to check quest state to make sure the quest is completed. Otherwise the quest might not have been started
	FREED_KLENTER(449),
	ICTHLARINS_LITTLE_HELPER_PROGRESS(418), // max val is 26
	FREED_DROALAK(1388),
	// Unsure if perma curing Morton people will flip a varb
	// Possible its a varp bitmap like Morton table might be
	// Seems unlikely to be transmitted considering the buggy transform on talk

	/**
	 * Redeemable quest items
	 */
	// Diary of Herbi flax is a cursed varp bitmap
	GAVE_WEISS_FIRE_NOTES_TO_BURNTMEAT(6529),
	// Note that this flips to 1 regardless of which person (Zarvistic or Yanni) you sell to
	GAVE_BLACK_PRISM_AWAY(504),

	/**
	 * Memoriam Device memories
	 */
	// Unclear

	/**
	 * Hidden identities
 	 */
	// Unclear

	/**
	 * Item combination recipes
	 */
	CAN_CRAFT_NEITIZNOT_FACEGUARDS(9472),
	// Antifire potions?

	/**
	 * Quest lamps, certificates, and tomes
	 */
	// Most of these probably have varps
	USED_LOVAKENGJ_FAVOUR_CERTIFICATE(7802),

	/**
	 * Obtained trophies
	 */
	// These seem rather unlikely to be transmitted varbs (kq and vork heads) but who knows

	/**
	 * Expert Dragon Archer title
	 */
	// Likely varb counter

	/**
	 * Varrock Museum activities
	 */
	PAID_CETO_PERMANENT(242),
	// Others likely have varbs, know that kudos does

	/**
	 * Fastest kills and runs
	 */
	// Possibly?

	/**
	 * Stronghold of Security
	 */
	SOIZTUNS_FATE_PROGRESS(5639), // 2 after Litara has been informed

	/**
	 * Chest kc
	 */
	// At least grubby chest has a kc counter
	// Others seem likely
	GRUBBY_CHEST_COUNT(10038),

	/**
	 * Irreversible warnings
	 */
	// Most probably have varbs
	IRREVERSIBLE_WARNING_GRUBBY_CHEST(8402),
	// Brimhaven hole warning is the same as Banisoch payment
	BANISOCH_ENTRANCE_STATE(5629), // 0 not paid, 1 paid, 2 warning disabled

	/**
	 * Wise Old Man's bank robbery confession
	 */
	WISE_OLD_MAN_BANK_PROGRESS(960), // Last state is 3

	/**
	 * Delivered Sir Gerry's notes
	 */
	// Probably progression varb, check corpse obj
	// Unclear, as theres only one state for most varbs in the 3969 area

	/**
	 * Disabled Shilo Village furnace coffer
	 */
	// Probably need to check Karam diary and maybe a coffer varb

	/**
	 * Completed Adventure Paths
	 */
	// Check Adventurer Jon visibility, as varbs actually associated with this may be incomplete by accounts that are older
	// Val of 0 means Jon is not visible
	ADVENTURER_JON_STATE(9340),

	/**
	 * Fairy ring codes
	 */
	// If they exist, probably in a varp

	// Warnings

	// Set to 1 when off
	WARNING_MINIGAME_TELEPORT(5410),

	ATLAS_TRAINING_SESSION_COUNT(12131),
	// 0->1 when completed
	KARUULM_DIARY_ASSEMBLED(13035),
	UNGAEL_NOTES_ASSEMBLED(12133),
	LITHKREN_NOTES_ASSEMBLED(12134),

	// 0->1 when built
	ISLAND_OF_SOULS_SPINNING_WHEEL(11716),
	ISLAND_OF_SOULS_POTTERS_WHEEL(11717),

	TAILBLAZER_TELEPORT_SCROLL(11761),
	SHATTERED_RELICS_TELEPORT_SCROLL(13343),

	KOUREND_RESPAWN_UNLOCKED(12304),

	ENTERED_WILDERNESS_COUNTER(4149);

	private final int id;
}
