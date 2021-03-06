package org.avp.block;

import org.avp.tile.TileEntitySatelliteDish;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.world.World;

public class BlockSatelliteDish extends Block
{
    public BlockSatelliteDish()
    {
        super(Material.IRON);
        this.setTickRandomly(true);
    }
    
    @Override
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }
    
    @Override
    public EnumBlockRenderType getRenderType(IBlockState state)
    {
        return EnumBlockRenderType.INVISIBLE;
    }

    @Override
    public TileEntity createTileEntity(World world, IBlockState state)
    {
        return new TileEntitySatelliteDish();
    }

    @Override
    public boolean hasTileEntity(IBlockState state)
    {
        return true;
    }
}
