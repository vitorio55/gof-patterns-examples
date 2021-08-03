package com.learning.gofpatterns.creational.abstract_factory.products.first_factory;

import com.learning.gofpatterns.creational.abstract_factory.products.ProductB;
import lombok.Getter;

public class ConcreteProductB1 implements ProductB {
    @Getter
    String className;

    public ConcreteProductB1() {
        className = this.getClass().getSimpleName();
    }

    @Override
    public void identifyProductB() {
        System.out.printf("[%s] I am product B1, made by the First factory!\n", this.className);
    }
}
