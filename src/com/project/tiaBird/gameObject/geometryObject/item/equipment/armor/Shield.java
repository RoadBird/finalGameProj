package com.project.tiaBird.gameObject.geometryObject.item.equipment.armor;

import com.project.tiaBird.gameObject.geometryObject.item.equipment.Equipment;
import com.project.tiaBird.gameObject.geometryObject.item.Money;
import com.project.tiaBird.gameObject.geometryObject.item.equipment.armor.armorParameters.Fortification;
import com.project.tiaBird.gameObject.geometryObject.item.equipment.armor.armorParameters.ShieldEquivalent;
import com.project.tiaBird.gameObject.geometryObject.item.equipment.armor.armorParameters.ShieldSpecialAbility;

import java.util.HashMap;

public class Shield extends Equipment {
    private ShieldEquivalent armorEquivalent;
    private HashMap<String, ShieldSpecialAbility> armorAbilitysMap;
    private boolean superiority;
    private int hitPoints;
    private int durability;
    private int modificationBonus;
    private int armorBonus;
    private int armorChrckPenalty;
    private int chanceToFailCast;

    public Shield(Money price, double weight, String name) {
        super(price, weight, name);
    }
}
