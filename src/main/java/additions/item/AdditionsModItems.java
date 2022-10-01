package additions.item;

import additions.AdditionsMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AdditionsModItems {
   public static final Item EDIBLE_FISH = new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.ROTTEN_FLESH));
   // TODO - Create custom food component for fish in future?

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(AdditionsMod.MOD_ID, "edible_fish"), EDIBLE_FISH);
    }
}
