package net.angelicaether.eden_expanded.item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent RAW_EDEN_MUSSEL = new FoodComponent.Builder().hunger(2).saturationModifier(0.25f).build();
    public static final FoodComponent COOKED_EDEN_MUSSEL = new FoodComponent.Builder().hunger(5).saturationModifier(0.5f).build();
    public static final FoodComponent ROCKMITE = new FoodComponent.Builder().hunger(2).saturationModifier(0.25f).build();
    public static final FoodComponent COOKED_ROCKMITE = new FoodComponent.Builder().hunger(4).saturationModifier(0.75f).build();
    public static final FoodComponent RAW_ROCKBEEF = new FoodComponent.Builder().hunger(3).saturationModifier(0.25f).build();
    public static final FoodComponent COOKED_ROCKBEEF = new FoodComponent.Builder().hunger(8).saturationModifier(0.85f).build();
}
