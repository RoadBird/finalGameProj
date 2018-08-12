package com.project.tiaBird.gameObject.geometryObject.creature.character.feat.general;

import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;

public class MediumArmorProficiency extends GeneralFeat {

    @Override
    public boolean canPersonUse(Character character) {
        return character.getFeats().contains(LightArmorProficiency.class.getSimpleName());
    }
}
