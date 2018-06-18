/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.pepsoft.minecraft;

import com.google.common.collect.ImmutableSet;

import java.util.*;

/**
 *
 * @author pepijn
 */
public final class Constants {
    private Constants() {
        // Prevent instantiation
    }

    // MC 1.13 block names

    public static final String MC_ACACIA_BARK = "minecraft:acacia_bark";
    public static final String MC_ACACIA_DOOR = "minecraft:acacia_door";
    public static final String MC_ACACIA_FENCE = "minecraft:acacia_fence";
    public static final String MC_ACACIA_FENCE_GATE = "minecraft:acacia_fence_gate";
    public static final String MC_ACACIA_LEAVES = "minecraft:acacia_leaves";
    public static final String MC_ACACIA_LOG = "minecraft:acacia_log";
    public static final String MC_ACACIA_PLANKS = "minecraft:acacia_planks";
    public static final String MC_ACACIA_SAPLING = "minecraft:acacia_sapling";
    public static final String MC_ACACIA_SLAB = "minecraft:acacia_slab";
    public static final String MC_ACACIA_STAIRS = "minecraft:acacia_stairs";
    public static final String MC_ACTIVATOR_RAIL = "minecraft:activator_rail";
    public static final String MC_AIR = "minecraft:air";
    public static final String MC_ALLIUM = "minecraft:allium";
    public static final String MC_ANDESITE = "minecraft:andesite";
    public static final String MC_ANVIL = "minecraft:anvil";
    public static final String MC_AZURE_BLUET = "minecraft:azure_bluet";
    public static final String MC_BARRIER = "minecraft:barrier";
    public static final String MC_BEACON = "minecraft:beacon";
    public static final String MC_BEDROCK = "minecraft:bedrock";
    public static final String MC_BEETROOTS = "minecraft:beetroots";
    public static final String MC_BIRCH_BARK = "minecraft:birch_bark";
    public static final String MC_BIRCH_DOOR = "minecraft:birch_door";
    public static final String MC_BIRCH_FENCE = "minecraft:birch_fence";
    public static final String MC_BIRCH_FENCE_GATE = "minecraft:birch_fence_gate";
    public static final String MC_BIRCH_LEAVES = "minecraft:birch_leaves";
    public static final String MC_BIRCH_LOG = "minecraft:birch_log";
    public static final String MC_BIRCH_PLANKS = "minecraft:birch_planks";
    public static final String MC_BIRCH_SAPLING = "minecraft:birch_sapling";
    public static final String MC_BIRCH_SLAB = "minecraft:birch_slab";
    public static final String MC_BIRCH_STAIRS = "minecraft:birch_stairs";
    public static final String MC_BLACK_CARPET = "minecraft:black_carpet";
    public static final String MC_BLACK_CONCRETE = "minecraft:black_concrete";
    public static final String MC_BLACK_CONCRETE_POWDER = "minecraft:black_concrete_powder";
    public static final String MC_BLACK_GLAZED_TERRACOTTA = "minecraft:black_glazed_terracotta";
    public static final String MC_BLACK_SHULKER_BOX = "minecraft:black_shulker_box";
    public static final String MC_BLACK_STAINED_GLASS = "minecraft:black_stained_glass";
    public static final String MC_BLACK_STAINED_GLASS_PANE = "minecraft:black_stained_glass_pane";
    public static final String MC_BLACK_TERRACOTTA = "minecraft:black_terracotta";
    public static final String MC_BLACK_WOOL = "minecraft:black_wool";
    public static final String MC_BLUE_CARPET = "minecraft:blue_carpet";
    public static final String MC_BLUE_CONCRETE = "minecraft:blue_concrete";
    public static final String MC_BLUE_CONCRETE_POWDER = "minecraft:blue_concrete_powder";
    public static final String MC_BLUE_GLAZED_TERRACOTTA = "minecraft:blue_glazed_terracotta";
    public static final String MC_BLUE_ORCHID = "minecraft:blue_orchid";
    public static final String MC_BLUE_SHULKER_BOX = "minecraft:blue_shulker_box";
    public static final String MC_BLUE_STAINED_GLASS = "minecraft:blue_stained_glass";
    public static final String MC_BLUE_STAINED_GLASS_PANE = "minecraft:blue_stained_glass_pane";
    public static final String MC_BLUE_TERRACOTTA = "minecraft:blue_terracotta";
    public static final String MC_BLUE_WOOL = "minecraft:blue_wool";
    public static final String MC_BONE_BLOCK = "minecraft:bone_block";
    public static final String MC_BOOKSHELF = "minecraft:bookshelf";
    public static final String MC_BREWING_STAND = "minecraft:brewing_stand";
    public static final String MC_BRICK_SLAB = "minecraft:brick_slab";
    public static final String MC_BRICK_STAIRS = "minecraft:brick_stairs";
    public static final String MC_BRICKS = "minecraft:bricks";
    public static final String MC_BROWN_CARPET = "minecraft:brown_carpet";
    public static final String MC_BROWN_CONCRETE = "minecraft:brown_concrete";
    public static final String MC_BROWN_CONCRETE_POWDER = "minecraft:brown_concrete_powder";
    public static final String MC_BROWN_GLAZED_TERRACOTTA = "minecraft:brown_glazed_terracotta";
    public static final String MC_BROWN_MUSHROOM = "minecraft:brown_mushroom";
    public static final String MC_BROWN_MUSHROOM_BLOCK = "minecraft:brown_mushroom_block";
    public static final String MC_BROWN_SHULKER_BOX = "minecraft:brown_shulker_box";
    public static final String MC_BROWN_STAINED_GLASS = "minecraft:brown_stained_glass";
    public static final String MC_BROWN_STAINED_GLASS_PANE = "minecraft:brown_stained_glass_pane";
    public static final String MC_BROWN_TERRACOTTA = "minecraft:brown_terracotta";
    public static final String MC_BROWN_WOOL = "minecraft:brown_wool";
    public static final String MC_CACTUS = "minecraft:cactus";
    public static final String MC_CAKE = "minecraft:cake";
    public static final String MC_CARROTS = "minecraft:carrots";
    public static final String MC_CAULDRON = "minecraft:cauldron";
    public static final String MC_CHAIN_COMMAND_BLOCK = "minecraft:chain_command_block";
    public static final String MC_CHEST = "minecraft:chest";
    public static final String MC_CHIPPED_ANVIL = "minecraft:chipped_anvil";
    public static final String MC_CHISELED_QUARTZ_BLOCK = "minecraft:chiseled_quartz_block";
    public static final String MC_CHISELED_RED_SANDSTONE = "minecraft:chiseled_red_sandstone";
    public static final String MC_CHISELED_SANDSTONE = "minecraft:chiseled_sandstone";
    public static final String MC_CHISELED_STONE_BRICKS = "minecraft:chiseled_stone_bricks";
    public static final String MC_CHORUS_FLOWER = "minecraft:chorus_flower";
    public static final String MC_CHORUS_PLANT = "minecraft:chorus_plant";
    public static final String MC_CLAY = "minecraft:clay";
    public static final String MC_COAL_BLOCK = "minecraft:coal_block";
    public static final String MC_COAL_ORE = "minecraft:coal_ore";
    public static final String MC_COARSE_DIRT = "minecraft:coarse_dirt";
    public static final String MC_COBBLESTONE = "minecraft:cobblestone";
    public static final String MC_COBBLESTONE_SLAB = "minecraft:cobblestone_slab";
    public static final String MC_COBBLESTONE_STAIRS = "minecraft:cobblestone_stairs";
    public static final String MC_COBBLESTONE_WALL = "minecraft:cobblestone_wall";
    public static final String MC_COBWEB = "minecraft:cobweb";
    public static final String MC_COCOA = "minecraft:cocoa";
    public static final String MC_COMMAND_BLOCK = "minecraft:command_block";
    public static final String MC_COMPARATOR = "minecraft:comparator";
    public static final String MC_CRACKED_STONE_BRICKS = "minecraft:cracked_stone_bricks";
    public static final String MC_CRAFTING_TABLE = "minecraft:crafting_table";
    public static final String MC_CUT_RED_SANDSTONE = "minecraft:cut_red_sandstone";
    public static final String MC_CUT_SANDSTONE = "minecraft:cut_sandstone";
    public static final String MC_CYAN_CARPET = "minecraft:cyan_carpet";
    public static final String MC_CYAN_CONCRETE = "minecraft:cyan_concrete";
    public static final String MC_CYAN_CONCRETE_POWDER = "minecraft:cyan_concrete_powder";
    public static final String MC_CYAN_GLAZED_TERRACOTTA = "minecraft:cyan_glazed_terracotta";
    public static final String MC_CYAN_SHULKER_BOX = "minecraft:cyan_shulker_box";
    public static final String MC_CYAN_STAINED_GLASS = "minecraft:cyan_stained_glass";
    public static final String MC_CYAN_STAINED_GLASS_PANE = "minecraft:cyan_stained_glass_pane";
    public static final String MC_CYAN_TERRACOTTA = "minecraft:cyan_terracotta";
    public static final String MC_CYAN_WOOL = "minecraft:cyan_wool";
    public static final String MC_DAMAGED_ANVIL = "minecraft:damaged_anvil";
    public static final String MC_DANDELION = "minecraft:dandelion";
    public static final String MC_DARK_OAK_BARK = "minecraft:dark_oak_bark";
    public static final String MC_DARK_OAK_DOOR = "minecraft:dark_oak_door";
    public static final String MC_DARK_OAK_FENCE = "minecraft:dark_oak_fence";
    public static final String MC_DARK_OAK_FENCE_GATE = "minecraft:dark_oak_fence_gate";
    public static final String MC_DARK_OAK_LEAVES = "minecraft:dark_oak_leaves";
    public static final String MC_DARK_OAK_LOG = "minecraft:dark_oak_log";
    public static final String MC_DARK_OAK_PLANKS = "minecraft:dark_oak_planks";
    public static final String MC_DARK_OAK_SAPLING = "minecraft:dark_oak_sapling";
    public static final String MC_DARK_OAK_SLAB = "minecraft:dark_oak_slab";
    public static final String MC_DARK_OAK_STAIRS = "minecraft:dark_oak_stairs";
    public static final String MC_DARK_PRISMARINE = "minecraft:dark_prismarine";
    public static final String MC_DAYLIGHT_DETECTOR = "minecraft:daylight_detector";
    public static final String MC_DEAD_BUSH = "minecraft:dead_bush";
    public static final String MC_DETECTOR_RAIL = "minecraft:detector_rail";
    public static final String MC_DIAMOND_BLOCK = "minecraft:diamond_block";
    public static final String MC_DIAMOND_ORE = "minecraft:diamond_ore";
    public static final String MC_DIORITE = "minecraft:diorite";
    public static final String MC_DIRT = "minecraft:dirt";
    public static final String MC_DISPENSER = "minecraft:dispenser";
    public static final String MC_DRAGON_EGG = "minecraft:dragon_egg";
    public static final String MC_DROPPER = "minecraft:dropper";
    public static final String MC_EMERALD_BLOCK = "minecraft:emerald_block";
    public static final String MC_EMERALD_ORE = "minecraft:emerald_ore";
    public static final String MC_ENCHANTING_TABLE = "minecraft:enchanting_table";
    public static final String MC_END_GATEWAY = "minecraft:end_gateway";
    public static final String MC_END_PORTAL = "minecraft:end_portal";
    public static final String MC_END_PORTAL_FRAME = "minecraft:end_portal_frame";
    public static final String MC_END_ROD = "minecraft:end_rod";
    public static final String MC_END_STONE = "minecraft:end_stone";
    public static final String MC_END_STONE_BRICKS = "minecraft:end_stone_bricks";
    public static final String MC_ENDER_CHEST = "minecraft:ender_chest";
    public static final String MC_FARMLAND = "minecraft:farmland";
    public static final String MC_FERN = "minecraft:fern";
    public static final String MC_FIRE = "minecraft:fire";
    public static final String MC_FROSTED_ICE = "minecraft:frosted_ice";
    public static final String MC_FURNACE = "minecraft:furnace";
    public static final String MC_GLASS = "minecraft:glass";
    public static final String MC_GLASS_PANE = "minecraft:glass_pane";
    public static final String MC_GLOWSTONE = "minecraft:glowstone";
    public static final String MC_GOLD_BLOCK = "minecraft:gold_block";
    public static final String MC_GOLD_ORE = "minecraft:gold_ore";
    public static final String MC_GRANITE = "minecraft:granite";
    public static final String MC_GRASS = "minecraft:grass";
    public static final String MC_GRASS_BLOCK = "minecraft:grass_block";
    public static final String MC_GRASS_PATH = "minecraft:grass_path";
    public static final String MC_GRAVEL = "minecraft:gravel";
    public static final String MC_GRAY_CARPET = "minecraft:gray_carpet";
    public static final String MC_GRAY_CONCRETE = "minecraft:gray_concrete";
    public static final String MC_GRAY_CONCRETE_POWDER = "minecraft:gray_concrete_powder";
    public static final String MC_GRAY_GLAZED_TERRACOTTA = "minecraft:gray_glazed_terracotta";
    public static final String MC_GRAY_SHULKER_BOX = "minecraft:gray_shulker_box";
    public static final String MC_GRAY_STAINED_GLASS = "minecraft:gray_stained_glass";
    public static final String MC_GRAY_STAINED_GLASS_PANE = "minecraft:gray_stained_glass_pane";
    public static final String MC_GRAY_TERRACOTTA = "minecraft:gray_terracotta";
    public static final String MC_GRAY_WOOL = "minecraft:gray_wool";
    public static final String MC_GREEN_CARPET = "minecraft:green_carpet";
    public static final String MC_GREEN_CONCRETE = "minecraft:green_concrete";
    public static final String MC_GREEN_CONCRETE_POWDER = "minecraft:green_concrete_powder";
    public static final String MC_GREEN_GLAZED_TERRACOTTA = "minecraft:green_glazed_terracotta";
    public static final String MC_GREEN_SHULKER_BOX = "minecraft:green_shulker_box";
    public static final String MC_GREEN_STAINED_GLASS = "minecraft:green_stained_glass";
    public static final String MC_GREEN_STAINED_GLASS_PANE = "minecraft:green_stained_glass_pane";
    public static final String MC_GREEN_TERRACOTTA = "minecraft:green_terracotta";
    public static final String MC_GREEN_WOOL = "minecraft:green_wool";
    public static final String MC_HAY_BLOCK = "minecraft:hay_block";
    public static final String MC_HEAVY_WEIGHTED_PRESSURE_PLATE = "minecraft:heavy_weighted_pressure_plate";
    public static final String MC_HOPPER = "minecraft:hopper";
    public static final String MC_ICE = "minecraft:ice";
    public static final String MC_INFESTED_CHISELED_STONE_BRICKS = "minecraft:infested_chiseled_stone_bricks";
    public static final String MC_INFESTED_COBBLESTONE = "minecraft:infested_cobblestone";
    public static final String MC_INFESTED_CRACKED_STONE_BRICKS = "minecraft:infested_cracked_stone_bricks";
    public static final String MC_INFESTED_MOSSY_STONE_BRICKS = "minecraft:infested_mossy_stone_bricks";
    public static final String MC_INFESTED_STONE = "minecraft:infested_stone";
    public static final String MC_INFESTED_STONE_BRICKS = "minecraft:infested_stone_bricks";
    public static final String MC_IRON_BARS = "minecraft:iron_bars";
    public static final String MC_IRON_BLOCK = "minecraft:iron_block";
    public static final String MC_IRON_DOOR = "minecraft:iron_door";
    public static final String MC_IRON_ORE = "minecraft:iron_ore";
    public static final String MC_IRON_TRAPDOOR = "minecraft:iron_trapdoor";
    public static final String MC_JACK_O_LANTERN = "minecraft:jack_o_lantern";
    public static final String MC_JUKEBOX = "minecraft:jukebox";
    public static final String MC_JUNGLE_BARK = "minecraft:jungle_bark";
    public static final String MC_JUNGLE_DOOR = "minecraft:jungle_door";
    public static final String MC_JUNGLE_FENCE = "minecraft:jungle_fence";
    public static final String MC_JUNGLE_FENCE_GATE = "minecraft:jungle_fence_gate";
    public static final String MC_JUNGLE_LEAVES = "minecraft:jungle_leaves";
    public static final String MC_JUNGLE_LOG = "minecraft:jungle_log";
    public static final String MC_JUNGLE_PLANKS = "minecraft:jungle_planks";
    public static final String MC_JUNGLE_SAPLING = "minecraft:jungle_sapling";
    public static final String MC_JUNGLE_SLAB = "minecraft:jungle_slab";
    public static final String MC_JUNGLE_STAIRS = "minecraft:jungle_stairs";
    public static final String MC_LADDER = "minecraft:ladder";
    public static final String MC_LAPIS_BLOCK = "minecraft:lapis_block";
    public static final String MC_LAPIS_ORE = "minecraft:lapis_ore";
    public static final String MC_LARGE_FERN = "minecraft:large_fern";
    public static final String MC_LAVA = "minecraft:lava";
    public static final String MC_LEVER = "minecraft:lever";
    public static final String MC_LIGHT_BLUE_CARPET = "minecraft:light_blue_carpet";
    public static final String MC_LIGHT_BLUE_CONCRETE = "minecraft:light_blue_concrete";
    public static final String MC_LIGHT_BLUE_CONCRETE_POWDER = "minecraft:light_blue_concrete_powder";
    public static final String MC_LIGHT_BLUE_GLAZED_TERRACOTTA = "minecraft:light_blue_glazed_terracotta";
    public static final String MC_LIGHT_BLUE_SHULKER_BOX = "minecraft:light_blue_shulker_box";
    public static final String MC_LIGHT_BLUE_STAINED_GLASS = "minecraft:light_blue_stained_glass";
    public static final String MC_LIGHT_BLUE_STAINED_GLASS_PANE = "minecraft:light_blue_stained_glass_pane";
    public static final String MC_LIGHT_BLUE_TERRACOTTA = "minecraft:light_blue_terracotta";
    public static final String MC_LIGHT_BLUE_WOOL = "minecraft:light_blue_wool";
    public static final String MC_LIGHT_GRAY_CARPET = "minecraft:light_gray_carpet";
    public static final String MC_LIGHT_GRAY_CONCRETE = "minecraft:light_gray_concrete";
    public static final String MC_LIGHT_GRAY_CONCRETE_POWDER = "minecraft:light_gray_concrete_powder";
    public static final String MC_LIGHT_GRAY_GLAZED_TERRACOTTA = "minecraft:light_gray_glazed_terracotta";
    public static final String MC_LIGHT_GRAY_SHULKER_BOX = "minecraft:light_gray_shulker_box";
    public static final String MC_LIGHT_GRAY_STAINED_GLASS = "minecraft:light_gray_stained_glass";
    public static final String MC_LIGHT_GRAY_STAINED_GLASS_PANE = "minecraft:light_gray_stained_glass_pane";
    public static final String MC_LIGHT_GRAY_TERRACOTTA = "minecraft:light_gray_terracotta";
    public static final String MC_LIGHT_GRAY_WOOL = "minecraft:light_gray_wool";
    public static final String MC_LIGHT_WEIGHTED_PRESSURE_PLATE = "minecraft:light_weighted_pressure_plate";
    public static final String MC_LILAC = "minecraft:lilac";
    public static final String MC_LILY_PAD = "minecraft:lily_pad";
    public static final String MC_LIME_CARPET = "minecraft:lime_carpet";
    public static final String MC_LIME_CONCRETE = "minecraft:lime_concrete";
    public static final String MC_LIME_CONCRETE_POWDER = "minecraft:lime_concrete_powder";
    public static final String MC_LIME_GLAZED_TERRACOTTA = "minecraft:lime_glazed_terracotta";
    public static final String MC_LIME_SHULKER_BOX = "minecraft:lime_shulker_box";
    public static final String MC_LIME_STAINED_GLASS = "minecraft:lime_stained_glass";
    public static final String MC_LIME_STAINED_GLASS_PANE = "minecraft:lime_stained_glass_pane";
    public static final String MC_LIME_TERRACOTTA = "minecraft:lime_terracotta";
    public static final String MC_LIME_WOOL = "minecraft:lime_wool";
    public static final String MC_MAGENTA_CARPET = "minecraft:magenta_carpet";
    public static final String MC_MAGENTA_CONCRETE = "minecraft:magenta_concrete";
    public static final String MC_MAGENTA_CONCRETE_POWDER = "minecraft:magenta_concrete_powder";
    public static final String MC_MAGENTA_GLAZED_TERRACOTTA = "minecraft:magenta_glazed_terracotta";
    public static final String MC_MAGENTA_SHULKER_BOX = "minecraft:magenta_shulker_box";
    public static final String MC_MAGENTA_STAINED_GLASS = "minecraft:magenta_stained_glass";
    public static final String MC_MAGENTA_STAINED_GLASS_PANE = "minecraft:magenta_stained_glass_pane";
    public static final String MC_MAGENTA_TERRACOTTA = "minecraft:magenta_terracotta";
    public static final String MC_MAGENTA_WOOL = "minecraft:magenta_wool";
    public static final String MC_MAGMA_BLOCK = "minecraft:magma_block";
    public static final String MC_MELON_BLOCK = "minecraft:melon_block";
    public static final String MC_MELON_STEM = "minecraft:melon_stem";
    public static final String MC_MOB_SPAWNER = "minecraft:mob_spawner";
    public static final String MC_MOSSY_COBBLESTONE = "minecraft:mossy_cobblestone";
    public static final String MC_MOSSY_COBBLESTONE_WALL = "minecraft:mossy_cobblestone_wall";
    public static final String MC_MOSSY_STONE_BRICKS = "minecraft:mossy_stone_bricks";
    public static final String MC_MUSHROOM_STEM = "minecraft:mushroom_stem";
    public static final String MC_MYCELIUM = "minecraft:mycelium";
    public static final String MC_NETHER_BRICK_FENCE = "minecraft:nether_brick_fence";
    public static final String MC_NETHER_BRICK_SLAB = "minecraft:nether_brick_slab";
    public static final String MC_NETHER_BRICK_STAIRS = "minecraft:nether_brick_stairs";
    public static final String MC_NETHER_BRICKS = "minecraft:nether_bricks";
    public static final String MC_NETHER_QUARTZ_ORE = "minecraft:nether_quartz_ore";
    public static final String MC_NETHER_WART = "minecraft:nether_wart";
    public static final String MC_NETHER_WART_BLOCK = "minecraft:nether_wart_block";
    public static final String MC_NETHERRACK = "minecraft:netherrack";
    public static final String MC_NOTE_BLOCK = "minecraft:note_block";
    public static final String MC_OAK_BARK = "minecraft:oak_bark";
    public static final String MC_OAK_BUTTON = "minecraft:oak_button";
    public static final String MC_OAK_DOOR = "minecraft:oak_door";
    public static final String MC_OAK_FENCE = "minecraft:oak_fence";
    public static final String MC_OAK_FENCE_GATE = "minecraft:oak_fence_gate";
    public static final String MC_OAK_LEAVES = "minecraft:oak_leaves";
    public static final String MC_OAK_LOG = "minecraft:oak_log";
    public static final String MC_OAK_PLANKS = "minecraft:oak_planks";
    public static final String MC_OAK_PRESSURE_PLATE = "minecraft:oak_pressure_plate";
    public static final String MC_OAK_SAPLING = "minecraft:oak_sapling";
    public static final String MC_OAK_SLAB = "minecraft:oak_slab";
    public static final String MC_OAK_STAIRS = "minecraft:oak_stairs";
    public static final String MC_OAK_TRAPDOOR = "minecraft:oak_trapdoor";
    public static final String MC_OBSERVER = "minecraft:observer";
    public static final String MC_OBSIDIAN = "minecraft:obsidian";
    public static final String MC_ORANGE_CARPET = "minecraft:orange_carpet";
    public static final String MC_ORANGE_CONCRETE = "minecraft:orange_concrete";
    public static final String MC_ORANGE_CONCRETE_POWDER = "minecraft:orange_concrete_powder";
    public static final String MC_ORANGE_GLAZED_TERRACOTTA = "minecraft:orange_glazed_terracotta";
    public static final String MC_ORANGE_SHULKER_BOX = "minecraft:orange_shulker_box";
    public static final String MC_ORANGE_STAINED_GLASS = "minecraft:orange_stained_glass";
    public static final String MC_ORANGE_STAINED_GLASS_PANE = "minecraft:orange_stained_glass_pane";
    public static final String MC_ORANGE_TERRACOTTA = "minecraft:orange_terracotta";
    public static final String MC_ORANGE_TULIP = "minecraft:orange_tulip";
    public static final String MC_ORANGE_WOOL = "minecraft:orange_wool";
    public static final String MC_OXEYE_DAISY = "minecraft:oxeye_daisy";
    public static final String MC_PACKED_ICE = "minecraft:packed_ice";
    public static final String MC_PEONY = "minecraft:peony";
    public static final String MC_PETRIFIED_OAK_SLAB = "minecraft:petrified_oak_slab";
    public static final String MC_PINK_CARPET = "minecraft:pink_carpet";
    public static final String MC_PINK_CONCRETE = "minecraft:pink_concrete";
    public static final String MC_PINK_CONCRETE_POWDER = "minecraft:pink_concrete_powder";
    public static final String MC_PINK_GLAZED_TERRACOTTA = "minecraft:pink_glazed_terracotta";
    public static final String MC_PINK_SHULKER_BOX = "minecraft:pink_shulker_box";
    public static final String MC_PINK_STAINED_GLASS = "minecraft:pink_stained_glass";
    public static final String MC_PINK_STAINED_GLASS_PANE = "minecraft:pink_stained_glass_pane";
    public static final String MC_PINK_TERRACOTTA = "minecraft:pink_terracotta";
    public static final String MC_PINK_TULIP = "minecraft:pink_tulip";
    public static final String MC_PINK_WOOL = "minecraft:pink_wool";
    public static final String MC_PISTON = "minecraft:piston";
    public static final String MC_PISTON_HEAD = "minecraft:piston_head";
    public static final String MC_PODZOL = "minecraft:podzol";
    public static final String MC_POLISHED_ANDESITE = "minecraft:polished_andesite";
    public static final String MC_POLISHED_DIORITE = "minecraft:polished_diorite";
    public static final String MC_POLISHED_GRANITE = "minecraft:polished_granite";
    public static final String MC_POPPY = "minecraft:poppy";
    public static final String MC_PORTAL = "minecraft:portal";
    public static final String MC_POTATOES = "minecraft:potatoes";
    public static final String MC_POTTED_CACTUS = "minecraft:potted_cactus";
    public static final String MC_POWERED_RAIL = "minecraft:powered_rail";
    public static final String MC_PRISMARINE = "minecraft:prismarine";
    public static final String MC_PRISMARINE_BRICKS = "minecraft:prismarine_bricks";
    public static final String MC_PUMPKIN = "minecraft:pumpkin";
    public static final String MC_PUMPKIN_STEM = "minecraft:pumpkin_stem";
    public static final String MC_PURPLE_CARPET = "minecraft:purple_carpet";
    public static final String MC_PURPLE_CONCRETE = "minecraft:purple_concrete";
    public static final String MC_PURPLE_CONCRETE_POWDER = "minecraft:purple_concrete_powder";
    public static final String MC_PURPLE_GLAZED_TERRACOTTA = "minecraft:purple_glazed_terracotta";
    public static final String MC_PURPLE_STAINED_GLASS = "minecraft:purple_stained_glass";
    public static final String MC_PURPLE_STAINED_GLASS_PANE = "minecraft:purple_stained_glass_pane";
    public static final String MC_PURPLE_TERRACOTTA = "minecraft:purple_terracotta";
    public static final String MC_PURPLE_WOOL = "minecraft:purple_wool";
    public static final String MC_PURPUR_BLOCK = "minecraft:purpur_block";
    public static final String MC_PURPUR_PILLAR = "minecraft:purpur_pillar";
    public static final String MC_PURPUR_SLAB = "minecraft:purpur_slab";
    public static final String MC_PURPUR_STAIRS = "minecraft:purpur_stairs";
    public static final String MC_QUARTZ_BLOCK = "minecraft:quartz_block";
    public static final String MC_QUARTZ_PILLAR = "minecraft:quartz_pillar";
    public static final String MC_QUARTZ_SLAB = "minecraft:quartz_slab";
    public static final String MC_QUARTZ_STAIRS = "minecraft:quartz_stairs";
    public static final String MC_RAIL = "minecraft:rail";
    public static final String MC_RED_BED = "minecraft:red_bed";
    public static final String MC_RED_CARPET = "minecraft:red_carpet";
    public static final String MC_RED_CONCRETE = "minecraft:red_concrete";
    public static final String MC_RED_CONCRETE_POWDER = "minecraft:red_concrete_powder";
    public static final String MC_RED_GLAZED_TERRACOTTA = "minecraft:red_glazed_terracotta";
    public static final String MC_RED_MUSHROOM = "minecraft:red_mushroom";
    public static final String MC_RED_MUSHROOM_BLOCK = "minecraft:red_mushroom_block";
    public static final String MC_RED_NETHER_BRICKS = "minecraft:red_nether_bricks";
    public static final String MC_RED_SAND = "minecraft:red_sand";
    public static final String MC_RED_SANDSTONE = "minecraft:red_sandstone";
    public static final String MC_RED_SANDSTONE_SLAB = "minecraft:red_sandstone_slab";
    public static final String MC_RED_SANDSTONE_STAIRS = "minecraft:red_sandstone_stairs";
    public static final String MC_RED_SHULKER_BOX = "minecraft:red_shulker_box";
    public static final String MC_RED_STAINED_GLASS = "minecraft:red_stained_glass";
    public static final String MC_RED_STAINED_GLASS_PANE = "minecraft:red_stained_glass_pane";
    public static final String MC_RED_TERRACOTTA = "minecraft:red_terracotta";
    public static final String MC_RED_TULIP = "minecraft:red_tulip";
    public static final String MC_RED_WOOL = "minecraft:red_wool";
    public static final String MC_REDSTONE_BLOCK = "minecraft:redstone_block";
    public static final String MC_REDSTONE_LAMP = "minecraft:redstone_lamp";
    public static final String MC_REDSTONE_ORE = "minecraft:redstone_ore";
    public static final String MC_REDSTONE_TORCH = "minecraft:redstone_torch";
    public static final String MC_REDSTONE_WALL_TORCH = "minecraft:redstone_wall_torch";
    public static final String MC_REDSTONE_WIRE = "minecraft:redstone_wire";
    public static final String MC_REPEATER = "minecraft:repeater";
    public static final String MC_REPEATING_COMMAND_BLOCK = "minecraft:repeating_command_block";
    public static final String MC_ROSE_BUSH = "minecraft:rose_bush";
    public static final String MC_SAND = "minecraft:sand";
    public static final String MC_SANDSTONE = "minecraft:sandstone";
    public static final String MC_SANDSTONE_SLAB = "minecraft:sandstone_slab";
    public static final String MC_SANDSTONE_STAIRS = "minecraft:sandstone_stairs";
    public static final String MC_SEA_LANTERN = "minecraft:sea_lantern";
    public static final String MC_SHULKER_BOX = "minecraft:shulker_box";
    public static final String MC_SIGN = "minecraft:sign";
    public static final String MC_SLIME_BLOCK = "minecraft:slime_block";
    public static final String MC_SMOOTH_QUARTZ = "minecraft:smooth_quartz";
    public static final String MC_SMOOTH_RED_SANDSTONE = "minecraft:smooth_red_sandstone";
    public static final String MC_SMOOTH_SANDSTONE = "minecraft:smooth_sandstone";
    public static final String MC_SMOOTH_STONE = "minecraft:smooth_stone";
    public static final String MC_SNOW = "minecraft:snow";
    public static final String MC_SNOW_BLOCK = "minecraft:snow_block";
    public static final String MC_SOUL_SAND = "minecraft:soul_sand";
    public static final String MC_SPONGE = "minecraft:sponge";
    public static final String MC_SPRUCE_BARK = "minecraft:spruce_bark";
    public static final String MC_SPRUCE_DOOR = "minecraft:spruce_door";
    public static final String MC_SPRUCE_FENCE = "minecraft:spruce_fence";
    public static final String MC_SPRUCE_FENCE_GATE = "minecraft:spruce_fence_gate";
    public static final String MC_SPRUCE_LEAVES = "minecraft:spruce_leaves";
    public static final String MC_SPRUCE_LOG = "minecraft:spruce_log";
    public static final String MC_SPRUCE_PLANKS = "minecraft:spruce_planks";
    public static final String MC_SPRUCE_SAPLING = "minecraft:spruce_sapling";
    public static final String MC_SPRUCE_SLAB = "minecraft:spruce_slab";
    public static final String MC_SPRUCE_STAIRS = "minecraft:spruce_stairs";
    public static final String MC_STICKY_PISTON = "minecraft:sticky_piston";
    public static final String MC_STONE = "minecraft:stone";
    public static final String MC_STONE_BRICK_SLAB = "minecraft:stone_brick_slab";
    public static final String MC_STONE_BRICK_STAIRS = "minecraft:stone_brick_stairs";
    public static final String MC_STONE_BRICKS = "minecraft:stone_bricks";
    public static final String MC_STONE_BUTTON = "minecraft:stone_button";
    public static final String MC_STONE_PRESSURE_PLATE = "minecraft:stone_pressure_plate";
    public static final String MC_STONE_SLAB = "minecraft:stone_slab";
    public static final String MC_STRUCTURE_BLOCK = "minecraft:structure_block";
    public static final String MC_STRUCTURE_VOID = "minecraft:structure_void";
    public static final String MC_SUGAR_CANE = "minecraft:sugar_cane";
    public static final String MC_SUNFLOWER = "minecraft:sunflower";
    public static final String MC_TALL_GRASS = "minecraft:tall_grass";
    public static final String MC_TERRACOTTA = "minecraft:terracotta";
    public static final String MC_TNT = "minecraft:tnt";
    public static final String MC_TORCH = "minecraft:torch";
    public static final String MC_TRAPPED_CHEST = "minecraft:trapped_chest";
    public static final String MC_TRIPWIRE = "minecraft:tripwire";
    public static final String MC_TRIPWIRE_HOOK = "minecraft:tripwire_hook";
    public static final String MC_VINE = "minecraft:vine";
    public static final String MC_WALL_SIGN = "minecraft:wall_sign";
    public static final String MC_WALL_TORCH = "minecraft:wall_torch";
    public static final String MC_WATER = "minecraft:water";
    public static final String MC_WET_SPONGE = "minecraft:wet_sponge";
    public static final String MC_WHEAT = "minecraft:wheat";
    public static final String MC_WHITE_BANNER = "minecraft:white_banner";
    public static final String MC_WHITE_CARPET = "minecraft:white_carpet";
    public static final String MC_WHITE_CONCRETE = "minecraft:white_concrete";
    public static final String MC_WHITE_CONCRETE_POWDER = "minecraft:white_concrete_powder";
    public static final String MC_WHITE_GLAZED_TERRACOTTA = "minecraft:white_glazed_terracotta";
    public static final String MC_WHITE_SHULKER_BOX = "minecraft:white_shulker_box";
    public static final String MC_WHITE_STAINED_GLASS = "minecraft:white_stained_glass";
    public static final String MC_WHITE_STAINED_GLASS_PANE = "minecraft:white_stained_glass_pane";
    public static final String MC_WHITE_TERRACOTTA = "minecraft:white_terracotta";
    public static final String MC_WHITE_TULIP = "minecraft:white_tulip";
    public static final String MC_WHITE_WALL_BANNER = "minecraft:white_wall_banner";
    public static final String MC_WHITE_WOOL = "minecraft:white_wool";
    public static final String MC_YELLOW_CARPET = "minecraft:yellow_carpet";
    public static final String MC_YELLOW_CONCRETE = "minecraft:yellow_concrete";
    public static final String MC_YELLOW_CONCRETE_POWDER = "minecraft:yellow_concrete_powder";
    public static final String MC_YELLOW_GLAZED_TERRACOTTA = "minecraft:yellow_glazed_terracotta";
    public static final String MC_YELLOW_SHULKER_BOX = "minecraft:yellow_shulker_box";
    public static final String MC_YELLOW_STAINED_GLASS = "minecraft:yellow_stained_glass";
    public static final String MC_YELLOW_STAINED_GLASS_PANE = "minecraft:yellow_stained_glass_pane";
    public static final String MC_YELLOW_TERRACOTTA = "minecraft:yellow_terracotta";
    public static final String MC_YELLOW_WOOL = "minecraft:yellow_wool";

