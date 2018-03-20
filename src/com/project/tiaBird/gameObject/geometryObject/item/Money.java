package com.project.tiaBird.gameObject.geometryObject.item;

import com.project.tiaBird.gameObject.geometryObject.item.equipment.Equipment;

public class Money extends Equipment {

    private int bronze = 0;
    private int silver = 0;
    private int gold = 0;
    private int platinum = 0;

    public int getBronze() {
        return bronze;
    }

    public void setBronze(int bronze) {
        this.bronze = bronze;
    }

    public int getSilver() {
        return silver;
    }

    public void setSilver(int silver) {
        this.silver = silver;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getPlatinum() {
        return platinum;
    }

    public void setPlatinum(int platinum) {
        this.platinum = platinum;
    }
}
