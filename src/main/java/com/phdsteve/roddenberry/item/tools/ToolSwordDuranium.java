package com.phdsteve.roddenberry.item.tools;

import com.phdsteve.roddenberry.creativetab.CreativeTabRoddenberry;
import net.minecraft.item.ItemSword;

public class ToolSwordDuranium extends ItemSword
{
    public ToolSwordDuranium(ToolMaterial toolMaterial)
    {
        super(toolMaterial);
        this.setCreativeTab(CreativeTabRoddenberry.RODDENBERRY_TAB);
        this.setUnlocalizedName("duraniumSword");
        this.setTextureName("roddenberry:duraniumSword");
    }
}
