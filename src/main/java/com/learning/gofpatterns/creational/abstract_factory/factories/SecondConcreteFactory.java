package com.learning.gofpatterns.creational.abstract_factory.factories;

import com.learning.gofpatterns.creational.abstract_factory.products.*;
import com.learning.gofpatterns.creational.abstract_factory.products.second_factory.ConcreteProductA2;
import com.learning.gofpatterns.creational.abstract_factory.products.second_factory.ConcreteProductB2;
import com.learning.gofpatterns.creational.abstract_factory.products.second_factory.ConcreteProductC2;

public class SecondConcreteFactory implements AbstractFactory {

    @Override
    public ProductA createProductA() {
        ProductA product = new ConcreteProductA2();
        product.identifyProductA();
        return product;
    }

    @Override
    public ProductB createProductB() {
        ProductB product = new ConcreteProductB2();
        product.identifyProductB();
        return product;
    }

    @Override
    public ProductC createProductC() {
        ProductC product = new ConcreteProductC2();
        product.identifyProductC();
        return product;
    }
}
