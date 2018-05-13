package com.project.tiaBird.gameObject.geometryObject.creature.character.classes;

import com.project.tiaBird.exception.AppendException;
import com.project.tiaBird.gameObject.GameObject;
import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;
import com.project.tiaBird.gameObject.geometryObject.creature.character.personRace.Human;
import com.project.tiaBird.gameObject.geometryObject.creature.character.skill.Skill;
import com.project.tiaBird.gameObject.geometryObject.creature.character.skill.SkillEnum;
import com.project.tiaBird.gameObject.geometryObject.creature.stat.StatEnum;

import java.util.HashSet;
import java.util.Set;

public class PersonFullClass extends GameObject {

    private Character character;
    private Skill skills;
    private int freePointOfSkill = 0;
    private int level = 0;
    private Set<AbstractPersonClass> personFullClasses = new HashSet<>();

    public PersonFullClass(Character character){
        this.character = character;
        skills = character.getSkill();
    }

    public Skill getSkills() {
        return skills;
    }

    public int getFreePointOfSkill() {
        return freePointOfSkill;
    }

    public Set<AbstractPersonClass> getPersonFullClasses() {
        return personFullClasses;
    }

    public void levelApp(AbstractPersonClass personClass){
        personClass.levelUp();
        level++;
        if(level == 1) {
            freePointOfSkill += (personClass.getPointOfSkillPerLevel() + character.getStatModifier(StatEnum.INT)) * 4;
            if(character.getPersonRace() instanceof Human){
                freePointOfSkill += 4;
            }
            int hp = personClass.getMaxHP() + character.getStatModifier(StatEnum.CON);
            if(hp <=0) {
                hp = 1;
            }
            character.appendMaxHealf(hp);
            character.appendMoney(personClass.getStartMoney());
            character.setInventory(personClass.getStartInventory());
            character.setArming(personClass.getStartArming());
        } else {
            freePointOfSkill += personClass.getPointOfSkillPerLevel() + character.getStatModifier(StatEnum.INT);
            if(character.getPersonRace() instanceof Human){
                freePointOfSkill++;
            }
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

    public void appendSkill(SkillEnum skill) throws AppendException {
        if(getMaxSkillRang(skill) > skills.getSkill(skill) + 0.5) {
            if (isClassSkill(skill)) {
                skills.appendSkill(skill, 1);
            } else {
                skills.appendSkill(skill, 0.5);
            }
        } else if (getMaxSkillRang(skill) == skills.getSkill(skill) + 0.5 &&
                !isClassSkill(skill)){
            skills.appendSkill(skill, 0.5);
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

    private double getMaxSkillRang(SkillEnum skill){
        if(isClassSkill(skill)){
            return level + 3;
        } else {
            return (level + 3) / 2;
        }
    }
}
