package com.project.tiaBird.gameObject.geometryObject.creature.character.feat;

import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;
import com.project.tiaBird.gameObject.geometryObject.creature.stat.StatEnum;

public class Dodge extends Feat {
    @Override
    public boolean bonusForWarrior() {
        return true;
    }

    @Override
    public boolean canPersonUse(Character character) {
        return character.getStat().getStat(StatEnum.DEX) >= 13;
    }
}