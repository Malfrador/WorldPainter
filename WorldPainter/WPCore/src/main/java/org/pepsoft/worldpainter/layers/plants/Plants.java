package org.pepsoft.worldpainter.layers.plants;

import org.pepsoft.minecraft.Direction;
import org.pepsoft.minecraft.Material;
import org.pepsoft.worldpainter.Platform;
import org.pepsoft.worldpainter.exporting.MinecraftWorld;

import java.util.Random;

import static org.pepsoft.minecraft.Constants.*;
import static org.pepsoft.minecraft.Material.*;
import static org.pepsoft.worldpainter.layers.plants.Category.*;

/**
 * A collection of Minecraft plants. These are prototypes which cannot be
 * actually be rendered; you must always invoke
 * {@link Plant#realise(int, Platform)} to obtain a concrete instances of the
 * plant which can be rendered. The dimensions of the prototypes indicate the
 * maximum dimensions of the plant.
 */
public class Plants {
    public static void main(String[] args) {
        for (Plant plant: ALL_PLANTS) {
            System.out.println(plant);
        }
    }

    public static final Plant GRASS = new SimplePlant("Grass", Material.GRASS, PLANTS_AND_FLOWERS);
    public static final Plant FERN = new SimplePlant("Fern", Material.FERN, PLANTS_AND_FLOWERS);
    public static final Plant DEAD_SHRUB = new SimplePlant("Dead Shrub", Material.DEAD_SHRUBS, PLANTS_AND_FLOWERS) {
        @Override
        public boolean isValidFoundation(MinecraftWorld world, int x, int y, int z) {
            return world.getMaterialAt(x, y, z).isNamedOneOf(MC_SAND, MC_RED_SAND, MC_DIRT, MC_TERRACOTTA, MC_PODZOL, MC_COARSE_DIRT);
        }
    };
    public static final Plant DANDELION = new SimplePlant("Dandelion", Material.DANDELION, PLANTS_AND_FLOWERS);
    public static final Plant POPPY = new SimplePlant("Poppy", Material.ROSE, PLANTS_AND_FLOWERS);
    public static final Plant BLUE_ORCHID = new SimplePlant("Blue Orchid", Material.BLUE_ORCHID, PLANTS_AND_FLOWERS);
    public static final Plant ALLIUM = new SimplePlant("Allium", Material.ALLIUM, PLANTS_AND_FLOWERS);
    public static final Plant AZURE_BLUET = new SimplePlant("Azure Bluet", Material.AZURE_BLUET, PLANTS_AND_FLOWERS);
    public static final Plant TULIP_RED = new SimplePlant("Red Tulip", Material.RED_TULIP, PLANTS_AND_FLOWERS);
    public static final Plant TULIP_ORANGE = new SimplePlant("Orange Tulip", Material.ORANGE_TULIP, PLANTS_AND_FLOWERS);
    public static final Plant TULIP_WHITE = new SimplePlant("White Tulip", Material.WHITE_TULIP, PLANTS_AND_FLOWERS);
    public static final Plant TULIP_PINK = new SimplePlant("Pink Tulip", Material.PINK_TULIP, PLANTS_AND_FLOWERS);
    public static final Plant OXEYE_DAISY = new SimplePlant("Oxeye Daisy", Material.OXEYE_DAISY, PLANTS_AND_FLOWERS);
    public static final Plant CORNFLOWER = new SimplePlant("Cornflower", Material.CORNFLOWER, PLANTS_AND_FLOWERS);
    public static final Plant LILY_OF_THE_VALLEY = new SimplePlant("Lily of the Valley", Material.LILY_OF_THE_VALLEY, PLANTS_AND_FLOWERS);
    public static final Plant WITHER_ROSE = new SimplePlant("Wither Rose", Material.WITHER_ROSE, NETHER);
    public static final Plant SUNFLOWER = new DoubleHighPlant("Sunflower", Material.SUNFLOWER_LOWER, PLANTS_AND_FLOWERS, "block/sunflower_front.png");
    public static final Plant LILAC = new DoubleHighPlant("Lilac", Material.LILAC_LOWER, PLANTS_AND_FLOWERS);
    public static final Plant TALL_GRASS = new DoubleHighPlant("Tall Grass", Material.TALL_GRASS_LOWER, PLANTS_AND_FLOWERS);
    public static final Plant LARGE_FERN = new DoubleHighPlant("Large Fern", Material.LARGE_FERN_LOWER, PLANTS_AND_FLOWERS);
    public static final Plant ROSE_BUSH = new DoubleHighPlant("Rose Bush", Material.ROSE_BUSH_LOWER, PLANTS_AND_FLOWERS);
    public static final Plant PEONY = new DoubleHighPlant("Peony", Material.PEONY_LOWER, PLANTS_AND_FLOWERS);
    public static final Plant SAPLING_OAK = new SimplePlant("Oak Sapling", Material.OAK_SAPLING, SAPLINGS);
    public static final Plant SAPLING_DARK_OAK = new SimplePlant("Dark Oak Sapling", Material.DARK_OAK_SAPLING, SAPLINGS);
    public static final Plant SAPLING_PINE = new SimplePlant("Pine Sapling", Material.PINE_SAPLING, SAPLINGS);
    public static final Plant SAPLING_BIRCH = new SimplePlant("Birch Sapling", Material.BIRCH_SAPLING, SAPLINGS);
    public static final Plant SAPLING_JUNGLE = new SimplePlant("Jungle Sapling", Material.JUNGLE_SAPLING, SAPLINGS);
    public static final Plant SAPLING_ACACIA = new SimplePlant("Acacia Sapling", Material.ACACIA_SAPLING, SAPLINGS);
    public static final Plant MUSHROOM_RED = new SimplePlant("Red Mushroom", Material.RED_MUSHROOM, MUSHROOMS);
    public static final Plant MUSHROOM_BROWN = new SimplePlant("Brown Mushroom", Material.BROWN_MUSHROOM, MUSHROOMS);
    public static final Plant WHEAT = new AgingPlant("Wheat", Material.WHEAT, CROPS, "block/wheat_stage7.png", 8);
    public static final Plant CARROTS = new AgingPlant("Carrots", Material.CARROTS, CROPS, "block/carrots_stage3.png", 8);
    public static final Plant POTATOES = new AgingPlant("Potatoes", Material.POTATOES, CROPS, "block/potatoes_stage3.png", 8);
    public static final Plant PUMPKIN_STEMS = new AgingPlant("Pumpkin Stems", Material.PUMPKIN_STEM, CROPS, "block/pumpkin_side.png", 8) {
        @Override
        public Plant realise(int growth, Platform platform) {
            return new SimplePlant("Pumpkin Stems", Material.PUMPKIN_STEM.withProperty(FACING, Direction.values()[RANDOM.nextInt(4)]), CROPS);
        }
    };
    public static final Plant MELON_STEMS = new AgingPlant("Melon Stems", Material.MELON_STEM, CROPS, "block/melon_side.png", 8) {
        @Override
        public Plant realise(int growth, Platform platform) {
            return new SimplePlant("Melon Stems", Material.MELON_STEM.withProperty(FACING, Direction.values()[RANDOM.nextInt(4)]), CROPS);
        }
    };
    public static final Plant BEETROOTS = new AgingPlant("Beetroots", Material.BEETROOTS, CROPS, "block/beetroots_stage3.png", 4);
    public static final Plant SWEET_BERRY_BUSH = new AgingPlant("Sweet Berry Bush", Material.SWEET_BERRY_BUSH, PLANTS_AND_FLOWERS, "block/sweet_berry_bush_stage3.png", 4);
    public static final Plant CACTUS = new VariableHeightPlant("Cactus", Material.CACTUS, Category.CACTUS, "block/cactus_side.png", 3);
    public static final Plant SUGAR_CANE = new VariableHeightPlant("Sugar Cane", Material.SUGAR_CANE, Category.SUGAR_CANE, 3);
    public static final Plant LILY_PAD = new SimplePlant("Lily Pad", Material.LILY_PAD, Category.FLOATING_PLANTS);
    public static final Plant NETHER_WART = new AgingPlant("Nether Wart", Material.NETHER_WART, Category.NETHER, "block/nether_wart_stage2.png", 4) {
        @Override
        public Plant realise(int growth, Platform platform) {
            return new SimplePlant("Nether Wart", Material.NETHER_WART.withProperty(AGE, growth - 1), NETHER) {
                @Override
                public boolean isValidFoundation(MinecraftWorld world, int x, int y, int height) {
                    return world.getMaterialAt(x, y, height).isNamed(MC_SOUL_SAND);
                }
            };
        }
    };
    public static final Plant CHORUS_PLANT = new VariableHeightPlant("Chorus Plant", Material.CHORUS_PLANT, Material.CHORUS_FLOWER, Category.END, "block/chorus_flower.png", 5);
    public static final Plant TUBE_CORAL = new SimplePlant("Tube Coral", Material.TUBE_CORAL, WATER_PLANTS);
    public static final Plant BRAIN_CORAL = new SimplePlant("Brain Coral", Material.BRAIN_CORAL, WATER_PLANTS);
    public static final Plant BUBBLE_CORAL = new SimplePlant("Bubble Coral", Material.BUBBLE_CORAL, WATER_PLANTS);
    public static final Plant FIRE_CORAL = new SimplePlant("Fire Coral", Material.FIRE_CORAL, WATER_PLANTS);
    public static final Plant HORN_CORAL = new SimplePlant("Horn Coral", Material.HORN_CORAL, WATER_PLANTS);
    public static final Plant TUBE_CORAL_FAN = new SimplePlant("Tube Coral Fan", Material.TUBE_CORAL_FAN, WATER_PLANTS);
    public static final Plant BRAIN_CORAL_FAN = new SimplePlant("Brain Coral Fan", Material.BRAIN_CORAL_FAN, WATER_PLANTS);
    public static final Plant BUBBLE_CORAL_FAN = new SimplePlant("Bubble Coral Fan", Material.BUBBLE_CORAL_FAN, WATER_PLANTS);
    public static final Plant FIRE_CORAL_FAN = new SimplePlant("Fire Coral Fan", Material.FIRE_CORAL_FAN, WATER_PLANTS);
    public static final Plant HORN_CORAL_FAN = new SimplePlant("Horn Coral Fan", Material.HORN_CORAL_FAN, WATER_PLANTS);
    public static final Plant KELP = new VariableHeightPlant("Kelp", Material.KELP_PLANT, Material.KELP, WATER_PLANTS, 26) {
        @Override
        public VariableHeightPlant realise(int growth, Platform platform) {
            return new VariableHeightPlant("Kelp", Material.KELP_PLANT, Material.KELP.withProperty(AGE, RANDOM.nextInt(26)), WATER_PLANTS, growth);
        }
    };
    public static final Plant SEAGRASS = new SimplePlant("Seagrass", Material.SEAGRASS, WATER_PLANTS);
    public static final Plant TALL_SEAGRASS = new DoubleHighPlant("Tall Seagrass", Material.TALL_SEAGRASS_LOWER, WATER_PLANTS);
    public static final Plant SEA_PICKLE = new AgingPlant("Sea Pickle", Material.SEA_PICKLE_1, WATER_PLANTS, "item/sea_pickle.png", 4) {
        @Override
        public AgingPlant realise(int growth, Platform platform) {
            return new AgingPlant(name, material.withProperty(PICKLES, growth), category, iconName, maxGrowth);
        }
    };
    public static final Plant BAMBOO = new VariableHeightPlant("Bamboo", BAMBOO_NO_LEAVES, BAMBOO_LARGE_LEAVES_STAGE_1, PLANTS_AND_FLOWERS, "item/bamboo.png", 16); // TODO better approximate Minecraft-generated bamboo
    public static final Plant SAPLING_AZALEA = new SimplePlant("Azalea", Material.AZALEA, SAPLINGS, "block/azalea_plant.png");
    public static final Plant SAPLING_FLOWERING_AZALEA = new SimplePlant("Flowering Azalea", Material.FLOWERING_AZALEA, SAPLINGS, "block/flowering_azalea_side.png");
    public static final Plant CRIMSON_FUNGUS = new SimplePlant("Crimson Fungus", Material.CRIMSON_FUNGUS, NETHER);
    public static final Plant WARPED_FUNGUS = new SimplePlant("Warped Fungus", Material.WARPED_FUNGUS, NETHER);
    public static final Plant CRIMSON_ROOTS = new SimplePlant("Crimson Roots", Material.CRIMSON_ROOTS, NETHER);
    public static final Plant WARPED_ROOTS = new SimplePlant("Warped Roots", Material.WARPED_ROOTS, NETHER);
    public static final Plant NETHER_SPROUTS = new SimplePlant("Nether Sprouts", Material.NETHER_SPROUTS, NETHER);
    public static final Plant TWISTING_VINES = new VariableHeightPlant("Twisting Vines", Material.TWISTING_VINES_PLANT, TWISTING_VINES_25, MUSHROOMS, 10); // TODO not really mushrooms, but for now those are presented as "Various"
    public static final Plant GLOW_LICHEN = new SimplePlant("Glow Lichen", Material.GLOW_LICHEN_DOWN, MUSHROOMS) { // TODO not really mushrooms, but for now those are presented as "Various"
        @Override
        public boolean isValidFoundation(MinecraftWorld world, int x, int y, int height) {
            return MUSHROOMS.isValidFoundation(world, x, y, height) || WATER_PLANTS.isValidFoundation(world, x, y, height);
        }
    };
    public static final Plant MOSS_CARPET = new SimplePlant("Moss Carpet", Material.MOSS_CARPET, MUSHROOMS, "block/moss_block.png"); // TODO not really mushrooms, but for now those are presented as "Various"
    public static final Plant BIG_DRIPLEAF = new VariableHeightPlant("Big Dripleaf", Material.BIG_DRIPLEAF_STEM_SOUTH, Material.BIG_DRIPLEAF_SOUTH, PLANTS_AND_FLOWERS, "block/big_dripleaf_top.png", 10) {
        @Override
        public VariableHeightPlant realise(int growth, Platform platform) {
            final Direction facing = Direction.values()[(int) (Math.random() * 4)];
            return new VariableHeightPlant("Big Dripleaf", Material.BIG_DRIPLEAF_STEM_SOUTH.withProperty(MC_FACING, facing.toString()), Material.BIG_DRIPLEAF_SOUTH.withProperty(MC_FACING, facing.toString()), PLANTS_AND_FLOWERS, growth);
        }
    };

