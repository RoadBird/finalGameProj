package com.project.tiaBird.gameObject.geometryObject.creature.character.feat.warriorBonus;

import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;
import com.project.tiaBird.gameObject.geometryObject.creature.character.skill.SkillEnum;

public class MountedCombat extends WarriorBonusFeat {
    @Override
    public boolean canPersonUse(Character character) {
        return character.getSkills().getSkill(SkillEnum.RIDE) >= 1;
    }
}
