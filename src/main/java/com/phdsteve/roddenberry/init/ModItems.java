package com.phdsteve.roddenberry.init;

import com.phdsteve.roddenberry.item.ItemMapleLeaf;
import com.phdsteve.roddenberry.item.ItemRoddenberry;
import com.phdsteve.roddenberry.item.ItemStarfleetInsignia;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemRoddenberry starfleetInsignia = new ItemStarfleetInsignia();
    public static final ItemRoddenberry mapleLeaf = new ItemMapleLeaf();

    //Game Registry
    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
        GameRegistry.registerItem(starfleetInsignia, "starfleetInsignia");
    }
}
