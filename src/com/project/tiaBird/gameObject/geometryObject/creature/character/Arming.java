package com.project.tiaBird.gameObject.geometryObject.creature.character;

import com.project.tiaBird.gameObject.geometryObject.item.equipment.accessory.Necklace;
import com.project.tiaBird.gameObject.geometryObject.item.equipment.accessory.Ring;
import com.project.tiaBird.gameObject.geometryObject.item.equipment.armor.Armor;
import com.project.tiaBird.gameObject.geometryObject.item.equipment.armor.Shield;
import com.project.tiaBird.gameObject.geometryObject.item.equipment.weapon.Weapon;

public class Arming {
    private Weapon weapon1;
    private Weapon weapon2;
    private Ring ring1;
    private Ring ring2;
    private Necklace necklace;
    private Armor armor;
    private Shield shield;

    public Weapon getWeapon1() {
        return weapon1;
    }

    public void setWeapon1(Weapon weapon1) {
        this.weapon1 = weapon1;
    }

    public Weapon getWeapon2() {
        return weapon2;
    }

    public void setWeapon2(Weapon weapon2) {
        this.weapon2 = weapon2;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public Shield getShield() {
        return shield;
    }

    public void setShield(Shield shield) {
        this.shield = shield;
    }

    public Ring getRing1() {
        return ring1;
    }

    public void setRing1(Ring ring1) {
        this.ring1 = ring1;
    }

    public Ring getRing2() {
        return ring2;
    }

    public void setRing2(Ring ring2) {
        this.ring2 = ring2;
    }

    public Necklace getNecklace() {
        return necklace;
    }

    public void setNecklace(Necklace necklace) {
        this.necklace = necklace;
    }
}
