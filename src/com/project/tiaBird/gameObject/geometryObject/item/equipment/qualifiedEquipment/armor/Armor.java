package com.project.tiaBird.gameObject.geometryObject.item.equipment.qualifiedEquipment.armor;

import com.project.tiaBird.gameObject.geometryObject.item.equipment.Equipment;
import com.project.tiaBird.gameObject.geometryObject.item.Money;
import com.project.tiaBird.gameObject.geometryObject.item.equipment.qualifiedEquipment.Fortification;

public class Armor extends Equipment {
    private Fortification chance;

    public Armor(Money price, double weight, String name) {
        super(price, weight, name);
    }
}
