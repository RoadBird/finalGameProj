package com.project.tiaBird.gameObject.geometryObject.creature.character.feat.warriorBonus;

import com.project.tiaBird.gameObject.geometryObject.creature.character.feat.Feat;

public abstract class WarriorBonusFeat extends Feat {
    @Override
    public boolean bonusForWarrior() {
        return true;
    }
}
