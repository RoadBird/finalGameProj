package com.project.tiaBird.gameObject.geometryObject.item.equipment.consumables;

import com.project.tiaBird.gameObject.geometryObject.item.equipment.Equipment;
import com.project.tiaBird.gameObject.geometryObject.item.Money;

public class Cosumables extends Equipment {
    private int maxCharges;
    private int charges;

    public Cosumables(Money price, double weight, String name) {
        super(price, weight, name);
    }

    public void consumeCharge() {
        charges--;
    }

    public void chargeItem() {
        if (charges < maxCharges) {
            charges++;
        }
    }

    public int getMaxCharges() {
        return maxCharges;
    }

    public void setMaxCharges(int maxCharges) {
        this.maxCharges = maxCharges;
    }

    public int getCharges() {
        return charges;
    }

    public void setCharges(int charges) {
        if (charges < 0) {
            this.charges = 0;
        } else this.charges = charges;
    }
}
