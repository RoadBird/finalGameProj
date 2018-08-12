package com.project.tiaBird.gameObject.geometryObject.creature.character.classes;

import com.project.tiaBird.gameObject.geometryObject.creature.character.Arming;
import com.project.tiaBird.gameObject.geometryObject.creature.character.Inventory;
import com.project.tiaBird.gameObject.geometryObject.creature.stat.StatEnum;
import com.project.tiaBird.gameObject.geometryObject.item.Money;

public class Caster extends AbstractPersonClass {
    public Caster(PersonFullClass personFullClass) {
        super(personFullClass);
    }

    @Override
    public int[] getAttackThrow() {
        return new int[0];
    }

    @Override
    public int getSavingThrowFortitude() {
        return 0;
    }

    @Override
    public int getSavingThrowReflex() {
        return 0;
    }

    @Override
    public int getSavingThrowWill() {
        return 0;
    }

    @Override
    public int getNewHP() {
        return 0;
    }

    @Override
    public int getMaxHP() {
        return 0;
    }

    @Override
    public Arming getStartArming() {
        return null;
    }

    @Override
    public Inventory getStartInventory() {
        return null;
    }

    @Override
    public Money getStartMoney() {
        return null;
    }

    @Override
    public int[] getSpellPerDay() {
        return new int[0];
    }

    @Override
    public int getPointOfSkillPerLevel() {
        return 0;
    }

    @Override
    public StatEnum getMainStat() {
        return null;
    }

    @Override
    protected void levelUp1() {

    }

    @Override
    protected void levelUp2() {

    }

    @Override
    protected void levelUp3() {

    }

    @Override
    protected void levelUp4() {

    }

    @Override
    protected void levelUp5() {

    }

    @Override
    protected void levelUp6() {

    }

    @Override
    protected void levelUp7() {

    }

    @Override
    protected void levelUp8() {

    }

    @Override
    protected void levelUp9() {

    }

    @Override
    protected void levelUp10() {

    }

    @Override
    protected void levelUp11() {

    }

    @Override
    protected void levelUp12() {

    }

    @Override
    protected void levelUp13() {

    }

    @Override
    protected void levelUp14() {

    }

    @Override
    protected void levelUp15() {

    }

    @Override
    protected void levelUp16() {

    }

    @Override
    protected void levelUp17() {

    }

    @Override
    protected void levelUp18() {

    }

    @Override
    protected void levelUp19() {

    }

    @Override
    protected void levelUp20() {

    }

    @Override
    public void leaveTheClass() {

    }
}
