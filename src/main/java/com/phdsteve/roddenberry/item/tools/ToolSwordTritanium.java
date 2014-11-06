package com.phdsteve.roddenberry.item.tools;

import com.phdsteve.roddenberry.creativetab.CreativeTabRoddenberry;
import net.minecraft.item.ItemSword;

public class ToolSwordTritanium extends ItemSword
{
    public ToolSwordTritanium(ToolMaterial toolMaterial)
    {
        super(toolMaterial);
        this.setCreativeTab(CreativeTabRoddenberry.RODDENBERRY_TAB);
        this.setUnlocalizedName("tritaniumSword");
        this.setTextureName("roddenberry:tritaniumSword");
    }
}
