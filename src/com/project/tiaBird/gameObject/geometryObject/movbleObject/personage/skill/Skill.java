package com.project.tiaBird.gameObject.geometryObject.movbleObject.personage.skill;

import java.util.HashMap;
import java.util.Map;

public class Skill {
    private Map<SkillEnum, Integer> skillsMap = new HashMap();

    public Skill() {
        SkillEnum[] skills = SkillEnum.values();
        for (int i = 0; i < skills.length; i++) {
            skillsMap.put(skills[i], 0);
        }
    }

    public void appendSkill(SkillEnum skill, int count){
        skillsMap.put(skill, skillsMap.get(skill) + count);
    }

    public int getSkill(SkillEnum skill){
        return skillsMap.get(skill);
    }
}