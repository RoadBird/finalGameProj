package com.project.tiaBird.gameObject.geometryObject.creature.character.feat;

import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;

import java.util.HashMap;
import java.util.Map;

public class FeatList {
    private Map<FeatEnum, Feat> feats = new HashMap<>();
    private Character character;

    public FeatList(Character character){
        this.character = character;
    }
    public boolean addFeat(Feat t) {
        if(t.canPersonUse(character)) {
            feats.put(t.getType(), t);
            return true;
        }
        return false;
    }
    public boolean contains(FeatEnum type) {

        return feats.containsKey(type);
    }
    public boolean contains(FeatEnum type, Object key) {
        return feats.get(type).getKey().equals(key);
    }
}
