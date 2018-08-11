package com.project.tiaBird.gameObject.geometryObject.creature.character.feat;

import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;

public class AnimalAffinity extends Feat {
    public AnimalAffinity() {
        super(FeatEnum.ANIMAL_AFFINITY);
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
