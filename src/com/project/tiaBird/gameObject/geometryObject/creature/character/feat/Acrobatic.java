package com.project.tiaBird.gameObject.geometryObject.creature.character.feat;

import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;

public class Acrobatic extends Feat {
    public Acrobatic(){
        super(FeatEnum.ACROBATIC);
    }
    @Override
    public boolean bonusForWarrior() {
        return false;
    }

    @Override
    public boolean canPersonUse(Character character) {
        return true;
    }
}
