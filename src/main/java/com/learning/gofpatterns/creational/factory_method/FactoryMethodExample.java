package com.learning.gofpatterns.creational.factory_method;

import com.learning.gofpatterns.BannerPrinter;
import com.learning.gofpatterns.Example;
import com.learning.gofpatterns.creational.factory_method.creators.ConcreteCreatorA;
import com.learning.gofpatterns.creational.factory_method.creators.ConcreteCreatorB;
import com.learning.gofpatterns.creational.factory_method.creators.Creator;

import java.util.List;

public class FactoryMethodExample implements Example {
    @Override
    public void runExample() {
        BannerPrinter.printFactoryMethodBanner();

        System.out.println("==> Running Factory Method Example");

        System.out.println("* Instantiating our concrete Creator classes...");
        List<Creator> creatorsList = List.of(
                new ConcreteCreatorA(),
                new ConcreteCreatorB()
        );

        System.out.println("* Each of our Creator classes will now create their product and make them doStuff()...");
        creatorsList.forEach(Creator::createProductAndDoStuff);
        System.out.println("");
    }
}
