package com.project.tiaBird.gameObject.geometryObject.creature.character.feat.warriorBonus;

import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;

public class PreciseShot extends WarriorBonusFeat {
    @Override
    public boolean canPersonUse(Character character) {
        return character.getFeats().contains(PointBlankShot.class.getSimpleName());
    }
}
