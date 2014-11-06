package com.phdsteve.roddenberry.item.tools;

import com.phdsteve.roddenberry.creativetab.CreativeTabRoddenberry;
import net.minecraft.item.ItemPickaxe;

public class ToolPickaxeTritanium extends ItemPickaxe
{
    public ToolPickaxeTritanium(ToolMaterial toolMaterial)
    {
        super(toolMaterial);
        this.setCreativeTab(CreativeTabRoddenberry.RODDENBERRY_TAB);
        this.setUnlocalizedName("tritaniumPickaxe");
        this.setTextureName("roddenberry:tritaniumPickaxe");
    }
}
