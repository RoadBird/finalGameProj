package com.project.tiaBird.gameObject.geometryObject.creature.character.skill;

import com.project.tiaBird.exception.AppendException;
import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;
import com.project.tiaBird.gameObject.geometryObject.creature.character.classes.AbstractPersonClass;

public class SkillAppender {
    public void appendSkill(Character person, SkillEnum skill) throws AppendException {
        if(getMaxSkillRang(person, skill) > person.getSkills().getSkill(skill) + 0.5) {
            if (isClassSkill(person, skill)) {
                person.getSkills().appendSkill(skill, 1);
            } else {
                person.getSkills().appendSkill(skill, 0.5);
            }
        } else if (getMaxSkillRang(person, skill) == person.getSkills().getSkill(skill) + 0.5 &&
                !isClassSkill(person, skill)){
            person.getSkills().appendSkill(skill, 0.5);
        } else {
            throw new AppendException("Cannot append skill. Max limited");
        }
    }

    private boolean isClassSkill(Character person, SkillEnum skill){
        for(AbstractPersonClass cl : person.getPersonFullClass().getPersonFullClasses()){
            if(cl.getClassSkills().contains(skill)){
                return true;
            }
        }
        return false;
    }

    private double getMaxSkillRang(Character person, SkillEnum skill){
        if(isClassSkill(person, skill)){
            return person.getPersonFullClass().getLevel() + 3;
        } else {
            return (person.getPersonFullClass().getLevel() + 3) / 2;
        }
    }
}
