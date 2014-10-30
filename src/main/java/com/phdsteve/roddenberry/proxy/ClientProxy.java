package com.phdsteve.roddenberry.proxy;

import com.phdsteve.roddenberry.client.Settings.Keybindings;
import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.settings.KeyBinding;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerKeyBindings()
    {
        ClientRegistry.registerKeyBinding(Keybindings.charge);
        ClientRegistry.registerKeyBinding(Keybindings.release);
    }
}
