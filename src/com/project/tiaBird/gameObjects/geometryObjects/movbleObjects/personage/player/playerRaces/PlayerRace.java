package com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.player.playerRaces;

import com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.player.PlayerCharacter;

public abstract class PlayerRace {

    PlayerCharacter playerCharacter;

    public PlayerRace(PlayerCharacter playerCharacter){
        this.playerCharacter = playerCharacter;
    }

    abstract String getSpecification();
}
