package com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.skills;

import com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage.stats.StatEnum;

public enum SkillEnum {
    Appraise, Balance, Bluff, Climb, Concentration, Craft, Decipher_Script,
    Diplomacy, Disable_Device, Disguise, Escape_Artist, Forgery, Gather_Information,
    Handle_Animal, Heal, Hide, Intimidate, Jump, Knowledge, Listen,
    Move_Silently, Open_Lock, Perform, Profession, Ride, Search, Sense_Motive,
    Sleight_Of_Hand, Speak_Language, Spellcraft, Spot, Survival, Swim, Tumble,
    Use_Magic_Device, Use_Rope;

    private boolean canUseUntrained;
    private StatEnum generalStat;
}
