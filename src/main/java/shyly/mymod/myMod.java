package shyly.mymod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import shyly.mymod.Item.ModItemGroup;
import shyly.mymod.Item.ModItems;

public class myMod implements ModInitializer {
	public static final String MOD_ID = "mymod";
	public static final Logger LOGGER = LoggerFactory.getLogger("mymod");

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
	}
}