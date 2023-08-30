package shyly.mymod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class myMod implements ModInitializer {
    public static final String MOD_ID = "mymod";
	public static final Logger LOGGER = LoggerFactory.getLogger("mymod");

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
	}
}