package com.project.tiaBird.gameObject.geometryObject.creature.character.personRace;

import com.project.tiaBird.gameObject.geometryObject.creature.CreatureSize;
import com.project.tiaBird.gameObject.geometryObject.creature.CreatureVisionType;
import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;
import com.project.tiaBird.gameObject.geometryObject.creature.character.skill.SkillEnum;
import com.project.tiaBird.gameObject.geometryObject.creature.stat.StatEnum;

public class Dwarf extends PersonRace {
    public Dwarf(Character character) {
        super(character);
        character.appendStat(StatEnum.CON, 2);
        character.appendStat(StatEnum.CHAR, -2);
        character.setSize(CreatureSize.MEDIUM);
        character.setSpeed(6);
        character.setVision(CreatureVisionType.Darkvision);
        character.getSkill().appendSkill(SkillEnum.Feeling_of_stone, 2);
    }
}
