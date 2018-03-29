package com.project.tiaBird.gameObject.geometryObject.creature.character.classes;

import com.project.tiaBird.gameObject.GameObject;
import com.project.tiaBird.gameObject.effect.spell.Spell;
import com.project.tiaBird.gameObject.effect.spell.spellLikeAbility.SpellLikeAbility;
import com.project.tiaBird.gameObject.geometryObject.creature.character.Arming;
import com.project.tiaBird.gameObject.geometryObject.creature.character.Inventory;
import com.project.tiaBird.gameObject.geometryObject.creature.character.skill.SkillEnum;
import com.project.tiaBird.gameObject.geometryObject.creature.stat.StatEnum;
import com.project.tiaBird.gameObject.geometryObject.item.Money;

import java.util.HashSet;
import java.util.Set;

public abstract class AbstractPersonClass extends GameObject{

    PersonFullClass personFullClass;
    private Set<SkillEnum> classSkills = new HashSet<>();
    private Set<SpellLikeAbility> spellLikeAbilities = new HashSet<>();
    private Set<Spell> spells = new HashSet<>();
    private int level = 0;

    public AbstractPersonClass(PersonFullClass personFullClass) {
        this.personFullClass = personFullClass;
    }

    public Set<SkillEnum> getClassSkills(){
        return classSkills;
    }
    public int getLevel() {
        return level;
    }
    public abstract int[] getAttackThrow();
    public abstract int getSavingThrowFortitude();
    public abstract int getSavingThrowReflex();
    public abstract int getSavingThrowWill();
    public abstract int getNewHP();
    public abstract int getMaxHP();
    public abstract Arming getStartArming();
    public abstract Inventory getStartInventory();
    public abstract int[] getSpellPerDay();
    public abstract int getPointOfSkillPerLevel();
    public abstract StatEnum getMainStat();

    public void levelUp(){
        switch (level){
            case 0: levelUp1(); level++; break;
            case 1: levelUp2(); level++; break;
            case 2: levelUp3(); level++; break;
            case 3: levelUp4(); level++; break;
            case 4: levelUp5(); level++; break;
            case 5: levelUp6(); level++; break;
            case 6: levelUp7(); level++; break;
            case 7: levelUp8(); level++; break;
            case 8: levelUp9(); level++; break;
            case 9: levelUp10(); level++; break;
            case 10: levelUp11(); level++; break;
            case 11: levelUp12(); level++; break;
            case 12: levelUp13(); level++; break;
            case 13: levelUp14(); level++; break;
            case 14: levelUp15(); level++; break;
            case 15: levelUp16(); level++; break;
            case 16: levelUp17(); level++; break;
            case 17: levelUp18(); level++; break;
            case 18: levelUp19(); level++; break;
            case 19: levelUp20(); level++; break;

        }
    }
    protected abstract void levelUp1();
    protected abstract void levelUp2();
    protected abstract void levelUp3();
    protected abstract void levelUp4();
    protected abstract void levelUp5();
    protected abstract void levelUp6();
    protected abstract void levelUp7();
    protected abstract void levelUp8();
    protected abstract void levelUp9();
    protected abstract void levelUp10();
    protected abstract void levelUp11();
    protected abstract void levelUp12();
    protected abstract void levelUp13();
    protected abstract void levelUp14();
    protected abstract void levelUp15();
    protected abstract void levelUp16();
    protected abstract void levelUp17();
    protected abstract void levelUp18();
    protected abstract void levelUp19();
    protected abstract void levelUp20();
    public abstract void leaveTheClass();
    public abstract Money getMoney();
}
