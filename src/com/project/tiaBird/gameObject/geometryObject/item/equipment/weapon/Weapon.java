package com.project.tiaBird.gameObject.geometryObject.item.equipment.weapon;

import com.project.tiaBird.gameObject.geometryObject.item.Money;
import com.project.tiaBird.gameObject.geometryObject.item.equipment.Equipment;

public class Weapon extends Equipment {
    private DamageType damageType;
    private WeaponSize weaponSize;
    private WeaponType weaponType;
    private WeaponUsage weaponUsage;

    private double range;
    private int damage;
    private int critChance;
    private int critMultiplier;
    private int accuracy;
    private int reload;

    public Weapon(Money price, double weight, String name) {
        super(price, weight, name);
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public int getReload() {
        return reload;
    }

    public void setReload(int reload) {
        this.reload = reload;
    }

    public DamageType getDamageType() {
        return damageType;
    }

    public void setDamageType(DamageType damageType) {
        this.damageType = damageType;
    }

    public WeaponSize getWeaponSize() {
        return weaponSize;
    }

    public void setWeaponSize(WeaponSize weaponSize) {
        this.weaponSize = weaponSize;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public WeaponUsage getWeaponUsage() {
        return weaponUsage;
    }

    public void setWeaponUsage(WeaponUsage weaponUsage) {
        this.weaponUsage = weaponUsage;
    }

    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        if (weaponType.equals(WeaponType.RANGE)) {
            this.range = range;
        } else if (weaponType.equals(WeaponType.MELEE) && range > 6) {
            this.range = 6;
        } else if (range < 0) {
            this.range = 0;
        }
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getCritChance() {
        return critChance;
    }

    public void setCritChance(int critChance) {
        this.critChance = critChance;
    }

    public int getCritMultiplier() {
        return critMultiplier;
    }

    public void setCritMultiplier(int critMultiplier) {
        this.critMultiplier = critMultiplier;
    }

}
