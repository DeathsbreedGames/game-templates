/**
 * Copyright (C) 2015 DeathsbreedGames
 * License: Apache License 2.0
 */
package io.github.deathsbreedgames.libgdxtemplate;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Sprite;
import com.badlogic.gdx.graphics.SpriteBatch;
import com.badlogic.gdx.graphics.TextureRegion;
import com.badlogic.gdx.math.Vector2;

/**
 * A template for entities (such as moving objects, or just objects that
 * serve a purpose).
 * 
 * @author Nicolás A. Ortega
 * @version 15.02.05
 */
public class Entity extends Sprite {
	private Vector2 position;
	private Vector2 velocity;

	/**
	 * @param img		A texture region which will be drawn on the screen as the entity.
	 * @param x		The initial X position of the entity.
	 * @param y		The initial Y position of the entity.
	 */
	public Entity(TextureRegion img, float x, float y) {
		super(img);
		position = new Vector2(x, y);
		velocity = new Vector2(0f, 0f);
		setCenter(position.x, position.y);
		setBounds(this.getX(), this.getY(), this.getWidth(), this.getHeight());
	}

	/**
	 * @param img		A texture which will be drawn on the screen as the entity.
	 * @param x		The initial X position of the entity.
	 * @param y		The initial Y position of the entity.
	 */
	public Entity(Texture img, float x, float y) {
		super(img);
		position = new Vector2(x, y);
		velocity = new Vector2(0f, 0f);
		setCenter(position.x, position.y);
		setBounds(this.getX(), this.getY(), this.getWidth(), this.getHeight());
	}

	/**
	 * @param batch		The SpriteBatch that will be used to draw the texture to the screen.
	 * @param delta		The time between the current frame and the last.
	 */
	public void render(SpriteBatch batch, float delta) {
		position.add(velocity.x * delta, velocity.y * delta);
		setCenter(position.x, position.y);

		setBounds(this.getX(), this.getY(), this.getWidth(), this.getHeight());

		super.draw(batch);
	}

	// Getter methods:
	public Vector2 getPosition() { return position; }
	public float getPosX() { return position.x; }
	public float getPosY() { return position.y; }
	public Vector2 getVelocity() { return velocity; }
	public float getVelX() { return velocity.x; }
	public float getVelY() { return velocity.y; }

	// Setter methods:
	public void setPosition(Vector2 position) { this.position = position; }
	public void setPosition(float x, float y) { this.position = new Vector2(x, y); }
	public void setPosX(float x) { this.position.x = x; }
	public void setPosY(float y) { this.position.y = y; }
	public void setVelocity(Vector2 velocity) { this.velocity = velocity; }
	public void setVelocity(float x, float y) { this.velocity = new Vector2(x, y); }
	public void setVelX(float x) { this.velocity.x = x; }
	public void setVelY(float y) { this.velocity.y = y; }
}
