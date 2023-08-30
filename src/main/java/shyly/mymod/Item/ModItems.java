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

    public static final Item Hat = registerItem("hat", new Item(new FabricItemSettings()));
    public static final Item Jacket = registerItem("jacket", new Item(new FabricItemSettings()));
    public static final Item Trousers = registerItem("trouser", new Item(new FabricItemSettings()));
    public static final Item Shoes = registerItem("shoes", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(myMod.MOD_ID, name), item);
    }

    public static void addItemsToGroup(){
        addItemsToGroup(ItemGroups.COMBAT, Hat);
        addItemsToGroup(ItemGroups.COMBAT, Jacket);
        addItemsToGroup(ItemGroups.COMBAT, Trousers);
        addItemsToGroup(ItemGroups.COMBAT, Shoes);
    }

    public static void addItemsToGroup(ItemGroup group, Item item){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems(){
        myMod.LOGGER.info("Registering Mod Items for "+ myMod.MOD_ID);
        addItemsToGroup();
    }

}
