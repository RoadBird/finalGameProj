package com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.personRaces;

import com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.CreatureSizeEnum;
import com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.Personage;
import com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.skills.SkillEnum;
import com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.stats.StatEnum;

public class Gnome extends PersonRace {

    public Gnome(Personage personage) {
        super(personage);
        personage.getMods().appendStatsMod(StatEnum.STR, -2);
        personage.getMods().appendStatsMod(StatEnum.CON, 2);
        personage.setSize(CreatureSizeEnum.SMALL);
        personage.getMods().appendArmorClassMod(1);
        personage.getMods().appendCheckAttackMod(1);
        personage.setSpeed(6);
        personage.getMods().appendSkillMod(SkillEnum.Hide, 4);
        
        //Class is not finished
    }
}
