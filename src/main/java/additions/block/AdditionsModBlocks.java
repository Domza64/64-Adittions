package additions.block;

import additions.AdditionsMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AdditionsModBlocks {
    public static final Block WALL_LANTERN = new WallLantern(AbstractBlock.Settings.of(Material.METAL).requiresTool().strength(3.5f).sounds(BlockSoundGroup.LANTERN).luminance(state -> 15).nonOpaque());

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(AdditionsMod.MOD_ID, "wall_lantern"), WALL_LANTERN);
        Registry.register(Registry.ITEM, new Identifier(AdditionsMod.MOD_ID, "wall_lantern"), new BlockItem(WALL_LANTERN, new FabricItemSettings().group(ItemGroup.MISC)));
    }
}
