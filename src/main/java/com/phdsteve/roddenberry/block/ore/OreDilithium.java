package com.phdsteve.roddenberry.block.ore;

import com.phdsteve.roddenberry.block.BlockRoddenberry;
import com.phdsteve.roddenberry.init.ModItems;
import net.minecraft.item.Item;

import java.util.Random;

public class OreDilithium extends BlockRoddenberry
{
    public OreDilithium()
    {
        super();
        this.setBlockName("dilithiumOre");
        this.setBlockTextureName("roddenberry:oreDilithium");

        this.setHarvestLevel("pickaxe", 3);
        this.setHardness(5.0F);
        this.setLightLevel(0.4F);
    }

    public Item getItemDropped(int metadata, Random random, int fortune)
    {
        return ModItems.gemDilithium;
    }

    @Override
    public int quantityDropped(int meta, int fortune, Random random)
    {
        return 1 + fortune;
    }

    public static int numberPerChunk = 1;
    public static int maxGenHeight = 16;
    public static int minGenHeight = 0;
    public static int blocksPerVein = 4;
}
