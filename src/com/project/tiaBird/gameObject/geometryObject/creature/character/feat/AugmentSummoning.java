package com.project.tiaBird.gameObject.geometryObject.creature.character.feat;

import com.project.tiaBird.gameObject.effect.MagicSchoolEnum;
import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;

public class AugmentSummoning extends Feat {
    public AugmentSummoning(){
        super(FeatEnum.AUGMENT_SUMMONING);
    }

    @Override
    public boolean bonusForWarrior() {
        return false;
    }

    @Override
    public boolean canPersonUse(Character character) {
        return character.getFeats().contains(FeatEnum.SPELL_FOCUS, MagicSchoolEnum.CONJURATION);
    }
}
