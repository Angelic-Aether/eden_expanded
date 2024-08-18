package net.angelicaether.eden_expanded;

import net.angelicaether.eden_expanded.block.ModBlocks;
import net.angelicaether.eden_expanded.item.ModItemGroups;
import net.angelicaether.eden_expanded.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EdenExpanded implements ModInitializer {
	public static final String MOD_ID = "eden_expanded";
    public static final Logger LOGGER = LoggerFactory.getLogger("MOD_ID");

	@Override
	public void onInitialize() {
		// Initialises, registers, and logs stuff
		LOGGER.info("AETHER WAS HERE! :3");
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		// Makes all logs strippable with an axe
		StrippableBlockRegistry.register(ModBlocks.ROCKWOOD_LOG, ModBlocks.STRIPPED_ROCKWOOD_LOG);
		StrippableBlockRegistry.register(ModBlocks.ROCKWOOD_WOOD, ModBlocks.STRIPPED_ROCKWOOD_WOOD);

		// Makes all wood blocks flammable
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ROCKWOOD_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ROCKWOOD_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_ROCKWOOD_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_ROCKWOOD_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ROCKWOOD_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ROCKWOOD_LEAVES, 30, 60);
	}
}