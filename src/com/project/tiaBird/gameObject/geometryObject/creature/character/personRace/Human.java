package com.project.tiaBird.gameObject.geometryObject.creature.character.personRace;

import com.project.tiaBird.gameObject.geometryObject.creature.CreatureSize;
import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;
import com.project.tiaBird.gameObject.language.LanguageEnum;

public class Human extends PersonRace {

    public Human(Character character) {
        super(character);
        character.setSize(CreatureSize.MEDIUM);
        character.setSpeed(9);
        character.addLanguages(LanguageEnum.COMMON);
        character.addBonusLanguages(LanguageEnum.ANY);
    }
}
