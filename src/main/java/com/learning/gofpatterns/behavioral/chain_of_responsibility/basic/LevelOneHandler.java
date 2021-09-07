package com.learning.gofpatterns.behavioral.chain_of_responsibility.basic;

import static com.learning.gofpatterns.behavioral.chain_of_responsibility.Levels.LEVEL_1;

public class LevelOneHandler extends LevelHandler {

    public LevelOneHandler() {
        super(LEVEL_1);
        this.handledLevel = LEVEL_1;
    }

    @Override
    protected void customHandle() {
        System.out.println("HANDLED LEVEL " + this.handledLevel);
    }
}
