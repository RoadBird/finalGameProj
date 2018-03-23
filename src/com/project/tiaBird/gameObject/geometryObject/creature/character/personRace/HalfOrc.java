package com.project.tiaBird.gameObject.geometryObject.creature.character.personRace;

import com.project.tiaBird.gameObject.geometryObject.creature.CreatureSize;
import com.project.tiaBird.gameObject.geometryObject.creature.CreatureVisionType;
import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;
import com.project.tiaBird.gameObject.geometryObject.creature.stat.StatEnum;
import com.project.tiaBird.gameObject.language.LanguageEnum;

public class HalfOrc extends PersonRace {
    public HalfOrc(Character character) {
        super(character);
        character.appendStat(StatEnum.STR, 2);
        character.appendStat(StatEnum.INT, -2);
        character.appendStat(StatEnum.CHAR, -2);
        character.setSize(CreatureSize.MEDIUM);
        character.setSpeed(9);
        character.setVision(CreatureVisionType.Darkvision);
        character.addLanguages(LanguageEnum.Common);
        character.addLanguages(LanguageEnum.Orc);
        character.addBonusLanguages(LanguageEnum.Dragon_Turtle);
        character.addBonusLanguages(LanguageEnum.Giant);
        character.addBonusLanguages(LanguageEnum.Gnoll);
        character.addBonusLanguages(LanguageEnum.Goblin);
        character.addBonusLanguages(LanguageEnum.Abyssal);
    }
}
