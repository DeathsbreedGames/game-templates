package io.github.deathsbreedgames.libgdxtemplate.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import io.github.deathsbreedgames.libgdxtemplate.LibGDXTemplate;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new LibGDXTemplate(), config);
	}
}
