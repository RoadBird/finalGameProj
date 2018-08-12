package com.project.tiaBird.gameObject.geometryObject.creature.character.feat.general;

import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;

public class ImprovedFamiliar extends GeneralFeat {
    @Override
    public boolean canPersonUse(Character character) {
        //TODO Only if person has an ability to acquire a new familiar
        return true;
    }
}
