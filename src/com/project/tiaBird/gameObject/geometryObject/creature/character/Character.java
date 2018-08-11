package com.project.tiaBird.gameObject.geometryObject.creature.character;

import com.project.tiaBird.gameObject.effect.spell.spellLikeAbility.SpellLikeAbility;
import com.project.tiaBird.gameObject.geometryObject.creature.Creature;
import com.project.tiaBird.gameObject.geometryObject.creature.character.classes.AbstractPersonClass;
import com.project.tiaBird.gameObject.geometryObject.creature.character.classes.PersonFullClass;
import com.project.tiaBird.gameObject.geometryObject.creature.character.modification.Modification;
import com.project.tiaBird.gameObject.geometryObject.creature.character.personRace.Human;
import com.project.tiaBird.gameObject.geometryObject.creature.character.personRace.PersonRace;
import com.project.tiaBird.gameObject.geometryObject.creature.character.skill.Skill;
import com.project.tiaBird.gameObject.geometryObject.creature.character.feat.FeatList;
import com.project.tiaBird.gameObject.geometryObject.creature.stat.Stat;
import com.project.tiaBird.gameObject.geometryObject.creature.stat.StatEnum;
import com.project.tiaBird.gameObject.geometryObject.item.Money;
import com.project.tiaBird.gameObject.geometryObject.item.SpellBook;
import com.project.tiaBird.gameObject.god.God;
import com.project.tiaBird.gameObject.language.LanguageEnum;

import java.util.HashSet;
import java.util.Set;

public class Character extends Creature {

    private int experiencePoints = 0;
    private int freePointsOfTraits = 0;
    private int freePointsOfStats = 0;

    private PersonRace personRace;
    private PersonFullClass personFullClass = new PersonFullClass(this);
    private Skill skill = new Skill();
    private FeatList feats = new FeatList(this);
    private ArmamentQualification qualification = new ArmamentQualification();
    private Set<LanguageEnum> languages = new HashSet<>();
    private Set<LanguageEnum> bonusLanguages = new HashSet<>();

    private Set<SpellLikeAbility> spellLikeAbilities = new HashSet<>();

    private Creature target; //нацеленность персонажа на...

//    private StatEnum mainStatToMAXSpellCount = null;
//    private int[] countOfMaxKnowbleSpells = new int[11];
    private SpellBook spellBook;

    private God god;
    private Alignment alignment;
    private Arming arming = new Arming();
    private Inventory inventory = new Inventory();
    private Money money = new Money();

    private String story;

    public Character() {}

//    public abstract int getSavingThrowFortitude();
//
//    public abstract int getSavingThrowReflex();
//
//    public abstract int getSavingThrowWill();
//
//    public abstract int getSpellsPerDay();

    //    public abstract void levelUP();

    //    public abstract void addExperiencePoints(int count);

    // public abstract void newTrait();

    // public abstract void appendStat();

    // public abstract void appendSkills();

    public void appendMaxHealf(int count){
        maxHealth += count;
    }

    public void appendMoney(Money money){
        this.money.appendMoney(money);
    }

    //TODO продвижение только на один уровень иначе на 2, но -1 очко опыта
    //TODO передача управления  игроку для выбора класса
    //TODO добавлять свободные очки черт и навыков
    //public void appendExperiencePoints(int points);

    public Set<LanguageEnum> getLanguages() {
        return languages;
    }
    public void addLanguages(LanguageEnum language) {
        languages.add(language);
    }
    //TODO количество бонусных языков на старте зависит от бонуса интеллекта
    public void learningANewLanguage(LanguageEnum language){
        if(bonusLanguages.contains(language)){
            this.languages.add(language);
        }
    }
    public Set<LanguageEnum> getBonusLanguages() {
        return bonusLanguages;
    }
    public void addBonusLanguages(LanguageEnum bonusLanguage) {
        this.bonusLanguages.add(bonusLanguage);
    }

    public Arming getArming() {
        return arming;
    }

    public void setArming(Arming arming) {
        this.arming = arming;
    }

    public ArmamentQualification getQualification() {
        return qualification;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Skill getSkill(){
        return skill;
    }
    //TODO Добавить проверку скилла: Д20 + ранг навыка + модификатор параметра + различные модификации

    public int getFreePointOfSkill() {
        return personFullClass.getFreePointOfSkill();
    }

    //public abstract void addSpell(Spell spell);

    public SpellBook getSpellBook(){
        return spellBook;
    }

    public void addSpellLikeAbilities(SpellLikeAbility spellLikeAbility) {
        this.spellLikeAbilities.add(spellLikeAbility);
    }

    public PersonRace getPersonRace() {
        return personRace;
    }

    public Alignment getAlignment() {
        return alignment;
    }

    public void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }

    public FeatList getFeats(){
        return feats;
    }

    public static class Builder{
        private Character character = new Character();
        public Builder(){
            character.setMods(new Modification());
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
            character.setMods(mods);
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
