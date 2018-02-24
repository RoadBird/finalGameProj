package com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage;

import com.project.tiaBird.gameObjects.SizeEnum;
import com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.MovbleObject;
import com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.classes.PersonClass;
import com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.modification.Modifications;
import com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.personRaces.PlayerRace;
import com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.skills.Skill;
import com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.stats.StatEnum;
import com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.stats.Stats;
import com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.traits.Trait;
import com.project.tiaBird.gameObjects.gods.God;
import com.project.tiaBird.gameObjects.specialSkills.SpecialSkills;
import com.project.tiaBird.gameObjects.spells.Spell;
import com.project.tiaBird.gameObjects.subjects.Subject;
import com.project.tiaBird.gameObjects.subjects.armores.Armor;
import com.project.tiaBird.gameObjects.subjects.shields.Shield;
import com.project.tiaBird.gameObjects.subjects.weapons.Weapon;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public abstract class Personage extends MovbleObject {

    private String name;
    private int level = 0;
    private int experiencePoints = 0;
    private int speed = 0;
    private int health = 0;
    private int armorClass = 0;
    private int checkAttack = 0;
    private int radiusOfSee = 0;
    private SizeEnum size = null;

    private Stats stats;
    private PlayerRace playerRace;
    private Set<PersonClass> personClasses = new HashSet<>();
    private Set<Skill> skills = new HashSet<>();
    private Set<Trait> traits = new HashSet<>();
    private Set<SpecialSkills> specialSkills = new HashSet<>();
    private Modifications mods = new Modifications();

    private MovbleObject target; //нацеленность персонажа на...
    private Weapon weapon1 = null;
    private Weapon weapon2 = null;
    private Armor armor = null;
    private Shield shield = null;
    private List<Subject> inventory = new LinkedList<>();
    private int countOfSpellPerDay = 0;
    private int countOfUsedSpellInThisDey = 0;
    private int countOfMaxKnowbleSpells = 0;
    private Set<Spell> spellKnowledge = new HashSet<>();

    private Object[] languages;
    private God god;

    private int bronze = 0;
    private int silver = 0;
    private int gold = 0;
    private int platinum = 0;

    private String story;
    private Alignment alignment;

    public abstract int getCheckSkill();

    public abstract int getPointAttack();

    public abstract int getSavingThrowFortitude();

    public abstract int getSavingThrowReflex();

    public abstract int getSavingThrowWill();

    public abstract int getSpellsPerDay();

    public void addSpell(Spell spell){
        if(countOfMaxKnowbleSpells < spellKnowledge.size()){
            spellKnowledge.add(spell);
        }
        else System.out.println("Max limit of knowledge spell");
    }

    public void addSubject(Subject thing){
        inventory.add(thing);
    }

    public void removeSubject(Subject thing){
        inventory.remove(thing);
    }

    public PlayerRace getPlayerRace() {
        return playerRace;
    }

    public void setPlayerRace(PlayerRace playerRace) {
        this.playerRace = playerRace;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(int str, int dex, int con, int intel, int wis, int charsm) {
        stats = new Stats(str, dex, con, intel, wis, charsm);
    }

    public int getStatModifier(StatEnum statEnum) {
        return getStats().getStatModifier(statEnum);
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

    public Alignment getAlignment(){
        return alignment;
    }
    public void setAlignment(Alignment alignment){
        this.alignment = alignment;
    }
}
