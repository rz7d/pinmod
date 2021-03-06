package net.ciebus.pinmod;

import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;

public class ClientProxy extends CommonProxy {
    public static final KeyBinding sampleKey = new KeyBinding("Key.sample", Keyboard.KEY_R, "CategoryName");

    @Override
    public void registerClientInfo() {
        ClientRegistry.registerKeyBinding(sampleKey);
    }

}