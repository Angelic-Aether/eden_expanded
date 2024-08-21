package net.angelicaether.eden_expanded.block;

import net.angelicaether.eden_expanded.EdenExpanded;
import net.angelicaether.eden_expanded.block.custom.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    // Registers gritsoil blocks
    public static final Block GRITSOIL = registerBlock("gritsoil",
            new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block GRITSOIL_GRASS_BLOCK = registerBlock("gritsoil_grass_block",
            new GritsoilGrassBlock(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK)));

    // Registers rhyolite and cobbled rhyolite blocks
    public static final Block RHYOLITE = registerBlock("rhyolite",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block COBBLED_RHYOLITE = registerBlock("cobbled_rhyolite",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block COBBLED_RHYOLITE_STAIRS = registerBlock("cobbled_rhyolite_stairs",
            new StairsBlock(ModBlocks.COBBLED_RHYOLITE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));
    public static final Block COBBLED_RHYOLITE_SLAB = registerBlock("cobbled_rhyolite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));
    public static final Block COBBLED_RHYOLITE_WALL = registerBlock("cobbled_rhyolite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));

    // Registers chiseled rhyolite
    public static final Block CHISELED_RHYOLITE = registerBlock("chiseled_rhyolite",
            new Block(FabricBlockSettings.copyOf(Blocks.CHISELED_STONE_BRICKS)));

    // Registers polished rhyolite blocks
    public static final Block POLISHED_RHYOLITE = registerBlock("polished_rhyolite",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block POLISHED_RHYOLITE_STAIRS = registerBlock("polished_rhyolite_stairs",
            new StairsBlock(ModBlocks.POLISHED_RHYOLITE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));
    public static final Block POLISHED_RHYOLITE_SLAB = registerBlock("polished_rhyolite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));
    public static final Block POLISHED_RHYOLITE_WALL = registerBlock("polished_rhyolite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));

    // Registers rhyolite brick blocks
    public static final Block RHYOLITE_BRICKS = registerBlock("rhyolite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block CRACKED_RHYOLITE_BRICKS = registerBlock("cracked_rhyolite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CRACKED_STONE_BRICKS)));
    public static final Block RHYOLITE_BRICK_STAIRS = registerBlock("rhyolite_brick_stairs",
            new StairsBlock(ModBlocks.RHYOLITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));
    public static final Block RHYOLITE_BRICK_SLAB = registerBlock("rhyolite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));
    public static final Block RHYOLITE_BRICK_WALL = registerBlock("rhyolite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));

    // Registers rhyolite tile blocks
    public static final Block RHYOLITE_TILES = registerBlock("rhyolite_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block CRACKED_RHYOLITE_TILES = registerBlock("cracked_rhyolite_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.CRACKED_STONE_BRICKS)));
    public static final Block RHYOLITE_TILE_STAIRS = registerBlock("rhyolite_tile_stairs",
            new StairsBlock(ModBlocks.RHYOLITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));
    public static final Block RHYOLITE_TILE_SLAB = registerBlock("rhyolite_tile_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));
    public static final Block RHYOLITE_TILE_WALL = registerBlock("rhyolite_tile_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));

    // Registers rhyolite ore blocks
    public static final Block RHYOLITE_COAL_ORE = registerBlock("rhyolite_coal_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.COAL_ORE)));
    public static final Block RHYOLITE_IRON_ORE = registerBlock("rhyolite_iron_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
    public static final Block RHYOLITE_COPPER_ORE = registerBlock("rhyolite_copper_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.COPPER_ORE)));
    public static final Block RHYOLITE_GOLD_ORE = registerBlock("rhyolite_gold_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.GOLD_ORE)));
    public static final Block RHYOLITE_REDSTONE_ORE = registerBlock("rhyolite_redstone_ore",
            new RedstoneOreBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_ORE)));
    public static final Block RHYOLITE_EMERALD_ORE = registerBlock("rhyolite_emerald_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE)));
    public static final Block RHYOLITE_LAPIS_ORE = registerBlock("rhyolite_lapis_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.LAPIS_ORE)));
    public static final Block RHYOLITE_DIAMOND_ORE = registerBlock("rhyolite_diamond_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE)));

    // Registers rockwood blocks
    public static final Block ROCKWOOD_LOG = registerBlock("rockwood_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block ROCKWOOD_WOOD = registerBlock("rockwood_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_ROCKWOOD_LOG = registerBlock("stripped_rockwood_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_ROCKWOOD_WOOD = registerBlock("stripped_rockwood_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block ROCKWOOD_PLANKS = registerBlock("rockwood_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block ROCKWOOD_STAIRS = registerBlock("rockwood_stairs",
            new StairsBlock(ModBlocks.ROCKWOOD_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block ROCKWOOD_SLAB = registerBlock("rockwood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block ROCKWOOD_FENCE = registerBlock("rockwood_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block ROCKWOOD_FENCE_GATE = registerBlock("rockwood_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));
    public static final Block ROCKWOOD_DOOR = registerBlock("rockwood_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block ROCKWOOD_TRAPDOOR = registerBlock("rockwood_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block ROCKWOOD_PRESSURE_PLATE = registerBlock("rockwood_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block ROCKWOOD_BUTTON = registerBlock("rockwood_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 30, true));
    public static final Block ROCKWOOD_LEAVES = registerBlock("rockwood_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));

    // Registers sign textures
    public static final Identifier ROCKWOOD_SIGN_TEXTURE = new Identifier(EdenExpanded.MOD_ID, "entity/signs/rockwood");
    public static final Identifier ROCKWOOD_HANGING_SIGN_TEXTURE = new Identifier(EdenExpanded.MOD_ID, "entity/signs/hanging/rockwood");
    public static final Identifier ROCKWOOD_HANGING_GUI_SIGN_TEXTURE = new Identifier(EdenExpanded.MOD_ID, "textures/gui/hanging_signs/rockwood");

    public static final Block ROCKWOOD_SIGN = registerBlockWithoutItem("rockwood_sign",
            new SignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), WoodType.OAK));
    public static final Block ROCKWOOD_WALL_SIGN = registerBlockWithoutItem("rockwood_wall_sign",
            new WallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN), WoodType.OAK));

    // Registers blocks without items
    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(EdenExpanded.MOD_ID, name), block);
    }

    // Registers blocks
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(EdenExpanded.MOD_ID, name), block);
    }

    // Registers blocks as items
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(EdenExpanded.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    // Registers and logs blocks
    public static void registerModBlocks() {
        EdenExpanded.LOGGER.info("Registering Mod Blocks for " + EdenExpanded.MOD_ID);
    }
}
