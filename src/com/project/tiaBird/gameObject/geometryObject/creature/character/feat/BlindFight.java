package com.project.tiaBird.gameObject.geometryObject.creature.character.feat;

import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;

public class BlindFight extends Feat {
    public BlindFight(){
        super(FeatEnum.BLIND_FIGHT);
    }

    @Override
    public boolean bonusForWarrior() {
        return true;
    }

    @Override
    public boolean canPersonUse(Character character) {
        return true;
    }
}
