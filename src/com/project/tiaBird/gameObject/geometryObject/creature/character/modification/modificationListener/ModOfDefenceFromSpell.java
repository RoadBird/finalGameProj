package com.project.tiaBird.gameObject.geometryObject.creature.character.modification.modificationListener;

import com.project.tiaBird.gameObject.effect.spell.Spell;

public interface ModOfDefenceFromSpell extends ModificationListener {
    int getDefenceModification(Spell spell);
}