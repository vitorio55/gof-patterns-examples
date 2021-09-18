package com.learning.gofpatterns.behavioral.interator.iterators;

import com.learning.gofpatterns.behavioral.interator.entities.Vehicle;

import java.util.List;
import java.util.stream.Collectors;

public class VehicleIteratorByYear extends BaseVehicleIterator {
    private int year;

    public VehicleIteratorByYear(List<Vehicle> collection, int year) {
        if (collection == null) return;
        this.year = year;
        this.vehicles = collection
                .stream()
                .filter((v) -> this.year == v.getYear())
                .collect(Collectors.toList());
        this.position = 0;
    }
}
