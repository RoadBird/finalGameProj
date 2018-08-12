package com.project.tiaBird.gameObject.geometryObject.creature.character.feat.general;

import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;

public class HeavyArmorProficiency extends GeneralFeat {

    @Override
    public boolean canPersonUse(Character character) {
        return character.getFeats().contains(LightArmorProficiency.class.getSimpleName())
                && character.getFeats().contains(MediumArmorProficiency.class.getSimpleName());
    }
}
