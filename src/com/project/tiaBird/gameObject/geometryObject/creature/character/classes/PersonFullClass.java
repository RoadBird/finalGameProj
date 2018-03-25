package com.project.tiaBird.gameObject.geometryObject.creature.character.classes;

import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;
import com.project.tiaBird.gameObject.geometryObject.item.equipment.armor.Armor;
import com.project.tiaBird.gameObject.geometryObject.item.equipment.armor.Shield;
import com.project.tiaBird.gameObject.geometryObject.item.equipment.weapon.Weapon;

import java.util.HashSet;
import java.util.Set;

public class PersonFullClass {

    private Character character;
    private Set<Weapon> weaponQualification = new HashSet<>();
    private Set<Armor> armorQualification = new HashSet<>();
    private Set<Shield> shieldQualification = new HashSet<>();
    private int level = 0;

    public PersonFullClass(Character character){
        this.character = character;
    }

    private Set<AbstractPersonClass> personFullClasses = new HashSet<>();

    public void levelApp(AbstractPersonClass personClass){
        personClass.levelUp();
        level++;
    }

    public void newClass(AbstractPersonClass personClass){
        personFullClasses.add(personClass);
        levelApp(personClass);
    }

    public void leaveClass(AbstractPersonClass personClass){
        personClass.leaveTheClass();
    }

    public int getLevel(){
        return level;
    }

    public Set<Weapon> getWeaponQualification() {
        return weaponQualification;
    }

    public Set<Armor> getArmorQualification() {
        return armorQualification;
    }

    public Set<Shield> getShieldQualification() {
        return shieldQualification;
    }
}
