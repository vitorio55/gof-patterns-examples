package com.learning.gofpatterns.behavioral.command.commands;

public interface Command {
    Command execute();
    void undo();
}
