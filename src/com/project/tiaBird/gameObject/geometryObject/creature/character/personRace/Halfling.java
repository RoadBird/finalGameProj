package com.project.tiaBird.gameObject.geometryObject.creature.character.personRace;

import com.project.tiaBird.gameObject.effect.EffectsEnum;
import com.project.tiaBird.gameObject.geometryObject.creature.CreatureSize;
import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;
import com.project.tiaBird.gameObject.geometryObject.creature.character.modification.modificationListener.ModOfAttackWith;
import com.project.tiaBird.gameObject.geometryObject.creature.character.modification.modificationListener.ModOfDefenceFromEffect;
import com.project.tiaBird.gameObject.geometryObject.creature.character.skill.SkillEnum;
import com.project.tiaBird.gameObject.geometryObject.creature.stat.StatEnum;
import com.project.tiaBird.gameObject.geometryObject.item.equipment.qualifiedEquipment.weapon.Weapon;
import com.project.tiaBird.gameObject.geometryObject.item.equipment.qualifiedEquipment.weapon.weaponParameters.WeaponType;
import com.project.tiaBird.gameObject.language.LanguageEnum;

public class Halfling extends PersonRace implements ModOfDefenceFromEffect, ModOfAttackWith{
    public Halfling(Character character) {
        super(character);
        character.appendStat(StatEnum.DEX, 2);
        character.appendStat(StatEnum.STR, -2);
        character.setSpeed(6);
        character.setSize(CreatureSize.SMALL);
        character.getMods().appendSkillMod(SkillEnum.CLIMB, 2);
        character.getMods().appendSkillMod(SkillEnum.JUMP, 2);
        character.getMods().appendSkillMod(SkillEnum.MOVE_SILENTLY, 2);
        character.getMods().appendModOfSavingThrowFortitude(1);
        character.getMods().appendModOfSavingThrowReflex(1);
        character.getMods().appendModOfSavingThrowWill(1);
        character.getMods().addModOfDefenceFromEffects(this);
        character.getMods().addModOfAttackWiths(this);
        character.getMods().appendSkillMod(SkillEnum.LISTEN, 2);
        character.addLanguages(LanguageEnum.COMMON);
        character.addLanguages(LanguageEnum.HALFING);
        character.addBonusLanguages(LanguageEnum.DWARVISH);
        character.addBonusLanguages(LanguageEnum.ELVISH);
        character.addBonusLanguages(LanguageEnum.GNOMISH);
        character.addBonusLanguages(LanguageEnum.GOBLIN);
        character.addBonusLanguages(LanguageEnum.ORC);
    }

    @Override
    public int getModOfDefence(EffectsEnum effect) {
        if(effect == EffectsEnum.INTIMIDATE){
            return 2;
        }
        return 0;
    }

    @Override
    public int getAttackModification(Weapon weapon) {
        if(weapon.getWeaponCharacteristics().getWeaponType() == WeaponType.THROWING){
            return 1;
        }
        return 0;
    }
}
