package com.project.tiaBird.gameObject.geometryObject.creature.character.feat;

import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;

public class HeavyArmorProficiency extends Feat {
    public HeavyArmorProficiency(){
        super(FeatEnum.HEAVY_ARMOR_PROFICIENCY);
    }

    @Override
    public boolean bonusForWarrior() {
        return false;
    }

    @Override
    public boolean canPersonUse(Character character) {
        return character.getFeats().contains(FeatEnum.LIGHT_ARMOR_PROFICIENCY)
                && character.getFeats().contains(FeatEnum.MEDIUM_ARMOR_PROFICIENCY);
    }
}
