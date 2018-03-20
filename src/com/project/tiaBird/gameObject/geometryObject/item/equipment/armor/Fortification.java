package com.project.tiaBird.gameObject.geometryObject.item.equipment.armor;

public enum Fortification {
    LIGHT(25), MEDIUM(75), HEAVY(100);
    private int chanceForNormalDamage;

    Fortification(int chanceForNormalDamage) {
        this.chanceForNormalDamage = chanceForNormalDamage;
    }

    public int getChanceForNormalDamage() {
        return chanceForNormalDamage;
    }
}
