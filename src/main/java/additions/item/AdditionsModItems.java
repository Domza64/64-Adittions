package additions.item;

import additions.AdditionsMod;
import additions.item.items.OxygenMask;
import additions.item.items.OxygenTank;
import net.fabricmc.fabric.api.item.v1.EquipmentSlotProvider;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AdditionsModItems {
    // TODO - Create custom food component for fish in future?
   public static final Item EDIBLE_FISH = new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.ROTTEN_FLESH));
   public static final Item OXYGEN_TANK = new OxygenTank();
    public static final Item OXYGEN_MASK = new OxygenMask();

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(AdditionsMod.MOD_ID, "edible_fish"), EDIBLE_FISH);
        Registry.register(Registry.ITEM, new Identifier(AdditionsMod.MOD_ID, "oxygen_tank"), OXYGEN_TANK);
        Registry.register(Registry.ITEM, new Identifier(AdditionsMod.MOD_ID, "oxygen_mask"), OXYGEN_MASK);
    }
}
