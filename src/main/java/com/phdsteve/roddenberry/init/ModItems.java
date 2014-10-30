package com.phdsteve.roddenberry.init;

import com.phdsteve.roddenberry.item.ItemMapleLeaf;
import com.phdsteve.roddenberry.item.ItemRoddenberry;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
     public static final ItemRoddenberry mapleLeaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}
