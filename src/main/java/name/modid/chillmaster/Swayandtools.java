package name.modid.chillmaster;

import name.modid.chillmaster.Items.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Swayandtools implements ModInitializer {
		public static final String MOD_ID = "Swayandtools";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

		@Override
		public void onInitialize() {
			ModItems.registerModItems();
	}
}