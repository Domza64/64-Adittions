package additions.item.items;

import additions.item.AdditionsModItems;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class OxygenMonitor extends Item {
    public OxygenMonitor() {
        super(new FabricItemSettings().group(ItemGroup.COMBAT).maxCount(1));
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (world.isClient) {
            return;
        }
        if (entity.isPlayer()) {
            PlayerEntity player = (PlayerEntity) entity;
            if (player.getStackInHand(Hand.OFF_HAND).isOf(AdditionsModItems.OXYGEN_MONITOR) ||
                    (player.getStackInHand(Hand.MAIN_HAND).isOf(AdditionsModItems.OXYGEN_MONITOR))) {
                ItemStack itemStack = player.getInventory().getArmorStack(2);
                if (itemStack.isOf(AdditionsModItems.OXYGEN_TANK)) {
                    int oxygenLeft = AdditionsModItems.OXYGEN_TANK.getMaxCount() - itemStack.getDamage();
                    // TODO - Make Oxygen tank 10,000 durability and devide with 100 to display in % oxygen left??
                    player.sendMessage(Text.literal("Oxygen left: " + oxygenLeft), true);
                    // TODO - Use mixin to add custom display of oxygen to HUD
                }
            }
        }
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.literal("Hold in hand and it will display level of oxygen from equiped tank"));
        // TODO - Replace with TranslatableText
    }
}
