package com.phdsteve.roddenberry.item.tools;

import com.phdsteve.roddenberry.creativetab.CreativeTabRoddenberry;
import net.minecraft.item.ItemPickaxe;

public class ToolPickaxeDuranium extends ItemPickaxe
{
    public ToolPickaxeDuranium(ToolMaterial toolMaterial)
    {
        super(toolMaterial);
        this.setCreativeTab(CreativeTabRoddenberry.RODDENBERRY_TAB);
        this.setUnlocalizedName("duraniumPickaxe");
    }
}
