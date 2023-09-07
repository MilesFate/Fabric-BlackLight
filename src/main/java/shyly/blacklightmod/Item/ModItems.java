package shyly.blacklightmod.Item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import shyly.blacklightmod.BlackLightMod;
import shyly.blacklightmod.Item.custom.BlacklightArmorItem;
import shyly.blacklightmod.Item.custom.BlacklightSwordItem;
import shyly.blacklightmod.Item.materials.ModArmorMaterials;
import shyly.blacklightmod.Item.materials.ModToolsMaterials;

public class ModItems {
    public static final Item BLACKLIGHT = registerItem("blacklight", new Item(new FabricItemSettings()));
    public static final Item RAW_BLACKLIGHT = registerItem("raw_blacklight", new Item(new FabricItemSettings()));
    public static final Item FIGGY_PUDDING = registerItem("figgy_pudding", new Item(new FabricItemSettings()));
    public static final Item BLACKLIGHT_SLURRY = registerItem("blacklight_slurry", new Item(new FabricItemSettings()));
    public static final Item BLACKLIGHT_HAT = registerItem("blacklight_hat", new BlacklightArmorItem(ModArmorMaterials.BLACKLIGHT, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item BLACKLIGHT_JACKET = registerItem("blacklight_jacket", new BlacklightArmorItem(ModArmorMaterials.BLACKLIGHT, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item BLACKLIGHT_TROUSER = registerItem("blacklight_trouser", new BlacklightArmorItem(ModArmorMaterials.BLACKLIGHT, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item BLACKLIGHT_SHOES = registerItem("blacklight_shoes", new BlacklightArmorItem(ModArmorMaterials.BLACKLIGHT, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item BLACKLIGHT_SWORD = registerItem("blacklight_sword", new BlacklightSwordItem(ModToolsMaterials.BLACKLGHT, 5, 3f, new FabricItemSettings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(BlackLightMod.MOD_ID, name), item);
    }

    public static void addItemsToGroup(){
        addItemsToGroup(ModItemGroup.BLACKLIGHT, BLACKLIGHT_HAT);
        addItemsToGroup(ModItemGroup.BLACKLIGHT, BLACKLIGHT_JACKET);
        addItemsToGroup(ModItemGroup.BLACKLIGHT, BLACKLIGHT_TROUSER);
        addItemsToGroup(ModItemGroup.BLACKLIGHT, BLACKLIGHT_SHOES);
        addItemsToGroup(ModItemGroup.BLACKLIGHT, BLACKLIGHT_SWORD);
        addItemsToGroup(ModItemGroup.BLACKLIGHT, BLACKLIGHT);
        addItemsToGroup(ModItemGroup.BLACKLIGHT, RAW_BLACKLIGHT);
        addItemsToGroup(ModItemGroup.BLACKLIGHT, FIGGY_PUDDING);
        addItemsToGroup(ModItemGroup.BLACKLIGHT, BLACKLIGHT_SLURRY);
    }

    public static void addItemsToGroup(ItemGroup group, Item item){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems(){
        BlackLightMod.LOGGER.info("Registering Mod Items for "+ BlackLightMod.MOD_ID);
        addItemsToGroup();
    }

}
