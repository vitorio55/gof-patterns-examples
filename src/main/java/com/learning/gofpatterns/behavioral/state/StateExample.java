package com.learning.gofpatterns.behavioral.state;

import com.learning.gofpatterns.BannerPrinter;
import com.learning.gofpatterns.Example;
import com.learning.gofpatterns.behavioral.state.states.NumberGeneratorRangeState;

import java.text.DecimalFormat;

public class StateExample implements Example {

    @Override
    public void runExample() {
        BannerPrinter.printStateBanner();

        System.out.println("==> Running State Example");

        System.out.println("""
            The State Pattern defines a way of decoupling the states logic from the context that requires their usage.
            Imagine having to implement states as a big switch-case in the context code. That would not be very easy
            to maintain in the long run as the logic grows, and the context code ends up with more responsibilities
            than it should have.

            Using this pattern, we can isolate state logic inside their specific classes, and declare state changes
            inside them. The context is not even aware of the transitions in some cases (like in this example).
            """);

        NumberGeneratorRangeState fiveHundredToThousandState = new NumberGeneratorRangeState(500, 1000, null);
        NumberGeneratorRangeState hundredToTwoHundredState = new NumberGeneratorRangeState(100, 200, fiveHundredToThousandState);
        NumberGeneratorRangeState zeroToTenState = new NumberGeneratorRangeState(0, 10, hundredToTwoHundredState);

        Context context = new Context(zeroToTenState);

        System.out.println("* Generation of random numbers based on state: ");
        System.out.printf(" First state is ....... 0-10 -> generated (%s)\n", format(context.generateRandomNumber()));
        System.out.printf(" Second state is ... 100-200 -> generated (%s)\n", format(context.generateRandomNumber()));
        System.out.printf(" Third state is ... 500-1000 -> generated (%s)\n", format(context.generateRandomNumber()));
        System.out.println();
    }

    private static String format(double number) {
        return new DecimalFormat("#.##").format(number);
    }

}