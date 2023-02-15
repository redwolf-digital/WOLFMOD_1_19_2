package net.redwolf.wolfmod;

import net.fabricmc.api.ModInitializer;
import net.redwolf.wolfmod.block.ModBlocks;
import net.redwolf.wolfmod.fluid.ModFluids;
import net.redwolf.wolfmod.util.ModFlammableBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WolfMod implements ModInitializer {
	public static final String MOD_ID = "wolfmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlock();
		ModFlammableBlocks.registerFlammableBlocks();
		ModFluids.register();

	}
}
