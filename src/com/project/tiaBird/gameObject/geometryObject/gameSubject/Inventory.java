package com.project.tiaBird.gameObject.geometryObject.gameSubject;

import java.util.LinkedList;
import java.util.List;

public class Inventory extends Subject {
    private List<Subject> inventory = new LinkedList<>();

    public List<Subject> getInventory() {
        return inventory;
    }

    public void setInventory(List<Subject> inventory) {
        this.inventory = inventory;
    }

    public void addSubject(Subject subject){
        inventory.add(subject);
    }
}
