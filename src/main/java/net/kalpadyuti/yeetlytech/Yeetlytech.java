package net.kalpadyuti.yeetlytech;

import net.fabricmc.api.ModInitializer;
import net.kalpadyuti.yeetlytech.block.ModBlocks;
import net.kalpadyuti.yeetlytech.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Yeetlytech implements ModInitializer {
	public static final String MOD_ID = "yeetlytech";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
