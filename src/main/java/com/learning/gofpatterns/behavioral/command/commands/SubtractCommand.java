package com.learning.gofpatterns.behavioral.command.commands;

import com.learning.gofpatterns.behavioral.command.Total;

public class SubtractCommand implements Command {
    private Total total;
    private float delta;

    public SubtractCommand(Total total, float delta) {
        this.total = total;
        this.delta = delta;
    }

    @Override
    public Command execute() {
        float acc = this.total.getAcc();
        acc -= this.delta;
        this.total.setAcc(acc);
        System.out.println("[SUB " + this.delta + " = " + this.total.getAcc() + "]");
        return this;
    }

    @Override
    public void undo() {
        float acc = this.total.getAcc();
        acc += this.delta;
        this.total.setAcc(acc);
        System.out.println("[UNDO SUB " + this.delta + " = " + this.total.getAcc() + "]");
    }
}
