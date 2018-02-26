package com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.modification.modificatinListeners;

import com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.MovableObject;

public interface ModOfAttackAgainst extends ModificationListener {
    int getAttackModificatin(MovableObject target);
}
