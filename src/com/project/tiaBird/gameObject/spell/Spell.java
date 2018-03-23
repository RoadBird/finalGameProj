package com.project.tiaBird.gameObject.spell;

import com.project.tiaBird.gameObject.GameObject;

public class Spell extends GameObject {
    private int level;
    private SpellTypeEnum spellType;
    private int difficultyClass;

    protected Spell(int level, int difficultyClass, SpellTypeEnum type){
        this.level = level;
        spellType = type;
        this.difficultyClass = difficultyClass;
    }

    public int getLevel() {
        return level;
    }

    public SpellTypeEnum getType(){
        return spellType;
    }

    public void appendComplexityClass(int count){
        difficultyClass += count;
    }
}
