package com.project.tiaBird.gameObject.geometryObject.creature.character.modification.modificationListener;

import com.project.tiaBird.gameObject.geometryObject.item.equipment.qualifiedEquipment.weapon.Weapon;

public interface ModOfAttackWith extends ModificationListener {
    int getAttackModification(Weapon weapon);
}
