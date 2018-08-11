package com.project.tiaBird.gameObject.geometryObject.creature.character;

import com.project.tiaBird.gameObject.geometryObject.item.equipment.qualifiedEquipment.armor.ArmorEquivalent;
import com.project.tiaBird.gameObject.geometryObject.item.equipment.qualifiedEquipment.shield.ShieldEquivalent;
import com.project.tiaBird.gameObject.geometryObject.item.equipment.qualifiedEquipment.weapon.weaponParameters.WeaponEquivalent;

import java.util.HashSet;
import java.util.Set;

public class ArmamentQualification {
    private Set<ArmorEquivalent> armorQualification = new HashSet<>();
    private Set<ShieldEquivalent> shieldQualification = new HashSet<>();
    private Set<WeaponEquivalent> weaponQualification = new HashSet<>();

    public void addQualification(ArmorEquivalent armorEquivalent){
        armorQualification.add(armorEquivalent);
    }
    public void addQualification(ShieldEquivalent shieldEquivalent){
        shieldQualification.add(shieldEquivalent);
    }
    public void addQualification(WeaponEquivalent weaponEquivalent){
        weaponQualification.add(weaponEquivalent);
    }

    public boolean hasQualification(WeaponEquivalent weaponEquivalent){
        return weaponQualification.contains(weaponEquivalent);
    }
    public boolean hasQualification(ShieldEquivalent shieldEquivalent){
        return shieldQualification.contains(shieldEquivalent);
    }
    public boolean hasQualification(ArmorEquivalent armorEquivalent){
        return armorQualification.contains(armorEquivalent);
    }
}
