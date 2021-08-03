package com.learning.gofpatterns.creational.abstract_factory;

import com.learning.gofpatterns.Example;
import com.learning.gofpatterns.creational.abstract_factory.factories.AbstractFactory;
import com.learning.gofpatterns.creational.abstract_factory.factories.FirstConcreteFactory;
import com.learning.gofpatterns.creational.abstract_factory.factories.SecondConcreteFactory;

import java.util.List;

public class AbstractFactoryExample implements Example {
    @Override
    public void runExample() {
        System.out.println("==> Running Abstract Factory Example");

        System.out.println("* Instantiating our concrete Factory classes...");
        List<AbstractFactory> factories = List.of(
            new FirstConcreteFactory(),
            new SecondConcreteFactory()
        );

        System.out.println("* Factories will now create their product lines...");
        factories.forEach(factory -> {
            factory.createProductA();
            factory.createProductB();
            factory.createProductC();
            System.out.println("");
        });
    }
}
