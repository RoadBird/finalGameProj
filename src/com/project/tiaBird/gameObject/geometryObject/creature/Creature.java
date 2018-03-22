package com.project.tiaBird.gameObject.geometryObject.creature;

import com.project.tiaBird.gameObject.geometryObject.GeometryObject;

public class Creature extends GeometryObject {
    private int speed;
    private CreatureTypeEnum creatureType;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public CreatureTypeEnum getCreatureType() {
        return creatureType;
    }
}
