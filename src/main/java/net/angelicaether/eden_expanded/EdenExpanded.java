package net.angelicaether.eden_expanded;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EdenExpanded implements ModInitializer {
	public static final String MOD_ID = "eden_expanded";
    public static final Logger LOGGER = LoggerFactory.getLogger("MOD_ID");

	@Override
	public void onInitialize() {
		LOGGER.info("AETHER WAS HERE!");
	}
}