package com.learning.gofpatterns.creational.prototype.deepcopy_interface;

import com.learning.gofpatterns.Example;

import java.util.ArrayList;
import java.util.List;

public class PrototypeDeepCopyInterfaceExample implements Example {
    @Override
    public void runExample() {
        System.out.println("==> Running Prototype Example using interface that handles deep copying");

        List<Prototype> concretePrototypes = new ArrayList<>();
        List<Prototype> clonedList = new ArrayList<>();

        ConcretePrototype cpA = new ConcretePrototype();
        cpA.setEntity(new AnEntity(10, new AnotherEntity("first", "second")));
        concretePrototypes.add(cpA);

        ConcretePrototype cpB = new ConcretePrototype();
        cpB.setEntity(new AnEntity(20, new AnotherEntity("third", "fourth")));
        concretePrototypes.add(cpB);

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

        System.out.println("Now lets change the AnEntity's anotherEntity attribute's first string of the first concrete prototype copy...");
        ((ConcretePrototype) clonedList.get(0)).getEntity().getAnotherEntity().setFirstString("NEW STRING");

        System.out.println("\nAs we can see only the copy was affected by the change:\n");

        System.out.println("This is our list of concrete prototypes...");
        concretePrototypes.forEach((concretePrototype) -> {
            System.out.println("   " + concretePrototype);
        });

        System.out.println("This is our list of clones...");
        clonedList.forEach((concretePrototype) -> {
            System.out.println("   " + concretePrototype);
        });
        System.out.println("");
    }
}
