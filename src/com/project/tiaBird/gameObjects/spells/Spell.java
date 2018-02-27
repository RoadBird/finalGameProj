package com.project.tiaBird.gameObjects.spells;

import com.project.tiaBird.gameObjects.GameObject;

public class Spell extends GameObject {
    private int level;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
