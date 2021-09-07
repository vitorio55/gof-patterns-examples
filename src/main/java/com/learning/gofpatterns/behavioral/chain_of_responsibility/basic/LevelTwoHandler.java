package com.learning.gofpatterns.behavioral.chain_of_responsibility.basic;

import static com.learning.gofpatterns.behavioral.chain_of_responsibility.Levels.LEVEL_2;

public class LevelTwoHandler extends LevelHandler {

    public LevelTwoHandler() {
        super(LEVEL_2);
        this.handledLevel = LEVEL_2;
    }
}