    // MC 1.13 property names

    public static final String MC_SNOWY       = "snowy";
    public static final String MC_NORTH       = "north";
    public static final String MC_EAST        = "east";
    public static final String MC_SOUTH       = "south";
    public static final String MC_WEST        = "west";
    public static final String MC_UP          = "up";
    public static final String MC_HALF        = "half";
    public static final String MC_LAYERS      = "layers";
    public static final String MC_LEVEL       = "level";
    public static final String MC_WATERLOGGED = "waterlogged";

    // Minecraft NBT tag names

    public static final String TAG_LEVEL                   = "Level";
    public static final String TAG_BLOCKS                  = "Blocks";
    public static final String TAG_BLOCK_STATES            = "BlockStates";
    public static final String TAG_DATA                    = "Data";
    public static final String TAG_SKY_LIGHT               = "SkyLight";
    public static final String TAG_BLOCK_LIGHT             = "BlockLight";
    public static final String TAG_HEIGHT_MAP              = "HeightMap";
    public static final String TAG_HEIGHT_MAPS             = "Heightmaps";
    public static final String TAG_ENTITIES                = "Entities";
    public static final String TAG_TILE_ENTITIES           = "TileEntities";
    public static final String TAG_LAST_UPDATE             = "LastUpdate";
    public static final String TAG_X_POS                   = "xPos";
    public static final String TAG_Z_POS                   = "zPos";
    public static final String TAG_TERRAIN_POPULATED       = "TerrainPopulated";
    public static final String TAG_TIME                    = "Time";
    public static final String TAG_LAST_PLAYED             = "LastPlayed";
    public static final String TAG_PLAYER                  = "Player";
    public static final String TAG_INVENTORY               = "Inventory";
    public static final String TAG_SCORE                   = "Score";
    public static final String TAG_DIMENSION               = "Dimension";
    public static final String TAG_SPAWN_X                 = "SpawnX";
    public static final String TAG_SPAWN_Y                 = "SpawnY";
    public static final String TAG_SPAWN_Z                 = "SpawnZ";
    public static final String TAG_SIZE_ON_DISK            = "SizeOnDisk";
    public static final String TAG_RANDOM_SEED             = "RandomSeed";
    /** Lower case variant. */
    public static final String TAG_VERSION                 = "version";
    /** Upper case variant. */
    public static final String TAG_VERSION_                = "Version";
    public static final String TAG_LEVEL_NAME              = "LevelName";
    /** Lower case variant. */
    public static final String TAG_ID                      = "id";
    /** Upper case variant. */
    public static final String TAG_ID_                     = "Id";
    public static final String TAG_POS                     = "Pos";
    public static final String TAG_MOTION                  = "Motion";
    public static final String TAG_ROTATION                = "Rotation";
    public static final String TAG_FALL_DISTANCE           = "FallDistance";
    public static final String TAG_FIRE                    = "Fire";
    public static final String TAG_AIR                     = "Air";
    public static final String TAG_ON_GROUND               = "OnGround";
    public static final String TAG_ATTACK_TIME             = "AttackTime";
    public static final String TAG_DEATH_TIME              = "DeathTime";
    public static final String TAG_HEALTH                  = "Health";
    public static final String TAG_HURT_TIME               = "HurtTime";
    public static final String TAG_DAMAGE                  = "Damage";
    public static final String TAG_COUNT                   = "Count";
    public static final String TAG_SLOT                    = "Slot";
    public static final String TAG_X                       = "x";
    public static final String TAG_Y                       = "y";
    public static final String TAG_Z                       = "z";
    public static final String TAG_ITEMS                   = "Items";
    public static final String TAG_MAP_FEATURES            = "MapFeatures";
    public static final String TAG_GAME_TYPE               = "GameType";
    public static final String TAG_GENERATOR_NAME          = "generatorName";
    public static final String TAG_Y2                      = "Y";
    public static final String TAG_SECTIONS                = "Sections";
    public static final String TAG_ADD                     = "Add";
    public static final String TAG_BIOMES                  = "Biomes";
    public static final String TAG_GENERATOR_VERSION       = "generatorVersion";
    public static final String TAG_PROFESSION              = "Profession";
    public static final String TAG_TEXT1                   = "Text1";
    public static final String TAG_TEXT2                   = "Text2";
    public static final String TAG_TEXT3                   = "Text3";
    public static final String TAG_TEXT4                   = "Text4";
    public static final String TAG_DIR                     = "Dir";
    public static final String TAG_MOTIVE                  = "Motive";
    public static final String TAG_TILE_X                  = "TileX";
    public static final String TAG_TILE_Y                  = "TileY";
    public static final String TAG_TILE_Z                  = "TileZ";
    public static final String TAG_ALLOW_COMMANDS          = "allowCommands";
    public static final String TAG_GENERATOR_OPTIONS       = "generatorOptions";
    public static final String TAG_HARDCORE                = "hardcore";
    public static final String TAG_DIFFICULTY              = "Difficulty";
    public static final String TAG_DIFFICULTY_LOCKED       = "DifficultyLocked";
    public static final String TAG_LIGHT_POPULATED         = "LightPopulated";
    public static final String TAG_INHABITED_TIME          = "InhabitedTime";
    public static final String TAG_BORDER_CENTER_X         = "BorderCenterX";
    public static final String TAG_BORDER_CENTER_Z         = "BorderCenterZ";
    public static final String TAG_BORDER_SIZE             = "BorderSize";
    public static final String TAG_BORDER_SAFE_ZONE        = "BorderSafeZone";
    public static final String TAG_BORDER_WARNING_BLOCKS   = "BorderWarningBlocks";
    public static final String TAG_BORDER_WARNING_TIME     = "BorderWarningTime";
    public static final String TAG_BORDER_SIZE_LERP_TARGET = "BorderSizeLerpTarget";
    public static final String TAG_BORDER_SIZE_LERP_TIME   = "BorderSizeLerpTime";
    public static final String TAG_BORDER_DAMAGE_PER_BLOCK = "BorderDamagePerBlock";
    public static final String TAG_UUID                    = "UUID";
    public static final String TAG_UUID_MOST               = "UUIDMost";
    public static final String TAG_UUID_LEAST              = "UUIDLeast";
    public static final String TAG_DATA_VERSION            = "DataVersion";
    public static final String TAG_STATUS                  = "Status";
    public static final String TAG_PALETTE                 = "Palette";
    public static final String TAG_NAME                    = "Name";
    public static final String TAG_PROPERTIES              = "Properties";
    public static final String TAG_SNAPSHOT                = "Snapshot";
    /**
     * Possibly unofficial, SpoutCraft-specific
     */
    public static final String TAG_MAP_HEIGHT = "MapHeight";