    // The code which uses this assumes there will never be more than 128 plants. If that ever happens it needs to be
    // overhauled! IMPORTANT: indices into this array are stored in layer settings! New entries MUST be added at the
    // end, and the order MUST never be changed!
    public static final Plant[] ALL_PLANTS = {GRASS, TALL_GRASS, FERN, LARGE_FERN, DEAD_SHRUB, DANDELION, POPPY,
            BLUE_ORCHID, ALLIUM, AZURE_BLUET, TULIP_RED, TULIP_ORANGE, TULIP_WHITE, TULIP_PINK, OXEYE_DAISY, SUNFLOWER,
            LILAC, ROSE_BUSH, PEONY, SAPLING_OAK, SAPLING_DARK_OAK, SAPLING_PINE, SAPLING_BIRCH, SAPLING_JUNGLE,
            SAPLING_ACACIA, MUSHROOM_RED, MUSHROOM_BROWN, WHEAT, CARROTS, POTATOES, PUMPKIN_STEMS, MELON_STEMS, CACTUS,
            SUGAR_CANE, LILY_PAD, BEETROOTS, NETHER_WART, CHORUS_PLANT, TUBE_CORAL, BRAIN_CORAL, BUBBLE_CORAL,
            FIRE_CORAL, HORN_CORAL, TUBE_CORAL_FAN, BRAIN_CORAL_FAN, BUBBLE_CORAL_FAN, FIRE_CORAL_FAN, HORN_CORAL_FAN,
            KELP, SEAGRASS, TALL_SEAGRASS, SEA_PICKLE, CORNFLOWER, LILY_OF_THE_VALLEY, WITHER_ROSE, SWEET_BERRY_BUSH,
            BAMBOO, SAPLING_AZALEA, SAPLING_FLOWERING_AZALEA, CRIMSON_FUNGUS, WARPED_FUNGUS, CRIMSON_ROOTS,
            WARPED_ROOTS, NETHER_SPROUTS, TWISTING_VINES, GLOW_LICHEN, MOSS_CARPET, BIG_DRIPLEAF};

    private static final Random RANDOM = new Random();
}
