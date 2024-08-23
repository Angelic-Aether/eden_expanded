package net.angelicaether.eden_expanded.item;

import net.angelicaether.eden_expanded.EdenExpanded;
import net.angelicaether.eden_expanded.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup EDEN_ALPHA = Registry.register(Registries.ITEM_GROUP,
            new Identifier(EdenExpanded.MOD_ID, "gritsoil_grass_block"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.eden_alpha"))
                    .icon(() -> new ItemStack(ModBlocks.GRITSOIL_GRASS_BLOCK)).entries((displayContext, entries) -> {
                        // Adds gritsoil to the Eden Alpha tab
                        entries.add(ModBlocks.GRITSOIL);
                        entries.add(ModBlocks.GRITSOIL_GRASS_BLOCK);

                        // Adds rhyolite and cobbled rhyolite blocks to the Eden Alpha tab
                        entries.add(ModBlocks.RHYOLITE);
                        entries.add(ModBlocks.COBBLED_RHYOLITE);
                        entries.add(ModBlocks.COBBLED_RHYOLITE_STAIRS);
                        entries.add(ModBlocks.COBBLED_RHYOLITE_SLAB);
                        entries.add(ModBlocks.COBBLED_RHYOLITE_WALL);

                        // Adds chiseled rhyolite to the Eden Alpha tab
                        entries.add(ModBlocks.CHISELED_RHYOLITE);

                        // Adds polished rhyolite blocks to the Eden Alpha tab
                        entries.add(ModBlocks.POLISHED_RHYOLITE);
                        entries.add(ModBlocks.POLISHED_RHYOLITE_STAIRS);
                        entries.add(ModBlocks.POLISHED_RHYOLITE_SLAB);
                        entries.add(ModBlocks.POLISHED_RHYOLITE_WALL);

                        // Adds rhyolite brick blocks to the Eden Alpha tab
                        entries.add(ModBlocks.RHYOLITE_BRICKS);
                        entries.add(ModBlocks.CRACKED_RHYOLITE_BRICKS);
                        entries.add(ModBlocks.RHYOLITE_BRICK_STAIRS);
                        entries.add(ModBlocks.RHYOLITE_BRICK_SLAB);
                        entries.add(ModBlocks.RHYOLITE_BRICK_WALL);

                        // Adds rhyolite tile blocks to the Eden Alpha tab
                        entries.add(ModBlocks.RHYOLITE_TILES);
                        entries.add(ModBlocks.CRACKED_RHYOLITE_TILES);
                        entries.add(ModBlocks.RHYOLITE_TILE_STAIRS);
                        entries.add(ModBlocks.RHYOLITE_TILE_SLAB);
                        entries.add(ModBlocks.RHYOLITE_TILE_WALL);

                        // Adds rhyolite ore blocks to the Eden Alpha tab
                        entries.add(ModBlocks.RHYOLITE_COAL_ORE);
                        entries.add(ModBlocks.RHYOLITE_COPPER_ORE);
                        entries.add(ModBlocks.RHYOLITE_DIAMOND_ORE);
                        entries.add(ModBlocks.RHYOLITE_EMERALD_ORE);
                        entries.add(ModBlocks.RHYOLITE_GOLD_ORE);
                        entries.add(ModBlocks.RHYOLITE_IRON_ORE);
                        entries.add(ModBlocks.RHYOLITE_LAPIS_ORE);
                        entries.add(ModBlocks.RHYOLITE_REDSTONE_ORE);

                        // Adds rockwood blocks to the Eden Alpha tab
                        entries.add(ModBlocks.ROCKWOOD_LOG);
                        entries.add(ModBlocks.ROCKWOOD_WOOD);
                        entries.add(ModBlocks.STRIPPED_ROCKWOOD_LOG);
                        entries.add(ModBlocks.STRIPPED_ROCKWOOD_WOOD);
                        entries.add(ModBlocks.ROCKWOOD_PLANKS);
                        entries.add(ModBlocks.ROCKWOOD_STAIRS);
                        entries.add(ModBlocks.ROCKWOOD_SLAB);
                        entries.add(ModBlocks.ROCKWOOD_FENCE);
                        entries.add(ModBlocks.ROCKWOOD_FENCE_GATE);
                        entries.add(ModBlocks.ROCKWOOD_DOOR);
                        entries.add(ModBlocks.ROCKWOOD_TRAPDOOR);
                        entries.add(ModBlocks.ROCKWOOD_PRESSURE_PLATE);
                        entries.add(ModBlocks.ROCKWOOD_BUTTON);

                        // Adds food items to the Eden Alpha tab
                        entries.add(ModItems.EDEN_MUSSEL);
                        entries.add(ModItems.RAW_EDEN_MUSSEL);
                        entries.add(ModItems.COOKED_EDEN_MUSSEL);
                        entries.add(ModItems.ROCKMITE);
                        entries.add(ModItems.COOKED_ROCKMITE);
                        entries.add(ModItems.RAW_ROCKBEEF);
                        entries.add(ModItems.COOKED_ROCKBEEF);

                        // Adds weapons to the Eden Alpha tab
                        entries.add(ModItems.TROGLORAPTOR_CLAW);
                        entries.add(ModItems.TROGLORAPTOR_SPEAR);
                        entries.add(ModItems.SCORPION_WHIP);
                        entries.add(ModItems.SCORPION_SCYTHE);
                        entries.add(ModItems.WHIPRAPTOR_CLAW);
                        entries.add(ModItems.WHIPRAPTOR_DAGGER);
                    }).build());

    public static void registerItemGroups() {
        EdenExpanded.LOGGER.info("Registering Item Groups for " + EdenExpanded.MOD_ID);
    }
}
