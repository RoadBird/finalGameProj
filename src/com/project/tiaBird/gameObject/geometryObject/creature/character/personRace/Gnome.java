package com.project.tiaBird.gameObject.geometryObject.creature.character.personRace;

import com.project.tiaBird.gameObject.geometryObject.creature.Creature;
import com.project.tiaBird.gameObject.geometryObject.creature.CreatureSize;
import com.project.tiaBird.gameObject.geometryObject.creature.CreatureTypeEnum;
import com.project.tiaBird.gameObject.geometryObject.creature.CreatureVisionType;
import com.project.tiaBird.gameObject.geometryObject.creature.character.modification.modificationListener.ModOfCastSpell;
import com.project.tiaBird.gameObject.geometryObject.creature.character.modification.modificationListener.ModOfDefenceFromPerson;
import com.project.tiaBird.gameObject.geometryObject.creature.character.modification.modificationListener.ModOfDefenceFromSpell;
import com.project.tiaBird.gameObject.geometryObject.creature.character.skill.SkillEnum;
import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;
import com.project.tiaBird.gameObject.geometryObject.creature.stat.StatEnum;
import com.project.tiaBird.gameObject.language.LanguageEnum;
import com.project.tiaBird.gameObject.effect.spell.*;
import com.project.tiaBird.gameObject.effect.spell.spellLikeAbility.*;

public class Gnome extends PersonRace implements ModOfDefenceFromSpell, ModOfCastSpell, ModOfDefenceFromPerson {

    public Gnome(Character character) {
        super(character);
        character.appendStat(StatEnum.STR, -2);
        character.appendStat(StatEnum.CON, 2);
        character.setSize(CreatureSize.SMALL);
        character.setSpeed(6);
        character.setVision(CreatureVisionType.Low_light);
        character.getMods().addModOfDefenceFromSpells(this);
        character.getMods().addModOfCastSpells(this);
        character.getMods().addModOfDefeceFromPersons(this);
        character.getMods().appendSkillMod(SkillEnum.LISTEN, 2);
        character.getMods().appendSkillMod(SkillEnum.CRAFT_ALCHEMY, 2);
        character.addLanguages(LanguageEnum.COMMON);
        character.addLanguages(LanguageEnum.GNOMISH);
        character.addBonusLanguages(LanguageEnum.DWARVISH);
        character.addBonusLanguages(LanguageEnum.DRAGON_TURTLE);
        character.addBonusLanguages(LanguageEnum.ELVISH);
        character.addBonusLanguages(LanguageEnum.GIANT);
        character.addBonusLanguages(LanguageEnum.GOBLIN);
        character.addBonusLanguages(LanguageEnum.ORC);
        character.addSpellLikeAbilities(new AbilitySpeakWithAnimals(character, 1, FrequencyTimeEnum.Once_a_day));
        character.addSpellLikeAbilities(new AbilityDancingLights(character, 1, FrequencyTimeEnum.Once_a_day));
        character.addSpellLikeAbilities(new AbilityDancingLights(character, 1, FrequencyTimeEnum.Once_a_day));
        character.addSpellLikeAbilities(new AbilityPrestidigitation(character, 1, FrequencyTimeEnum.Once_a_day));
    }

    @Override
    public int getDefenceModification(Spell spell) {
        if(spell.getType() == SpellTypeEnum.ILLUSION){
            return 2;
        }
        return 0;
    }

    @Override
    public void setModOfCastSpell(Spell spell) {
        if(spell.getType() == SpellTypeEnum.ILLUSION){
            spell.appendDifficultyClass(1);
        }
    }

    @Override
    public int getDefenceModification(Creature target) {
        int toReturn = 0;
        if (target.getCreatureType() == CreatureTypeEnum.GIANT){
            toReturn += 4;
        }
        if (target.getCreatureType() == CreatureTypeEnum.KOBOLD
                || target.getCreatureType() == CreatureTypeEnum.GOBLINOID){
            toReturn += 1;
        }
        return toReturn;
    }
}
