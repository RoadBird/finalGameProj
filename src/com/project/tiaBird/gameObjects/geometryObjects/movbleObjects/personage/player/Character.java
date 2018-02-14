package com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.player;

import com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.Stats;
import com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.Stat;
import com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.Personage;
import com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.Alignment;
import com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.MovbleObject;
import com.project.tiaBird.gameObjects.spells.Spell;
import com.project.tiaBird.gameObjects.subjects.Subject;
import com.project.tiaBird.gameObjects.subjects.armores.Armor;
import com.project.tiaBird.gameObjects.subjects.shields.Shield;
import com.project.tiaBird.gameObjects.subjects.weapons.Weapon;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public abstract class Character extends Personage {

    private int health = 0;
    private int level = 0;
    private int armorClass = 0;
   // private int damage = 0;
    private int radiusOfSee = 0;
    private int experiencePoints = 0;
    private int gold = 0;

    private MovbleObject target; //нацеленность персонажа на...
    private Object[] languages;
    private Object god;
    private Weapon weapon1 = null;
    private Weapon weapon2 = null;
    private Armor armor = null;
    private Shield shield = null;
    private List<Subject> inventory = new LinkedList<>();
    private int countOfSpellPerDay = 0;
    private int countOfMaxKnowbleSpells = 0;
    private Set<Spell> spellKnowledge = new HashSet<>();

    private Stats stats;
    private Races race;
    private Alignment alignment;
    private PlayerClass firstClass;
    private PlayerClass secondClass;

    public abstract int getAllCheckSkill();

    public abstract int getAllPointAttack();

    public abstract int getAllSavingThrowFortitude();

    public abstract int getAllSavingThrowReflex();

    public abstract int getAllSavingThrowWill();

    public abstract int getSpellsPerDay();

    public void addSpell(Spell spell){
        if(countOfMaxKnowbleSpells < spellKnowledge.size()){
            spellKnowledge.add(spell);
        }
    }

    public void addSubject(Subject thing){
        inventory.add(thing);
    }

    public void removeSubject(Subject thing){
        inventory.remove(thing);
    }

    public Alignment getAlignment(){
        return alignment;
    }

    public void setAlignment(Alignment alignment){
        this.alignment = alignment;
    }

    public Races getRace() {
        return race;
    }

    public void setRace(Races race) {
        this.race = race;
    }

    public Stats getStats() {
        return stats;
    }

    public void setAbilities(int str, int dex, int con, int intel, int wis, int charsm) {
        stats = new Stats(str, dex, con, intel, wis, charsm);
    }

    public int getAbilityModifier(Stat stat) {
        return getStats().getAbilityModifier(stat);
    }

    public Weapon getWeapon1() {
        return weapon1;
    }

    public void setWeapon1(Weapon weapon1) {
        this.weapon1 = weapon1;
    }

    public Weapon getWeapon2() {
        return weapon2;
    }

    public void setWeapon2(Weapon weapon2) {
        this.weapon2 = weapon2;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public Shield getShield() {
        return shield;
    }

    public void setShield(Shield shield) {
        this.shield = shield;
    }
}
