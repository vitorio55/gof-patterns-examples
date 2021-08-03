package com.learning.gofpatterns.creational.abstract_factory.products.second_factory;

import com.learning.gofpatterns.creational.abstract_factory.products.ProductC;
import lombok.Getter;

public class ConcreteProductC2 implements ProductC {
    @Getter
    String className;

    public ConcreteProductC2() {
        className = this.getClass().getSimpleName();
    }

    @Override
    public void identifyProductC() {
        System.out.printf("[%s] I am product C2, made by the Second factory!\n", this.className);
    }
}
