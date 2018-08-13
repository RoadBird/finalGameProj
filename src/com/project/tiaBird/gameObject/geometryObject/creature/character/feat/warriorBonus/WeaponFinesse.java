package com.project.tiaBird.gameObject.geometryObject.creature.character.feat.warriorBonus;

import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;

public class WeaponFinesse extends WarriorBonusFeat {
    @Override
    public boolean canPersonUse(Character character) {
        return character.getPersonFullClass().getAttackThrow()[0] >= 1;
    }
}
