package com.project.tiaBird.gameObject.geometryObject.item.equipment;

import com.project.tiaBird.gameObject.GameObject;
import com.project.tiaBird.gameObject.geometryObject.item.Money;

public abstract class Equipment extends GameObject {
    private String name;
    private Money price;
    private double weight;

    public Equipment(Money price, double weight, String name) {
        this.price = price;
        this.weight = weight;
        this.name = name;
    }

}
