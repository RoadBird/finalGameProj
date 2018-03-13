package com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.skills;

import java.util.HashMap;
import java.util.Map;

public class Skills {
    private Map<SkillEnum, Integer> skillsMap = new HashMap();

    public Skills() {
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