    public static final int VERSION_MCREGION = 0x4abc;
    public static final int VERSION_ANVIL    = 0x4abd;

    public static final int DATA_VERSION_MC_1_12_2 = 1343;
    public static final int DATA_VERSION_MC_1_13   = 1502; // TODO: update when 1.13 is released

    // Legacy (pre-MC 1.13) block IDs

    /** @deprecated */ public static final int BLK_AIR                   =   0;
    /** @deprecated */ public static final int BLK_STONE                 =   1;
    /** @deprecated */ public static final int BLK_GRASS                 =   2;
    /** @deprecated */ public static final int BLK_DIRT                  =   3;
    /** @deprecated */ public static final int BLK_COBBLESTONE           =   4;
    /** @deprecated */ public static final int BLK_WOODEN_PLANK          =   5;
    /** @deprecated */ public static final int BLK_SAPLING               =   6;
    /** @deprecated */ public static final int BLK_BEDROCK               =   7;
    /** @deprecated */ public static final int BLK_WATER                 =   8;
    /** @deprecated */ public static final int BLK_STATIONARY_WATER      =   9;
    /** @deprecated */ public static final int BLK_LAVA                  =  10;
    /** @deprecated */ public static final int BLK_STATIONARY_LAVA       =  11;
    /** @deprecated */ public static final int BLK_SAND                  =  12;
    /** @deprecated */ public static final int BLK_GRAVEL                =  13;
    /** @deprecated */ public static final int BLK_GOLD_ORE              =  14;
    /** @deprecated */ public static final int BLK_IRON_ORE              =  15;
    /** @deprecated */ public static final int BLK_COAL                  =  16;
    /** @deprecated */ public static final int BLK_WOOD                  =  17;
    /** @deprecated */ public static final int BLK_LEAVES                =  18;
    /** @deprecated */ public static final int BLK_SPONGE                =  19;
    /** @deprecated */ public static final int BLK_GLASS                 =  20;
    /** @deprecated */ public static final int BLK_LAPIS_LAZULI_ORE      =  21;
    /** @deprecated */ public static final int BLK_LAPIS_LAZULI_BLOCK    =  22;
    /** @deprecated */ public static final int BLK_DISPENSER             =  23;
    /** @deprecated */ public static final int BLK_SANDSTONE             =  24;
    /** @deprecated */ public static final int BLK_NOTE_BLOCK            =  25;
    /** @deprecated */ public static final int BLK_BED                   =  26;
    /** @deprecated */ public static final int BLK_POWERED_RAILS         =  27;
    /** @deprecated */ public static final int BLK_DETECTOR_RAILS        =  28;

