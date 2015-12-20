package com.phdsteve.roddenberry.block.fuel;

import com.phdsteve.roddenberry.block.BlockRoddenberry;

public class BlockDolamideRefined extends BlockRoddenberry {

    public BlockDolamideRefined()
    {
        super();
        this.setBlockName("dolamideBlock");
        this.setBlockTextureName("roddenberry:blockDolamide");

        this.setHarvestLevel("pickaxe", 2);
        this.setHardness(1.5F);
    }
}
