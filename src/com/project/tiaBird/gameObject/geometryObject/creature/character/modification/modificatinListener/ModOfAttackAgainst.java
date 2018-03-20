package com.project.tiaBird.gameObject.geometryObject.creature.character.modification.modificatinListener;

import com.project.tiaBird.gameObject.geometryObject.creature.Creature;

public interface ModOfAttackAgainst extends ModificationListener {
    int getAttackModificatin(Creature target);
}
