package com.learning.gofpatterns.behavioral.command;

import com.learning.gofpatterns.behavioral.command.commands.Command;

import java.util.ArrayList;
import java.util.List;

public class CommandHistory {
    private final List<Command> history = new ArrayList<>();

    public void addCommand(Command command) {
        history.add(0, command);
    }

    public void removeCommand(Command command) {
        history.remove(command);
    }

    public List<Command> getHistory() {
        return this.history;
    }
}
