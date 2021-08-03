package com.learning.gofpatterns.creational.abstract_factory.products.second_factory;

import com.learning.gofpatterns.creational.abstract_factory.products.ProductB;
import lombok.Getter;

public class ConcreteProductB2 implements ProductB {
    @Getter
    String className;

    public ConcreteProductB2() {
        className = this.getClass().getSimpleName();
    }

    @Override
    public void identifyProductB() {
        System.out.printf("[%s] I am product B2, made by the Second factory!\n", this.className);
    }
}
