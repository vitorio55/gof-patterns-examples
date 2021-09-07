package com.learning.gofpatterns.behavioral.chain_of_responsibility.basic;

import static com.learning.gofpatterns.behavioral.chain_of_responsibility.Levels.LEVEL_3;

public class LevelThreeHandler extends LevelHandler {

    public LevelThreeHandler() {
        super(LEVEL_3);
        this.handledLevel = LEVEL_3;
    }

    @Override
    protected void customHandle() {
        System.out.println("HANDLED LEVEL " + this.handledLevel);
    }
}
