package com.project.tiaBird.gameObject.geometryObject.creature.character.feat;

import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;

public class LigthArmorProficiency extends Feat {
    public LigthArmorProficiency() {
        super(FeatEnum.LIGHT_ARMOR_PROFICIENCY);
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
