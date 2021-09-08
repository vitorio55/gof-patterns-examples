package com.learning.gofpatterns.behavioral.command;

import com.learning.gofpatterns.BannerPrinter;
import com.learning.gofpatterns.Example;
import com.learning.gofpatterns.behavioral.command.commands.*;

public class CommandExample implements Example {

    @Override
    public void runExample() {
        BannerPrinter.printCommandBanner();

        System.out.println("==> Running Command Example");

        System.out.println("""
            Here we implement the Command Pattern using a base Command interface that is implemented by the basic
            mathematical operations along with the factorial operation. A command history is saved so we can also
            reverse the commands at the end.
            """);

        CommandHistory commandHistory = new CommandHistory();

        Total total = new Total(0);
        System.out.println("[INITIAL VALUE = " + total.getAcc() + "]");

        // We could call the command directly, but we are using an extra layer of Invokers
        // In a GUI (for example) Buttons could play the part of the Invokers
        commandHistory.addCommand(new Invoker(new SumCommand(total, 120)).execute());
        commandHistory.addCommand(new Invoker(new SubtractCommand(total, 20)).execute());
        commandHistory.addCommand(new Invoker(new MultiplyCommand(total, 3)).execute());
        commandHistory.addCommand(new Invoker(new DivideCommand(total, 60)).execute());
        commandHistory.addCommand(new Invoker(new FactorialCommand(total)).execute());

        System.out.println("[RESULT = " + total.getAcc()  + "]");

        System.out.println("\n* Undoing commands using command history...");
        System.out.println("[INITIAL VALUE = " + total.getAcc() + "]");

        // For command undoing, we are using the Commands directly, no Invokers involved
        commandHistory.getHistory().forEach(Command::undo);

        System.out.println("[RESULT = " + total.getAcc()  + "]");
        System.out.println();
    }
}
