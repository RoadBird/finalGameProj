package com.project.tiaBird.gameObject.geometryObject.creature.character.feat.metamagic;

import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;
import com.project.tiaBird.gameObject.geometryObject.creature.character.feat.Feat;

public class MetamagicFeat extends Feat {
    @Override
    public boolean bonusForWarrior() {
        return false;
    }

    @Override
    public boolean canPersonUse(Character character) {
        return true;
    }
}
