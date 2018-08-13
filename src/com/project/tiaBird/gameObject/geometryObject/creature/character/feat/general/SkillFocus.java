package com.project.tiaBird.gameObject.geometryObject.creature.character.feat.general;

import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;
import com.project.tiaBird.gameObject.geometryObject.creature.character.feat.FeatWithKey;
import com.project.tiaBird.gameObject.geometryObject.creature.character.skill.SkillEnum;

public class SkillFocus extends FeatWithKey {
    public SkillFocus(SkillEnum key) {
        super(key.name());
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
