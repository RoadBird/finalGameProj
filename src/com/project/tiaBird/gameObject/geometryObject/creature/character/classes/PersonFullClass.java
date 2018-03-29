package com.project.tiaBird.gameObject.geometryObject.creature.character.classes;

import com.project.tiaBird.exception.AppendException;
import com.project.tiaBird.gameObject.GameObject;
import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;
import com.project.tiaBird.gameObject.geometryObject.creature.character.skill.Skill;
import com.project.tiaBird.gameObject.geometryObject.creature.character.skill.SkillEnum;
import com.project.tiaBird.gameObject.geometryObject.creature.stat.StatEnum;
import com.project.tiaBird.gameObject.geometryObject.item.equipment.armor.Armor;
import com.project.tiaBird.gameObject.geometryObject.item.equipment.armor.Shield;
import com.project.tiaBird.gameObject.geometryObject.item.equipment.weapon.Weapon;

import java.util.HashSet;
import java.util.Set;

public class PersonFullClass extends GameObject {

    private Character character;
    private Set<Weapon> weaponQualification = new HashSet<>();
    private Set<Armor> armorQualification = new HashSet<>();
    private Set<Shield> shieldQualification = new HashSet<>();
    private Skill skills;
    private int freePointOfSkill = 0;
    private int level = 0;
    private Set<AbstractPersonClass> personFullClasses = new HashSet<>();

    public PersonFullClass(Character character){
        this.character = character;
        skills = character.getSkill();
    }



    public void levelApp(AbstractPersonClass personClass){
        personClass.levelUp();
        level++;
        if(level == 1) {
            int hp = personClass.getMaxHP() + character.getStatModifier(StatEnum.CON);
            freePointOfSkill += personClass.getPointOfSkillPerLevel() * 4;
            if(hp <=0) {
                hp = 1;
            }
            character.appendMaxHealf(hp);
            character.appendMoney(personClass.getMoney());
            character.setInventory(personClass.getStartInventory());
            character.setArming(personClass.getStartArming());
        } else {
            freePointOfSkill += personClass.getPointOfSkillPerLevel();
            int hp = personClass.getNewHP() + character.getStatModifier(StatEnum.CON);
            if(hp <=0) {
                hp = 1;
            }
            character.appendMaxHealf(hp);
        }
    }

    public void newClass(AbstractPersonClass personClass){
        personFullClasses.add(personClass);
        levelApp(personClass);
    }

    public void leaveClass(AbstractPersonClass personClass){
        personClass.leaveTheClass();
    }

    public int getLevel(){
        return level;
    }

    public Set<Weapon> getWeaponQualification() {
        return weaponQualification;
    }

    public Set<Armor> getArmorQualification() {
        return armorQualification;
    }

    public Set<Shield> getShieldQualification() {
        return shieldQualification;
    }

    public int[] getAttackThrow(){
        int[] toReturn = new int[] {0, 0, 0, 0};
        for (AbstractPersonClass cl : personFullClasses){
            int[] temp = cl.getAttackThrow();
            for (int i = 0; i < temp.length; i++){
                toReturn[i] += temp[i];
            }
        }
        return toReturn;
    }
    public  int getSavingThrowFortitude(){
        int toReturn = 0;
        for (AbstractPersonClass cl : personFullClasses){
            toReturn += cl.getSavingThrowFortitude();
        }
        return toReturn;
    }
    public int getSavingThrowReflex(){
        int toReturn = 0;
        for (AbstractPersonClass cl : personFullClasses){
            toReturn += cl.getSavingThrowReflex();
        }
        return toReturn;
    }
    public int getSavingThrowWill(){
        int toReturn = 0;
        for (AbstractPersonClass cl : personFullClasses){
            toReturn += cl.getSavingThrowWill();
        }
        return toReturn;
    }


    //Что делать, если до максимума не хватает 0.5, а повышается на 1 ???
    public void appendSkill(SkillEnum skill) throws AppendException {
        if(maxSkillRang(skill) > skills.getSkill(skill)){
            if(isClassSkill(skill)) {
                skills.appendSkill(skill, 1);
            } else {
                skills.appendSkill(skill, 0.5);
            }
        } else {
            throw new AppendException("Cannot append skill. Max limited");
        }
    }

    private boolean isClassSkill(SkillEnum skill){
        for(AbstractPersonClass cl : personFullClasses){
            if(cl.getClassSkills().contains(skill)){
                return true;
            }
        }
        return false;
    }

    private double maxSkillRang(SkillEnum skill){
        if(isClassSkill(skill)){
            return level + 3;
        } else {
            return (level + 3) / 2;
        }
    }
}
