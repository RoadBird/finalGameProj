package com.project.tiaBird.gameObject.geometryObject.creature;

import com.project.tiaBird.gameObject.geometryObject.GeometryObject;
import com.project.tiaBird.gameObject.geometryObject.creature.stat.Stat;
import com.project.tiaBird.gameObject.geometryObject.creature.stat.StatEnum;

public class Creature extends GeometryObject {
    private int speed;
    private int level;
    private Stat stat = new Stat();
    private CreatureTypeEnum creatureType;

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
