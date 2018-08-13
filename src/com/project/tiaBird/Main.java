package com.project.tiaBird;

import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;
import com.project.tiaBird.gameObject.geometryObject.creature.character.feat.Feat;
import com.project.tiaBird.gameObject.geometryObject.creature.character.feat.FeatList;
import com.project.tiaBird.gameObject.geometryObject.creature.character.feat.general.SimpleWeaponProficiency;
import com.project.tiaBird.gameObject.geometryObject.creature.character.feat.general.Toughness;

import java.util.Set;

public class Main {

    public Main() {
        FeatList feats = new FeatList(new Character());
        feats.addFeat(new Toughness());
        feats.addFeat(new Toughness());
        feats.addFeat(new Toughness());
        feats.addFeat(new SimpleWeaponProficiency());
        Set<Feat> set = feats.getFeats(Toughness.class.getSimpleName());
        System.out.println(set.size());
        System.out.println(feats.getAll().size());

    }

    public static void main(String[] args) {
        new Main();
    }
}
