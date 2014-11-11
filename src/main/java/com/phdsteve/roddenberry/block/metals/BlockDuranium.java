package com.phdsteve.roddenberry.block.metals;

import com.phdsteve.roddenberry.block.BlockRoddenberry;

public class BlockDuranium extends BlockRoddenberry
{
    public BlockDuranium()
    {
        super();
        this.setBlockName("duraniumBlock");
        this.setBlockTextureName("roddenberry:blockDuranium");
        this.setHarvestLevel("pickaxe", 3);
        this.setHardness(3.0F);
    }
}
