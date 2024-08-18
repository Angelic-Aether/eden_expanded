package net.angelicaether.eden_expanded.item;

import net.angelicaether.eden_expanded.EdenExpanded;
import net.angelicaether.eden_expanded.block.ModBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item EDEN_MUSSEL = registerItem("eden_mussel", new Item(new FabricItemSettings()));
    public static final Item RAW_EDEN_MUSSEL = registerItem("raw_eden_mussel", new Item(new FabricItemSettings().food(ModFoodComponents.RAW_EDEN_MUSSEL)));
    public static final Item COOKED_EDEN_MUSSEL = registerItem("cooked_eden_mussel", new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_EDEN_MUSSEL)));
    public static final Item ROCKMITE = registerItem("rockmite", new Item(new FabricItemSettings().food(ModFoodComponents.ROCKMITE)));
    public static final Item COOKED_ROCKMITE = registerItem("cooked_rockmite", new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_ROCKMITE)));

    // Adds food items to the Food and Drink tab
    private static void addItemsToFoodAndDrinkItemGroup(FabricItemGroupEntries entries) {
        // Adds eden mussel items to the Food and Drink tab
        entries.add(EDEN_MUSSEL);
        entries.add(RAW_EDEN_MUSSEL);
        entries.add(COOKED_EDEN_MUSSEL);

        // Adds rockmite items to the Food and Drink tab
        entries.add(ROCKMITE);
        entries.add(COOKED_ROCKMITE);
    }

    // Adds blocks to the Building Blocks Tab
    private static void addItemsToBuildingBlocksItemGroup(FabricItemGroupEntries entries) {
        // Adds rhyolite and cobbled rhyolite blocks to the Building Blocks tab
        entries.add(ModBlocks.RHYOLITE);
        entries.add(ModBlocks.COBBLED_RHYOLITE);
        entries.add(ModBlocks.COBBLED_RHYOLITE_STAIRS);
        entries.add(ModBlocks.COBBLED_RHYOLITE_SLAB);
        entries.add(ModBlocks.COBBLED_RHYOLITE_WALL);

        // Adds chiseled rhyolite to the Building Blocks tab
        entries.add(ModBlocks.CHISELED_RHYOLITE);

        // Adds polished rhyolite blocks to the Building Blocks tab
        entries.add(ModBlocks.POLISHED_RHYOLITE);
        entries.add(ModBlocks.POLISHED_RHYOLITE_STAIRS);
        entries.add(ModBlocks.POLISHED_RHYOLITE_SLAB);
        entries.add(ModBlocks.POLISHED_RHYOLITE_WALL);

        // Adds rhyolite brick blocks to the Building Blocks tab
        entries.add(ModBlocks.RHYOLITE_BRICKS);
        entries.add(ModBlocks.CRACKED_RHYOLITE_BRICKS);
        entries.add(ModBlocks.RHYOLITE_BRICK_STAIRS);
        entries.add(ModBlocks.RHYOLITE_BRICK_SLAB);
        entries.add(ModBlocks.RHYOLITE_BRICK_WALL);

        // Adds rhyolite tile blocks to the Building Blocks tab
        entries.add(ModBlocks.RHYOLITE_TILES);
        entries.add(ModBlocks.CRACKED_RHYOLITE_TILES);
        entries.add(ModBlocks.RHYOLITE_TILE_STAIRS);
        entries.add(ModBlocks.RHYOLITE_TILE_SLAB);
        entries.add(ModBlocks.RHYOLITE_TILE_WALL);

        // Adds rockwood blocks to the Building Blocks tab
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
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(EdenExpanded.MOD_ID, name), item);
    }

    public static void registerModItems() {
        EdenExpanded.LOGGER.info("Registering Mod Items for " + EdenExpanded.MOD_ID);

        // Adds blocks and items to vanilla item tabs
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodAndDrinkItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModItems::addItemsToBuildingBlocksItemGroup);
    }
}
