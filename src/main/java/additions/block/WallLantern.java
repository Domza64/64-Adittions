package additions.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.LanternBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldView;

public class WallLantern extends Block {

    protected static final VoxelShape SHAPE = VoxelShapes.union(Block.createCuboidShape(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), Block.createCuboidShape(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

    public WallLantern(Settings settings) {
        super(settings);
    }

//    @Override
//    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
//        Direction direction = Direction.fromVector(pos);
//        Direction direction = LanternBlock.attachedDirection(state).getOpposite();
//        return !Block.sideCoversSmallSquare(world, pos.offset(direction), direction);
//    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}
