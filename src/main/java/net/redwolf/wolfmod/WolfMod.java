package net.redwolf.wolfmod;

import net.fabricmc.api.ModInitializer;
import net.redwolf.wolfmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WolfMod implements ModInitializer {
	public static final String MOD_ID = "wolfmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

	}
}
