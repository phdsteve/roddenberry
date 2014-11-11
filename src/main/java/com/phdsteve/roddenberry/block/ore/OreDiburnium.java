package com.phdsteve.roddenberry.block.ore;

import com.phdsteve.roddenberry.block.BlockRoddenberry;

public class OreDiburnium extends BlockRoddenberry
{
    public OreDiburnium()
    {
        super();
        this.setBlockName("diburniumOre");
        this.setBlockTextureName("roddenberry:oreDiburnium");

        this.setHarvestLevel("pickaxe", 5);
        this.setHardness(10.0F);
    }

    public static int numberPerChunk = 3;
    public static int maxGenHeight = 48;
    public static int minGenHeight = 0;
    public static int blocksPerVein = 4;
}
