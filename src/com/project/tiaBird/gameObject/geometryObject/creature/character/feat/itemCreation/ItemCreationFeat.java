package com.project.tiaBird.gameObject.geometryObject.creature.character.feat.itemCreation;

import com.project.tiaBird.gameObject.geometryObject.creature.character.feat.Feat;

public abstract class ItemCreationFeat extends Feat {
    @Override
    public boolean bonusForWarrior() {
        return false;
    }
}
