package com.phdsteve.roddenberry.item.tools;

import com.phdsteve.roddenberry.creativetab.CreativeTabRoddenberry;
import net.minecraft.item.ItemPickaxe;

public class ToolPickaxeCopper extends ItemPickaxe
{
    public ToolPickaxeCopper(ToolMaterial toolMaterial)
    {
        super(toolMaterial);
        this.setCreativeTab(CreativeTabRoddenberry.RODDENBERRY_TAB);
        this.setUnlocalizedName("copperPickaxe");
        this.setTextureName("roddenberry:copperPickaxe");
    }
}
