package shyly.blacklightmod.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import shyly.blacklightmod.Item.ModItems;
import shyly.blacklightmod.block.ModBlocks;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLACKLIGHT_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLACKLIGHT_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_BLACKLIGHT_ORE);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.BLACKLIGHT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_BLACKLIGHT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLACKLIGHT_HAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLACKLIGHT_JACKET, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLACKLIGHT_TROUSER, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLACKLIGHT_SHOES, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLACKLIGHT_SWORD, Models.GENERATED);
        itemModelGenerator.register(ModItems.FIGGY_PUDDING, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLACKLIGHT_SLURRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLACKLIGHT_AXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLACKLIGHT_HOE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLACKLIGHT_SHOVEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLACKLIGHT_PICKAXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GLIDER,Models.GENERATED);
        itemModelGenerator.register(ModItems.DRUTUTT,Models.GENERATED);
        itemModelGenerator.register(ModItems.REST,Models.GENERATED);
        itemModelGenerator.register(ModItems.THEFEELS,Models.GENERATED);
    }
}
