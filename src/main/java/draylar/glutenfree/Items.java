package draylar.glutenfree;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public enum Items {
    GLUTEN_FREE_BREAD("bread_gluten_free", new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(5).build()))),
    GLUTEN_FREE_WHEAT("gluten_free_wheat", new Item(new Item.Settings().group(ItemGroup.FOOD))),
    GLUTEN_FREE_CARROT("gluten_free_carrot", new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(3).build())));


    Items(String name, Item item) {
        Registry.register(Registry.ITEM, new Identifier("glutenfree", name), item);
    }
}