    /** @deprecated */ public static final int BLK_COBWEB                =  30;
    /** @deprecated */ public static final int BLK_TALL_GRASS            =  31;
    /** @deprecated */ public static final int BLK_DEAD_SHRUBS           =  32;
    /** @deprecated */ public static final int BLK_PISTON                =  33;
    /** @deprecated */ public static final int BLK_PISTON_HEAD           =  34;
    /** @deprecated */ public static final int BLK_WOOL                  =  35;
    /** @deprecated */ public static final int BLK_PISTON_EXTENSION      =  36;
    /** @deprecated */ public static final int BLK_DANDELION             =  37;
    /** @deprecated */ public static final int BLK_ROSE                  =  38;
    /** @deprecated */ public static final int BLK_BROWN_MUSHROOM        =  39;
    /** @deprecated */ public static final int BLK_RED_MUSHROOM          =  40;
    /** @deprecated */ public static final int BLK_GOLD_BLOCK            =  41;
    /** @deprecated */ public static final int BLK_IRON_BLOCK            =  42;
    /** @deprecated */ public static final int BLK_DOUBLE_SLAB           =  43;
    /** @deprecated */ public static final int BLK_SLAB                  =  44;
    /** @deprecated */ public static final int BLK_BRICKS                =  45;
    /** @deprecated */ public static final int BLK_TNT                   =  46;
    /** @deprecated */ public static final int BLK_BOOKCASE              =  47;
    /** @deprecated */ public static final int BLK_MOSSY_COBBLESTONE     =  48;
    /** @deprecated */ public static final int BLK_OBSIDIAN              =  49;
    /** @deprecated */ public static final int BLK_TORCH                 =  50;
    /** @deprecated */ public static final int BLK_FIRE                  =  51;
    /** @deprecated */ public static final int BLK_MONSTER_SPAWNER       =  52;
    /** @deprecated */ public static final int BLK_WOODEN_STAIRS         =  53;
    /** @deprecated */ public static final int BLK_CHEST                 =  54;
    /** @deprecated */ public static final int BLK_REDSTONE_WIRE         =  55;
    /** @deprecated */ public static final int BLK_DIAMOND_ORE           =  56;
    /** @deprecated */ public static final int BLK_DIAMOND_BLOCK         =  57;
    /** @deprecated */ public static final int BLK_CRAFTING_TABLE        =  58;
    /** @deprecated */ public static final int BLK_WHEAT                 =  59;
    /** @deprecated */ public static final int BLK_TILLED_DIRT           =  60;
    /** @deprecated */ public static final int BLK_FURNACE               =  61;
    /** @deprecated */ public static final int BLK_BURNING_FURNACE       =  62;
    /** @deprecated */ public static final int BLK_SIGN                  =  63;
    /** @deprecated */ public static final int BLK_WOODEN_DOOR           =  64;
    /** @deprecated */ public static final int BLK_LADDER                =  65;
    /** @deprecated */ public static final int BLK_RAILS                 =  66;
    /** @deprecated */ public static final int BLK_COBBLESTONE_STAIRS    =  67;
    /** @deprecated */ public static final int BLK_WALL_SIGN             =  68;
    /** @deprecated */ public static final int BLK_LEVER                 =  69;
    /** @deprecated */ public static final int BLK_STONE_PRESSURE_PLATE  =  70;
    /** @deprecated */ public static final int BLK_IRON_DOOR             =  71;
    /** @deprecated */ public static final int BLK_WOODEN_PRESSURE_PLATE =  72;
    /** @deprecated */ public static final int BLK_REDSTONE_ORE          =  73;
    /** @deprecated */ public static final int BLK_GLOWING_REDSTONE_ORE  =  74;
    /** @deprecated */ public static final int BLK_REDSTONE_TORCH_OFF    =  75;
    /** @deprecated */ public static final int BLK_REDSTONE_TORCH_ON     =  76;
    /** @deprecated */ public static final int BLK_STONE_BUTTON          =  77;
    /** @deprecated */ public static final int BLK_SNOW                  =  78;
    /** @deprecated */ public static final int BLK_ICE                   =  79;
    /** @deprecated */ public static final int BLK_SNOW_BLOCK            =  80;
    /** @deprecated */ public static final int BLK_CACTUS                =  81;
    /** @deprecated */ public static final int BLK_CLAY                  =  82;
    /** @deprecated */ public static final int BLK_SUGAR_CANE            =  83;
    /** @deprecated */ public static final int BLK_JUKEBOX               =  84;
    /** @deprecated */ public static final int BLK_FENCE                 =  85;
    /** @deprecated */ public static final int BLK_PUMPKIN               =  86;
    /** @deprecated */ public static final int BLK_NETHERRACK            =  87;
    /** @deprecated */ public static final int BLK_SOUL_SAND             =  88;
    /** @deprecated */ public static final int BLK_GLOWSTONE             =  89;
    /** @deprecated */ public static final int BLK_PORTAL                =  90;
    /** @deprecated */ public static final int BLK_JACK_O_LANTERN        =  91;
    /** @deprecated */ public static final int BLK_CAKE                  =  92;
    /** @deprecated */ public static final int BLK_REDSTONE_REPEATER_OFF =  93;
    /** @deprecated */ public static final int BLK_REDSTONE_REPEATER_ON  =  94;

