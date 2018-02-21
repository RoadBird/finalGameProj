package com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.personage;

import com.project.tiaBird.gameObjects.geometryObjects.movbleObjects.MovbleObject;

public class Personage extends MovbleObject {
    private String name;

    private int health = 0;
    private int armorClass = 0;
    private int radiusOfSee = 0;

    private int bronze = 0;
    private int silver = 0;
    private int gold = 0;
    private int platinum = 0;

    private Object[] languages;
    private Object god;
    private String story;
    private Alignment alignment;

    public Alignment getAlignment(){
        return alignment;
    }
    public void setAlignment(Alignment alignment){
        this.alignment = alignment;
    }
}
