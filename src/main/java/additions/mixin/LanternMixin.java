package additions.mixin;

import additions.block.AdditionsModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.LanternBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;


@Mixin(LanternBlock.class)
public class LanternMixin {
    @Inject(method = "canPlaceAt", at = @At("RETURN"))
    public void canPlaceAt(BlockState state, WorldView world, BlockPos pos, CallbackInfoReturnable<Boolean> info) {
        if (!info.getReturnValue()) {
            world.getChunk(pos).setBlockState(pos, AdditionsModBlocks.WALL_LANTERN.getDefaultState(), true);
        }
    }
}
