package shyly.blacklightmod.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import shyly.blacklightmod.Item.ModItems;
import shyly.blacklightmod.block.ModBlocks;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.BLACKLIGHT_BLOCK);
        addDrop(ModBlocks.BLACKLIGHT_ORE,
                oreDrops(ModBlocks.BLACKLIGHT_ORE, ModItems.RAW_BLACKLIGHT));
        addDrop(ModBlocks.DEEPSLATE_BLACKLIGHT_ORE,
                oreDrops(ModBlocks.DEEPSLATE_BLACKLIGHT_ORE, ModItems.RAW_BLACKLIGHT));
    }
}
