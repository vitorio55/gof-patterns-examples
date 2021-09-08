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

        commandHistory.addCommand(new SumCommand(total, 120).execute());
        commandHistory.addCommand(new SubtractCommand(total, 20).execute());
        commandHistory.addCommand(new MultiplyCommand(total, 3).execute());
        commandHistory.addCommand(new DivideCommand(total, 60).execute());
        commandHistory.addCommand(new FactorialCommand(total).execute());

        System.out.println("[RESULT = " + total.getAcc()  + "]");

        System.out.println("\n* Undoing commands using command history...");
        System.out.println("[INITIAL VALUE = " + total.getAcc() + "]");

        commandHistory.getHistory().forEach(Command::undo);

        System.out.println("[RESULT = " + total.getAcc()  + "]");
        System.out.println();
    }
}
