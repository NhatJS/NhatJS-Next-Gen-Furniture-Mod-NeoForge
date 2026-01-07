package net.nhatjs.nextgen_furniture.util;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.nhatjs.nextgen_furniture.NhatJSNextGenFurnitureMod;

public class ModTags {
    public static class Items {
        public static final TagKey<Item> TABLE_2X1_BLACK = createTag("table_2x1_black");
        public static final TagKey<Item> TABLE_2X1_WHITE = createTag("table_2x1_white");
        public static final TagKey<Item> TABLE_2X1_WOOD_OAK = createTag("table_2x1_wood_oak");
        public static final TagKey<Item> TABLE_2X1_WOOD_BIRCH = createTag("table_2x1_wood_birch");

        private static TagKey<Item> createTag(String name) {
            return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(NhatJSNextGenFurnitureMod.MOD_ID, name));
        }
    }
}