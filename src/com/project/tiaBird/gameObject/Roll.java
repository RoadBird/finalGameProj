package com.project.tiaBird.gameObject;

import java.util.Random;

public enum Roll {
    D4(4), D6(6), D8(8), D10(10), D12(12), D20(20);
    private static Random rand = new Random();
    private int value;

    Roll(int maxValue){
        value = maxValue;
    }

    public int getValue() {
        return rand.nextInt(value) + 1;
    }
}
