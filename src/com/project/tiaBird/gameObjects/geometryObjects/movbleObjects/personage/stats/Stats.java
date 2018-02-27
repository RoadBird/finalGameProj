package com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.stats;

public class Stats {

    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

    public Stats(int str, int dex, int con, int intel, int wis, int charsm) {
        strength = str;
        dexterity = dex;
        constitution = con;
        intelligence = intel;
        wisdom = wis;
        charisma = charsm;
    }

    private int getStrength() {
        return strength;
    }

    private void setStrength(int strength) {
        this.strength = strength;
    }

    private int getDexterity() {
        return dexterity;
    }

    private void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    private int getConstitution() {
        return constitution;
    }

    private void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    private int getIntelligence() {
        return intelligence;
    }

    private void setIntelligence(int intelligence) {
        if (intelligence < 3)
            intelligence = 3;
        this.intelligence = intelligence;
    }

    private int getWisdom() {
        return wisdom;
    }

    private void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    private int getCharisma() {
        return charisma;
    }

    private void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public void setStat(StatEnum statEnum, int count){
        switch (statEnum) {
            case STR:
                strength += count;
            case DEX:
                dexterity += count;
            case CON:
                constitution += count;
            case INT:
                intelligence += count;
            case WIS:
                wisdom += count;
            case CHAR:
                charisma += count;
        }
    }

    public int getStat(StatEnum statEnum) {
        switch (statEnum) {
            case STR:
                return getStrength();
            case DEX:
                return getDexterity();
            case CON:
                return getConstitution();
            case INT:
                return getIntelligence();
            case WIS:
                return getWisdom();
            case CHAR:
                return getCharisma();
        }
        return 0;
    }

    public int getStatModifier(StatEnum statEnum) {
        int abilityScore = 0;
        switch (statEnum) {
            case STR:
                abilityScore = getStrength();
                break;
            case DEX:
                abilityScore = getDexterity();
                break;
            case CON:
                abilityScore = getConstitution();
                break;
            case INT:
                abilityScore = getIntelligence();
                break;
            case WIS:
                abilityScore = getWisdom();
                break;
            case CHAR:
                abilityScore = getCharisma();
                break;
        }
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
