package com.phdsteve.roddenberry.block.ore;

import com.phdsteve.roddenberry.block.BlockRoddenberry;

public class OreTitanium extends BlockRoddenberry
{
    public OreTitanium()
    {
        super();
        this.setBlockName("titaniumOre");
        this.setBlockTextureName("roddenberry:oreTitanium");

        this.setHarvestLevel("pickaxe", 3);
        this.setHardness(3.0F);
    }

    public static int numberPerChunk = 6;
    public static int maxGenHeight = 48;
    public static int minGenHeight = 16;
    public static int blocksPerVein = 7;
}
