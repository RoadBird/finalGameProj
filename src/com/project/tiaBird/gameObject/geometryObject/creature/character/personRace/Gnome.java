package com.project.tiaBird.gameObject.geometryObject.creature.character.personRace;

import com.project.tiaBird.gameObject.geometryObject.creature.CreatureSize;
import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;
import com.project.tiaBird.gameObject.geometryObject.creature.character.skill.SkillEnum;
import com.project.tiaBird.gameObject.geometryObject.creature.character.stat.StatEnum;

public class Gnome extends PersonRace {

    public Gnome(Character character) {
        super(character);
    }

    @Override
    public void initialize() {
        character.getMods().appendStatsMod(StatEnum.STR, -2);
        character.getMods().appendStatsMod(StatEnum.CON, 2);
        character.setSize(CreatureSize.SMALL);
        character.getMods().appendArmorClassMod(1);
        character.getMods().appendCheckAttackMod(1);
        character.setSpeed(6);
        character.getMods().appendSkillMod(SkillEnum.Hide, 4);

        //Class is not finished
    }
}
