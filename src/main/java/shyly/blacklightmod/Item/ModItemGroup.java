package shyly.blacklightmod.Item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import shyly.blacklightmod.BlackLightMod;

public class ModItemGroup {
    public static ItemGroup BLACKLIGHT;

    public static void registerItemGroups(){

        BLACKLIGHT = FabricItemGroup.builder(new Identifier(BlackLightMod.MOD_ID, "blacklight"))
                .displayName(Text.translatable("itemgroup.blacklight"))
                .icon(()-> new ItemStack(ModItems.BLACKLIGHT)).build();
    }
}
