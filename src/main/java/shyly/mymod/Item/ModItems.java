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

    public static final Item HAT = registerItem("hat", new Item(new FabricItemSettings()));
    public static final Item JACKET = registerItem("jacket", new Item(new FabricItemSettings()));
    public static final Item TROUSER = registerItem("trouser", new Item(new FabricItemSettings()));
    public static final Item SHOES = registerItem("shoes", new Item(new FabricItemSettings()));
    public static final Item SWORD = registerItem("sword", new Item(new FabricItemSettings()));

    public static final Item CITRINE = registerItem("citrine", new Item(new FabricItemSettings()));
    public static final Item RAW_CITRINE = registerItem("raw_citrine", new Item(new FabricItemSettings()));
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(myMod.MOD_ID, name), item);
    }

    public static void addItemsToGroup(){
        addItemsToGroup(ItemGroups.COMBAT, HAT);
        addItemsToGroup(ItemGroups.COMBAT, JACKET);
        addItemsToGroup(ItemGroups.COMBAT, TROUSER);
        addItemsToGroup(ItemGroups.COMBAT, SHOES);
        addItemsToGroup(ItemGroups.COMBAT, SWORD);

        addItemsToGroup(ModItemGroup.DRIP, HAT);
        addItemsToGroup(ModItemGroup.DRIP, JACKET);
        addItemsToGroup(ModItemGroup.DRIP, TROUSER);
        addItemsToGroup(ModItemGroup.DRIP, SHOES);
        addItemsToGroup(ModItemGroup.DRIP, SWORD);

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
