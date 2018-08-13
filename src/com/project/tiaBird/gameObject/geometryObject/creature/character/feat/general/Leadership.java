package com.project.tiaBird.gameObject.geometryObject.creature.character.feat.general;

import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;

public class Leadership extends GeneralFeat {
    @Override
    public boolean canPersonUse(Character character) {
        return character.getPersonFullClass().getLevel() >= 6;
    }
}
