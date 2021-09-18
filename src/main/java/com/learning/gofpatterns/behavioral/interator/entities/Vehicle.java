package com.learning.gofpatterns.behavioral.interator.entities;

import com.learning.gofpatterns.behavioral.interator.VehicleType;

public class Vehicle {
    VehicleType type;
    String model;
    int year;

    public Vehicle(VehicleType type, String model, int year) {
        this.type = type;
        this.model = model;
        this.year = year;
    }

    public VehicleType getType() {
        return type;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "type=" + type +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
