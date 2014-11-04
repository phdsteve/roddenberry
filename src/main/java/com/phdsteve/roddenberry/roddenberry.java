package com.phdsteve.roddenberry;

import com.phdsteve.roddenberry.client.handler.KeyInputEventHandler;
import com.phdsteve.roddenberry.handler.ConfigurationHandler;
import com.phdsteve.roddenberry.init.*;
import com.phdsteve.roddenberry.proxy.IProxy;
import com.phdsteve.roddenberry.reference.Reference;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class roddenberry
{
    @Mod.Instance(Reference.MOD_ID)
    public static roddenberry instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        ModItems.init();
        ModBlocks.init();
        ModArmors.init();
        ModTools.init();
        proxy.registerKeyBindings();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        Recipes.init();
        FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    }
}
