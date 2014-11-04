package com.phdsteve.roddenberry.item;

import com.phdsteve.roddenberry.creativetab.CreativeTabRoddenberry;
import net.minecraft.item.Item;

public class ItemRoddenberry extends Item
{
    public ItemRoddenberry()
    {
        super();
        this.setCreativeTab(CreativeTabRoddenberry.RODDENBERRY_TAB);
        this.setMaxStackSize(64);
    }
}
