package com.phdsteve.roddenberry.block.ore;

import com.phdsteve.roddenberry.block.BlockRoddenberry;
import com.phdsteve.roddenberry.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

import java.util.Random;

public class OreTritanium extends BlockRoddenberry
{
    public OreTritanium()
    {
        super();
        this.setBlockName("tritaniumOre");
        this.setBlockTextureName("roddenberry:oreTritanium");

        this.setHardness(1.0F);
        this.setStepSound(Block.soundTypeStone);
    }

    public Item getItemDropped(int metadata, Random random, int fortune)
    {
        return Item.getItemFromBlock(ModBlocks.oreTritanium);
    }
}
