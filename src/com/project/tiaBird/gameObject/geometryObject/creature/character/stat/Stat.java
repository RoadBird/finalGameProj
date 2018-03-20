package com.project.tiaBird.gameObject.geometryObject.creature.character.stat;

import java.util.HashMap;
import java.util.Map;

public class Stat {

    private Map<StatEnum, Integer> statsMap;

    public Stat(){
        statsMap = new HashMap();
        StatEnum[] stats = StatEnum.values();
        for (int i = 0; i < stats.length; i++) {
            statsMap.put(stats[i], 0);
        }
    }

    public Stat(int str, int dex, int con, int intel, int wis, int charsm) {
        statsMap = new HashMap();
        statsMap.put(StatEnum.STR, str);
        statsMap.put(StatEnum.DEX, dex);
        statsMap.put(StatEnum.CON, con);
        statsMap.put(StatEnum.INT, intel);
        statsMap.put(StatEnum.WIS, wis);
        statsMap.put(StatEnum.CHAR, charsm);
    }

    public void appendStat(StatEnum statEnum, int count){
        statsMap.put(statEnum, statsMap.get(statEnum) + count);
        if(statEnum.equals(StatEnum.INT) && statsMap.get(StatEnum.INT) < 3){
            statsMap.put(StatEnum.INT, 3);
        }
        if(statsMap.get(statEnum) < 0){
            statsMap.put(statEnum, 0);
        }
    }

    public int getStat(StatEnum statEnum) {
        return statsMap.get(statEnum);
    }

    public int getStatModifier(StatEnum statEnum) {
        int abilityScore = statsMap.get(statEnum);
        if (abilityScore <= 1)
            return -5;
        if (abilityScore < 11)
            return (abilityScore - 11) / 2;
        else if (abilityScore > 11)
            return (abilityScore - 10) / 2;
        else return 0;
    }

    public int getCountOfSpellModifier(StatEnum statEnum, int spellLvl) {
        int t = getStatModifier(statEnum);
        if (t < 0) {
            return -1;
        } else if(spellLvl == 0) {
            return 0;
        }else if(spellLvl > t){
            return 0;
        } else {
            return (t - spellLvl)/4 + 1;
        }
    }
}
