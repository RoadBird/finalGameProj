package com.project.tiaBird.gameObject.geometryObject.gameSubject.arming;

import com.project.tiaBird.gameObject.geometryObject.gameSubject.Subject;
import com.project.tiaBird.gameObject.geometryObject.gameSubject.arming.armore.Armor;
import com.project.tiaBird.gameObject.geometryObject.gameSubject.arming.shield.Shield;
import com.project.tiaBird.gameObject.geometryObject.gameSubject.arming.weapon.Weapon;

public class Arming extends Subject {
    private Weapon weapon1;
    private Weapon weapon2;
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
}
