package com.project.tiaBird.gameObject.geometryObject.creature.character.skill;

import com.project.tiaBird.gameObject.geometryObject.creature.stat.StatEnum;

public enum SkillEnum {
    SPEAK_LANGUAGE(false, null, 0), //Особое повышение навыка
    APPRAISE(true, StatEnum.INT, 0), BALANCE(true, StatEnum.DEX, 1), BLUFF(true, StatEnum.CHAR, 0), CLIMB(true, StatEnum.STR, 1),
    CONCENTRATION(true, StatEnum.CON, 0), CRAFT_ALCHEMY(false, StatEnum.INT, 0), CRAFT_ARMORSMITHING(false, StatEnum.INT, 0),
    CRAFT_BOWMAKING(false, StatEnum.INT, 0), CRAFT_WEAPONSMITHING(false, StatEnum.INT, 0), CRAFT_TRAPMAKING(false, StatEnum.INT, 0),
    CRAFT_VARIES(false, StatEnum.INT, 0), DECIPHER_SCRIPT(false, StatEnum.INT, 0), DIPLOMACY(true, StatEnum.CHAR, 0),
    DISABLE_DEVICE(false, StatEnum.INT, 0), DISGUISE(true, StatEnum.CHAR, 0), ESCAPE_ARTIST(true, StatEnum.DEX, 1),
    FORGERY(true, StatEnum.INT, 0), GATHER_INFORMATION(true, StatEnum.INT, 0), HANDLE_ANIMAL(false, StatEnum.CHAR, 0),
    HEAL(true, StatEnum.WIS, 0), HIDE(true, StatEnum.DEX, 1), INTIMIDATE(true, StatEnum.CHAR, 0), JUMP(true, StatEnum.STR, 1),
    KNOWLEDGE_ARCANA(false, StatEnum.INT, 0), KNOWLEDGE_ENGINEERING(false, StatEnum.INT, 0), KNOWLEDGE_DUNGEONEERING(false, StatEnum.INT, 0),
    KNOWLEDGE_HISTORY(false, StatEnum.INT, 0), KNOWLEDGE_LOCAL(false, StatEnum.INT, 0), KNOWLEDGE_NATURE(false, StatEnum.INT, 0),
    KNOWLEDGE_NOBILITY(false, StatEnum.INT, 0), KNOWLEDGE_RELIGION(false, StatEnum.INT, 0), KNOWLEDGE_THE_PLANES(false, StatEnum.INT, 0),
    LISTEN(true, StatEnum.WIS, 0), MOVE_SILENTLY(true, StatEnum.DEX, 1), OPEN_LOCK(false, StatEnum.DEX, 0),
    PERFORM_ACT(true, StatEnum.CHAR, 0), PERFORM_COMEDY(true, StatEnum.CHAR, 0), PERFORM_DANCE(true, StatEnum.CHAR, 0),
    PERFORM_KEYBOARD_INSTRUMENTS(true, StatEnum.CHAR, 0), PERFORM_ORATORY(true, StatEnum.CHAR, 0),
    PERFORM_PERCUSSION_INSTRUMENTS(true, StatEnum.CHAR, 0), PERFORM_STRING_INSTRUMENTS(true, StatEnum.CHAR, 0),
    PERFORM_WIND_INSTRUMENTS(true, StatEnum.CHAR, 0), PERFORM_SING(true, StatEnum.CHAR, 0),
    RIDE(true, StatEnum.DEX, 0), SEARCH(true, StatEnum.INT, 0), SENSE_MOTIVE(true, StatEnum.WIS, 0),
    SLEIGHT_OF_HAND(false, StatEnum.DEX, 1), SPELLCRAFT(false, StatEnum.INT, 0), SPOT(true, StatEnum.WIS, 0),
    SURVIVAL(true, StatEnum.WIS, 0), SWIM(true, StatEnum.STR, 2), TUMBLE(false, StatEnum.DEX, 1),
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
