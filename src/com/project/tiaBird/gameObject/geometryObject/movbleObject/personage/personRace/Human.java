package com.project.tiaBird.gameObject.geometryObject.movbleObject.personage.personRace;

import com.project.tiaBird.gameObject.geometryObject.movbleObject.personage.PersonSizeEnum;
import com.project.tiaBird.gameObject.geometryObject.movbleObject.personage.Personage;
import com.project.tiaBird.gameObject.language.LanguageEnum;

public class Human extends PersonRace {

    public Human(Personage personage) {
        super(personage);
    }

    @Override
    public void initialize() {
        personage.setSize(PersonSizeEnum.MEDIUM);
        personage.setSpeed(9);
        personage.addLanguages(LanguageEnum.Common);
    }
}
