package com.nur.pracmacro;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = PracMacroMod.MODID, version = PracMacroMod.VERSION)
public class PracMacroMod {
    public static final String MODID = "pracmacro";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        Keybinds.register();
        MinecraftForge.EVENT_BUS.register(new KeyPressHandler());
    }
}
