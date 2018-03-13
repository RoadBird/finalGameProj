package com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage;

import com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.MovableObject;
import com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.classes.PersonClass;
import com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.modification.Modifications;
import com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.personRaces.Human;
import com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.personRaces.PersonRace;
import com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.skills.Skills;
import com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.stats.StatEnum;
import com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.stats.Stats;
import com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.traits.Trait;
import com.project.tiaBird.gameObjects.gods.God;
import com.project.tiaBird.gameObjects.languages.LanguageEnum;
import com.project.tiaBird.gameObjects.specialSkills.SpecialSkills;
import com.project.tiaBird.gameObjects.spells.Spell;
import com.project.tiaBird.gameObjects.subjects.Subject;
import com.project.tiaBird.gameObjects.subjects.armores.Armor;
import com.project.tiaBird.gameObjects.subjects.shields.Shield;
import com.project.tiaBird.gameObjects.subjects.weapons.Weapon;

import java.util.*;

public class Personage extends MovableObject {

    private String name;
    private int level = 0;
    private int experiencePoints = 0;
    private int health = 0;
    private int armorClass = 0;
    private int checkAttack = 0;
    private int radiusOfSee = 0;
    private CreatureSizeEnum size;

    private Stats stats;
    private PersonRace personRace;
    private Set<PersonClass> personClasses = new HashSet<>();
    private Skills skills;
    private Set<Trait> traits = new HashSet<>();
    private Set<LanguageEnum> languages = new HashSet<>();
    private Modifications mods;

    private Set<SpecialSkills> specialSkills = new HashSet<>();

    private MovableObject target; //нацеленность персонажа на...
    private Weapon weapon1 = null;
    private Weapon weapon2 = null;
    private Armor armor = null;
    private Shield shield = null;
    private List<Subject> inventory = new LinkedList<>();
    private int countOfSpellPerDay = 0;
    private int countOfUsedSpellInThisDey = 0;
    private StatEnum mainStatToMAXSpellCount = null;
    private int[] countOfMaxKnowbleSpells = new int[10];
    private Map<Integer, Set<Spell>> spellBook = new HashMap<>();


    private God god;

    private int bronze = 0;
    private int silver = 0;
    private int gold = 0;
    private int platinum = 0;

    private String story;
    private Alignment alignment;

    private Personage() {
    }

//    public abstract int getCheckSkill();
//
//    public abstract int getPointAttack();
//
//    public abstract int getSavingThrowFortitude();
//
//    public abstract int getSavingThrowReflex();
//
//    public abstract int getSavingThrowWill();
//
//    public abstract int getSpellsPerDay();

    public Set<LanguageEnum> getLanguages() {
        return languages;
    }
    public void addLanguages(LanguageEnum language) {
        languages.add(language);
    }

    public void addSpell(Spell spell) {
        if (countOfMaxKnowbleSpells[spell.getLevel()] < spellBook.get(spell.getLevel()).size()) {
            spellBook.get(spell.getLevel()).add(spell);
        } else System.out.println("Max limit of knowledge spell");
    }

    public Modifications getMods() {
        return mods;
    }
    public void setMods(Modifications mods) {
        this.mods = mods;
    }

    public void addSubject(Subject thing) {
        inventory.add(thing);
    }

    public void removeSubject(Subject thing) {
        inventory.remove(thing);
    }

    public PersonRace getPersonRace() {
        return personRace;
    }

    public void setPersonRace(PersonRace personRace) {
        this.personRace = personRace;
    }

    public void setStats(int str, int dex, int con, int intel, int wis, int charsm) {
        stats = new Stats(str, dex, con, intel, wis, charsm);
        if(mainStatToMAXSpellCount != null)
            toCountMaxKnowbleSpell(mainStatToMAXSpellCount);
    }
    public int getStat(StatEnum statEnum) {
        return stats.getStat(statEnum);
    }
    public void appendStat(StatEnum stat, int count) {
        stats.appendStat(stat, count);
        if(mainStatToMAXSpellCount != null && stat.equals(mainStatToMAXSpellCount)) {
            toCountMaxKnowbleSpell(mainStatToMAXSpellCount);
        }
    }
    public int getStatModifier(StatEnum statEnum) {
        return stats.getStatModifier(statEnum);
    }

    public CreatureSizeEnum getSize() {
        return size;
    }
    public void setSize(CreatureSizeEnum size) {
        this.size = size;
    }

    public Alignment getAlignment() {
        return alignment;
    }

    public void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }

    private void toCountMaxKnowbleSpell(StatEnum stat) {
        if (stat != null) {
            for (int i = 0; i < countOfMaxKnowbleSpells.length; i++) {
                countOfMaxKnowbleSpells[i] = stats.getCountOfSpellModifier(stat, i);
            }
        }
    }
    public static class Builder{
        private Personage personage = new Personage();
        public Builder(){
            personage.stats = new Stats();
            personage.skills = new Skills();
            personage.mods = new Modifications();
            personage.personRace = new Human(personage);
            for (int i = 0; i < 10; i++) {
                personage.spellBook.put(i, new HashSet<>());
            }
        }
        public Builder setStats(Stats stats){
            personage.stats = stats;
            return this;
        }
        public Builder setRace(PersonRace race){
            personage.personRace = race;
            return this;
        }
        public Builder setClasses(Set<PersonClass> personClasses){
            personage.personClasses = personClasses;
            return this;
        }
        public Builder setSkills(Skills skills){
            personage.skills = skills;
            return this;
        }
        public Builder setMods(Modifications mods){
            personage.mods = mods;
            return this;
        }
        public Personage getPersonage(){
            return personage;
        }

    }
}
