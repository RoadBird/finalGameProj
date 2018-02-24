package com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.classes;

import com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.Personage;

public abstract class PersonClass {

    Personage personage;
    private int level;

    public PersonClass(Personage personage) {
        this.personage = personage;
    }

    public abstract void leaveTheClass();

    public abstract void levelUp();

    public int getLevel() {
        return level;
    }


}
