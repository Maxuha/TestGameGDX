package com.openggames.testgame.model;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.graphics.Texture;

abstract class GameObject {

    Rectangle bounds;
    Sprite sprite;

    GameObject(Texture texture, float x, float y, float width, float height) {
        bounds = new Rectangle(x, y, width, height);
        sprite = new Sprite(texture);
    }

    public void draw(SpriteBatch batch) {
        sprite.setBounds(bounds.getX(), bounds.getY(), bounds.getWidth(), bounds.getHeight());
        sprite.draw(batch);
    }

}
