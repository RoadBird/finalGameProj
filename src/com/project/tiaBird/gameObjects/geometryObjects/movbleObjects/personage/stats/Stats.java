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

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        if (intelligence < 3)
            intelligence = 3;
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
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
