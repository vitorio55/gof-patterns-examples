package com.learning.gofpatterns.creational.builder.extra.bloch;

import com.learning.gofpatterns.Example;

public class JoshuaBlochBuilderExample implements Example {
    @Override
    public void runExample() {
        System.out.println("==> Running Joshua Bloch's Builder Example");

        /*******************************************************
         * This is an extra example.
         * Joshua Bloch's Builder isn't a GoF Design Pattern
         ******************************************************/

        String engine = "1.6";
        String maker = "Ford";

        Car car = new Car.Builder(engine, maker)
                .color(Color.RED)
                .year(1995)
                .seats(4)
                .doors(4)
                .build();

        System.out.println(car.toString());

        System.out.println("Make sure to check the Bloch's Builder pattern unit tests on this project!\n");
    }
}
