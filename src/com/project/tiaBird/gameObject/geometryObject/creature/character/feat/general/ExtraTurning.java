package com.project.tiaBird.gameObject.geometryObject.creature.character.feat.general;

import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;

public class ExtraTurning extends GeneralFeat {
    @Override
    public boolean canPersonUse(Character character) {
        //TODO Person must have an ability to turn or rebuke creatures
        return true;
    }
}