    /** @deprecated */ public static final int BLK_TRAPDOOR              =  96;
    /** @deprecated */ public static final int BLK_HIDDEN_SILVERFISH     =  97;
    /** @deprecated */ public static final int BLK_STONE_BRICKS          =  98;
    /** @deprecated */ public static final int BLK_HUGE_BROWN_MUSHROOM   =  99;
    /** @deprecated */ public static final int BLK_HUGE_RED_MUSHROOM     = 100;
    /** @deprecated */ public static final int BLK_IRON_BARS             = 101;
    /** @deprecated */ public static final int BLK_GLASS_PANE            = 102;
    /** @deprecated */ public static final int BLK_MELON                 = 103;
    /** @deprecated */ public static final int BLK_PUMPKIN_STEM          = 104;
    /** @deprecated */ public static final int BLK_MELON_STEM            = 105;
    /** @deprecated */ public static final int BLK_VINES                 = 106;
    /** @deprecated */ public static final int BLK_FENCE_GATE            = 107;
    /** @deprecated */ public static final int BLK_BRICK_STAIRS          = 108;
    /** @deprecated */ public static final int BLK_STONE_BRICK_STAIRS    = 109;
    /** @deprecated */ public static final int BLK_MYCELIUM              = 110;
    /** @deprecated */ public static final int BLK_LILY_PAD              = 111;
    /** @deprecated */ public static final int BLK_NETHER_BRICK          = 112;
    /** @deprecated */ public static final int BLK_NETHER_BRICK_FENCE    = 113;
    /** @deprecated */ public static final int BLK_NETHER_BRICK_STAIRS   = 114;
    /** @deprecated */ public static final int BLK_NETHER_WART           = 115;
    /** @deprecated */ public static final int BLK_ENCHANTMENT_TABLE     = 116;
    /** @deprecated */ public static final int BLK_BREWING_STAND         = 117;
    /** @deprecated */ public static final int BLK_CAULDRON              = 118;
    /** @deprecated */ public static final int BLK_END_PORTAL            = 119;
    /** @deprecated */ public static final int BLK_END_PORTAL_FRAME      = 120;
    /** @deprecated */ public static final int BLK_END_STONE             = 121;
    /** @deprecated */ public static final int BLK_DRAGON_EGG            = 122;
    /** @deprecated */ public static final int BLK_REDSTONE_LANTERN_OFF  = 123;
    /** @deprecated */ public static final int BLK_REDSTONE_LANTERN_ON   = 124;
    /** @deprecated */ public static final int BLK_DOUBLE_WOODEN_SLAB    = 125;
    /** @deprecated */ public static final int BLK_WOODEN_SLAB           = 126;
    /** @deprecated */ public static final int BLK_COCOA_PLANT           = 127;
    /** @deprecated */ public static final int BLK_SANDSTONE_STAIRS      = 128;
    /** @deprecated */ public static final int BLK_EMERALD_ORE           = 129;
    /** @deprecated */ public static final int BLK_ENDER_CHEST           = 130;
    /** @deprecated */ public static final int BLK_TRIPWIRE_HOOK         = 131;
    /** @deprecated */ public static final int BLK_TRIPWIRE              = 132;
    /** @deprecated */ public static final int BLK_EMERALD_BLOCK         = 133;
    /** @deprecated */ public static final int BLK_PINE_WOOD_STAIRS      = 134;
    /** @deprecated */ public static final int BLK_BIRCH_WOOD_STAIRS     = 135;
    /** @deprecated */ public static final int BLK_JUNGLE_WOOD_STAIRS    = 136;
    /** @deprecated */ public static final int BLK_COMMAND_BLOCK         = 137;
    /** @deprecated */ public static final int BLK_BEACON                = 138;
    /** @deprecated */ public static final int BLK_COBBLESTONE_WALL      = 139;
    /** @deprecated */ public static final int BLK_FLOWER_POT            = 140;
    /** @deprecated */ public static final int BLK_CARROTS               = 141;
    /** @deprecated */ public static final int BLK_POTATOES              = 142;
    /** @deprecated */ public static final int BLK_WOODEN_BUTTON         = 143;
    /** @deprecated */ public static final int BLK_HEAD                  = 144;
    /** @deprecated */ public static final int BLK_ANVIL                 = 144;

