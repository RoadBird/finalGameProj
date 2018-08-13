package com.project.tiaBird.gameObject.geometryObject.creature.character.feat.general;

import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;

public class TowerShieldProficiency extends GeneralFeat {
    @Override
    public boolean canPersonUse(Character character) {
        return character.getFeats().contains(ShieldProficiency.class.getSimpleName());
    }
}
