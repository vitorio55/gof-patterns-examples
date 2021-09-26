package com.learning.gofpatterns.behavioral.state;

import com.learning.gofpatterns.behavioral.state.states.State;

public class Context {
    State currentState;

    public Context(State currentState) {
        this.currentState = currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public double generateRandomNumber() {
        return this.currentState.generateRandomNumber(this);
    }
}
