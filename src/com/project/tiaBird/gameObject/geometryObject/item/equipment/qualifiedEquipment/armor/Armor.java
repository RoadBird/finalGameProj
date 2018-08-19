package com.project.tiaBird.gameObject.geometryObject.item.equipment.armor;

import com.project.tiaBird.gameObject.geometryObject.item.equipment.Equipment;
import com.project.tiaBird.gameObject.geometryObject.item.Money;
import com.project.tiaBird.gameObject.geometryObject.item.equipment.armor.armorParameters.ArmorEquivalent;
import com.project.tiaBird.gameObject.geometryObject.item.equipment.armor.armorParameters.ArmorSpecialAbility;
import com.project.tiaBird.gameObject.geometryObject.item.equipment.armor.armorParameters.ArmorType;

import java.util.HashMap;

public class Armor extends Equipment {
    private ArmorType armorType;
    private ArmorEquivalent armorEquivalent;
    private HashMap<String, ArmorSpecialAbility> armorAbilitysMap;
    private boolean superiority;
    private int modificationBonus;
    private int armorBonus;
    private int maxAgilityBonus;
    private int armorChrckPenalty;
    private int chanceToFailCast;

    public Armor(Money price, double weight, String name) {
        super(price, weight, name);
    }
}
