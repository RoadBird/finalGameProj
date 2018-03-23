package com.project.tiaBird.gameObject.spell.spellLikeAbility;

import com.project.tiaBird.gameObject.geometryObject.creature.Creature;
import com.project.tiaBird.gameObject.spell.SpeakWithAnimals;

public class AbilitySpeakWithAnimals extends SpellLikeAbility {
    public AbilitySpeakWithAnimals(Creature creature, int spellLevel, FrequencyTimeEnum time) {
        super(creature, new SpeakWithAnimals(spellLevel), time);
    }


    @Override
    public boolean isCanBeUsed() {
        return true;
    }
}
