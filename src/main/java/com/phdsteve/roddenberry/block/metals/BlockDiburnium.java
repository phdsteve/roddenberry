package com.phdsteve.roddenberry.block.metals;

import com.phdsteve.roddenberry.block.BlockRoddenberry;

public class BlockDiburnium extends BlockRoddenberry
{
    public BlockDiburnium()
    {
        super();
        this.setBlockName("diburniumBlock");
        this.setBlockTextureName("roddenberry:blockDiburnium");
        this.setHarvestLevel("pickaxe", 4);
        this.setHardness(8.0F);
    }
}
