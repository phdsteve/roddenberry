package com.phdsteve.roddenberry.block.metals;

import com.phdsteve.roddenberry.block.BlockRoddenberry;

public class BlockTitanium extends BlockRoddenberry
{
    public BlockTitanium()
    {
        super();
        this.setBlockName("titaniumBlock");
        this.setBlockTextureName("roddenberry:blockTitanium");
        this.setHarvestLevel("pickaxe", 3);
        this.setHardness(3.0F);
    }
}
