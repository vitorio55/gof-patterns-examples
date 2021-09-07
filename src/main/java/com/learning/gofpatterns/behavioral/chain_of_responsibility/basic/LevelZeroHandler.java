package com.learning.gofpatterns.behavioral.chain_of_responsibility.basic;

import static com.learning.gofpatterns.behavioral.chain_of_responsibility.Levels.LEVEL_0;

public class LevelZeroHandler extends LevelHandler {

    public LevelZeroHandler() {
        super(LEVEL_0);
        this.handledLevel = LEVEL_0;
    }
}
