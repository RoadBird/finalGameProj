package com.project.tiaBird.gameObject.geometryObject.creature.character.personRace;

import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;

public abstract class PersonRace {

    Character character;

    public PersonRace(Character character){
        this.character = character;
    }

    public abstract void initialize();

}
