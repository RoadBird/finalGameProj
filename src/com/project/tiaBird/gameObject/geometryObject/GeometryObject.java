package com.project.tiaBird.gameObject.geometryObject;

import com.project.tiaBird.gameObject.GameObject;

public class  GeometryObject extends GameObject {
    private int x;
    private int y;
    private PositionEnum position = PositionEnum.ON_THE_GROUND;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public PositionEnum getPosition() {
        return position;
    }

    public void setPosition(PositionEnum position) {
        this.position = position;
    }
}
