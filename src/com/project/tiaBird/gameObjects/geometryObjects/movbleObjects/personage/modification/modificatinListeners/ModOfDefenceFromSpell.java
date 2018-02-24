package com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.modification.modificatinListeners;

import com.project.tiaBird.gameObjects.spells.Spell;

public interface ModOfDefenceFromSpell extends ModificationListener {
    int getDefenceModificatin(Spell spell);
}