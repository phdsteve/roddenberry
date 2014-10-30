package com.phdsteve.roddenberry.block;

import com.phdsteve.roddenberry.creativetab.CreativeTabRoddenberry;
import com.phdsteve.roddenberry.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockRoddenberry extends Block
{
    public BlockRoddenberry()
    {
        this(Material.rock);
        this.setCreativeTab(CreativeTabRoddenberry.RODDENBERRY_TAB);
    }

    public BlockRoddenberry(Material material)
    {
        super(material);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
