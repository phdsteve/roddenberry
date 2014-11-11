package com.phdsteve.roddenberry.block.ore;

import com.phdsteve.roddenberry.block.BlockRoddenberry;

public class OreTritanium extends BlockRoddenberry
{
    public OreTritanium()
    {
        super();
        this.setBlockName("tritaniumOre");
        this.setBlockTextureName("roddenberry:oreTritanium");

        this.setHarvestLevel("pickaxe", 5);
        this.setHardness(10.0F);
    }

    public static int numberPerChunk = 2;
    public static int maxGenHeight = 36;
    public static int minGenHeight = 12;
    public static int blocksPerVein = 4;
}
