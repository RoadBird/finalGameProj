package com.project.tiaBird.gameObject.geometryObject.creature.character.modification.modificationListener;

import com.project.tiaBird.gameObject.geometryObject.creature.Creature;

public interface ModOfDefenceFromPerson extends ModificationListener {
    int getDefenceModification(Creature target);
}
