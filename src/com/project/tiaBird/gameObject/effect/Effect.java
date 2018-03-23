package com.project.tiaBird.gameObject.effect;

import com.project.tiaBird.gameObject.GameObject;

public class Effect extends GameObject{
    private EffectsEnum effect;

    public Effect(EffectsEnum effect) {
        this.effect = effect;
    }

    public EffectsEnum getEffect() {
        return effect;
    }

    public void setEffect(EffectsEnum effect) {
        this.effect = effect;
    }
}
