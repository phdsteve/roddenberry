package com.phdsteve.roddenberry.creativetab;

import com.phdsteve.roddenberry.init.ModItems;
import com.phdsteve.roddenberry.reference.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabRoddenberry
{
    public static final CreativeTabs RODDENBERRY_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.starfleetInsignia;
        }
    };
}
