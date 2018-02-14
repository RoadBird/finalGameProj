package com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage;

public class Stats {

    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

    public Stats(int str, int dex, int con, int intel, int wis, int charsm){
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

    public int getAbilityModifier(Stat stat) {
        int abilityScore = 0;
        switch (stat) {
            case STR: abilityScore = getStrength(); break;
            case DEX: abilityScore = getDexterity(); break;
            case CON: abilityScore = getConstitution(); break;
            case INT: abilityScore = getIntelligence(); break;
            case WIS: abilityScore = getWisdom(); break;
            case CHAR: abilityScore = getCharisma(); break;
        }
        if (abilityScore <= 1)
            return -5;
        if (abilityScore < 11)
            return (abilityScore - 11) / 2;
        else if (abilityScore > 11)
            return (abilityScore - 10) / 2;
        else return 0;
    }
}
