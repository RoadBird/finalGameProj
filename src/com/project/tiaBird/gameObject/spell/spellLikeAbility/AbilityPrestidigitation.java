package com.project.tiaBird.gameObject.spell.spellLikeAbility;

import com.project.tiaBird.gameObject.geometryObject.creature.Creature;
import com.project.tiaBird.gameObject.geometryObject.creature.stat.StatEnum;
import com.project.tiaBird.gameObject.spell.Prestidigitation;

public class AbilityPrestidigitation extends SpellLikeAbility {
    public AbilityPrestidigitation(Creature creature, int spellLevel, FrequencyTimeEnum time) {
        super(creature, new Prestidigitation(spellLevel), time);
    }

    @Override
    public boolean isCanBeUsed() {
        if(creature.getStat(StatEnum.CHAR) < 10){
            return false;
        }
        return true;
    }
}
