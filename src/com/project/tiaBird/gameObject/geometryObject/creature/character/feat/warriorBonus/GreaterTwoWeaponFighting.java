package com.project.tiaBird.gameObject.geometryObject.creature.character.feat.warriorBonus;

import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;
import com.project.tiaBird.gameObject.geometryObject.creature.stat.StatEnum;

public class GreaterTwoWeaponFighting extends WarriorBonusFeat {
    @Override
    public boolean canPersonUse(Character character) {
        return character.getStats().getStat(StatEnum.DEX) >= 19
                && character.getFeats().contains(TwoWeaponFighting.class.getSimpleName())
                && character.getFeats().contains(ImprovedTwoWeaponFighting.class.getSimpleName())
                && character.getPersonFullClass().getAttackThrow()[0] >= 11;
    }
}
