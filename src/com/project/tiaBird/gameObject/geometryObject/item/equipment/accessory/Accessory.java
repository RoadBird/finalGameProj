package com.project.tiaBird.gameObject.geometryObject.item.equipment.accessory;

import com.project.tiaBird.gameObject.geometryObject.item.equipment.Equipment;
import com.project.tiaBird.gameObject.geometryObject.item.Money;

public abstract class Accessory extends Equipment{

    public Accessory(Money price, double weight, String name) {
        super(price, weight, name);
    }
}
