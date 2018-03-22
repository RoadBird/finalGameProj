package com.project.tiaBird.gameObject.geometryObject.creature.character.modification;

import com.project.tiaBird.gameObject.GameObject;
import com.project.tiaBird.gameObject.geometryObject.creature.character.modification.modificatinListener.*;
import com.project.tiaBird.gameObject.geometryObject.creature.character.skill.Skill;
import com.project.tiaBird.gameObject.geometryObject.creature.character.skill.SkillEnum;
import com.project.tiaBird.gameObject.geometryObject.creature.character.stat.StatEnum;
import com.project.tiaBird.gameObject.geometryObject.creature.character.stat.Stat;

import java.util.LinkedList;
import java.util.List;

public class Modification extends GameObject {
    private int healfMod = 0;
    private int armorClassMod = 0;
    private int checkAttackMod = 0;
    private int modOfSavingThrowFortitude = 0;
    private int modOfSavingThrowReflex = 0;
    private int modOfSavingThrowWill = 0;
    private List<ModOfAttackAgainst> modOfAttackAgainsts = new LinkedList<>();
    private List<ModOfAttackWith> modOfAttackWiths = new LinkedList<>();
    private List<ModOfDefeceFromPerson> modOfDefeceFromPersons = new LinkedList<>();
    private List<ModOfDefenceFromSpell> modOfDefenceFromSpells = new LinkedList<>();
    private List<ModOfCastSpell> modOfCastSpells = new LinkedList<>();
    private Stat statMod = new Stat();
    private Skill skillMod = new Skill();

    public int getHealfMod() {
        return healfMod;
    }

    public void appendHealfMod(int healfMod) {
        this.healfMod += healfMod;
    }

    public int getArmorClassMod() {
        return armorClassMod;
    }

    public void appendArmorClassMod(int armorClassMod) {
        this.armorClassMod += armorClassMod;
    }

    public int getCheckAttackMod() {
        return checkAttackMod;
    }

    public void appendCheckAttackMod(int checkAttackMod) {
        this.checkAttackMod += checkAttackMod;
    }

    public int getModOfSavingThrowFortitude() {
        return modOfSavingThrowFortitude;
    }

    public void appendModOfSavingThrowFortitude(int modOfSavingThrowFortitude) {
        this.modOfSavingThrowFortitude += modOfSavingThrowFortitude;
    }

    public int getModOfSavingThrowReflex() {
        return modOfSavingThrowReflex;
    }

    public void appendModOfSavingThrowReflex(int modOfSavingThrowReflex) {
        this.modOfSavingThrowReflex += modOfSavingThrowReflex;
    }

    public int getModOfSavingThrowWill() {
        return modOfSavingThrowWill;
    }

    public void appendModOfSavingThrowWill(int modOfSavingThrowWill) {
        this.modOfSavingThrowWill += modOfSavingThrowWill;
    }

    public List<ModOfAttackAgainst> getModOfAttackAgainsts() {
        return modOfAttackAgainsts;
    }

    public void addModOfAttackAgainsts(ModOfAttackAgainst modOfAttackAgainsts) {
        this.modOfAttackAgainsts.add(modOfAttackAgainsts);
    }

    public void removeModOfAttackAgainsts(ModOfAttackAgainst modOfAttackAgainsts) {
        this.modOfAttackAgainsts.remove(modOfAttackAgainsts);
    }

    public List<ModOfAttackWith> getModOfAttackWiths() {
        return modOfAttackWiths;
    }

    public void addModOfAttackWiths(ModOfAttackWith modOfAttackWiths) {
        this.modOfAttackWiths.add(modOfAttackWiths);
    }

    public void removeModOfAttackWiths(ModOfAttackWith modOfAttackWiths) {
        this.modOfAttackWiths.remove(modOfAttackWiths);
    }

    public List<ModOfDefeceFromPerson> getModOfDefeceFromPersons() {
        return modOfDefeceFromPersons;
    }

    public void addModOfDefeceFromPersons(ModOfDefeceFromPerson modOfDefeceFromPersons) {
        this.modOfDefeceFromPersons.add(modOfDefeceFromPersons);
    }

    public void removeModOfDefeceFromPersons(ModOfDefeceFromPerson modOfDefeceFromPersons) {
        this.modOfDefeceFromPersons.remove(modOfDefeceFromPersons);
    }

    public List<ModOfDefenceFromSpell> getModOfDefenceFromSpells() {
        return modOfDefenceFromSpells;
    }

    public void addModOfDefenceFromSpells(ModOfDefenceFromSpell modOfDefenceFromSpells) {
        this.modOfDefenceFromSpells.add(modOfDefenceFromSpells);
    }

    public void removeModOfDefenceFromSpells(ModOfDefenceFromSpell modOfDefenceFromSpells) {
        this.modOfDefenceFromSpells.remove(modOfDefenceFromSpells);
    }

    public List<ModOfCastSpell> getModOfCastSpells() {
        return modOfCastSpells;
    }

    public void addModOfCastSpells(ModOfCastSpell modOfCastSpells) {
        this.modOfCastSpells.add(modOfCastSpells);
    }

    public void removeModOfCastSpells(ModOfCastSpell modOfCastSpells) {
        this.modOfCastSpells.remove(modOfCastSpells);
    }

    public int getStatsMod(StatEnum stat) {
        return statMod.getStat(stat);
    }

    public void appendStatsMod(StatEnum stat, int cout) {
        statMod.appendStat(stat, cout);
    }

    public int getSkillsMod(SkillEnum skill) {
        return skillMod.getSkill(skill);
    }

    public void appendSkillMod(SkillEnum skill, int count) {
        skillMod.appendSkill(skill, count);
    }

}
