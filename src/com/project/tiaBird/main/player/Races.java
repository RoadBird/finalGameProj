package com.project.tiaBird.main.player;

public abstract class Races {
    protected Abilities abilities;
    protected int speed;

    abstract void getModifier();
    abstract String getSpecification();

    public Races(Abilities abilities){
        this.abilities = abilities;
    }

    public int getSpeed() {
        return speed;
    }
}
