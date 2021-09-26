package com.learning.gofpatterns.behavioral.strategy;

import java.util.List;

public class Context {
    NumbersStrategy strategy;
    List<Integer> baseNumbers;

    public Context(NumbersStrategy strategy, List<Integer> baseNumbers) {
        this.strategy = strategy;
        this.baseNumbers = baseNumbers;
    }

    public void setStrategy(NumbersStrategy strategy) {
        this.strategy = strategy;
    }

    public void printNumbers() {
        System.out.println("  " + this.strategy.getNumbers(this.baseNumbers));
    }
}
