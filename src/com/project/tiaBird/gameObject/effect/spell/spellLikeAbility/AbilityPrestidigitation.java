package com.project.tiaBird.gameObject.effect.spell.spellLikeAbility;

import com.project.tiaBird.gameObject.effect.spell.Prestidigitation;
import com.project.tiaBird.gameObject.geometryObject.creature.Creature;
import com.project.tiaBird.gameObject.geometryObject.creature.stat.StatEnum;

public class AbilityPrestidigitation extends SpellLikeAbility {
    public AbilityPrestidigitation(Creature creature, int spellLevel, FrequencyTimeEnum time) {
        super(creature, new Prestidigitation(spellLevel), time);
    }

    @Override
    public boolean isCanBeUsed() {
        if(creature.getStats().getStat(StatEnum.CHAR) < 10){
            return false;
        }
        return true;
    }
}
