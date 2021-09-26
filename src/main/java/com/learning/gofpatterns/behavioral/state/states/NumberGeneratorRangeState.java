package com.learning.gofpatterns.behavioral.state.states;

import com.learning.gofpatterns.behavioral.state.Context;

public record NumberGeneratorRangeState(int min, int max, State nextState) implements State {

    @Override
    public double generateRandomNumber(Context context) {
        double gen = (Math.random() * ((this.max - this.min) + 1)) + this.min;
        if (this.nextState != null) {
            context.setCurrentState(this.nextState);
        }
        return gen;
    }
}
