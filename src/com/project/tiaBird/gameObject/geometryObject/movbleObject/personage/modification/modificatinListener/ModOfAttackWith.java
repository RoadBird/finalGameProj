package com.project.tiaBird.gameObject.geometryObject.movbleObject.personage.modification.modificatinListener;

import com.project.tiaBird.gameObject.geometryObject.gameSubject.arming.weapon.Weapon;

public interface ModOfAttackWith extends ModificationListener {
    int getAttackModificatin(Weapon weapon);
}
