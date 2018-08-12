package com.project.tiaBird.gameObject.geometryObject.creature.character.feat.warriorBonus;

import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;
import com.project.tiaBird.gameObject.geometryObject.creature.character.feat.general.ShieldProficiency;

public class ImprovedShieldBash extends WarriorBonusFeat{
    @Override
    public boolean canPersonUse(Character character) {
        return character.getFeats().contains(ShieldProficiency.class.getSimpleName());
    }
}
