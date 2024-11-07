package rings_of_saturn.github.io.tar.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import rings_of_saturn.github.io.tar.event.KeyInputHandler;

import java.io.File;

public class TARClient implements ClientModInitializer {
    public static boolean isModActive = true;
    @Override
    public void onInitializeClient() {
        KeyInputHandler.register();
    }
}
