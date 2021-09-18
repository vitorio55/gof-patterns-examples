package com.learning.gofpatterns.behavioral.interator.iterators;

import com.learning.gofpatterns.behavioral.interator.entities.Vehicle;

public interface VehicleIterator {
    Vehicle getNext();
    boolean hasMore();
    void printCurrent();
}
