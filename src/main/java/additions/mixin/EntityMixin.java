package additions.mixin;

import additions.item.AdditionsModItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Entity.class)
public abstract class EntityMixin {

    @Inject(method = "setAir", at = @At("HEAD"), cancellable = true)
    public void setAir(CallbackInfo ci) {
        Entity entity = ((Entity)(Object)this);
        if (entity.isPlayer()) {
            PlayerEntity player = (PlayerEntity) entity;
            ItemStack stack = player.getInventory().getArmorStack(2);
            if (stack.isOf(AdditionsModItems.OXYGEN_TANK)) {
                if (player.isSubmergedInWater() && player.getInventory().getArmorStack(3).isOf(AdditionsModItems.OXYGEN_MASK)) {
                    if (stack.getDamage() < AdditionsModItems.OXYGEN_TANK.getMaxDamage() - 1) {
                        stack.damage(1, player, (e) -> {});
                        ci.cancel();
                    }
                }
            }
        }
    }
}