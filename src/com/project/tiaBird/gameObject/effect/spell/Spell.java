package com.project.tiaBird.gameObject.effect.spell;

import com.project.tiaBird.gameObject.effect.Effect;
import com.project.tiaBird.gameObject.effect.EffectsEnum;

public abstract class Spell extends Effect{
    private int level;
    private SpellTypeEnum spellType;
    private int difficultyClass = 0;

    protected Spell(int level){
        super(EffectsEnum.Spell);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public SpellTypeEnum getType() {
        return spellType;
    }

    public void setSpellType(SpellTypeEnum spellType) {
        this.spellType = spellType;
    }

    public abstract int getDifficultyClass();

    public void appendDifficultyClass(int count){
        difficultyClass += count;
    }
}
