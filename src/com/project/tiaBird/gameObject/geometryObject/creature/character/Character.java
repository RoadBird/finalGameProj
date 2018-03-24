package com.project.tiaBird.gameObject.geometryObject.creature.character;

import com.project.tiaBird.gameObject.geometryObject.creature.Creature;
import com.project.tiaBird.gameObject.geometryObject.creature.CreatureSize;
import com.project.tiaBird.gameObject.geometryObject.creature.CreatureVisionType;
import com.project.tiaBird.gameObject.geometryObject.creature.character.classes.AbstractPersonClass;
import com.project.tiaBird.gameObject.geometryObject.creature.character.modification.Modification;
import com.project.tiaBird.gameObject.geometryObject.creature.character.personRace.Human;
import com.project.tiaBird.gameObject.geometryObject.creature.character.skill.Skill;
import com.project.tiaBird.gameObject.geometryObject.creature.character.skill.SkillEnum;
import com.project.tiaBird.gameObject.geometryObject.creature.stat.StatEnum;
import com.project.tiaBird.gameObject.geometryObject.creature.character.trait.Trait;
import com.project.tiaBird.gameObject.geometryObject.item.Money;
import com.project.tiaBird.gameObject.geometryObject.creature.character.classes.PersonFullClass;
import com.project.tiaBird.gameObject.geometryObject.creature.character.personRace.PersonRace;
import com.project.tiaBird.gameObject.geometryObject.creature.stat.Stat;
import com.project.tiaBird.gameObject.geometryObject.item.SpellBook;
import com.project.tiaBird.gameObject.god.God;
import com.project.tiaBird.gameObject.language.LanguageEnum;
import com.project.tiaBird.gameObject.effect.spell.spellLikeAbility.SpellLikeAbility;
import com.project.tiaBird.gameObject.effect.spell.Spell;

import java.util.HashSet;
import java.util.Set;

public class Character extends Creature {

    private String name;
    private int experiencePoints = 0;
    private int health = 0;
    private int armorClass = 0;
    private int radiusOfSee = 0;
    private CreatureVisionType vision = CreatureVisionType.Normal;
    private CreatureSize size = CreatureSize.MEDIUM;

    private PersonRace personRace;
    private PersonFullClass personFullClass = new PersonFullClass(this);
    private Skill skill = new Skill();
    private Set<Trait> traits = new HashSet<>();
    private Set<LanguageEnum> languages = new HashSet<>();
    private Set<LanguageEnum> bonusLanguages = new HashSet<>();
    private Modification mods;

    private Set<SpellLikeAbility> spellLikeAbilities = new HashSet<>();

    private Creature target; //нацеленность персонажа на...

    private StatEnum mainStatToMAXSpellCount = null;
    private int[] countOfMaxKnowbleSpells = new int[11];
    private SpellBook spellBook;

    private God god;
    private Alignment alignment;
    private Arming arming = new Arming();
    private Inventory inventory = new Inventory();
    private Money money = new Money();

    private String story;

    private Character() {}

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
    public Set<LanguageEnum> getBonusLanguages() {
        return bonusLanguages;
    }
    public void addBonusLanguages(LanguageEnum bonusLanguage) {
        this.bonusLanguages.add(bonusLanguage);
    }

    public Skill getSkill(){
        return skill;
    }

    public void addSpell(Spell spell) {
        if (spellBook != null && spell.getLevel() < 11) {
            if (countOfMaxKnowbleSpells[spell.getLevel()] < spellBook.getSpellSet(spell.getLevel()).size()) {
                spellBook.putSpell(spell);
            }
        }
    }
    public SpellBook getSpellBook(){
        return spellBook;
    }

    public void addSpellLikeAbilities(SpellLikeAbility spellLikeAbility) {
        this.spellLikeAbilities.add(spellLikeAbility);
    }

    public Modification getMods() {
        return mods;
    }

    public PersonRace getPersonRace() {
        return personRace;
    }

    @Override
    public void appendStat(StatEnum stat, int count) {
        appendStat(stat, count);
        if(mainStatToMAXSpellCount != null && stat.equals(mainStatToMAXSpellCount)) {
            toCountMaxKnowbleSpell(mainStatToMAXSpellCount);
        }
    }

    public CreatureSize getSize() {
        return size;
    }
    public void setSize(CreatureSize size) {
        switch (this.size){
            case FINE:
                changeModsWithSize(-8);
                break;
            case DIMINUTIVE:
                changeModsWithSize(-4);
                break;
            case TINY:
                changeModsWithSize(-2);
                break;
            case SMALL:
                changeModsWithSize(-1);
                break;
            case LARGE:
                changeModsWithSize(1);
                break;
            case HUGE:
                changeModsWithSize(2);
                break;
            case GARGANTUAN:
                changeModsWithSize(4);
                break;
            case COLOSSAL:
                changeModsWithSize(8);
                break;
        }
        switch (size){
            case FINE:
                changeModsWithSize(8);
                break;
            case DIMINUTIVE:
                changeModsWithSize(4);
                break;
            case TINY:
                changeModsWithSize(2);
                break;
            case SMALL:
                changeModsWithSize(1);
                break;
            case LARGE:
                changeModsWithSize(-1);
                break;
            case HUGE:
                changeModsWithSize(-2);
                break;
            case GARGANTUAN:
                changeModsWithSize(-4);
                break;
            case COLOSSAL:
                changeModsWithSize(-8);
                break;
        }

        this.size = size;
    }
    private void changeModsWithSize(int count){
        getMods().appendArmorClassMod(count);
        getMods().appendCheckAttackMod(count);
        getMods().appendSkillMod(SkillEnum.Hide, count*4);
    }

    public CreatureVisionType getVision() {
        return vision;
    }
    public void setVision(CreatureVisionType vision) {
        this.vision = vision;
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
                countOfMaxKnowbleSpells[i] = getStat().getCountOfSpellModifier(stat, i);
            }
        }
    }
    public static class Builder{
        private Character character = new Character();
        public Builder(){
            character.skill = new Skill();
            character.mods = new Modification();
            character.personFullClass = new PersonFullClass(character);
            character.personRace = new Human(character);
        }
        public Builder setStats(Stat stat){
            character.appendStat(StatEnum.CHAR, stat.getStat(StatEnum.CHAR) - 10);
            character.appendStat(StatEnum.CON, stat.getStat(StatEnum.CON) - 10);
            character.appendStat(StatEnum.DEX, stat.getStat(StatEnum.DEX) - 10);
            character.appendStat(StatEnum.INT, stat.getStat(StatEnum.INT) - 10);
            character.appendStat(StatEnum.STR, stat.getStat(StatEnum.STR) - 10);
            character.appendStat(StatEnum.WIS, stat.getStat(StatEnum.WIS) - 10);
            return this;
        }
        public Builder setRace(PersonRace race){
            character.personRace = race;
            return this;
        }
        public Builder setSkills(Skill skill){
            character.skill = skill;
            return this;
        }
        public Builder setMods(Modification mods){
            character.mods = mods;
            return this;
        }
        public Builder addNewPersonClass(AbstractPersonClass personClass){
            character.personFullClass.newClass(personClass);
            return this;
        }
        public Character getCharacter(){
            return character;
        }

    }
}
