package com.project.tiaBird.gameObject.geometryObject.creature.character.feat;

import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;

public class HeavyArmorProficiency extends Feat {
    @Override
    public boolean bonusForWarrior() {
        return false;
    }

    @Override
    public boolean canPersonUse(Character character) {
        return character.getFeats().contains(LightArmorProficiency.class.getSimpleName())
                && character.getFeats().contains(MediumArmorProficiency.class.getSimpleName());
    }
}
