package com.phdsteve.roddenberry.block.metals;

import com.phdsteve.roddenberry.block.BlockRoddenberry;

public class BlockTritanium extends BlockRoddenberry
{
    public BlockTritanium()
    {
        super();
        this.setBlockName("tritaniumBlock");
        this.setBlockTextureName("roddenberry:blockTritanium");
        this.setHarvestLevel("pickaxe", 4);
        this.setHardness(8.0F);
    }
}
