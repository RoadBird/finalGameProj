package com.project.tiaBird.gameObject.geometryObject.creature.character.feat;

import com.project.tiaBird.gameObject.geometryObject.creature.character.Character;

import java.util.Objects;

public abstract class Feat {
    private String key = "";
    public abstract boolean bonusForWarrior();
    public abstract boolean canPersonUse(Character character);

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Feat feat = (Feat) o;
        return getClass().getName().equals(feat.getClass().getSimpleName()) &&
                Objects.equals(key, feat.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getClass().getSimpleName(), key);
    }
}
