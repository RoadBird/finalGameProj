package com.project.tiaBird.gameObject.geometryObject.item;

import com.project.tiaBird.gameObject.geometryObject.GeometryObject;
import com.project.tiaBird.gameObject.effect.spell.Spell;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SpellBook extends GeometryObject {
    private Map<Integer, Set<Spell>> spellBook = new HashMap<>();

    public SpellBook(){
        for (int i = 0; i < 10; i++) {
            spellBook.put(i, new HashSet<>());
        }
    }

    public void putSpell(Spell spell){
        if(spell.getLevel() >= 0 && spell.getLevel() < spellBook.size()) {
            spellBook.get(spell.getLevel()).add(spell);
        }
    }

    public Set<Spell> getSpellSet(int level){
        if(level >= 0 && level < spellBook.size()) {
            return spellBook.get(level);
        }
        return null;
    }
}
