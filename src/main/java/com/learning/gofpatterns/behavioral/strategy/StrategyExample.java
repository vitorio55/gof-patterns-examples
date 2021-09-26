package com.learning.gofpatterns.behavioral.strategy;

import com.learning.gofpatterns.BannerPrinter;
import com.learning.gofpatterns.Example;

import java.util.List;

public class StrategyExample implements Example {

    @Override
    public void runExample() {
        BannerPrinter.printStrategyBanner();

        System.out.println("==> Running Strategy Example");

        System.out.println("""
            The Strategy Pattern allows an interchange of logic at runtime, based on the requirements of the
            context at the time.

            Here we have a functional interface that defines two filters (strategies) to handle a list of numbers
            that the context stores. To change the strategy all we have to do is to call the strategy method of the
            interface and reassign the context' strategy.
            """);

        Context context = new Context(
            NumbersStrategy.evenNumbersStrategy(),
            List.of(0, 1, 2, 3, 4, 5, 6, 7, 8)
        );

        System.out.println("* Initial strategy is getting only even numbers:");
        context.printNumbers();

        System.out.println("* Changing strategy to get odd numbers...");
        context.setStrategy(NumbersStrategy.oddNumbersStrategy());

        System.out.println("* Printing numbers returned from new strategy:");
        context.printNumbers();
        System.out.println();
    }

}