package com.project.tiaBird.gameObject.geometryObject.creature.character.personRace;

import com.project.tiaBird.gameObject.effect.EffectsEnum;
import com.project.tiaBird.gameObject.geometryObject.creature.CreatureSize;
import com.project.tiaBird.gameObject.geometryObject.creature.CreatureVisionType;
import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;
import com.project.tiaBird.gameObject.geometryObject.creature.character.modification.modificationListener.ModOfDefenceFromEffect;
import com.project.tiaBird.gameObject.geometryObject.creature.character.modification.modificationListener.ModOfDefenceFromSpell;
import com.project.tiaBird.gameObject.effect.spell.Spell;
import com.project.tiaBird.gameObject.effect.spell.SpellTypeEnum;
import com.project.tiaBird.gameObject.geometryObject.creature.character.skill.SkillEnum;
import com.project.tiaBird.gameObject.language.LanguageEnum;

public class HalfElf extends PersonRace implements ModOfDefenceFromSpell, ModOfDefenceFromEffect{
    public HalfElf(Character character) {
        super(character);
        character.setSpeed(9);
        character.setSize(CreatureSize.MEDIUM);
        character.getMods().addModOfDefenceFromSpells(this);
        character.getMods().addModOfDefenceFromEffects(this);
        character.setVision(CreatureVisionType.Low_light);
        character.getMods().appendSkillMod(SkillEnum.LISTEN, 1);
        character.getMods().appendSkillMod(SkillEnum.SEARCH, 1);
        character.getMods().appendSkillMod(SkillEnum.SPOT, 1);
        character.getMods().appendSkillMod(SkillEnum.DIPLOMACY, 2);
        character.getMods().appendSkillMod(SkillEnum.GATHER_INFORMATION, 2);
        character.addLanguages(LanguageEnum.Common);
        character.addLanguages(LanguageEnum.Elvish);
        character.addBonusLanguages(LanguageEnum.ANY);
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
