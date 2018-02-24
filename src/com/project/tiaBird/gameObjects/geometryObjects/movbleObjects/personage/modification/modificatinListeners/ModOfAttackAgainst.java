package com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.modification.modificatinListeners;

import com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.MovbleObject;

public interface ModOfAttackAgainst extends ModificationListener {
    int getAttackModificatin(MovbleObject target);
}
