package com.project.tiaBird.gameObject.geometryObject.movbleObject.personage.personRace;

import com.project.tiaBird.gameObject.geometryObject.movbleObject.personage.Personage;

public abstract class PersonRace {

    Personage personage;

    public PersonRace(Personage personage){
        this.personage = personage;
    }

    public abstract void initialize();

}
