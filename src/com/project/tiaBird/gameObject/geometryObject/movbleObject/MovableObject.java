package com.project.tiaBird.gameObject.geometryObject.movbleObject;

import com.project.tiaBird.gameObject.geometryObject.GeometryObject;

public class MovableObject extends GeometryObject {
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
