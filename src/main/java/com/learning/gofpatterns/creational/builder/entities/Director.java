package com.learning.gofpatterns.creational.builder.entities;

import com.learning.gofpatterns.creational.builder.builders.Builder;

public class Director {
    String className;
    Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
        className = this.getClass().getSimpleName();
    }

    public void changeBuilder(Builder builder) {
        this.builder = builder;
    }

    public void constructTinyHouse() {
        builder
            .color("Blue")
            .mainMaterial("Wood")
            .value("USD50,000.00")
            .yearBuilt("1978")
            .windows("5")
            .doors("3")
            .floors("1")
            .rooms("2");
        System.out.printf("[%s] The Director built a tiny house: \n", this.className);
    }

    public void constructHugeMansion() {
        builder
            .color("White")
            .mainMaterial("Bricks")
            .value("USD1,500,000.00")
            .yearBuilt("2003")
            .windows("25")
            .doors("30")
            .floors("4")
            .rooms("20");
        System.out.printf("[%s] The Director built a huge mansion: \n", this.className);
    }

    public void constructApartmentBuilding() {
        builder
            .color("Gray")
            .mainMaterial("Concrete")
            .value("USD8,000,000.00")
            .yearBuilt("2010")
            .windows("245")
            .doors("275")
            .floors("15")
            .rooms("220");
        System.out.printf("[%s] The Director built an appartment building: \n", this.className);
    }

    public String getClassName() {
        return this.className;
    }
}
