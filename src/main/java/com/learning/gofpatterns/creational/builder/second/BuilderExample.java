package com.learning.gofpatterns.creational.builder.second;

import com.learning.gofpatterns.Example;
import com.learning.gofpatterns.creational.builder.second.builders.ConcreteHouseBuilder;
import com.learning.gofpatterns.creational.builder.second.builders.WoodHouseBuilder;
import com.learning.gofpatterns.creational.builder.second.directors.Director;
import com.learning.gofpatterns.creational.builder.second.products.House;

public class BuilderExample implements Example {
    @Override
    public void runExample() {
        System.out.println("==> Running Second Builder Example");

        // For this example we will take a different approach (in contrast to the Factory Method and Abstract
        // Factory patterns) to exemplify the pattern. We will use classes that represent something in the real world.

        // Here our entity (House) is immutable. Our Concrete Builders create new Houses, but they never change.

        WoodHouseBuilder woodHouseBuilder = new WoodHouseBuilder();
        ConcreteHouseBuilder concreteHouseBuilder = new ConcreteHouseBuilder();

        Director director = new Director(woodHouseBuilder);

        System.out.println("Building a wood house...");
        director.constructHouseWithWoodExtraRoom();
        House house = woodHouseBuilder.getHouse();
        System.out.println(house.toString());

        System.out.println("Building a concrete house...");
        director.setHouseBuilder(concreteHouseBuilder);
        director.constructHouseWithConcreteExtraRoom();
        house = concreteHouseBuilder.getHouse();
        System.out.println(house.toString());

        System.out.println("Make sure to check the second Builder pattern unit tests on this project!");
    }
}
