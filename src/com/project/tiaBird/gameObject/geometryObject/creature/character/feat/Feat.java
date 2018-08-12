package com.project.tiaBird.gameObject.geometryObject.creature.character.feat;

import com.project.tiaBird.gameObject.GameObject;
import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;

public abstract class Feat {
    private FeatEnum type;
    private Object key;
    protected Feat(FeatEnum type){
        this.type = type;
    }
    public abstract boolean bonusForWarrior();
    public abstract boolean canPersonUse(Character character);

    public FeatEnum getType() {
        return type;
    }

    public Object getKey() {
        return key;
    }

    public void setKey(GameObject key) {
        this.key = key;
    }
}
