package com.nur.pracmacro;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import org.lwjgl.input.Keyboard;

public class Keybinds {
    public static KeyBinding prac;
    public static KeyBinding unprac;
    public static void register() {
        prac = new KeyBinding("/prac", Keyboard.KEY_RIGHT, "Prac Macros");
        unprac = new KeyBinding("/unprac", Keyboard.KEY_DOWN, "Prac Macros");
        ClientRegistry.registerKeyBinding(prac);
        ClientRegistry.registerKeyBinding(unprac);
    }
}
