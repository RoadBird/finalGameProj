package com.project.tiaBird.gameObject.geometryObject.item.equipment.weapon.weaponParameters;

public enum CritMultiplier {
    DOUBLE(2), TRIPLE(3), QUADROPLE(4), DUAL_ENDED(3, 4), LITE_DOUBLE(2), EXTRA_LITE_DOUBLE(2);
    private int multiplier;
    private int secondMultiplier;

    CritMultiplier(int multiplier) {
        this.multiplier = multiplier;
    }

    CritMultiplier(int firstMultiplier, int secondMultiplier) {
        this.multiplier = firstMultiplier;
        this.secondMultiplier = secondMultiplier;
    }

    public int getMultiplier() {
        return multiplier;
    }

    public int getSecondMultiplier() {
        return secondMultiplier;
    }
}