    /** @deprecated */ public static final int BLK_TRAPPED_CHEST                 = 146;
    /** @deprecated */ public static final int BLK_WEIGHTED_PRESSURE_PLATE_LIGHT = 147;
    /** @deprecated */ public static final int BLK_WEIGHTED_PRESSURE_PLATE_HEAVY = 148;
    /** @deprecated */ public static final int BLK_REDSTONE_COMPARATOR_UNPOWERED = 149;
    /** @deprecated */ public static final int BLK_REDSTONE_COMPARATOR_POWERED   = 150;
    /** @deprecated */ public static final int BLK_DAYLIGHT_SENSOR               = 151;

    /** @deprecated */ public static final int BLK_QUARTZ_ORE = 153;
    /** @deprecated */ public static final int BLK_HOPPER     = 154;

    /** @deprecated */ public static final int BLK_QUARTZ_STAIRS        = 156;
    /** @deprecated */ public static final int BLK_ACTIVATOR_RAIL       = 157;
    /** @deprecated */ public static final int BLK_DROPPER              = 158;
    /** @deprecated */ public static final int BLK_STAINED_CLAY         = 159;
    /** @deprecated */ public static final int BLK_STAINED_GLASS_PANE   = 160;
    /** @deprecated */ public static final int BLK_LEAVES2              = 161;
    /** @deprecated */ public static final int BLK_WOOD2                = 162;
    /** @deprecated */ public static final int BLK_ACACIA_WOOD_STAIRS   = 163;
    /** @deprecated */ public static final int BLK_DARK_OAK_WOOD_STAIRS = 164;
    /** @deprecated */ public static final int BLK_SLIME_BLOCK          = 165;
    /** @deprecated */ public static final int BLK_BARRIER              = 166;
    /** @deprecated */ public static final int BLK_IRON_TRAPDOOR        = 167;

    /** @deprecated */ public static final int BLK_CARPET                    = 171;
    /** @deprecated */ public static final int BLK_HARDENED_CLAY             = 172;
    /** @deprecated */ public static final int BLK_COAL_BLOCK                = 173;
    /** @deprecated */ public static final int BLK_PACKED_ICE                = 174;
    /** @deprecated */ public static final int BLK_LARGE_FLOWERS             = 175;
    /** @deprecated */ public static final int BLK_STANDING_BANNER           = 176;
    /** @deprecated */ public static final int BLK_WALL_BANNER               = 177;
    /** @deprecated */ public static final int BLK_DAYLIGHT_SENSOR_INVERTED  = 178;
    /** @deprecated */ public static final int BLK_RED_SANDSTONE             = 179;
    /** @deprecated */ public static final int BLK_RED_SANDSTONE_STAIRS      = 180;
    /** @deprecated */ public static final int BLK_DOUBLE_RED_SANDSTONE_SLAB = 181;
    /** @deprecated */ public static final int BLK_RED_SANDSTONE_SLAB        = 182;
    /** @deprecated */ public static final int BLK_PINE_WOOD_FENCE_GATE      = 183;
    /** @deprecated */ public static final int BLK_BIRCH_WOOD_FENCE_GATE     = 184;
    /** @deprecated */ public static final int BLK_JUNGLE_WOOD_FENCE_GATE    = 185;
    /** @deprecated */ public static final int BLK_DARK_OAK_WOOD_FENCE_GATE  = 186;
    /** @deprecated */ public static final int BLK_ACACIA_WOOD_FENCE_GATE    = 187;
    /** @deprecated */ public static final int BLK_PINE_WOOD_FENCE           = 188;
    /** @deprecated */ public static final int BLK_BIRCH_WOOD_FENCE          = 189;
    /** @deprecated */ public static final int BLK_JUNGLE_WOOD_FENCE         = 190;
    /** @deprecated */ public static final int BLK_DARK_OAK_WOOD_FENCE       = 191;
    /** @deprecated */ public static final int BLK_ACACIA_WOOD_FENCE         = 192;
    /** @deprecated */ public static final int BLK_PINE_WOOD_DOOR            = 193;
    /** @deprecated */ public static final int BLK_BIRCH_WOOD_DOOR           = 194;
    /** @deprecated */ public static final int BLK_JUNGLE_WOOD_DOOR          = 195;
    /** @deprecated */ public static final int BLK_ACACIA_WOOD_DOOR          = 196;
    /** @deprecated */ public static final int BLK_DARK_OAK_WOOD_DOOR        = 197;
    /** @deprecated */ public static final int BLK_END_ROD                   = 198;
    /** @deprecated */ public static final int BLK_CHORUS_PLANT              = 199;
    /** @deprecated */ public static final int BLK_CHORUS_FLOWER             = 200;
    /** @deprecated */ public static final int BLK_PURPUR_BLOCK              = 201;
    /** @deprecated */ public static final int BLK_PURPUR_PILLAR             = 202;
    /** @deprecated */ public static final int BLK_PURPUR_STAIRS             = 203;
    /** @deprecated */ public static final int BLK_DOUBLE_PURPUR_SLAB        = 204;
    /** @deprecated */ public static final int BLK_PURPUR_SLAB               = 205;
    /** @deprecated */ public static final int BLK_END_BRICKS                = 206;
    /** @deprecated */ public static final int BLK_BEETROOTS                 = 207;
    /** @deprecated */ public static final int BLK_GRASS_PATH                = 208;
    /** @deprecated */ public static final int BLK_END_GATEWAY               = 209;
    /** @deprecated */ public static final int BLK_REPEATING_COMMAND_BLOCK   = 210;
    /** @deprecated */ public static final int BLK_CHAIN_COMMAND_BLOCK       = 211;
    /** @deprecated */ public static final int BLK_FROSTED_ICE               = 212;
    /** @deprecated */ public static final int BLK_MAGMA                     = 213;

    /** @deprecated */ public static final int BLK_BONE_BLOCK = 216;

