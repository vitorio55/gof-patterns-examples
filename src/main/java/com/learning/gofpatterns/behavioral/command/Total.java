package com.learning.gofpatterns.behavioral.command;

public class Total {
    private float acc;

    // This is our Receiver class

    public Total(float acc) {
        this.acc = acc;
    }

    public float getAcc() {
        return acc;
    }

    public void setAcc(float acc) {
        this.acc = acc;
    }
}
