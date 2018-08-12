package com.project.tiaBird.gameObject.geometryObject.creature.character.feat.itemCreation;

import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;
import com.project.tiaBird.gameObject.geometryObject.creature.character.classes.Caster;
import com.project.tiaBird.gameObject.geometryObject.creature.character.feat.FeatEnum;

public class BrewPotion extends ItemCreationFeat {
    public BrewPotion(){
        super(FeatEnum.BREW_POTION);
    }

    @Override
    public boolean bonusForWarrior() {
        return false;
    }

    @Override
    public boolean canPersonUse(Character character) {
        return character.getPersonFullClass().getPersonFullClasses().stream()
                .anyMatch(abstractPersonClass -> abstractPersonClass.getClass().getName().equals(Caster.class.getName())
                && abstractPersonClass.getLevel() >= 3);
    }
}
