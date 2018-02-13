package com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.player;

public abstract class Races {

    Character character;

    public Races(Character character){
        this.character = character;
    }

    abstract String getSpecification();
}
