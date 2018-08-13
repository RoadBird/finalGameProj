package com.project.tiaBird.gameObject.geometryObject.creature.character.feat.warriorBonus;

import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;
import com.project.tiaBird.gameObject.geometryObject.creature.stat.StatEnum;

public class StunningFist extends WarriorBonusFeat {
    @Override
    public boolean canPersonUse(Character character) {
        return character.getStats().getStat(StatEnum.DEX) >= 13
                && character.getStats().getStat(StatEnum.WIS) >= 13
                && character.getFeats().contains(ImprovedUnarmedStrike.class.getSimpleName())
                && character.getPersonFullClass().getAttackThrow()[0] >= 8;
    }
}
