package com.phdsteve.roddenberry.block.metals;

import com.phdsteve.roddenberry.block.BlockRoddenberry;

public class BlockLatinum extends BlockRoddenberry
{
    public BlockLatinum()
    {
        super();
        this.setBlockName("latinumBlock");
        this.setBlockTextureName("roddenberry:blockLatinum");
        this.setHarvestLevel("pickaxe", 2);
        this.setHardness(5.0F);
    }
}
