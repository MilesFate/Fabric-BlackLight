package shyly.mymod.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import shyly.mymod.Item.ModItems;
import shyly.mymod.block.ModBlocks;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.CITRINE_BLOCK);
        addDrop(ModBlocks.CITRINE_ORE, oreDrops(ModBlocks.CITRINE_ORE, ModItems.RAW_CITRINE));
        addDrop(ModBlocks.DEEPSLATE_CITRINE_ORE, oreDrops(ModBlocks.DEEPSLATE_CITRINE_ORE, ModItems.RAW_CITRINE));

        addDrop(ModBlocks.BLACKLIGHT_BLOCK);
        addDrop(ModBlocks.BLACKLIGHT_ORE,
                oreDrops(ModBlocks.BLACKLIGHT_ORE, ModItems.RAW_BLACKLIGHT));
        addDrop(ModBlocks.DEEPSLATE_BLACKLIGHT_ORE,
                oreDrops(ModBlocks.DEEPSLATE_BLACKLIGHT_ORE, ModItems.RAW_BLACKLIGHT));
    }
}
