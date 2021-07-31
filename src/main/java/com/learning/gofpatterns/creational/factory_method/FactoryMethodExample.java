package com.learning.gofpatterns.creational.factory_method;

import com.learning.gofpatterns.Example;
import com.learning.gofpatterns.creational.factory_method.creators.ConcreteCreatorA;
import com.learning.gofpatterns.creational.factory_method.creators.ConcreteCreatorB;
import com.learning.gofpatterns.creational.factory_method.creators.Creator;

import java.util.List;

public class FactoryMethodExample implements Example {
    @Override
    public void runExample() {
        System.out.println("==> Running Factory Method Example");

        List<Creator> creatorsList = List.of(
                new ConcreteCreatorA(),
                new ConcreteCreatorB()
        );

        creatorsList.forEach(Creator::createProductAndDoStuff);
    }
}
