package net.angelicaether.eden_expanded.util;

import net.angelicaether.eden_expanded.EdenExpanded;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> RHYOLITE_ORE_REPLACEABLES =
                createTag("rhyolite_ore_replaceables");

        public static final TagKey<Block> RHYOLITE_ORES =
                createTag("rhyolite_ores");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(EdenExpanded.MOD_ID, name));
        }
    }

    public static class Items {
        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(EdenExpanded.MOD_ID, name));
        }
    }
}
