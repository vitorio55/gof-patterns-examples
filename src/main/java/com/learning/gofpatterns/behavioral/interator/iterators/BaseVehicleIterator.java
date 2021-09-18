package com.learning.gofpatterns.behavioral.interator.iterators;

import com.learning.gofpatterns.behavioral.interator.entities.Vehicle;

import java.util.List;

public abstract class BaseVehicleIterator implements VehicleIterator {
    protected List<Vehicle> vehicles;
    protected int position;

    // Current position of the Iterator in practice means the next element on the iteration !

    @Override
    public Vehicle getNext() {
        if (hasMore()) {
            return this.vehicles.get(this.position++);
        } else {
            return null;
        }
    }

    @Override
    public boolean hasMore() {
        return this.position < this.vehicles.size();
    }

    @Override
    public void printCurrent() {
        System.out.println(" " + this.vehicles.get(this.position));
    }
}
