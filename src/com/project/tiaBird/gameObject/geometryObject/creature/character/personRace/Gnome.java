package com.project.tiaBird.gameObject.geometryObject.creature.character.personRace;

import com.project.tiaBird.gameObject.geometryObject.creature.Creature;
import com.project.tiaBird.gameObject.geometryObject.creature.CreatureSize;
import com.project.tiaBird.gameObject.geometryObject.creature.CreatureTypeEnum;
import com.project.tiaBird.gameObject.geometryObject.creature.character.modification.modificatinListener.ModOfCastSpell;
import com.project.tiaBird.gameObject.geometryObject.creature.character.modification.modificatinListener.ModOfDefeceFromPerson;
import com.project.tiaBird.gameObject.geometryObject.creature.character.modification.modificatinListener.ModOfDefenceFromSpell;
import com.project.tiaBird.gameObject.geometryObject.creature.character.skill.SkillEnum;
import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;
import com.project.tiaBird.gameObject.geometryObject.creature.character.stat.StatEnum;
import com.project.tiaBird.gameObject.language.LanguageEnum;
import com.project.tiaBird.gameObject.spell.Spell;
import com.project.tiaBird.gameObject.spell.SpellTypeEnum;

public class Gnome extends PersonRace implements ModOfDefenceFromSpell, ModOfCastSpell, ModOfDefeceFromPerson{

    public Gnome(Character character) {
        super(character);
        character.appendStat(StatEnum.STR, -2);
        character.appendStat(StatEnum.CON, 2);
        character.setSize(CreatureSize.SMALL);
        character.getMods().appendArmorClassMod(1);
        character.getMods().appendCheckAttackMod(1);
        character.setSpeed(6);
        character.getMods().appendSkillMod(SkillEnum.Hide, 4);
        character.getMods().addModOfDefenceFromSpells(this);
        character.getMods().addModOfCastSpells(this);
        character.getMods().addModOfDefeceFromPersons(this);
        character.getMods().appendSkillMod(SkillEnum.Listen, 2);
        character.addLanguages(LanguageEnum.Common);
        character.addLanguages(LanguageEnum.Gnomish);

        //is not finished
    }

    @Override
    public int getDefenceModificatin(Spell spell) {
        if(spell.getType() == SpellTypeEnum.ILLUSION){
            return 2;
        }
        return 0;
    }

    @Override
    public void setModOfCastSpell(Spell spell) {
        if(spell.getType() == SpellTypeEnum.ILLUSION){
            spell.appendComplexityClass(1);
        }
    }

    @Override
    public int getDefenceModificatin(Creature target) {
        if (target.getCreatureType() == CreatureTypeEnum.GIANT){
            return 4;
        }
        return 0;
    }
}
