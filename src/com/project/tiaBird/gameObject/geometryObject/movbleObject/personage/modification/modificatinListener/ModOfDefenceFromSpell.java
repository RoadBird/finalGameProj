package com.project.tiaBird.gameObject.geometryObject.movbleObject.personage.modification.modificatinListener;

import com.project.tiaBird.gameObject.spell.Spell;

public interface ModOfDefenceFromSpell extends ModificationListener {
    int getDefenceModificatin(Spell spell);
}