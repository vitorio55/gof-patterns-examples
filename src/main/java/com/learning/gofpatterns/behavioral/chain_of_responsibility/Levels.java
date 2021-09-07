package com.learning.gofpatterns.behavioral.chain_of_responsibility;

public enum Levels {
    LEVEL_0,
    LEVEL_1,
    LEVEL_2,
    LEVEL_3;

    public static Levels[] all() {
        return values();
    }
}
