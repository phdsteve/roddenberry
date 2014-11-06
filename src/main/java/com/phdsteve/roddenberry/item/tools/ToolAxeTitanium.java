package com.phdsteve.roddenberry.item.tools;

import com.phdsteve.roddenberry.creativetab.CreativeTabRoddenberry;
import net.minecraft.item.ItemAxe;

public class ToolAxeTitanium extends ItemAxe
{
    public ToolAxeTitanium(ToolMaterial toolMaterial)
    {
        super(toolMaterial);
        this.setCreativeTab(CreativeTabRoddenberry.RODDENBERRY_TAB);
        this.setUnlocalizedName("titaniumAxe");
        this.setTextureName("roddenberry:titaniumAxe");
    }
}
