package com.project.tiaBird.gameObject.geometryObject.movbleObject.personage.modification.modificatinListener;

import com.project.tiaBird.gameObject.geometryObject.movbleObject.MovableObject;

public interface ModOfAttackAgainst extends ModificationListener {
    int getAttackModificatin(MovableObject target);
}
