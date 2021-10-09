package com.learning.gofpatterns.behavioral.visitor.elements;

import com.learning.gofpatterns.behavioral.visitor.Visitor;

public record IncrementThreeTimesElement(int step, int baseNumber) implements Element {

    public int getBaseNumber() {
        return baseNumber;
    }

    public int getStep() {
        return step;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitIncrementThreeTimesElement(this);
    }
}
