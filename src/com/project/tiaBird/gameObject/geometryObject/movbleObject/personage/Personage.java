package com.project.tiaBird.gameObject.geometryObject.movbleObject.personage;

import com.project.tiaBird.gameObject.geometryObject.gameSubject.Inventory;
import com.project.tiaBird.gameObject.geometryObject.gameSubject.Money;
import com.project.tiaBird.gameObject.geometryObject.gameSubject.arming.Arming;
import com.project.tiaBird.gameObject.geometryObject.movbleObject.MovableObject;
import com.project.tiaBird.gameObject.geometryObject.movbleObject.personage.classes.PersonClass;
import com.project.tiaBird.gameObject.geometryObject.movbleObject.personage.modification.Modification;
import com.project.tiaBird.gameObject.geometryObject.movbleObject.personage.personRace.Human;
import com.project.tiaBird.gameObject.geometryObject.movbleObject.personage.personRace.PersonRace;
import com.project.tiaBird.gameObject.geometryObject.movbleObject.personage.skill.Skill;
import com.project.tiaBird.gameObject.geometryObject.movbleObject.personage.stat.Stat;
import com.project.tiaBird.gameObject.geometryObject.movbleObject.personage.stat.StatEnum;
import com.project.tiaBird.gameObject.geometryObject.movbleObject.personage.trait.Trait;
import com.project.tiaBird.gameObject.god.God;
import com.project.tiaBird.gameObject.language.LanguageEnum;
import com.project.tiaBird.gameObject.specialSkill.SpecialSkill;
import com.project.tiaBird.gameObject.spell.Spell;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Personage extends MovableObject {

    private String name;
    private int level = 0;
    private int experiencePoints = 0;
    private int health = 0;
    private int armorClass = 0;
    private int radiusOfSee = 0;
    private PersonSizeEnum size;

    private PersonRace personRace;
    private Set<PersonClass> personClasses = new HashSet<>();
    private Stat stat;
    private Skill skill;
    private Set<Trait> traits = new HashSet<>();
    private Set<LanguageEnum> languages = new HashSet<>();
    private Modification mods;

    private Set<SpecialSkill> specialSkills = new HashSet<>();

    private MovableObject target; //нацеленность персонажа на...
    private int countOfSpellPerDay = 0;
    private int countOfUsedSpellInThisDey = 0;
    private StatEnum mainStatToMAXSpellCount = null;
    private int[] countOfMaxKnowbleSpells = new int[10];
    private Map<Integer, Set<Spell>> spellBook = new HashMap<>();

    private God god;
    private Alignment alignment;
    private Arming arming = new Arming();
    private Inventory inventory = new Inventory();
    private Money money = new Money();

    private String story;

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

    public Modification getMods() {
        return mods;
    }
    public void setMods(Modification mods) {
        this.mods = mods;
    }

    public PersonRace getPersonRace() {
        return personRace;
    }
    public void setPersonRace(PersonRace personRace) {
        this.personRace = personRace;
    }

    public void setStats(int str, int dex, int con, int intel, int wis, int charsm) {
        stat = new Stat(str, dex, con, intel, wis, charsm);
        if(mainStatToMAXSpellCount != null)
            toCountMaxKnowbleSpell(mainStatToMAXSpellCount);
    }
    public int getStat(StatEnum statEnum) {
        return stat.getStat(statEnum);
    }
    public void appendStat(StatEnum stat, int count) {
        this.stat.appendStat(stat, count);
        if(mainStatToMAXSpellCount != null && stat.equals(mainStatToMAXSpellCount)) {
            toCountMaxKnowbleSpell(mainStatToMAXSpellCount);
        }
    }
    public int getStatModifier(StatEnum statEnum) {
        return stat.getStatModifier(statEnum);
    }

    public PersonSizeEnum getSize() {
        return size;
    }
    public void setSize(PersonSizeEnum size) {
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
                countOfMaxKnowbleSpells[i] = this.stat.getCountOfSpellModifier(stat, i);
            }
        }
    }
    public static class Builder{
        private Personage personage = new Personage();
        public Builder(){
            personage.stat = new Stat();
            personage.skill = new Skill();
            personage.mods = new Modification();
            personage.personRace = new Human(personage);
            for (int i = 0; i < 10; i++) {
                personage.spellBook.put(i, new HashSet<>());
            }
        }
        public Builder setStats(Stat stat){
            personage.stat = stat;
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
        public Builder setSkills(Skill skill){
            personage.skill = skill;
            return this;
        }
        public Builder setMods(Modification mods){
            personage.mods = mods;
            return this;
        }
        public Personage getPersonage(){
            return personage;
        }

    }
}
