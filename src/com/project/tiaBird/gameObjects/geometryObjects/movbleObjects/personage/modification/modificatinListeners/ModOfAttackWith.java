package com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.modification.modificatinListeners;

import com.project.tiaBird.gameObjects.subjects.weapons.Weapon;

public interface ModOfAttackWith extends ModificationListener {
    int getAttackModificatin(Weapon weapon);
}
