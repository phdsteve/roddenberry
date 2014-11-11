package com.phdsteve.roddenberry.client.handler;

import com.phdsteve.roddenberry.client.settings.Keybindings;
import com.phdsteve.roddenberry.reference.Key;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

public class KeyInputEventHandler
{
    private static Key getPressedKeyBinding()
    {
        if(Keybindings.charge.isPressed())
        {
            return Key.CHARGE;
        }
        else if (Keybindings.release.isPressed())
        {
            return Key.RELEASE;
        }
        return Key.UNKNOWN;
    }

    @SubscribeEvent
    public void handleKeyInputEvent(InputEvent.KeyInputEvent event)
    {
    }
}
