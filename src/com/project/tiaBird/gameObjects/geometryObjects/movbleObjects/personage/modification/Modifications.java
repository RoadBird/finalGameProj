package com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.modification;

import com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.modification.modificatinListeners.ModOfAttackAgainst;
import com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.modification.modificatinListeners.ModOfAttackWith;
import com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.modification.modificatinListeners.ModOfDefeceFromPerson;
import com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.modification.modificatinListeners.ModOfDefenceFromSpell;
import com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.stats.StatEnum;

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
    private Map<StatEnum, Integer> satsMod = new HashMap<>();
}
