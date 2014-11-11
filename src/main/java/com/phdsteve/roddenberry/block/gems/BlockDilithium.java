package com.phdsteve.roddenberry.block.gems;

import com.phdsteve.roddenberry.block.BlockRoddenberry;

public class BlockDilithium extends BlockRoddenberry
{
    public BlockDilithium()
    {
        super();
        this.setBlockName("dilithiumBlock");
        this.setBlockTextureName("roddenberry:blockDilithium");
        this.setHarvestLevel("pickaxe", 3);
        this.setHardness(5.0F);
        this.setLightLevel(0.6F);
    }
}
