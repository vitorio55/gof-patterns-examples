package com.learning.gofpatterns.behavioral.interator.iterators;

import com.learning.gofpatterns.behavioral.interator.entities.Vehicle;
import com.learning.gofpatterns.behavioral.interator.VehicleType;

import java.util.List;
import java.util.stream.Collectors;

public class VehicleIteratorByType extends BaseVehicleIterator {
    private VehicleType type;

    public VehicleIteratorByType(List<Vehicle> collection, VehicleType type) {
        if (collection == null) return;
        this.type = type;
        this.vehicles = collection
                .stream()
                .filter((v) -> this.type == v.getType())
                .collect(Collectors.toList());
        this.position = 0;
    }
}
