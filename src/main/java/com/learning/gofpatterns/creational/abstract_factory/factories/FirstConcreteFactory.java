package com.learning.gofpatterns.creational.abstract_factory.factories;

import com.learning.gofpatterns.creational.abstract_factory.products.*;
import com.learning.gofpatterns.creational.abstract_factory.products.first_factory.ConcreteProductA1;
import com.learning.gofpatterns.creational.abstract_factory.products.first_factory.ConcreteProductB1;
import com.learning.gofpatterns.creational.abstract_factory.products.first_factory.ConcreteProductC1;

public class FirstConcreteFactory implements AbstractFactory {

    @Override
    public ProductA createProductA() {
        ProductA product = new ConcreteProductA1();
        product.identifyProductA();
        return product;
    }

    @Override
    public ProductB createProductB() {
        ProductB product = new ConcreteProductB1();
        product.identifyProductB();
        return product;
    }

    @Override
    public ProductC createProductC() {
        ProductC product = new ConcreteProductC1();
        product.identifyProductC();
        return product;
    }
}
