package com.phdsteve.roddenberry.block.metals;

import com.phdsteve.roddenberry.block.BlockRoddenberry;

public class BlockCopper extends BlockRoddenberry
{
    public BlockCopper()
    {
        super();
        this.setBlockName("copperBlock");
        this.setBlockTextureName("roddenberry:blockCopper");
        this.setHarvestLevel("pickaxe", 2);
        this.setHardness(3.0F);
    }
}
