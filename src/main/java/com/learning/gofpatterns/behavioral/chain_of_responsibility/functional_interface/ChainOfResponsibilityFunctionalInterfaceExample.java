package com.learning.gofpatterns.behavioral.chain_of_responsibility.functional_interface;

import com.learning.gofpatterns.BannerPrinter;
import com.learning.gofpatterns.Example;

import static com.learning.gofpatterns.behavioral.chain_of_responsibility.functional_interface.LevelHandler.*;
import static com.learning.gofpatterns.behavioral.chain_of_responsibility.Levels.*;

public class ChainOfResponsibilityFunctionalInterfaceExample implements Example {

    @Override
    public void runExample() {
        BannerPrinter.printChainOfResponsibilityBanner();

        System.out.println("==> Running Chain of Responsibility (functional interface) Example");

        System.out.println("""
            In the Chain of Responsibility pattern, entities are linked in a structure that can analise a propagated input
            between them. Once an entity decides that it must act upon the input, it may or may not stop the propagation.
            In the case of this example, the chain's input is propagated until the end regardless.
            Based on Wikipedia (en) Chain of Responsibility pattern Java example.
            """);

        LevelHandler levelHandler = levelZeroHandler().nextHandler(evenLevelsHandler())
                .nextHandler(oddLevelsHandler()).nextHandler(lessThanThreeHandler());

        System.out.println("* Triggering chain of responsibility for LEVEL_0...");
        System.out.println("* Expected handlers to be triggered:");
        System.out.println("  - Level Zero specific handler");
        System.out.println("  - Even Levels handler");
        System.out.println("  - Less Than Level Three handler");
        System.out.println("* Expected handlers NOT not be called:");
        System.out.println("  - Odd Levels handler");
        System.out.println("Result:");
        levelHandler.handle(LEVEL_0);

        System.out.println("\n* Triggering chain of responsibility for LEVEL_1...");
        System.out.println("* Expected handlers to be triggered:");
        System.out.println("  - Odd Levels handler");
        System.out.println("  - Less Than Level Three handler");
        System.out.println("* Expected handlers NOT not be called:");
        System.out.println("  - Level Zero specific handler");
        System.out.println("  - Even Levels handler");
        System.out.println("Result:");
        levelHandler.handle(LEVEL_1);

        System.out.println();
    }
}
