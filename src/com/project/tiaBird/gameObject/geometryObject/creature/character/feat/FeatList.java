package com.project.tiaBird.gameObject.geometryObject.creature.character.feat;

import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FeatList {
    private Set<Feat> feats = new HashSet<>();
    private Character character;

    public FeatList(Character character){
        this.character = character;
    }
    public boolean addFeat(Feat t) {
        if(t.canPersonUse(character)) {
            feats.add(t);
            return true;
        }
        return false;
    }
    public boolean contains(String featSimpleName) {
        return feats.stream().anyMatch(feat -> feat.getClass().getSimpleName().equals(featSimpleName));
    }
    public boolean contains(String featSimpleName, String key) {
        return feats.stream().anyMatch(feat -> feat.getClass().getSimpleName().equals(featSimpleName)
            && feat.getKey().equals(key));
    }
    public Set<Feat> getFeats(String featSimpleName){
        return feats.stream().filter(feat -> feat.getClass().getSimpleName().contains(featSimpleName))
                .collect(Collectors.toCollection(HashSet::new));
    }
    public Set<Feat> getAll(){
        return feats;
    }

}
