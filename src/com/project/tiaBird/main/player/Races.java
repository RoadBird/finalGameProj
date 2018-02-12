package com.project.tiaBird.main.player;

public abstract class Races {

    Character character;

    public Races(Character character){
        this.character = character;
    }

    abstract void getModifier();
    abstract String getSpecification();
}
