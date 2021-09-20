package com.learning.gofpatterns.behavioral.observer;

import java.util.List;

public class NumberSubject extends Publisher {
    String className;

    public NumberSubject(List<Observer> observerList) {
        super(observerList);
        this.className = this.getClass().getSimpleName();
    }

    public void evaluateNumber(int num) {
        System.out.printf("[%s] Updating observers about new number (%d)\n", this.className, num);
        notifyObservers(num);
    }
}
