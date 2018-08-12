package com.project.tiaBird.gameObject.geometryObject.creature.character.feat;

import com.project.tiaBird.gameObject.effect.MagicSchoolEnum;
import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;

public class AugmentSummoning extends Feat {
    @Override
    public boolean bonusForWarrior() {
        return false;
    }

    @Override
    public boolean canPersonUse(Character character) {
        return character.getFeats().contains(SpellFocus.class.getSimpleName(), MagicSchoolEnum.CONJURATION.name());
    }
}
