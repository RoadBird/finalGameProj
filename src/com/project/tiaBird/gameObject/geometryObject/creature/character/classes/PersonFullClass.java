package com.project.tiaBird.gameObject.geometryObject.creature.character.classes;

import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;

import java.util.HashSet;
import java.util.Set;

public class PersonFullClass {

    private Character character;
    private int level = 0;

    public PersonFullClass(Character character){
        this.character = character;
    }

    private Set<AbstractPersonClass> personFullClasses = new HashSet<>();

    public void levelApp(AbstractPersonClass personClass){
        personClass.levelUp();
        level++;
    }

    public void newClass(AbstractPersonClass personClass){
        personFullClasses.add(personClass);
        level++;
    }

    public void leaveClass(AbstractPersonClass personClass){
        level =- personClass.getLevel();
        personClass.leaveTheClass();
    }

    public int getLevel(){
        return level;
    }
}
