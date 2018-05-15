package com.project.tiaBird.gameObject.geometryObject.creature.character.skill;

import com.project.tiaBird.gameObject.geometryObject.creature.stat.StatEnum;

public enum SkillEnum {
    SPEAK_LANGUAGE(false, null, 0), //Особое повышение навыка
    Appraise, BALANCE(true, StatEnum.DEX, 1), BLUFF(true, StatEnum.CHAR, 0), CLIMB(true, StatEnum.STR, 1),
    CONCENTRATION(true, StatEnum.CON, 0), Craft_Alchemy, Craft_Armorsmithing,
    Craft_Bowmaking, Craft_Weaponsmithing, Craft_Trapmaking, Craft_Varies,
    Decipher_Script, DIPLOMACY(true, StatEnum.CHAR, 0), DISABLE_DEVICE(false, StatEnum.INT, 0),
    Disguise, ESCAPE_ARTIST(true, StatEnum.DEX, 1), Forgery, Gather_Information,
    Handle_Animal, Heal, Hide, INTIMIDATE(true, StatEnum.CHAR, 0), Jump, KNOWLEDGE_ARCANA(false, StatEnum.INT, 0),
    KNOWLEDGE_ENGINEERING(false, StatEnum.INT, 0), KNOWLEDGE_DUNGEONEERING(false, StatEnum.INT, 0),
    KNOWLEDGE_HISTORY(false, StatEnum.INT, 0), KNOWLEDGE_LOCAL(false, StatEnum.INT, 0), KNOWLEDGE_NATURE(false, StatEnum.INT, 0),
    KNOWLEDGE_NOBILITY(false, StatEnum.INT, 0), KNOWLEDGE_RELIGION(false, StatEnum.INT, 0),
    KNOWLEDGE_THE_PLANES(false, StatEnum.INT, 0), Listen,
    MOVE_SILENTLY(true, StatEnum.DEX, 1), OPEN_LOCK(false, StatEnum.DEX, 0),
    PERFORM_ACT(true, StatEnum.CHAR, 0), PERFORM_COMEDY(true, StatEnum.CHAR, 0), PERFORM_DANCE(true, StatEnum.CHAR, 0),
    PERFORM_KEYBOARD_INSTRUMENTS(true, StatEnum.CHAR, 0), PERFORM_ORATORY(true, StatEnum.CHAR, 0),
    PERFORM_PERCUSSION_INSTRUMENTS(true, StatEnum.CHAR, 0), PERFORM_STRING_INSTRUMENTS(true, StatEnum.CHAR, 0),
    PERFORM_WIND_INSTRUMENTS(true, StatEnum.CHAR, 0), PERFORM_SING(true, StatEnum.CHAR, 0),

    Profession, RIDE(true, StatEnum.DEX, 0), Search, Sense_Motive,
    Sleight_Of_Hand, SPELLCRAFT(false, StatEnum.INT, 0), Spot, SURVIVAL(true, StatEnum.WIS, 0), Swim, Tumble,
    USE_MAGIC_DEVICE(false, StatEnum.CHAR, 0), USE_ROPE(true, StatEnum.DEX, 0);

    private boolean canUseUntrained;
    private StatEnum generalStat;
    private int penaltyForArmor;

    SkillEnum(boolean canUseUntrained, StatEnum generalStat, int penaltyForArmor) {
        this.canUseUntrained = canUseUntrained;
        this.generalStat = generalStat;
        this.penaltyForArmor = penaltyForArmor;
    }

    public boolean isCanUseUntrained() {
        return canUseUntrained;
    }

    public StatEnum getGeneralStat() {
        return generalStat;
    }

    public int getPenaltyForArmor() {
        return penaltyForArmor;
    }
}
