package com.project.tiaBird.gameObject.geometryObject.movbleObject.personage.personRace;

import com.project.tiaBird.gameObject.geometryObject.movbleObject.personage.PersonSizeEnum;
import com.project.tiaBird.gameObject.geometryObject.movbleObject.personage.Personage;
import com.project.tiaBird.gameObject.geometryObject.movbleObject.personage.skill.SkillEnum;
import com.project.tiaBird.gameObject.geometryObject.movbleObject.personage.stat.StatEnum;

public class Gnome extends PersonRace {

    public Gnome(Personage personage) {
        super(personage);
    }

    @Override
    public void initialize() {
        personage.getMods().appendStatsMod(StatEnum.STR, -2);
        personage.getMods().appendStatsMod(StatEnum.CON, 2);
        personage.setSize(PersonSizeEnum.SMALL);
        personage.getMods().appendArmorClassMod(1);
        personage.getMods().appendCheckAttackMod(1);
        personage.setSpeed(6);
        personage.getMods().appendSkillMod(SkillEnum.Hide, 4);

        //Class is not finished
    }
}
