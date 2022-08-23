package additions;

import additions.block.AdditionsModBlocks;
import additions.item.AdditionsModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdditionsMod implements ModInitializer {
	public static final String MOD_ID = "additions_mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		AdditionsModItems.registerItems();
		AdditionsModBlocks.registerBlocks();
		LOGGER.info("Hello Fabric world!");

		// TODO - Modify lantern block with mixin so when it is placed on walls it places wall lantern

	}
}
