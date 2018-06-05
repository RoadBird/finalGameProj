package com.project.tiaBird.gameObject.geometryObject.creature.character.personRace;

import com.project.tiaBird.gameObject.effect.EffectsEnum;
import com.project.tiaBird.gameObject.effect.spell.Spell;
import com.project.tiaBird.gameObject.effect.spell.SpellTypeEnum;
import com.project.tiaBird.gameObject.geometryObject.creature.CreatureSize;
import com.project.tiaBird.gameObject.geometryObject.creature.CreatureVisionType;
import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;
import com.project.tiaBird.gameObject.geometryObject.creature.character.modification.modificationListener.ModOfDefenceFromEffect;
import com.project.tiaBird.gameObject.geometryObject.creature.character.modification.modificationListener.ModOfDefenceFromSpell;
import com.project.tiaBird.gameObject.geometryObject.creature.character.skill.SkillEnum;
import com.project.tiaBird.gameObject.geometryObject.creature.stat.StatEnum;
import com.project.tiaBird.gameObject.language.LanguageEnum;

public class HighElf extends PersonRace implements ModOfDefenceFromEffect, ModOfDefenceFromSpell{
    public HighElf(Character character) {
        super(character);
        character.appendStat(StatEnum.DEX, 2);
        character.appendStat(StatEnum.CON, -2);
        character.setSize(CreatureSize.MEDIUM);
        character.setSpeed(9);
        character.getMods().addModOfDefenceFromEffects(this);
        character.getMods().addModOfDefenceFromSpells(this);
        character.setVision(CreatureVisionType.Low_light);
        character.getMods().appendSkillMod(SkillEnum.SEARCH, 2);
        character.getMods().appendSkillMod(SkillEnum.LISTEN, 2);
        character.getMods().appendSkillMod(SkillEnum.SPOT, 2);
        character.addLanguages(LanguageEnum.Common);
        character.addLanguages(LanguageEnum.Elvish);
        character.addBonusLanguages(LanguageEnum.Dragon_Turtle);
        character.addBonusLanguages(LanguageEnum.Gnoll);
        character.addBonusLanguages(LanguageEnum.Gnomish);
        character.addBonusLanguages(LanguageEnum.Goblin);
        character.addBonusLanguages(LanguageEnum.Orc);
        character.addBonusLanguages(LanguageEnum.Sylph);
    }


    @Override
    public int getDefenceModification(Spell spell) {
        if(spell.getType() == SpellTypeEnum.SLEEP){
            return 100;
        }
        if(spell.getType() == SpellTypeEnum.ENCHANTMENT){
            return 2;
        }
        return 0;
    }

    @Override
    public int getModOfDefence(EffectsEnum effect) {
        if(effect == EffectsEnum.ENCHANTMENT){
            return 2;
        }
        return 0;
    }
}
