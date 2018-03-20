package com.project.tiaBird.gameObject.geometryObject.creature.character.classes;

import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;

public abstract class PersonClass {

    Character character;
    private int level;

    public PersonClass(Character character) {
        this.character = character;
    }

    public abstract void leaveTheClass();

    public abstract void levelUp();

    public int getLevel() {
        return level;
    }


}
