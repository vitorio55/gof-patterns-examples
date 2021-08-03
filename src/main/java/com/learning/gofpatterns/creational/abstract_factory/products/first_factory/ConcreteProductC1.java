package com.learning.gofpatterns.creational.abstract_factory.products.first_factory;

import com.learning.gofpatterns.creational.abstract_factory.products.ProductC;
import lombok.Getter;

public class ConcreteProductC1 implements ProductC {
    @Getter
    String className;

    public ConcreteProductC1() {
        className = this.getClass().getSimpleName();
    }

    @Override
    public void identifyProductC() {
        System.out.printf("[%s] I am product C1, made by the First factory!\n", this.className);
    }
}
