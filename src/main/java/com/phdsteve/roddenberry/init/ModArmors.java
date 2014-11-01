package com.phdsteve.roddenberry.init;

import com.phdsteve.roddenberry.armor.StarfleetUniform;
import com.phdsteve.roddenberry.creativetab.CreativeTabRoddenberry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class ModArmors
{
    // Armor materials
     public static ItemArmor.ArmorMaterial UNIFORM = EnumHelper.addArmorMaterial("UNIFORM", 99999, new int[]{0,2,1,1}, 0);

    // Starfleet Uniforms
    public static StarfleetUniform starfleetRedTunic = (StarfleetUniform) new StarfleetUniform(UNIFORM, 4, 1).setCreativeTab(CreativeTabRoddenberry.RODDENBERRY_TAB).setUnlocalizedName("starfleetRedTunic");
    public static StarfleetUniform starfleetYellowTunic = (StarfleetUniform) new StarfleetUniform(UNIFORM, 4, 1).setCreativeTab(CreativeTabRoddenberry.RODDENBERRY_TAB).setUnlocalizedName("starfleetYellowTunic");
    public static StarfleetUniform starfleetBlueTunic = (StarfleetUniform) new StarfleetUniform(UNIFORM, 4, 1).setCreativeTab(CreativeTabRoddenberry.RODDENBERRY_TAB).setUnlocalizedName("starfleetBlueTunic");
    public static StarfleetUniform starfleetBlackPants =(StarfleetUniform) new StarfleetUniform(UNIFORM, 4, 2).setCreativeTab(CreativeTabRoddenberry.RODDENBERRY_TAB).setUnlocalizedName("starfleetBlackPants");
    public static StarfleetUniform starfleetBlackBoots = (StarfleetUniform) new StarfleetUniform(UNIFORM, 4, 3).setCreativeTab(CreativeTabRoddenberry.RODDENBERRY_TAB).setUnlocalizedName("starfleetBlackBoots");

    public static void init()
    {
        GameRegistry.registerItem(starfleetRedTunic, "starfleetRedTunic");
        GameRegistry.registerItem(starfleetYellowTunic, "starfleetYellowTunic");
        GameRegistry.registerItem(starfleetBlueTunic, "starfleetBlueTunic");
        GameRegistry.registerItem(starfleetBlackPants, "starfleetBlackPants");
        GameRegistry.registerItem(starfleetBlackBoots, "starfleetBlackBoots");
    }
}
