package com.project.tiaBird.gameObject.geometryObject.creature.character.personRace;

import com.project.tiaBird.gameObject.effect.EffectsEnum;
import com.project.tiaBird.gameObject.geometryObject.PositionEnum;
import com.project.tiaBird.gameObject.geometryObject.creature.Creature;
import com.project.tiaBird.gameObject.geometryObject.creature.CreatureSize;
import com.project.tiaBird.gameObject.geometryObject.creature.CreatureTypeEnum;
import com.project.tiaBird.gameObject.geometryObject.creature.CreatureVisionType;
import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;
import com.project.tiaBird.gameObject.geometryObject.creature.character.modification.modificationListener.ModOfAttackAgainst;
import com.project.tiaBird.gameObject.geometryObject.creature.character.modification.modificationListener.ModOfDefenceFromEffect;
import com.project.tiaBird.gameObject.geometryObject.creature.character.modification.modificationListener.ModOfDefenceFromPerson;
import com.project.tiaBird.gameObject.geometryObject.creature.character.modification.modificationListener.ModOfDefenceFromSpell;
import com.project.tiaBird.gameObject.geometryObject.creature.character.skill.SkillEnum;
import com.project.tiaBird.gameObject.geometryObject.creature.stat.StatEnum;
import com.project.tiaBird.gameObject.language.LanguageEnum;
import com.project.tiaBird.gameObject.effect.spell.Spell;

public class Dwarf extends PersonRace implements ModOfDefenceFromEffect, ModOfDefenceFromSpell,
        ModOfAttackAgainst, ModOfDefenceFromPerson {
    public Dwarf(Character character) {
        super(character);
        character.appendStat(StatEnum.CON, 2);
        character.appendStat(StatEnum.CHAR, -2);
        character.setSize(CreatureSize.MEDIUM);
        character.setSpeed(6);
        character.setVision(CreatureVisionType.Darkvision);
        character.getMods().addModOfDefenceFromSpells(this);
        character.getMods().addModOfDefenceFromEffects(this);
        character.getMods().addModOfAttackAgainsts(this);
        character.getMods().addModOfDefeceFromPersons(this);
        character.getMods().appendSkillMod(SkillEnum.APPRAISE, 2);
        character.getMods().appendSkillMod(SkillEnum.CRAFT_ARMORSMITHING, 2);
        character.getMods().appendSkillMod(SkillEnum.CRAFT_WEAPONSMITHING, 2);
        character.getMods().appendSkillMod(SkillEnum.CRAFT_TRAPMAKING, 2);
        character.getMods().appendSkillMod(SkillEnum.CRAFT_VARIES, 2);
        character.addLanguages(LanguageEnum.COMMON);
        character.addLanguages(LanguageEnum.DWARVISH);
        character.addBonusLanguages(LanguageEnum.GIANT);
        character.addBonusLanguages(LanguageEnum.GOBLIN);
        character.addBonusLanguages(LanguageEnum.ORC);
        character.addBonusLanguages(LanguageEnum.UNDERCOMMON);
        character.addBonusLanguages(LanguageEnum.TERRAN);
    }

    @Override
    public int getModOfDefence(EffectsEnum effect) {
        if((effect == EffectsEnum.Bull_rushed || effect == EffectsEnum.Tripped)
                && character.getPosition() == PositionEnum.ON_THE_GROUND){
            return 4;
        }
        if(effect == EffectsEnum.Poison){
            return 2;
        }
        return 0;
    }

    @Override
    public int getDefenceModification(Spell spell) {
        return 2;
    }

    @Override
    public int getAttackModification(Creature target) {
        if(target.getCreatureType() == CreatureTypeEnum.GOBLINOID ||
                target.getCreatureType() == CreatureTypeEnum.ORC){
            return 1;
        }
        return 0;
    }


    @Override
    public int getDefenceModification(Creature target) {
        if(target.getCreatureType() == CreatureTypeEnum.GIANT){
            return 4;
        }
        return 0;
    }
}
