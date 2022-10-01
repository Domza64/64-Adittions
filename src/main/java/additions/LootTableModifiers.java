package additions;

import additions.item.AdditionsModItems;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.util.Identifier;

public class LootTableModifiers {
    private static final Identifier FISHING_FISH_ID = new Identifier("minecraft", "gameplay/fishing/fish");

    // TODO - Fix this, it gives edible fish every time, it should only give it alone few % of times and nothing else. Currently gives something it should + edible fish so fix that.
    public static void registerModifiedLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if(FISHING_FISH_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .with(ItemEntry.builder(AdditionsModItems.EDIBLE_FISH));

                tableBuilder.pool(poolBuilder);
            }
        });
    }
}
