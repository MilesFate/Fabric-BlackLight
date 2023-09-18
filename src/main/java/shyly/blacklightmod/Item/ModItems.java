package shyly.blacklightmod.Item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import shyly.blacklightmod.BlackLightMod;
import shyly.blacklightmod.Item.custom.*;
import shyly.blacklightmod.Item.materials.ModArmorMaterials;
import shyly.blacklightmod.Item.materials.ModToolsMaterials;
import shyly.blacklightmod.sound.ModSounds;

public class ModItems {
    public static final Item BLACKLIGHT = registerItem("blacklight", new Item(new FabricItemSettings()));
    public static final Item RAW_BLACKLIGHT = registerItem("raw_blacklight", new Item(new FabricItemSettings()));
    public static final Item FIGGY_PUDDING = registerItem("figgy_pudding", new Item(new FabricItemSettings()));
    public static final Item BLACKLIGHT_SLURRY = registerItem("blacklight_slurry", new Item(new FabricItemSettings()));
    public static final Item BLACKLIGHT_HAT = registerItem("blacklight_hat", new BlacklightArmorItem(ModArmorMaterials.BLACKLIGHT, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item BLACKLIGHT_JACKET = registerItem("blacklight_jacket", new BlacklightArmorItem(ModArmorMaterials.BLACKLIGHT, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item BLACKLIGHT_TROUSER = registerItem("blacklight_trouser", new BlacklightArmorItem(ModArmorMaterials.BLACKLIGHT, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item BLACKLIGHT_SHOES = registerItem("blacklight_shoes", new BlacklightArmorItem(ModArmorMaterials.BLACKLIGHT, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item BLACKLIGHT_SWORD = registerItem("blacklight_sword", new BlackLightSwordItem(ModToolsMaterials.BLACKLGHT, 16, 3f, new FabricItemSettings()));
    public static final Item BLACKLIGHT_SHOVEL = registerItem("blacklight_shovel", new BlackLightShoveltem(ModToolsMaterials.BLACKLGHT, 1, 3f, new FabricItemSettings()));
    public static final Item BLACKLIGHT_HOE = registerItem("blacklight_hoe", new BlackLightHoeItem(ModToolsMaterials.BLACKLGHT, 1, 3f, new FabricItemSettings()));
    public static final Item BLACKLIGHT_AXE = registerItem("blacklight_axe", new BlackLightAxeItem(ModToolsMaterials.BLACKLGHT, 5, 3f, new FabricItemSettings()));
    public static final Item BLACKLIGHT_PICKAXE = registerItem("blacklight_pickaxe", new BlackLightPickaxeItem(ModToolsMaterials.BLACKLGHT, 1, 3f, new FabricItemSettings()));
    public static final Item GLIDER = registerItem("glider", new MusicDiscItem(6, ModSounds.GLIDER, new FabricItemSettings().maxCount(1),132));
    public static final Item DRUTUTT = registerItem("drututt", new MusicDiscItem(6, ModSounds.DRUTUTT, new FabricItemSettings().maxCount(1),208));
    public static final Item REST = registerItem("rest", new MusicDiscItem(6, ModSounds.REST, new FabricItemSettings().maxCount(1),153));
    public static final Item THEFEELS = registerItem("thefeels", new MusicDiscItem(6, ModSounds.THEFEELS, new FabricItemSettings().maxCount(1),230));
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(BlackLightMod.MOD_ID, name), item);
    }

    public static void addItemsToGroup(){
        addItemsToGroup(ModItemGroup.BLACKLIGHT, BLACKLIGHT);
        addItemsToGroup(ModItemGroup.BLACKLIGHT, RAW_BLACKLIGHT);
        addItemsToGroup(ModItemGroup.BLACKLIGHT, FIGGY_PUDDING);
        addItemsToGroup(ModItemGroup.BLACKLIGHT, BLACKLIGHT_SLURRY);
        addItemsToGroup(ModItemGroup.BLACKLIGHT, BLACKLIGHT_HAT);
        addItemsToGroup(ModItemGroup.BLACKLIGHT, BLACKLIGHT_JACKET);
        addItemsToGroup(ModItemGroup.BLACKLIGHT, BLACKLIGHT_TROUSER);
        addItemsToGroup(ModItemGroup.BLACKLIGHT, BLACKLIGHT_SHOES);
        addItemsToGroup(ModItemGroup.BLACKLIGHT, BLACKLIGHT_SWORD);
        addItemsToGroup(ModItemGroup.BLACKLIGHT, BLACKLIGHT_SHOVEL);
        addItemsToGroup(ModItemGroup.BLACKLIGHT, BLACKLIGHT_HOE);
        addItemsToGroup(ModItemGroup.BLACKLIGHT, BLACKLIGHT_AXE);
        addItemsToGroup(ModItemGroup.BLACKLIGHT, BLACKLIGHT_PICKAXE);
        addItemsToGroup(ModItemGroup.BLACKLIGHT, GLIDER);
        addItemsToGroup(ModItemGroup.BLACKLIGHT, DRUTUTT);
        addItemsToGroup(ModItemGroup.BLACKLIGHT, REST);
        addItemsToGroup(ModItemGroup.BLACKLIGHT, THEFEELS);
    }

    public static void addItemsToGroup(ItemGroup group, Item item){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems(){
        BlackLightMod.LOGGER.info("Registering Mod Items for "+ BlackLightMod.MOD_ID);
        addItemsToGroup();
    }

}
