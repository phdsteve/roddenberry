package com.phdsteve.roddenberry.init;

import com.phdsteve.roddenberry.block.BlockFlag;
import com.phdsteve.roddenberry.block.BlockRoddenberry;
import com.phdsteve.roddenberry.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static BlockRoddenberry flag = new BlockFlag();

    public static void init()
    {
        GameRegistry.registerBlock(flag, "flag");
    }
}
