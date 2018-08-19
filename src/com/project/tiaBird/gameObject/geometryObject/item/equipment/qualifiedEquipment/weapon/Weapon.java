package com.project.tiaBird.gameObject.geometryObject.item.equipment.qualifiedEquipment.weapon;

import com.project.tiaBird.gameObject.Roll;
import com.project.tiaBird.gameObject.geometryObject.item.Money;
import com.project.tiaBird.gameObject.geometryObject.item.equipment.Equipment;
import com.project.tiaBird.gameObject.geometryObject.item.equipment.qualifiedEquipment.weapon.weaponParameters.WeaponSize;

public class Weapon extends Equipment {
    private WeaponCharacteristics weaponCharacteristics = new WeaponCharacteristics();

    private Roll damage;
    private Roll secondSideDamage;
    private int critChance;
    private boolean superiority;


    public Weapon(Money price, double weight, String name) {
        super(price, weight, name);
        weaponCharacteristics.setWeaponSize(WeaponSize.MEDIUM);
    }

    public WeaponCharacteristics getWeaponCharacteristics() {
        return weaponCharacteristics;
    }

}
