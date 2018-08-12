package com.project.tiaBird.gameObject.geometryObject.creature.character.feat;

import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;

public class Athletic extends Feat {
    public Athletic(){
        super(FeatEnum.ATHLETIC);
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
