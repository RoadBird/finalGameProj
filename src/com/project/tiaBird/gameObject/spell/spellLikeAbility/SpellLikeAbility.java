package com.project.tiaBird.gameObject.spell.spellLikeAbility;

import com.project.tiaBird.gameObject.GameObject;
import com.project.tiaBird.gameObject.geometryObject.creature.Creature;
import com.project.tiaBird.gameObject.spell.Spell;

public abstract class SpellLikeAbility extends GameObject {
    protected Creature creature;
    private Spell spell;
    private FrequencyTimeEnum time;

    public SpellLikeAbility(Creature creature, Spell spell, FrequencyTimeEnum time) {
        this.creature = creature;
        this.spell = spell;
        this.time = time;
    }

    public int getDifficultyClass(){
        return 10 + creature.getLevel() + spell.getLevel();
    }

    public abstract boolean isCanBeUsed();
}
