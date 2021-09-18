package com.learning.gofpatterns.behavioral.interator.entities;

import com.learning.gofpatterns.behavioral.interator.iterators.VehicleIterator;

public interface VehicleDataset {
    VehicleIterator createCarsIterator();
    VehicleIterator createMotorcyclesIterator();
    VehicleIterator createAirplanesIterator();

    VehicleIterator createYear2009Iterator();
    VehicleIterator createYear2012Iterator();
}
