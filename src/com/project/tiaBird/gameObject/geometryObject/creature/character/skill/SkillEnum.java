package com.project.tiaBird.gameObject.geometryObject.creature.character.skill;

import com.project.tiaBird.gameObject.geometryObject.creature.stat.StatEnum;

public enum SkillEnum {
    Feeling_of_stone, //Только для Дварфов
    Appraise, Balance, Bluff, Climb, Concentration, Craft_Alchemy, Craft_Armorsmithing,
    Craft_Bowmaking, Craft_Weaponsmithing, Craft_Trapmaking, Craft_Varies,
    Decipher_Script, Diplomacy, Disable_Device, Disguise, Escape_Artist, Forgery, Gather_Information,
    Handle_Animal, Heal, Hide, Intimidate, Jump, Knowledge, Listen,
    Move_Silently, Open_Lock, Perform, Profession, Ride, Search, Sense_Motive,
    Sleight_Of_Hand, Speak_Language, Spellcraft, Spot, Survival, Swim, Tumble,
    Use_Magic_Device, Use_Rope;

    private boolean canUseUntrained;
    private StatEnum generalStat;
}
