package com.project.tiaBird.gameObject.effect.spell.spellLikeAbility;

import com.project.tiaBird.gameObject.geometryObject.creature.Creature;
import com.project.tiaBird.gameObject.effect.spell.Spell;

public abstract class SpellLikeAbility extends Spell {
    protected Creature creature;
    private Spell spell;
    private FrequencyTimeEnum time;

    public SpellLikeAbility(Creature creature, Spell spell, FrequencyTimeEnum time) {
        super(spell.getLevel());
        this.creature = creature;
        this.spell = spell;
        this.time = time;
    }

    public int getDifficultyClass(){
        return 10 + creature.getLevel() + spell.getLevel();
    }

    public abstract boolean isCanBeUsed();
}
