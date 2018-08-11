package com.project.tiaBird.gameObject.geometryObject.creature.character.feat;

import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;

import java.util.ArrayList;
import java.util.List;

public class FeatList {
    private List<Feat> feats = new ArrayList();
    private Character character;

    public FeatList(Character character){
        this.character = character;
    }
    public boolean addFeat(Feat t) {
        if(t.canPersonUse(character)) {
            return feats.add(t);
        }
        return false;
    }
    public boolean contains(FeatEnum type) {
        return feats.stream().anyMatch(feat -> feat.getType().equals(type));
    }
}
