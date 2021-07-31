package com.learning.gofpatterns.creational.factory_method.products;

import lombok.Getter;

public class ConcreteProductA implements Product {
    @Getter
    String className;

    public ConcreteProductA() {
        className = this.getClass().getSimpleName();
    }

    @Override
    public void doStuff() {
        // Specifics of product A
        System.out.printf("[%s] Doing stuff this way!\n", this.className);
    }
}
