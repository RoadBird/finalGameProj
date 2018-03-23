package com.project.tiaBird.gameObject.spell.spellLikeAbility;

import com.project.tiaBird.gameObject.geometryObject.creature.Creature;
import com.project.tiaBird.gameObject.geometryObject.creature.stat.StatEnum;
import com.project.tiaBird.gameObject.spell.DancingLights;

public class AbilityGhostSound extends SpellLikeAbility {
    public AbilityGhostSound(Creature creature, int spellLevel, FrequencyTimeEnum time) {
        super(creature, new DancingLights(spellLevel), time);
    }

    @Override
    public boolean isCanBeUsed() {
        if(creature.getStat(StatEnum.CHAR) < 10){
            return false;
        }
        return true;
    }
}
