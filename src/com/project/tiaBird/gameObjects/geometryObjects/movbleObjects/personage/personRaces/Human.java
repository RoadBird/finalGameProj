package com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.personRaces;

import com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.CreatureSizeEnum;
import com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.Personage;
import com.project.tiaBird.gameObjects.languages.LanguageEnum;

public class Human extends PersonRace {

    public Human(Personage personage) {
        super(personage);
        personage.setSize(CreatureSizeEnum.MEDIUM);
        personage.setSpeed(9);
        personage.addLanguages(LanguageEnum.Common);
    }
}
