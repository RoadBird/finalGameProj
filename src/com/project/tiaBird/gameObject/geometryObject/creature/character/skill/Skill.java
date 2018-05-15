package com.project.tiaBird.gameObject.geometryObject.creature.character.skill;

import java.util.HashMap;
import java.util.Map;

public class Skill {
    private Map<SkillEnum, Double> skillsMap = new HashMap();

    public Skill() {
        SkillEnum[] skills = SkillEnum.values();
        for (int i = 0; i < skills.length; i++) {
            skillsMap.put(skills[i], 0.0);
        }
    }

    public void appendSkill(SkillEnum skill, double count){
        skillsMap.put(skill, skillsMap.get(skill) + count);
    }

    public double getSkill(SkillEnum skill){
        return skillsMap.get(skill);
    }

    //TODO запилить сюда синергию
    //TODO запилить изучение нового языка
}
