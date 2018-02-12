package com.project.tiaBird.main.player;

public class Character {

    protected int health = 0;
    protected int speed = 0;
    protected int level = 0;
    protected int countOfSpellPerDay = 0;
    protected int armorClass = 0;
    protected int damage = 0;
    protected int abilityToSee = 0;
    protected int experiencePoints = 0;

    protected int savingThrowDurability;
    protected int savingThrowReflexivity;
    protected int savingThrowOfWill;
    protected int savingThrowOther;

    protected Object target; //нацеленность персонажа на...
    protected Object[] languages;
    protected Object[] weapons;
    protected Object[] inventory;
    protected Object armor;
    protected Object[] spellKnowledge;

    protected Abilities abilities;
    protected Races race;
}