    /** @deprecated */ public static final int BLK_OBSERVER                     = 218;
    /** @deprecated */ public static final int BLK_WHITE_SHULKER_BOX            = 219;
    /** @deprecated */ public static final int BLK_ORANGE_SHULKER_BOX           = 220;
    /** @deprecated */ public static final int BLK_MAGENTA_SHULKER_BOX          = 221;
    /** @deprecated */ public static final int BLK_LIGHT_BLUE_SHULKER_BOX       = 222;
    /** @deprecated */ public static final int BLK_YELLOW_SHULKER_BOX           = 223;
    /** @deprecated */ public static final int BLK_LIME_SHULKER_BOX             = 224;
    /** @deprecated */ public static final int BLK_PINK_SHULKER_BOX             = 225;
    /** @deprecated */ public static final int BLK_GREY_SHULKER_BOX             = 226;
    /** @deprecated */ public static final int BLK_LIGHT_GREY_SHULKER_BOX       = 227;
    /** @deprecated */ public static final int BLK_CYAN_SHULKER_BOX             = 228;
    /** @deprecated */ public static final int BLK_PURPLE_SHULKER_BOX           = 229;
    /** @deprecated */ public static final int BLK_BLUE_SHULKER_BOX             = 230;
    /** @deprecated */ public static final int BLK_BROWN_SHULKER_BOX            = 231;
    /** @deprecated */ public static final int BLK_GREEN_SHULKER_BOX            = 232;
    /** @deprecated */ public static final int BLK_RED_SHULKER_BOX              = 233;
    /** @deprecated */ public static final int BLK_BLACK_SHULKER_BOX            = 234;
    /** @deprecated */ public static final int BLK_WHITE_GLAZED_TERRACOTTA      = 235;
    /** @deprecated */ public static final int BLK_ORANGE_GLAZED_TERRACOTTA     = 236;
    /** @deprecated */ public static final int BLK_MAGENTA_GLAZED_TERRACOTTA    = 237;
    /** @deprecated */ public static final int BLK_LIGHT_BLUE_GLAZED_TERRACOTTA = 238;
    /** @deprecated */ public static final int BLK_YELLOW_GLAZED_TERRACOTTA     = 239;
    /** @deprecated */ public static final int BLK_LIME_GLAZED_TERRACOTTA       = 240;
    /** @deprecated */ public static final int BLK_PINK_GLAZED_TERRACOTTA       = 241;
    /** @deprecated */ public static final int BLK_GREY_GLAZED_TERRACOTTA       = 242;
    /** @deprecated */ public static final int BLK_LIGHT_GREY_GLAZED_TERRACOTTA = 243;
    /** @deprecated */ public static final int BLK_CYAN_GLAZED_TERRACOTTA       = 244;
    /** @deprecated */ public static final int BLK_PURPLE_GLAZED_TERRACOTTA     = 245;
    /** @deprecated */ public static final int BLK_BLUE_GLAZED_TERRACOTTA       = 246;
    /** @deprecated */ public static final int BLK_BROWN_GLAZED_TERRACOTTA      = 247;
    /** @deprecated */ public static final int BLK_GREEN_GLAZED_TERRACOTTA      = 248;
    /** @deprecated */ public static final int BLK_RED_GLAZED_TERRACOTTA        = 249;
    /** @deprecated */ public static final int BLK_BLACK_GLAZED_TERRACOTTA      = 250;

    /** @deprecated */ public static final int BLK_CEMENT = 252;

    /** @deprecated */ public static final int BLK_STRUCTURE_BLOCK = 255;

    /** @deprecated */ public static final int HIGHEST_KNOWN_BLOCK_ID = BLK_STRUCTURE_BLOCK;

    // Legacy (pre-MC 1.13) data values

    /** @deprecated */ public static final int DATA_OAK      = 0;
    /** @deprecated */ public static final int DATA_PINE     = 1;
    /** @deprecated */ public static final int DATA_BIRCH    = 2;
    /** @deprecated */ public static final int DATA_JUNGLE   = 3;
    /** @deprecated */ public static final int DATA_ACACIA   = 0;
    /** @deprecated */ public static final int DATA_DARK_OAK = 1;
    /** @deprecated */ public static final int DATA_ACACIA_SAPLING   =   DATA_ACACIA + 4;
    /** @deprecated */ public static final int DATA_DARK_OAK_SAPLING = DATA_DARK_OAK + 4;

    /** @deprecated */ public static final int DATA_DEAD_SHRUB = 0;
    /** @deprecated */ public static final int DATA_TALL_GRASS = 1;
    /** @deprecated */ public static final int DATA_FERN       = 2;

    /** @deprecated */ public static final int DATA_DOOR_BOTTOM              = 0;
    /** @deprecated */ public static final int DATA_DOOR_BOTTOM_CLOSED       = 0;
    /** @deprecated */ public static final int DATA_DOOR_BOTTOM_OPEN         = 4;
    /** @deprecated */ public static final int DATA_DOOR_BOTTOM_FACING_WEST  = 0;
    /** @deprecated */ public static final int DATA_DOOR_BOTTOM_FACING_NORTH = 1;
    /** @deprecated */ public static final int DATA_DOOR_BOTTOM_FACING_EAST  = 2;
    /** @deprecated */ public static final int DATA_DOOR_BOTTOM_FACING_SOUTH = 3;
    /** @deprecated */ public static final int DATA_DOOR_TOP                 = 8;
    /** @deprecated */ public static final int DATA_DOOR_TOP_HINGE_RIGHT     = 0;
    /** @deprecated */ public static final int DATA_DOOR_TOP_HINGE_LEFT      = 1;

    /** @deprecated */ public static final int DATA_SLAB_STONE       = 0;
    /** @deprecated */ public static final int DATA_SLAB_SANDSTONE   = 1;
    /** @deprecated */ public static final int DATA_SLAB_WOOD        = 2;
    /** @deprecated */ public static final int DATA_SLAB_COBBLESTONE = 3;
    /** @deprecated */ public static final int DATA_SLAB_BRICK       = 4;
    /** @deprecated */ public static final int DATA_SLAB_STONE_BRICK = 5;

    /** @deprecated */ public static final int DATA_ASCENDING_EAST  = 0;
    /** @deprecated */ public static final int DATA_ASCENDING_WEST  = 1;
    /** @deprecated */ public static final int DATA_ASCENDING_SOUTH = 2;
    /** @deprecated */ public static final int DATA_ASCENDING_NORTH = 3;

    /** @deprecated */ public static final int DATA_BED_FOOT = 0;
    /** @deprecated */ public static final int DATA_BED_HEAD = 8;
    /** @deprecated */ public static final int DATA_BED_SOUTH = 0;
    /** @deprecated */ public static final int DATA_BED_WEST  = 1;
    /** @deprecated */ public static final int DATA_BED_NORTH = 2;
    /** @deprecated */ public static final int DATA_BED_EAST  = 3;

    /** @deprecated */ public static final int DATA_PUMPKIN_SOUTH_FACE = 0;
    /** @deprecated */ public static final int DATA_PUMPKIN_WEST_FACE  = 1;
    /** @deprecated */ public static final int DATA_PUMPKIN_NORTH_FACE = 2;
    /** @deprecated */ public static final int DATA_PUMPKIN_EAST_FACE  = 3;
    /** @deprecated */ public static final int DATA_PUMPKIN_NO_FACE    = 4;

    /** @deprecated */ public static final int DATA_WHITE      =  0;
    /** @deprecated */ public static final int DATA_ORANGE     =  1;
    /** @deprecated */ public static final int DATA_MAGENTA    =  2;
    /** @deprecated */ public static final int DATA_LIGHT_BLUE =  3;
    /** @deprecated */ public static final int DATA_YELLOW     =  4;
    /** @deprecated */ public static final int DATA_LIME       =  5;
    /** @deprecated */ public static final int DATA_PINK       =  6;
    /** @deprecated */ public static final int DATA_GREY       =  7;
    /** @deprecated */ public static final int DATA_LIGHT_GREY =  8;
    /** @deprecated */ public static final int DATA_CYAN       =  9;
    /** @deprecated */ public static final int DATA_PURPLE     = 10;
    /** @deprecated */ public static final int DATA_BLUE       = 11;
    /** @deprecated */ public static final int DATA_BROWN      = 12;
    /** @deprecated */ public static final int DATA_GREEN      = 13;
    /** @deprecated */ public static final int DATA_RED        = 14;
    /** @deprecated */ public static final int DATA_BLACK      = 15;

    public static final String[] COLOUR_NAMES = {"White", "Orange", "Magenta", "Light Blue", "Yellow", "Lime", "Pink",
        "Grey", "Light Grey", "Cyan", "Purple", "Blue", "Brown", "Green", "Red", "Black"};

    /** @deprecated */ public static final int DATA_STONE_STONE             = 0;
    /** @deprecated */ public static final int DATA_STONE_GRANITE           = 1;
    /** @deprecated */ public static final int DATA_STONE_GRANITE_POLISHED  = 2;
    /** @deprecated */ public static final int DATA_STONE_DIORITE           = 3;
    /** @deprecated */ public static final int DATA_STONE_DIORITE_POLISHED  = 4;
    /** @deprecated */ public static final int DATA_STONE_ANDESITE          = 5;
    /** @deprecated */ public static final int DATA_STONE_ANDESITE_POLISHED = 6;

    // Legacy (pre-MC 1.13) item IDs

    /** @deprecated */ public static final int ITM_FLINT_AND_STEEL = 259;

    /** @deprecated */ public static final int ITM_COAL            = 263;

    /** @deprecated */ public static final int ITM_DIAMOND         = 264;
    /** @deprecated */ public static final int ITM_IRON_INGOT      = 265;
    /** @deprecated */ public static final int ITM_GOLD_INGOT      = 266;

    /** @deprecated */ public static final int ITM_DIAMOND_SWORD   = 276;
    /** @deprecated */ public static final int ITM_DIAMOND_SHOVEL  = 277;
    /** @deprecated */ public static final int ITM_DIAMOND_PICKAXE = 278;
    /** @deprecated */ public static final int ITM_DIAMOND_AXE     = 279;

    /** @deprecated */ public static final int ITM_WATER_BUCKET    = 326;

    /** @deprecated */ public static final int ITM_SUGAR_CANE      = 338;

