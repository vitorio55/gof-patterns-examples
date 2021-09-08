package com.learning.gofpatterns.behavioral.command.commands;

import com.learning.gofpatterns.behavioral.command.Total;

public class SumCommand implements Command {
    private Total total;
    private float delta;

    public SumCommand(Total total, float delta) {
        this.total = total;
        this.delta = delta;
    }

    @Override
    public Command execute() {
        float acc = this.total.getAcc();
        acc += this.delta;
        this.total.setAcc(acc);
        System.out.println("[SUM " + this.delta + " = " + this.total.getAcc() + "]");
        return this;
    }

    @Override
    public void undo() {
        float acc = this.total.getAcc();
        acc -= this.delta;
        this.total.setAcc(acc);
        System.out.println("[UNDO SUM " + this.delta + " = " + this.total.getAcc() + "]");
    }
}
