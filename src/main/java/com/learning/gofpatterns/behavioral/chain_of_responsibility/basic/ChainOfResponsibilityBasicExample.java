package com.learning.gofpatterns.behavioral.chain_of_responsibility.basic;

import com.learning.gofpatterns.Example;

import static com.learning.gofpatterns.behavioral.chain_of_responsibility.Levels.*;

public class ChainOfResponsibilityBasicExample implements Example {

    @Override
    public void runExample() {
        System.out.println("==> Running Chain of Responsibility (basic) Example");

        LevelZeroHandler entryHandler = (LevelZeroHandler) new LevelZeroHandler()
                .setNextHandler(new LevelOneHandler())
                .setNextHandler(new LevelTwoHandler())
                .setNextHandler(new LevelThreeHandler());

        System.out.println("* Triggering chain of responsibility for LEVEL_0...");
        entryHandler.handle(LEVEL_0);

        System.out.println("* Triggering chain of responsibility for LEVEL_1...");
        entryHandler.handle(LEVEL_1);

        System.out.println("* Triggering chain of responsibility for LEVEL_2...");
        entryHandler.handle(LEVEL_2);

        System.out.println("* Triggering chain of responsibility for LEVEL_3...");
        entryHandler.handle(LEVEL_3);
        System.out.println();
    }
}
