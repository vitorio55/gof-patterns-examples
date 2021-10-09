package com.learning.gofpatterns.behavioral.visitor.elements;

import com.learning.gofpatterns.behavioral.visitor.Visitor;

public class FactorialElement implements Element {
    private int number;

    public FactorialElement(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitFactorialElement(this);
    }

}
