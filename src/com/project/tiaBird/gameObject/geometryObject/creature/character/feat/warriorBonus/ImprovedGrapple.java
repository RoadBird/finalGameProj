package com.project.tiaBird.gameObject.geometryObject.creature.character.feat.warriorBonus;

import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;
import com.project.tiaBird.gameObject.geometryObject.creature.stat.StatEnum;

public class ImprovedGrapple extends WarriorBonusFeat {
    @Override
    public boolean canPersonUse(Character character) {
        return character.getStats().getStat(StatEnum.DEX) >= 13
                && character.getFeats().contains(ImprovedUnarmedStrike.class.getSimpleName());
    }
}
