package com.learning.gofpatterns.creational.abstract_factory.products.first_factory;

import com.learning.gofpatterns.creational.abstract_factory.products.ProductA;
import lombok.Getter;

public class ConcreteProductA1 implements ProductA {
    @Getter
    String className;

    public ConcreteProductA1() {
        className = this.getClass().getSimpleName();
    }

    @Override
    public void identifyProductA() {
        System.out.printf("[%s] I am product A1, made by the First factory!\n", this.className);
    }
}
