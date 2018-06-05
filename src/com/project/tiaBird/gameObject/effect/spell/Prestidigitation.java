package com.project.tiaBird.gameObject.effect.spell;

public class Prestidigitation extends Spell {
    public Prestidigitation(int level) {
        super(level);
    }

    @Override
    public int getDifficultyClass() {
        return 0;
    }
}
