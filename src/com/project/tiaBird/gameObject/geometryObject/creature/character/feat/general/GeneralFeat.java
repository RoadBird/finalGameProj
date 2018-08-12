package com.project.tiaBird.gameObject.geometryObject.creature.character.feat.general;

import com.project.tiaBird.gameObject.geometryObject.creature.character.feat.Feat;

public abstract class GeneralFeat extends Feat {
    @Override
    public boolean bonusForWarrior() {
        return false;
    }
}
