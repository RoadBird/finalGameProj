package com.project.tiaBird;

import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;
import com.project.tiaBird.gameObject.geometryObject.creature.character.feat.FeatEnum;
import com.project.tiaBird.gameObject.geometryObject.creature.character.feat.LigthArmorProficiency;
import com.project.tiaBird.gameObject.geometryObject.creature.character.feat.MediumArmorProficiency;

public class Main {

    public Main() {
        Character character = new Character();
        MediumArmorProficiency map = new MediumArmorProficiency();
        character.getFeats().addFeat(new LigthArmorProficiency());
        character.getFeats().addFeat(map);
        System.out.println(character.getFeats().contains(FeatEnum.MEDIUM_ARMOR_PROFICIENCY));
    }

    public static void main(String[] args) {
        new Main();
    }
}
