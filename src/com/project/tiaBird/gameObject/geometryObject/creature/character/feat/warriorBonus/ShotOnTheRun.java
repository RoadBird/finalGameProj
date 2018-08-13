package com.project.tiaBird.gameObject.geometryObject.creature.character.feat.warriorBonus;

import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;
import com.project.tiaBird.gameObject.geometryObject.creature.stat.StatEnum;

public class ShotOnTheRun extends WarriorBonusFeat {
    @Override
    public boolean canPersonUse(Character character) {
        return character.getStats().getStat(StatEnum.DEX) >= 13
                && character.getFeats().contains(Dodge.class.getSimpleName())
                && character.getFeats().contains(Mobility.class.getSimpleName())
                && character.getFeats().contains(PointBlankShot.class.getSimpleName())
                && character.getPersonFullClass().getAttackThrow()[0] >= 4;
    }
}
