package com.project.tiaBird.gameObjects.geometryObjects.movbleObjects;

import com.project.tiaBird.gameObjects.geometryObjects.GeometryObject;

public class MovableObject extends GeometryObject {
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
