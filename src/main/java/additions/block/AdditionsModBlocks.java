package additions.block;

import additions.AdditionsMod;
import additions.block.blocks.WallLantern;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AdditionsModBlocks {
    public static final Block WALL_LANTERN = new WallLantern(AbstractBlock.Settings.of(Material.METAL).requiresTool().strength(3.5f).sounds(BlockSoundGroup.LANTERN).luminance(state -> 15).nonOpaque());
    public static final Block BAERREL = new BarrelBlock(AbstractBlock.Settings.of(Material.WOOD).strength(2.5f).sounds(BlockSoundGroup.WOOD));

    public static void registerBlocks() {
        // Blocks
        Registry.register(Registry.BLOCK, new Identifier(AdditionsMod.MOD_ID, "wall_lantern"), WALL_LANTERN);
        Registry.register(Registry.BLOCK, new Identifier(AdditionsMod.MOD_ID, "baerrel"), BAERREL);

        // Block Items
        Registry.register(Registry.ITEM, new Identifier(AdditionsMod.MOD_ID, "baerrel"), new BlockItem(BAERREL, new FabricItemSettings().group(ItemGroup.MISC)));


        // Temp, only for development and testing
        Registry.register(Registry.ITEM, new Identifier(AdditionsMod.MOD_ID, "wall_lantern"), new BlockItem(WALL_LANTERN, new FabricItemSettings().group(ItemGroup.MISC)));
    }
}
