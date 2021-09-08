package com.learning.gofpatterns.behavioral.command.commands;

import com.learning.gofpatterns.behavioral.command.Total;

public class FactorialCommand implements Command {
    Total total;
    float backup;

    public FactorialCommand(Total total) {
        this.total = total;
    }

    @Override
    public Command execute() {
        this.backup = this.total.getAcc();
        float factorialResult = this.doFactorial(this.total.getAcc());
        this.total.setAcc(factorialResult);
        System.out.println("[FACT = " + this.total.getAcc() + "]");
        return this;
    }

    @Override
    public void undo() {
        this.total.setAcc(this.backup);
        System.out.println("[UNDO FACT = " + this.total.getAcc() + "]");
    }

    private float doFactorial(float val) {
        if (val == 0) {
            return 1;
        } else {
            return val * this.doFactorial(val - 1);
        }
    }
}
