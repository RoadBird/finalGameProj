package com.project.tiaBird.gameObject.geometryObject.creature.character.feat.warriorBonus;

import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;
import com.project.tiaBird.gameObject.geometryObject.creature.character.feat.FeatWithKey;

public class ExoticWeaponProficiency extends FeatWithKey {

    public ExoticWeaponProficiency(String key) {
        super(key);
    }

    @Override
    public boolean bonusForWarrior() {
        return true;
    }

    @Override
    public boolean canPersonUse(Character character) {
        return character.getPersonFullClass().getAttackThrow()[0] >= 1;
    }
}
