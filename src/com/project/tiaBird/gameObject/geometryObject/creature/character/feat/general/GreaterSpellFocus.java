package com.project.tiaBird.gameObject.geometryObject.creature.character.feat.general;

import com.project.tiaBird.gameObject.effect.MagicSchoolEnum;
import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;
import com.project.tiaBird.gameObject.geometryObject.creature.character.feat.FeatWithKey;

public class GreaterSpellFocus extends FeatWithKey {
    public GreaterSpellFocus(MagicSchoolEnum key) {
        super(key.name());
    }

    @Override
    public boolean bonusForWarrior() {
        return false;
    }

    @Override
    public boolean canPersonUse(Character character) {
        return character.getFeats().contains(SpellFocus.class.getSimpleName(), getKey());
    }
}
