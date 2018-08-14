package com.project.tiaBird.gameObject.geometryObject.creature.character.classes;

import com.project.tiaBird.gameObject.GameObject;
import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;
import com.project.tiaBird.gameObject.geometryObject.creature.character.personRace.Human;
import com.project.tiaBird.gameObject.geometryObject.creature.character.skill.Skill;
import com.project.tiaBird.gameObject.geometryObject.creature.stat.StatEnum;

import java.util.HashSet;
import java.util.Set;

public class PersonFullClass extends GameObject {

    private Character character;
    private int level = 0;
    private Set<AbstractPersonClass> personFullClasses = new HashSet<>();

    public PersonFullClass(Character character){
        this.character = character;
    }

    public Set<AbstractPersonClass> getPersonFullClasses() {
        return personFullClasses;
    }

    public void levelApp(AbstractPersonClass personClass){
        personClass.levelUp();
        level++;
        if(level == 1) {
            character.setFreePointOfSkill(character.getFreePointOfSkill()
                    + (personClass.getPointOfSkillPerLevel() + character.getStatModifier(StatEnum.INT)) * 4);
            character.setFreePointsOfFeats(character.getFreePointsOfFeats() + 1);
            if(character.getPersonRace() instanceof Human){
                character.setFreePointOfSkill(character.getFreePointOfSkill() + 4);
                character.setFreePointsOfFeats(character.getFreePointsOfFeats() + 1);
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
            if(level % 3 == 0){
                character.setFreePointsOfFeats(character.getFreePointsOfFeats() + 1);
            }
            if(level % 4 == 0){
                character.setFreePointsOfStats(character.getFreePointsOfStats() + 1);
            }
            character.setFreePointOfSkill(character.getFreePointOfSkill()
                    +  personClass.getPointOfSkillPerLevel() + character.getStatModifier(StatEnum.INT));
            if(character.getPersonRace() instanceof Human){
                character.setFreePointOfSkill(character.getFreePointOfSkill() + 1);
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


}
