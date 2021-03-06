package com.project.tiaBird.gameObject.geometryObject.creature.character.feat.warriorBonus;

import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;
import com.project.tiaBird.gameObject.geometryObject.creature.character.classes.Warrior;
import com.project.tiaBird.gameObject.geometryObject.creature.character.feat.FeatWithKey;
import com.project.tiaBird.gameObject.geometryObject.item.equipment.qualifiedEquipment.weapon.weaponParameters.WeaponEquivalent;

public class GreaterWeaponFocus extends FeatWithKey {
    public GreaterWeaponFocus(WeaponEquivalent key) {
        super(key.name());
    }

    @Override
    public boolean bonusForWarrior() {
        return true;
    }

    @Override
    public boolean canPersonUse(Character character) {
        return character.getFeats().contains(WeaponFocus.class.getSimpleName(), getKey())
                && character.getPersonFullClass().getPersonFullClasses().stream().anyMatch(
                        abstractPersonClass -> abstractPersonClass.getClass()
                                .getSimpleName().contains(Warrior.class.getSimpleName())
                                && abstractPersonClass.getLevel() >= 8);
    }
}
