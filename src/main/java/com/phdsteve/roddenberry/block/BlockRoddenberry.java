package com.phdsteve.roddenberry.block;

import com.phdsteve.roddenberry.creativetab.CreativeTabRoddenberry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

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
}
