package com.project.tiaBird.gameObject.geometryObject.creature.character;

import com.project.tiaBird.gameObject.GameObject;
import com.project.tiaBird.gameObject.geometryObject.item.equipment.Equipment;

import java.util.LinkedList;
import java.util.List;

public class Inventory extends GameObject {
    private List<Equipment> inventory = new LinkedList<>();

    public List<Equipment> getInventory() {
        return inventory;
    }

    public void setInventory(List<Equipment> inventory) {
        this.inventory = inventory;
    }

    public void addSubject(Equipment subject){
        inventory.add(subject);
    }
}
