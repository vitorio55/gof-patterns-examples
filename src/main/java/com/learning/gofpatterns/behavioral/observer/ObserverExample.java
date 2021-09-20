package com.learning.gofpatterns.behavioral.observer;

import com.learning.gofpatterns.BannerPrinter;
import com.learning.gofpatterns.Example;

import java.util.List;

public class ObserverExample implements Example {

    @Override
    public void runExample() {
        BannerPrinter.printObserverBanner();

        System.out.println("==> Running Observer Example");

        System.out.println("""
            The Observer Pattern describes a way of notifying entities that their subject of interest has been updated.
            The Publisher (or Subject) is responsible for processing its specific logic and notifying the Observers
            (or Subscribers) of the updates.
            """);

        List<Observer> observerList = List.of(
                new EvenObserver("A"),
                new EvenObserver("B"),
                new OddObserver("C"),
                new OddObserver("D"),
                new OddObserver("E")
        );

        NumberSubject numberSubject = new NumberSubject(observerList);

        for (int i = 0; i <= 6; i++) {
            numberSubject.evaluateNumber(i);
        }

        System.out.println();
    }

}