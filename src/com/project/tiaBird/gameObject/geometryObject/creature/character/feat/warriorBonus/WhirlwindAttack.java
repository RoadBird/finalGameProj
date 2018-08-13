package com.project.tiaBird.gameObject.geometryObject.creature.character.feat.warriorBonus;

import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;
import com.project.tiaBird.gameObject.geometryObject.creature.stat.StatEnum;

public class WhirlwindAttack extends WarriorBonusFeat {
    @Override
    public boolean canPersonUse(Character character) {
        return character.getStats().getStat(StatEnum.DEX) >= 13
                && character.getStats().getStat(StatEnum.INT) >= 13
                && character.getFeats().contains(CombatExpertise.class.getSimpleName())
                && character.getFeats().contains(Dodge.class.getSimpleName())
                && character.getFeats().contains(Mobility.class.getSimpleName())
                && character.getFeats().contains(SpringAttack.class.getSimpleName())
                && character.getPersonFullClass().getAttackThrow()[0] >= 4;
    }
}
