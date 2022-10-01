package additions;

import additions.block.AdditionsModBlocks;
import additions.item.AdditionsModItems;
import net.fabricmc.api.ModInitializer;

public class AdditionsMod implements ModInitializer {
	public static final String MOD_ID = "additions_mod";

	@Override
	public void onInitialize() {
		AdditionsModItems.registerItems();
		AdditionsModBlocks.registerBlocks();
		LootTableModifiers.registerModifiedLootTables();
	}
}
