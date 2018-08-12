package com.project.tiaBird.gameObject.geometryObject.creature.character.feat.general;

import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;
import com.project.tiaBird.gameObject.geometryObject.creature.character.feat.FeatWithKey;

public class SpellFocus extends FeatWithKey {

    public SpellFocus(String key) {
        super(key);
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
