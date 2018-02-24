package com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.personRaces;

import com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.Personage;

public abstract class PlayerRace {

    Personage personage;

    public PlayerRace(Personage personage){
        this.personage = personage;
    }

    abstract String getSpecification();
}
