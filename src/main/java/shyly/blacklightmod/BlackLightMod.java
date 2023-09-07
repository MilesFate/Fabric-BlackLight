package shyly.blacklightmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import shyly.blacklightmod.Item.ModItemGroup;
import shyly.blacklightmod.Item.ModItems;
import shyly.blacklightmod.block.ModBlocks;
import shyly.blacklightmod.world.gen.ModWorldGeneration;

public class BlackLightMod implements ModInitializer {
	public static final String MOD_ID = "blacklightmod";
	public static final Logger LOGGER = LoggerFactory.getLogger("blacklightmod");

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModWorldGeneration.generateModWorldGen();

	}
}