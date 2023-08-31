package shyly.mymod.Item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import shyly.mymod.myMod;

public class ModItemGroup {
    public static ItemGroup CITRINE;
    public static ItemGroup DRIP;

    public static void registerItemGroups(){
        CITRINE = FabricItemGroup.builder(new Identifier(myMod.MOD_ID, "citrine"))
                .displayName(Text.translatable("itemgroup.citrine"))
                .icon(() -> new ItemStack(ModItems.CITRINE)).build();

        DRIP = FabricItemGroup.builder(new Identifier(myMod.MOD_ID, "drip"))
                .displayName(Text.translatable("itemgroup.drip"))
                .icon(()-> new ItemStack(ModItems.RAW_CITRINE)).build();
    }

}
