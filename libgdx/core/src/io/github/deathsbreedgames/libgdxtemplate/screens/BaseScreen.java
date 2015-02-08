/**
 * Copyright (C) 2015 DeathsbreedGames
 * License: MIT
 */
package io.github.deathsbreedgames.libgdxtemplate.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.GL20;

/**
 * A template for all screens.
 * 
 * @author Nicolás A. Ortega
 * @version 15.02.05
 */
public class BaseScreen implements Screen {
	private boolean done;
	private String nextScreen;

	/**
	 * The asset manager which has the resources loaded to it.
	 */
	protected AssetManager manager;

	/**
	 * @param nextScreen	String used by the main class to determine the next screen.
	 */
	public BaseScreen(String nextScreen) {
		this.nextScreen = nextScreen;
		this.done = false;
	}

	/**
	 * @param nextScreen	String used by the main class to determine the next screen.
	 * @param manager	The asset manager which has the resources loaded to it.
	 */
	public BaseScreen(String nextScreen, AssetManager manager) {
		this.nextScreen = nextScreen;
		this.done = false;
		this.manager = manager;
	}

	/**
	 * @param delta		The amount of time elapsed between the current frame and the previous frame.
	 */
	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0f, 0f, 0f, 1f);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	}

	@Override public void resize(int width, int height) {}
	@Override public void show() {}
	@Override public void hide() {}
	@Override public void pause() {}
	@Override public void resume() {}
	@Override public void dispose() {}

	// Getter methods:
	public boolean isDone() { return done; }
	public String getNextScreen() { return nextScreen(); }

	// Setter methods:
	public void setDone(boolean done) { this.done = done; }
	public void setNextScreen(String nextScreen) { this.nextScreen = nextScreen; }
}
