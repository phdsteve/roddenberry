package com.phdsteve.roddenberry.item.tools;

import com.phdsteve.roddenberry.creativetab.CreativeTabRoddenberry;
import net.minecraft.item.ItemPickaxe;

public class ToolPickaxeTitanium extends ItemPickaxe
{
    public ToolPickaxeTitanium(ToolMaterial toolMaterial)
    {
        super(toolMaterial);
        this.setCreativeTab(CreativeTabRoddenberry.RODDENBERRY_TAB);
        this.setUnlocalizedName("titaniumPickaxe");
        this.setTextureName("roddenberry:titaniumPickaxe");
    }
}
