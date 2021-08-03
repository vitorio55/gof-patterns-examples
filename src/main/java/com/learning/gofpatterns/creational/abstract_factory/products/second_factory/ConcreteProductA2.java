package com.learning.gofpatterns.creational.abstract_factory.products.second_factory;

import com.learning.gofpatterns.creational.abstract_factory.products.ProductA;
import lombok.Getter;

public class ConcreteProductA2 implements ProductA {
    @Getter
    String className;

    public ConcreteProductA2() {
        className = this.getClass().getSimpleName();
    }

    @Override
    public void identifyProductA() {
        System.out.printf("[%s] I am product A2, made by the Second factory!\n", this.className);
    }
}
