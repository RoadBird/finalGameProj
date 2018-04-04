package com.project.tiaBird.gameObject.geometryObject.item.equipment.weapon;

import com.project.tiaBird.gameObject.geometryObject.item.equipment.weapon.weaponParameters.*;

public class WeaponCharacteristics {
    private DamageParameter damageParameter;
    private WeaponSize weaponSize;
    private WeaponType weaponType;
    private WeaponInUse weaponInUse;
    private CritMultiplier critMultiplier;
    private DamageApplication damageApplication;
    private WeaponEquivalent weaponEquivalent;
    private WeaponQualifier weaponQualifier;
    private DamageType damageType;

    public WeaponSize getWeaponSize() {
        return weaponSize;
    }

    public void setWeaponSize(WeaponSize weaponSize) {
        this.weaponSize = weaponSize;
    }

    public WeaponInUse getWeaponInUse() {
        return weaponInUse;
    }

    public void setWeaponInUse(WeaponInUse weaponInUse) {
        this.weaponInUse = weaponInUse;
    }

    public WeaponEquivalent getWeaponEquivalent() {
        return weaponEquivalent;
    }

    public void setWeaponEquivalent(WeaponEquivalent weaponEquivalent) {
        this.weaponEquivalent = weaponEquivalent;
    }

    public DamageParameter getDamageParameter() {
        return damageParameter;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public CritMultiplier getCritMultiplier() {
        return critMultiplier;
    }

    public DamageApplication getDamageApplication() {
        return damageApplication;
    }

    public WeaponQualifier getWeaponQualifier() {
        return weaponQualifier;
    }

    public DamageType getDamageType() {
        return damageType;
    }
}
