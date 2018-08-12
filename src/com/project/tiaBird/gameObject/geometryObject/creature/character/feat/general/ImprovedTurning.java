package com.project.tiaBird.gameObject.geometryObject.creature.character.feat.general;

import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;

public class ImprovedTurning extends GeneralFeat {
    @Override
    public boolean canPersonUse(Character character) {
        //TODO Only if person has ability to turn or rebuke creatures
        return true;
    }
}
