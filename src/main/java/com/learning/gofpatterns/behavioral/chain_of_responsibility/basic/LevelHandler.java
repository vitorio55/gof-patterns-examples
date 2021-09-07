package com.learning.gofpatterns.behavioral.chain_of_responsibility.basic;

import com.learning.gofpatterns.behavioral.chain_of_responsibility.Levels;

public abstract class LevelHandler {
    LevelHandler nextHandler;
    Levels handledLevel;

    void handle(Levels level) {
        if (level == this.handledLevel) {
            System.out.println("HANDLED LEVEL " + this.handledLevel);
        } else if (this.nextHandler != null) {
                this.nextHandler.handle(level);
        }
    }

    public LevelHandler(Levels handledLevel) {
        this.handledLevel = handledLevel;
    }

    public LevelHandler setNextHandler(LevelHandler nextHandler) {
        if (this.nextHandler == null) {
            this.nextHandler = nextHandler;
        } else {
            this.nextHandler.setNextHandler(nextHandler);
        }
        return this;
    }
}
