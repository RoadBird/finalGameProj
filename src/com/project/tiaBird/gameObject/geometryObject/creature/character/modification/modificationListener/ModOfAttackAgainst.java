package com.project.tiaBird.gameObject.geometryObject.creature.character.modification.modificationListener;

import com.project.tiaBird.gameObject.geometryObject.creature.Creature;

public interface ModOfAttackAgainst extends ModificationListener {
    int getAttackModification(Creature target);
}
