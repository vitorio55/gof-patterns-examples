package com.learning.gofpatterns.behavioral.observer;

import java.util.List;

public class Publisher {
    List<Observer> observersList;

    public Publisher(List<Observer> observersList) {
        this.observersList = observersList;
    }

    public void notifyObservers(int num) {
        this.observersList.forEach(o -> o.update(num));
    }
}
