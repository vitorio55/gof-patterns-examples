package com.learning.gofpatterns.behavioral.command.commands;

import com.learning.gofpatterns.behavioral.command.Total;

public class DivideCommand implements Command {
    private Total total;
    private float delta;

    public DivideCommand(Total total, float delta) {
        this.total = total;
        this.delta = delta;
    }

    @Override
    public Command execute() {
        float acc = this.total.getAcc();
        acc /= this.delta;
        this.total.setAcc(acc);
        System.out.println("[DIV " + this.delta + " = " + this.total.getAcc() + "]");
        return this;
    }

    @Override
    public void undo() {
        float acc = this.total.getAcc();
        acc *= this.delta;
        this.total.setAcc(acc);
        System.out.println("[UNDO DIV " + this.delta + " = " + this.total.getAcc() + "]");
    }
}
