package com.project.tiaBird.gameObject.geometryObject.creature.character.feat.warriorBonus;

import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;
import com.project.tiaBird.gameObject.geometryObject.creature.stat.StatEnum;

public class ImprovedTwoWeaponFighting extends WarriorBonusFeat {
    @Override
    public boolean canPersonUse(Character character) {
        return character.getStats().getStat(StatEnum.DEX) >= 17
                && character.getFeats().contains(TwoWeaponFighting.class.getSimpleName())
                && character.getPersonFullClass().getAttackThrow()[0] >= 6;
    }
}
