package com.project.tiaBird.gameObject.geometryObject.creature.character.modification.modificatinListener;

import com.project.tiaBird.gameObject.geometryObject.item.equipment.weapon.Weapon;

public interface ModOfAttackWith extends ModificationListener {
    int getAttackModificatin(Weapon weapon);
}
