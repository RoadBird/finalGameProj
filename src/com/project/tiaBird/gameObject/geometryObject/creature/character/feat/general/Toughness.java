package com.project.tiaBird.gameObject.geometryObject.creature.character.feat.general;

import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;

import java.nio.charset.Charset;
import java.util.Random;

public class Toughness extends GeneralFeat {
    private static Random random = new Random();
    public Toughness(){
        byte[] array = new byte[7];
        random.nextBytes(array);
        setKey(new String(array, Charset.forName("UTF-8")));
    }
    @Override
    public boolean canPersonUse(Character character) {
        return true;
    }
}
