package com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.modification;

import com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.modification.modificatinListeners.ModOfAttackAgainst;
import com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.modification.modificatinListeners.ModOfAttackWith;
import com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.modification.modificatinListeners.ModOfDefeceFromPerson;
import com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.modification.modificatinListeners.ModOfDefenceFromSpell;
import com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.skills.SkillEnum;
import com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.skills.Skills;
import com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.stats.StatEnum;
import com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.stats.Stats;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Modifications {
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
    private Stats statsMod = new Stats();
    private Skills skillsMod = new Skills();

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

    public int getStatsMod(StatEnum stat) {
        return statsMod.getStat(stat);
    }
    public void appendStatsMod(StatEnum stat, int cout) {
        statsMod.appendStat(stat, cout);
    }

    public int getSkillsMod(SkillEnum skill) {
        return skillsMod.getSkill(skill);
    }
    public void appendSkillMod(SkillEnum skill, int count) {
        skillsMod.appendSkill(skill, count);
    }

}
