package shyly.mymod.Item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import shyly.mymod.myMod;

public class ModItems {

    public static final Item BLACKLIGHT_HAT = registerItem("blacklight_hat", new Item(new FabricItemSettings()));
    public static final Item BLACKLIGHT_JACKET = registerItem("blacklight_jacket", new Item(new FabricItemSettings()));
    public static final Item BLACKLIGHT_TROUSER = registerItem("blacklight_trouser", new Item(new FabricItemSettings()));
    public static final Item BLACKLIGHT_SHOES = registerItem("blacklight_shoes", new Item(new FabricItemSettings()));
    public static final Item BLACKLIGHT_SWORD = registerItem("blacklight_sword", new Item(new FabricItemSettings()));
    public static final Item BLACKLIGHT = registerItem("blacklight", new Item(new FabricItemSettings()));
    public static final Item RAW_BLACKLIGHT = registerItem("raw_blacklight", new Item(new FabricItemSettings()));

    public static final Item CITRINE = registerItem("citrine", new Item(new FabricItemSettings()));
    public static final Item RAW_CITRINE = registerItem("raw_citrine", new Item(new FabricItemSettings()));
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(myMod.MOD_ID, name), item);
    }

    public static void addItemsToGroup(){
        addItemsToGroup(ItemGroups.COMBAT, BLACKLIGHT_HAT);
        addItemsToGroup(ItemGroups.COMBAT, BLACKLIGHT_JACKET);
        addItemsToGroup(ItemGroups.COMBAT, BLACKLIGHT_TROUSER);
        addItemsToGroup(ItemGroups.COMBAT, BLACKLIGHT_SHOES);
        addItemsToGroup(ItemGroups.COMBAT, BLACKLIGHT_SWORD);

        addItemsToGroup(ModItemGroup.BLACKLIGHT, BLACKLIGHT_HAT);
        addItemsToGroup(ModItemGroup.BLACKLIGHT, BLACKLIGHT_JACKET);
        addItemsToGroup(ModItemGroup.BLACKLIGHT, BLACKLIGHT_TROUSER);
        addItemsToGroup(ModItemGroup.BLACKLIGHT, BLACKLIGHT_SHOES);
        addItemsToGroup(ModItemGroup.BLACKLIGHT, BLACKLIGHT_SWORD);
        addItemsToGroup(ModItemGroup.BLACKLIGHT, BLACKLIGHT);
        addItemsToGroup(ModItemGroup.BLACKLIGHT, RAW_BLACKLIGHT);


        addItemsToGroup(ItemGroups.INGREDIENTS, CITRINE);
        addItemsToGroup(ItemGroups.INGREDIENTS, RAW_CITRINE);

        addItemsToGroup(ModItemGroup.CITRINE, CITRINE);
        addItemsToGroup(ModItemGroup.CITRINE, RAW_CITRINE);

    }

    public static void addItemsToGroup(ItemGroup group, Item item){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems(){
        myMod.LOGGER.info("Registering Mod Items for "+ myMod.MOD_ID);
        addItemsToGroup();
    }

}
