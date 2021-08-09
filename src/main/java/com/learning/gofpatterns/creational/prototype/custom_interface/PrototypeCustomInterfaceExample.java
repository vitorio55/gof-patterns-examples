package com.learning.gofpatterns.creational.prototype.custom_interface;

import com.learning.gofpatterns.Example;

import java.util.ArrayList;
import java.util.List;

public class PrototypeCustomInterfaceExample implements Example {
    @Override
    public void runExample() {
        System.out.println("==> Running Prototype Example that uses a custom base interface (not Java's Cloneable)");

        // Clone operation is implemented manually.

        List<Prototype> concretePrototypes = new ArrayList<>();
        List<Prototype> clonedList = new ArrayList<>();

        ConcretePrototypeA cpA0 = new ConcretePrototypeA();
        cpA0.setNumber(50);
        concretePrototypes.add(cpA0);

        ConcretePrototypeA cpA1 = new ConcretePrototypeA();
        cpA1.setNumber(100);
        concretePrototypes.add(cpA1);

        ConcretePrototypeB cpB0 = new ConcretePrototypeB();
        cpB0.setSomeString("This is a string");
        concretePrototypes.add(cpB0);

        ConcretePrototypeB cpB1 = new ConcretePrototypeB();
        cpB1.setSomeString("This is another string");
        concretePrototypes.add(cpB1);

        System.out.println("This is our list of concrete prototypes...");
        concretePrototypes.forEach((concretePrototype) -> {
            System.out.println("   " + concretePrototype);
        });

        System.out.println("Let's clone the concrete prototypes list elements into a new list...");
        concretePrototypes.forEach((concretePrototype) -> {
            clonedList.add(concretePrototype.clone());
        });

        System.out.println("This is our list of clones...");
        clonedList.forEach((concretePrototype) -> {
            System.out.println("   " + concretePrototype);
        });
        System.out.println("");
    }
}
