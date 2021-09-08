package com.learning.gofpatterns.behavioral.command;

import com.learning.gofpatterns.behavioral.command.commands.Command;

public class Invoker {
    private final Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public Command execute() {
        if (this.command == null)
            return null;
        return this.command.execute();
    }
}
