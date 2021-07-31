package com.learning.gofpatterns.creational.factory_method.products;

import lombok.Getter;

public class ConcreteProductB implements Product {
    @Getter
    String className;

    public ConcreteProductB() {
        className = this.getClass().getSimpleName();
    }

    @Override
    public void doStuff() {
        // Specifics of product B
        System.out.printf("[%s] Doing stuff in a different way!\n", this.className);
    }
}
