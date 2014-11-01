package com.phdsteve.roddenberry.init;

import com.phdsteve.roddenberry.armor.StarfleetUniform;
import com.phdsteve.roddenberry.creativetab.CreativeTabRoddenberry;
import com.phdsteve.roddenberry.item.ItemRoddenberry;
import com.phdsteve.roddenberry.proxy.ClientProxy;
import com.phdsteve.roddenberry.reference.Reference;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class ModArmors
{
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static ClientProxy proxy;

    // Armor materials
     public static ItemArmor.ArmorMaterial UNIFORM = EnumHelper.addArmorMaterial("UNIFORM", 99999, new int[]{0,2,1,1}, 0);

    // Starfleet Uniforms
    public static ItemRoddenberry starfleetRedTunic = (ItemRoddenberry) new StarfleetUniform(UNIFORM, proxy.addArmor("starfleetRedUniform"), 1).setCreativeTab(CreativeTabRoddenberry.RODDENBERRY_TAB).setUnlocalizedName("starfleetRedTunic");

    public static void init()
    {
        GameRegistry.registerItem(starfleetRedTunic, "starfleetRedTunic");
    }
}
