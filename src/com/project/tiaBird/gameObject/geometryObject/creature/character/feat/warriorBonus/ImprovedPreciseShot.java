package com.project.tiaBird.gameObject.geometryObject.creature.character.feat.warriorBonus;

import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;
import com.project.tiaBird.gameObject.geometryObject.creature.stat.StatEnum;

public class ImprovedPreciseShot extends WarriorBonusFeat {
    @Override
    public boolean canPersonUse(Character character) {
        return character.getStats().getStat(StatEnum.DEX) >= 19
                && character.getFeats().contains(PointBlankShot.class.getSimpleName())
                && character.getFeats().contains(PreciseShot.class.getSimpleName())
                && character.getPersonFullClass().getAttackThrow()[0] >= 11;
    }
}
