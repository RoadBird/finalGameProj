package com.project.tiaBird.gameObject.geometryObject.creature.character.feat.warriorBonus;

import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;
import com.project.tiaBird.gameObject.geometryObject.creature.character.feat.FeatWithKey;
import com.project.tiaBird.gameObject.geometryObject.item.equipment.qualifiedEquipment.weapon.weaponParameters.WeaponEquivalent;

public class WeaponFocus extends FeatWithKey {
    public WeaponFocus(String key) {
        super(key);
    }

    @Override
    public boolean bonusForWarrior() {
        return true;
    }

    @Override
    public boolean canPersonUse(Character character) {
        return character.getQualification().hasQualification(WeaponEquivalent.valueOf(getKey()))
                && character.getPersonFullClass().getAttackThrow()[0] >= 1;
    }
}
