/**
 * Copyright (C) 2015 DeathsbreedGames
 * License: Apache License 2.0
 */
package io.github.deathsbreedgames.libgdxtemplate;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;

import io.github.deathsbreedgames.libgdxtemplate.screens.*;

/**
 * The main class of the game.
 * 
 * @author Nicolás A. Ortega
 * @version 15.02.07
 */
public class LibGDXTemplate extends Game {
	private AssetManager manager;
	
	// Create:
	@Override
	public void create () {
		manager = new AssetManager();
		setScreen(new BaseScreen(manager)); // Replace BaseScreen with your own screen that extends BaseScreen.
	}

	@Override
	public void render () {
		BaseScreen currentScreen = (BaseScreen)super.getScreen();

		// Update the screen
		currentScreen.render(Gdx.graphics.getDeltaTime());

		// Switch screen if done
		if(currentScreen.isDone()) {
			currentScreen.dispose();
			if(currentScreen.getNextScreen().equals("BaseScreen")) {
				setScreen(new BaseScreen(manager));
			}/* else if(currentScreen.getNextScreen().equals("YOURSCREENNAME")) {
				setScreen(new *YOURSCREEN*(manager));
			}*/else {
				setScreen(new BaseScreen(manager));
			}
		}
	}

	// Dispose:
	@Override
	public void dispose() {
		manager.dispose();
		super.getScreen().dispose();
		super.dispose();
	}
}
