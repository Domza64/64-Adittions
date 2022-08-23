package additions.mixin;

import additions.AdditionsMod;
import net.minecraft.block.Block;
import net.minecraft.block.LanternBlock;
import net.minecraft.block.Waterloggable;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class AdditionsModMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		AdditionsMod.LOGGER.info("This line is printed by an 64 Additions mod mixin!");
	}
}
