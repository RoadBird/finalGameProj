package com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.player;

public abstract class PlayerClass {

    Character character;
    private int level;

    public PlayerClass(Character character) {
        this.character = character;
    }

    public abstract void leaveTheClass();

    public abstract int getClassPointAttak();

    public abstract int getClassSavingThrowFortitude();

    public abstract int getClassSavingThrowReflex();

    public abstract int getClassSavingThrowWill();

    public abstract int getSpellsPerDay();

    public abstract void levelUp();

    public abstract int getPointsOfSkill();

    public int getLevel() {
        return level;
    }


}
