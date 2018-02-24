package com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.player.playerClasses;

import com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.player.PlayerCharacter;

public abstract class PlayerClass {

    PlayerCharacter playerCharacter;
    private int level;

    public PlayerClass(PlayerCharacter playerCharacter) {
        this.playerCharacter = playerCharacter;
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
