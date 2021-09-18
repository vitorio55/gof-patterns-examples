package com.learning.gofpatterns.behavioral.interator;

import com.learning.gofpatterns.BannerPrinter;
import com.learning.gofpatterns.Example;
import com.learning.gofpatterns.behavioral.interator.entities.Vehicle;
import com.learning.gofpatterns.behavioral.interator.entities.VehiclesCollection;
import com.learning.gofpatterns.behavioral.interator.iterators.VehicleIteratorByType;
import com.learning.gofpatterns.behavioral.interator.iterators.VehicleIteratorByYear;

import java.util.List;

public class IteratorExample implements Example {

    @Override
    public void runExample() {
        BannerPrinter.printIteratorBanner();

        System.out.println("==> Running Iterator Example");

        System.out.println("""
            The Iterator Pattern aims to implement a flexible way to traverse a dataset that is decoupled from
            the dataset itself.
            
            In this example we use the Iterator Pattern to define two types of vehicle iteration:
            * The first one traverses the vehicles of a specific type (AIRPLANE, CAR or MOTORCYCLE)
            * The second one traverses base on the vehicle's year
            """);

        List<Vehicle> vehicleList = List.of(
                new Vehicle(VehicleType.CAR, "Saturn AURA", 2009),
                new Vehicle(VehicleType.CAR, "Chrysler CROSSFIRE", 2008),
                new Vehicle(VehicleType.CAR, "Hyundai SONATA", 2012),
                new Vehicle(VehicleType.CAR, "Honda CH80 ELITE", 2002),

                new Vehicle(VehicleType.AIRPLANE, "Embraer EMB-314 Super Tucano", 2004),
                new Vehicle(VehicleType.AIRPLANE, "Airbus A320", 1987),
                new Vehicle(VehicleType.AIRPLANE, "Martin M-130", 1935),
                new Vehicle(VehicleType.AIRPLANE, "Boeing 777", 1995),

                new Vehicle(VehicleType.MOTORCYCLE, "Honda CBR500R", 2016),
                new Vehicle(VehicleType.MOTORCYCLE, "Suzuki GSX-R600", 2010),
                new Vehicle(VehicleType.MOTORCYCLE, "Harley-Davidson FLD Dyna Switchback", 2013),
                new Vehicle(VehicleType.MOTORCYCLE, "Vespa GTV250", 2009)
        );

        VehiclesCollection collection = new VehiclesCollection(vehicleList);

        VehicleIteratorByType carIterator = (VehicleIteratorByType) collection.createCarsIterator();
        VehicleIteratorByType airplaneIterator = (VehicleIteratorByType) collection.createAirplanesIterator();
        VehicleIteratorByType motorcycleIterator = (VehicleIteratorByType) collection.createMotorcyclesIterator();

        VehicleIteratorByYear twoK09Iterator = (VehicleIteratorByYear) collection.createYear2009Iterator();
        VehicleIteratorByYear twoK12Iterator = (VehicleIteratorByYear) collection.createYear2012Iterator();

        System.out.println("Whole vehicles collection:");
        collection.print();

        System.out.println("\n--- Running cars iterator...");
        while (carIterator.hasMore()) {
            carIterator.printCurrent();
            carIterator.getNext();
        }

        System.out.println("\n--- Running airplane iterator...");
        while (airplaneIterator.hasMore()) {
            airplaneIterator.printCurrent();
            airplaneIterator.getNext();
        }

        System.out.println("\n--- Running motorcycle iterator...");
        while (motorcycleIterator.hasMore()) {
            motorcycleIterator.printCurrent();
            motorcycleIterator.getNext();
        }

        System.out.println("\n--- Running year 2009 vehicle iterator...");
        while (twoK09Iterator.hasMore()) {
            twoK09Iterator.printCurrent();
            twoK09Iterator.getNext();
        }

        System.out.println("\n--- Running year 2012 vehicle iterator...");
        while (twoK12Iterator.hasMore()) {
            twoK12Iterator.printCurrent();
            twoK12Iterator.getNext();
        }

        System.out.println();
    }
}
