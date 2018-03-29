package com.project.tiaBird.gameObject.geometryObject.creature;

import com.project.tiaBird.gameObject.geometryObject.GeometryObject;
import com.project.tiaBird.gameObject.geometryObject.creature.character.modification.Modification;
import com.project.tiaBird.gameObject.geometryObject.creature.character.skill.SkillEnum;
import com.project.tiaBird.gameObject.geometryObject.creature.stat.Stat;
import com.project.tiaBird.gameObject.geometryObject.creature.stat.StatEnum;

public class Creature extends GeometryObject {
    private int speed;
    private int level;
    private Stat stat = new Stat();
    private Modification mods;
    private CreatureTypeEnum creatureType;
    private CreatureVisionType vision = CreatureVisionType.Normal;
    private CreatureSize size = CreatureSize.MEDIUM;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public CreatureTypeEnum getCreatureType() {
        return creatureType;
    }

    public Modification getMods() {
        return mods;
    }

    public void setMods(Modification mods) {
        this.mods = mods;
    }

    public CreatureSize getSize() {
        return size;
    }
    public void setSize(CreatureSize size) {
        switch (this.size){
            case FINE:
                changeModsWithSize(-8);
                break;
            case DIMINUTIVE:
                changeModsWithSize(-4);
                break;
            case TINY:
                changeModsWithSize(-2);
                break;
            case SMALL:
                changeModsWithSize(-1);
                break;
            case LARGE:
                changeModsWithSize(1);
                break;
            case HUGE:
                changeModsWithSize(2);
                break;
            case GARGANTUAN:
                changeModsWithSize(4);
                break;
            case COLOSSAL:
                changeModsWithSize(8);
                break;
        }
        switch (size){
            case FINE:
                changeModsWithSize(8);
                break;
            case DIMINUTIVE:
                changeModsWithSize(4);
                break;
            case TINY:
                changeModsWithSize(2);
                break;
            case SMALL:
                changeModsWithSize(1);
                break;
            case LARGE:
                changeModsWithSize(-1);
                break;
            case HUGE:
                changeModsWithSize(-2);
                break;
            case GARGANTUAN:
                changeModsWithSize(-4);
                break;
            case COLOSSAL:
                changeModsWithSize(-8);
                break;
        }

        this.size = size;
    }
    private void changeModsWithSize(int count){
        getMods().appendArmorClassMod(count);
        getMods().appendCheckAttackMod(count);
        getMods().appendSkillMod(SkillEnum.Hide, count*4);
    }

    public CreatureVisionType getVision() {
        return vision;
    }
    public void setVision(CreatureVisionType vision) {
        this.vision = vision;
    }

    public Stat getStat(){
        return stat;
    }
    public int getStat(StatEnum statEnum) {
        return getStat().getStat(statEnum);
    }
    public void appendStat(StatEnum stat, int count) {
        getStat().appendStat(stat, count);
    }
    public int getStatModifier(StatEnum statEnum) {
        return getStat().getStatModifier(statEnum);
    }
}
