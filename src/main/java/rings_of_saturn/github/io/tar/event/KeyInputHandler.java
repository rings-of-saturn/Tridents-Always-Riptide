package rings_of_saturn.github.io.tar.event;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.util.Hand;
import org.lwjgl.glfw.GLFW;

import java.io.File;

import static rings_of_saturn.github.io.tar.client.TARClient.isModActive;

public class KeyInputHandler {
	public static final String KEY_CATEGORY_PRISMIUM = "key.category.deeper_aquatic.deeper_aquatic";


	public static final String MOD_ACTIVE = "key.tar.activate_mod";

	public static KeyBinding modActivateKey;
	public static void registerKeyInputs(){
		ClientTickEvents.END_CLIENT_TICK.register(client -> {
			if(client.player != null) {
				if (modActivateKey.wasPressed()) {
					isModActive = !isModActive;
				}
			}
		});
	}

	public static void register(){
		modActivateKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
			MOD_ACTIVE,
			InputUtil.Type.KEYSYM,
			GLFW.GLFW_KEY_GRAVE_ACCENT,
			KEY_CATEGORY_PRISMIUM
		));

		registerKeyInputs();
	}
}