    /** @deprecated */ public static final int ITM_BONE            = 352;

    /** @deprecated */ public static final int ITM_BED             = 355;

    /** @deprecated */ public static final int ITM_EYE_OF_ENDER    = 381;

    // Legacy (pre-MC 1.13) tile entity IDs (TODOMC13: same for MC 1.13?)

    public static final String ID_CHEST        = "Chest";
    public static final String ID_VILLAGER     = "Villager";
    public static final String ID_PLAYER       = "Player";
    public static final String ID_SIGN         = "Sign";
    public static final String ID_PAINTING     = "Painting";
    public static final String ID_AIRPORTAL    = "Airportal";
    public static final String ID_BEACON       = "Beacon";
    public static final String ID_CAULDRON     = "Cauldron";
    public static final String ID_COMPARATOR   = "Comparator";
    public static final String ID_CONTROL      = "Control";
    public static final String ID_DLDETECTOR   = "DLDetector";
    public static final String ID_DROPPER      = "Dropper";
    public static final String ID_ENCHANTTABLE = "EnchantTable";
    public static final String ID_ENDERCHEST   = "EnderChest";
    public static final String ID_FLOWERPOT    = "FlowerPot";
    public static final String ID_FURNACE      = "Furnace";
    public static final String ID_HOPPER       = "Hopper";
    public static final String ID_MOBSPAWNER   = "MobSpawner";
    public static final String ID_MUSIC        = "Music";
    public static final String ID_PISTON       = "Piston";
    public static final String ID_RECORDPLAYER = "RecordPlayer";
    public static final String ID_SKULL        = "Skull";
    public static final String ID_TRAP         = "Trap";
    public static final String ID_BANNER       = "Banner";
    public static final String ID_STRUCTURE    = "Structure";
    public static final String ID_SHULKER_BOX  = "shulker_box"; // TODO: really?

    public static final int GAME_TYPE_SURVIVAL  = 0;
    public static final int GAME_TYPE_CREATIVE  = 1;
    public static final int GAME_TYPE_ADVENTURE = 2;
    
    public static final int PROFESSION_FARMER     = 0;
    public static final int PROFESSION_LIBRARIAN  = 1;
    public static final int PROFESSION_PRIEST     = 2;
    public static final int PROFESSION_BLACKSMITH = 3;
    public static final int PROFESSION_BUTCHER    = 4;
    
    public static final String MOTIVE_KEBAB           = "Kebab";
    public static final String MOTIVE_AZTEC           = "Aztec";
    public static final String MOTIVE_ALBAN           = "Alban";
    public static final String MOTIVE_AZTEC2          = "Aztec2";
    public static final String MOTIVE_BOMB            = "Bomb";
    public static final String MOTIVE_PLANT           = "Plant";
    public static final String MOTIVE_WASTELAND       = "Wasteland";
    public static final String MOTIVE_WANDERER        = "Wanderer";
    public static final String MOTIVE_GRAHAM          = "Graham";
    public static final String MOTIVE_POOL            = "Pool";
    public static final String MOTIVE_COURBET         = "Courbet";
    public static final String MOTIVE_SUNSET          = "Sunset";
    public static final String MOTIVE_SEA             = "Sea";
    public static final String MOTIVE_CREEBET         = "Creebet";
    public static final String MOTIVE_MATCH           = "Match";
    public static final String MOTIVE_BUST            = "Bust";
    public static final String MOTIVE_STAGE           = "Stage";
    public static final String MOTIVE_VOID            = "Void";
    public static final String MOTIVE_SKULL_AND_ROSES = "SkullAndRoses";
    public static final String MOTIVE_FIGHTERS        = "Fighters";
    public static final String MOTIVE_SKELETON        = "Skeleton";
    public static final String MOTIVE_DONKEY_KONG     = "DonkeyKong";
    public static final String MOTIVE_POINTER         = "Pointer";
    public static final String MOTIVE_PIGSCENE        = "Pigscene";
    public static final String MOTIVE_SKULL           = "Skull";
    
    /** 1x1 paintings */
    public static final String[] SMALL_PAINTINGS = {MOTIVE_KEBAB, MOTIVE_AZTEC, MOTIVE_ALBAN, MOTIVE_AZTEC2, MOTIVE_BOMB, MOTIVE_PLANT, MOTIVE_WASTELAND};

    /** 2x1 paintings */
    public static final String[] WIDE_PAINTINGS = {MOTIVE_POOL, MOTIVE_COURBET, MOTIVE_SUNSET, MOTIVE_SEA, MOTIVE_CREEBET};

    /** 1x2 paintings */
    public static final String[] TALL_PAINTINGS = {MOTIVE_WANDERER, MOTIVE_GRAHAM};

    /** 2x2 paintings */
    public static final String[] LARGE_PAINTINGS = {MOTIVE_MATCH, MOTIVE_BUST, MOTIVE_STAGE, MOTIVE_VOID, MOTIVE_SKULL_AND_ROSES};
    
    /**
     * A map from tile entity ID's to the corresponding block ID's. TODOMC13: migrate to modern materials
     */
    public static final Map<String, Set<Integer>> TILE_ENTITY_MAP = new HashMap<>();

    static {
        TILE_ENTITY_MAP.put(ID_AIRPORTAL, Collections.singleton(BLK_END_PORTAL));
        TILE_ENTITY_MAP.put(ID_BEACON, Collections.singleton(BLK_BEACON));
        TILE_ENTITY_MAP.put(ID_CAULDRON, Collections.singleton(BLK_BREWING_STAND));
        TILE_ENTITY_MAP.put(ID_CHEST, ImmutableSet.of(BLK_CHEST, BLK_TRAPPED_CHEST));
        TILE_ENTITY_MAP.put(ID_COMPARATOR, ImmutableSet.of(BLK_REDSTONE_COMPARATOR_UNPOWERED, BLK_REDSTONE_COMPARATOR_POWERED));
        TILE_ENTITY_MAP.put(ID_CONTROL, ImmutableSet.of(BLK_COMMAND_BLOCK, BLK_CHAIN_COMMAND_BLOCK, BLK_REPEATING_COMMAND_BLOCK));
        TILE_ENTITY_MAP.put(ID_DLDETECTOR, ImmutableSet.of(BLK_DAYLIGHT_SENSOR, BLK_DAYLIGHT_SENSOR_INVERTED));
        TILE_ENTITY_MAP.put(ID_DROPPER, Collections.singleton(BLK_DROPPER));
        TILE_ENTITY_MAP.put(ID_ENCHANTTABLE, Collections.singleton(BLK_ENCHANTMENT_TABLE));
        TILE_ENTITY_MAP.put(ID_ENDERCHEST, Collections.singleton(BLK_ENDER_CHEST));
        TILE_ENTITY_MAP.put(ID_FLOWERPOT, Collections.singleton(BLK_FLOWER_POT));
        TILE_ENTITY_MAP.put(ID_FURNACE, ImmutableSet.of(BLK_FURNACE, BLK_BURNING_FURNACE));
        TILE_ENTITY_MAP.put(ID_HOPPER, Collections.singleton(BLK_HOPPER));
        TILE_ENTITY_MAP.put(ID_MOBSPAWNER, Collections.singleton(BLK_MONSTER_SPAWNER));
        TILE_ENTITY_MAP.put(ID_MUSIC, Collections.singleton(BLK_NOTE_BLOCK));
        TILE_ENTITY_MAP.put(ID_PISTON, Collections.singleton(BLK_PISTON_HEAD));
        TILE_ENTITY_MAP.put(ID_RECORDPLAYER, Collections.singleton(BLK_JUKEBOX));
        TILE_ENTITY_MAP.put(ID_SIGN, ImmutableSet.of(BLK_SIGN, BLK_WALL_SIGN));
        TILE_ENTITY_MAP.put(ID_SKULL, Collections.singleton(BLK_HEAD));
        TILE_ENTITY_MAP.put(ID_TRAP, Collections.singleton(BLK_DISPENSER));
        TILE_ENTITY_MAP.put(ID_BANNER, ImmutableSet.of(BLK_STANDING_BANNER, BLK_WALL_BANNER));
        TILE_ENTITY_MAP.put(ID_STRUCTURE, Collections.singleton(BLK_STRUCTURE_BLOCK));
        TILE_ENTITY_MAP.put(ID_SHULKER_BOX, ImmutableSet.of(BLK_WHITE_SHULKER_BOX, BLK_ORANGE_SHULKER_BOX, BLK_MAGENTA_SHULKER_BOX, BLK_LIGHT_BLUE_SHULKER_BOX, BLK_YELLOW_SHULKER_BOX, BLK_LIME_SHULKER_BOX, BLK_PINK_SHULKER_BOX, BLK_GREY_SHULKER_BOX, BLK_LIGHT_GREY_SHULKER_BOX, BLK_CYAN_SHULKER_BOX, BLK_PURPLE_SHULKER_BOX, BLK_BLUE_SHULKER_BOX, BLK_BROWN_SHULKER_BOX, BLK_GREEN_SHULKER_BOX, BLK_RED_SHULKER_BOX, BLK_BLACK_SHULKER_BOX));

        // Make sure the tile entity flag in the block database is consistent
        // with the tile entity map:
        Set<Integer> allTileEntityIds = new HashSet<>();
        for (Set<Integer> blockIdSet: TILE_ENTITY_MAP.values()) {
            allTileEntityIds.addAll(blockIdSet);
            for (int blockId: blockIdSet) {
                if (! Block.BLOCKS[blockId].tileEntity) {
                    throw new AssertionError("Block " + blockId + " not marked as tile entity!");
                }
            }
        }
        for (Block block: Block.BLOCKS) {
            if (block.tileEntity && (! allTileEntityIds.contains(block.id))) {
                throw new AssertionError("Block " + block.id + " marked as tile entity but not present in tile entity map!");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("All checks passed");
    }

    public static final int DEFAULT_MAX_HEIGHT_MCREGION = 128;
    public static final int DEFAULT_MAX_HEIGHT_ANVIL = 256;
    
    public static final int DIFFICULTY_PEACEFUL = 0;
    public static final int DIFFICULTY_EASY     = 1;
    public static final int DIFFICULTY_NORMAL   = 2;
    public static final int DIFFICULTY_HARD     = 3;
}