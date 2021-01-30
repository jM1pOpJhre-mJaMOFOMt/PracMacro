package com.nur.pracmacro;

import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;

public class KeyPressHandler {
    @SubscribeEvent
    public void onKeyInput(InputEvent.KeyInputEvent event) {
        if (Keybinds.prac.isPressed()) Minecraft.getMinecraft().thePlayer.sendChatMessage("/prac");
        if (Keybinds.unprac.isPressed()) Minecraft.getMinecraft().thePlayer.sendChatMessage("/unprac");
    }
}
