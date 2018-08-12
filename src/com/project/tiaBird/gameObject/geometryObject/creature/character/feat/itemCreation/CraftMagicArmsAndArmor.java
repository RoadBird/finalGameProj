package com.project.tiaBird.gameObject.geometryObject.creature.character.feat.itemCreation;

import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;
import com.project.tiaBird.gameObject.geometryObject.creature.character.classes.Caster;

public class CraftMagicArmsAndArmor extends ItemCreationFeat {
    @Override
    public boolean canPersonUse(Character character) {
        return character.getPersonFullClass().getPersonFullClasses().stream()
                .anyMatch(abstractPersonClass -> abstractPersonClass.getClass().getName().equals(Caster.class.getSimpleName())
                        && abstractPersonClass.getLevel() >= 5);
    }
}
