package com.project.tiaBird.gameObject.geometryObject.creature.character.feat;

import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;

public abstract class Feat {
    private FeatEnum type;
    protected Feat(FeatEnum type){
        this.type = type;
    }
    public abstract boolean bonusForWarrior();
    public abstract boolean canPersonUse(Character character);

    public FeatEnum getType() {
        return type;
    }
}
