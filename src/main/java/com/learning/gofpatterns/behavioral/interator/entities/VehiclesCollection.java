package com.learning.gofpatterns.behavioral.interator.entities;

import com.learning.gofpatterns.behavioral.interator.VehicleType;
import com.learning.gofpatterns.behavioral.interator.iterators.VehicleIterator;
import com.learning.gofpatterns.behavioral.interator.iterators.VehicleIteratorByType;
import com.learning.gofpatterns.behavioral.interator.iterators.VehicleIteratorByYear;

import java.util.List;

public class VehiclesCollection implements VehicleDataset {
    List<Vehicle> collection;

    public VehiclesCollection(List<Vehicle> collection) {
        this.collection = collection;
    }

    @Override
    public VehicleIterator createCarsIterator() {
        return new VehicleIteratorByType(this.collection, VehicleType.CAR);
    }

    @Override
    public VehicleIterator createMotorcyclesIterator() {
        return new VehicleIteratorByType(this.collection, VehicleType.MOTORCYCLE);
    }

    @Override
    public VehicleIterator createAirplanesIterator() {
        return new VehicleIteratorByType(this.collection, VehicleType.AIRPLANE);
    }

    @Override
    public VehicleIterator createYear2009Iterator() {
        return new VehicleIteratorByYear(this.collection, 2009);
    }

    @Override
    public VehicleIterator createYear2012Iterator() {
        return new VehicleIteratorByYear(this.collection, 2012);
    }

    public void print() {
        this.collection.forEach((v) -> System.out.println(" " + v));
    }
}
