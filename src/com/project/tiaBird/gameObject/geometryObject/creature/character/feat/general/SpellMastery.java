package com.project.tiaBird.gameObject.geometryObject.creature.character.feat.general;

import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;
import com.project.tiaBird.gameObject.geometryObject.creature.character.classes.Wizard;

public class SpellMastery extends GeneralFeat {
    @Override
    public boolean canPersonUse(Character character) {
        return character.getPersonFullClass().getPersonFullClasses().stream()
                .anyMatch(abstractPersonClass -> abstractPersonClass.getClass().getName()
                        .equals(Wizard.class.getSimpleName()));
    }
}
