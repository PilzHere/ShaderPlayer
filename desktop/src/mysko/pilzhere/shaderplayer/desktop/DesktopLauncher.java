package mysko.pilzhere.shaderplayer.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import mysko.pilzhere.shaderplayer.ShaderPlayer;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.title = "ShaderPlayer";
		config.width = 1280;
		config.height = 720;
		config.allowSoftwareMode = true;
		//config.useGL30 = true;
		config.samples = 0;
		config.vSyncEnabled = false;
		config.foregroundFPS = 60;
		config.backgroundFPS = 30;
		config.fullscreen = false;
		config.resizable = true;
		config.forceExit = false; // Is true by default. For IntelliJ. Else exit code 255. Could be an issue on Mac.
		config.x = 0; // For my linux machine.
		config.y = 0; // For my linux machine.
		//config.addIcon();

		new LwjglApplication(new ShaderPlayer(), config);
	}
}
