package com.project.tiaBird.gameObject.geometryObject.item.equipment.armor;

import com.project.tiaBird.gameObject.geometryObject.item.equipment.Equipment;
import com.project.tiaBird.gameObject.geometryObject.item.Money;

public class Shield extends Equipment {
    private Fortification chance;

    public Shield(Money price, double weight, String name) {
        super(price, weight, name);
    }
}
