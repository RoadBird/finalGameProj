package com.project.tiaBird.gameObject.spell;

import com.project.tiaBird.gameObject.GameObject;

public class Spell extends GameObject {
    private int level;
    private SpellTypeEnum spellType;
    private int complexityClass;

    protected Spell(int level, int complexityClass, SpellTypeEnum type){
        this.level = level;
        spellType = type;
        this.complexityClass = complexityClass;
    }

    public int getLevel() {
        return level;
    }

    public SpellTypeEnum getType(){
        return spellType;
    }

    public void appendComplexityClass(int count){
        complexityClass += count;
    }
}
