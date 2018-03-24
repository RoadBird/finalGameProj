package com.project.tiaBird.gameObject.geometryObject.creature.character.personRace;

import com.project.tiaBird.gameObject.effect.EffectsEnum;
import com.project.tiaBird.gameObject.geometryObject.creature.CreatureSize;
import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;
import com.project.tiaBird.gameObject.geometryObject.creature.character.modification.modificationListener.ModOfAttackWith;
import com.project.tiaBird.gameObject.geometryObject.creature.character.modification.modificationListener.ModOfDefenceFromEffect;
import com.project.tiaBird.gameObject.geometryObject.creature.character.skill.SkillEnum;
import com.project.tiaBird.gameObject.geometryObject.creature.stat.StatEnum;
import com.project.tiaBird.gameObject.geometryObject.item.equipment.weapon.Weapon;
import com.project.tiaBird.gameObject.geometryObject.item.equipment.weapon.WeaponType;
import com.project.tiaBird.gameObject.language.LanguageEnum;

public class Halfling extends PersonRace implements ModOfDefenceFromEffect, ModOfAttackWith{
    public Halfling(Character character) {
        super(character);
        character.appendStat(StatEnum.DEX, 2);
        character.appendStat(StatEnum.STR, -2);
        character.setSpeed(6);
        character.setSize(CreatureSize.SMALL);
        character.getMods().appendSkillMod(SkillEnum.Climb, 2);
        character.getMods().appendSkillMod(SkillEnum.Jump, 2);
        character.getMods().appendSkillMod(SkillEnum.Move_Silently, 2);
        character.getMods().appendModOfSavingThrowFortitude(1);
        character.getMods().appendModOfSavingThrowReflex(1);
        character.getMods().appendModOfSavingThrowWill(1);
        character.getMods().addModOfDefenceFromEffects(this);
        character.getMods().addModOfAttackWiths(this);
        character.getMods().appendSkillMod(SkillEnum.Listen, 2);
        character.addLanguages(LanguageEnum.Common);
        character.addLanguages(LanguageEnum.Halfing);
        character.addBonusLanguages(LanguageEnum.Dwarvish);
        character.addBonusLanguages(LanguageEnum.Elvish);
        character.addBonusLanguages(LanguageEnum.Gnomish);
        character.addBonusLanguages(LanguageEnum.Goblin);
        character.addBonusLanguages(LanguageEnum.Orc);
    }

    @Override
    public int getModOfDefence(EffectsEnum effect) {
        if(effect == EffectsEnum.Fear){
            return 2;
        }
        return 0;
    }

    @Override
    public int getAttackModification(Weapon weapon) {
        if(weapon.getWeaponType() == WeaponType.THROWN){
            return 1;
        }
        return 0;
    }
}
