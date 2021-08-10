package com.learning.gofpatterns.creational.builder.first;

import com.learning.gofpatterns.BannerPrinter;
import com.learning.gofpatterns.Example;
import com.learning.gofpatterns.creational.builder.first.builders.StructureBuilder;
import com.learning.gofpatterns.creational.builder.first.entities.Director;
import com.learning.gofpatterns.creational.builder.first.entities.Structure;

public class FirstBuilderExample implements Example {
    @Override
    public void runExample() {
        BannerPrinter.printBuilderBanner();

        System.out.println("==> Running First Builder Example");

        // For this example we will take a different approach (in contrast to the Factory Method and Abstract
        // Factory patterns) to exemplify the pattern. We will use classes that represent something in the real world.

        StructureBuilder structureBuilder = new StructureBuilder();
        Structure mediumHouse = structureBuilder
                .color("Green")
                .mainMaterial("Bricks")
                .value("USD600,000.00")
                .yearBuilt("2010")
                .windows("8")
                .doors("6")
                .floors("2")
                .rooms("5")
                .getResult();

        System.out.printf("[%s] Built the following house using the Builder directly: \n", structureBuilder.getClassName());
        mediumHouse.showInfo();

        // We can also use the Director to run pre-defined building recipes for us.
        Director director = new Director(structureBuilder);

        // A tiny house
        director.constructTinyHouse();
        structureBuilder.getResult().showInfo();

        // A huge mansion
        director.constructHugeMansion();
        structureBuilder.getResult().showInfo();

        // An apartment building
        director.constructApartmentBuilding();
        structureBuilder.getResult().showInfo();
    }
}
