package com.learning.gofpatterns.creational.factory_method.creators;

import com.learning.gofpatterns.creational.factory_method.products.ConcreteProductA;
import com.learning.gofpatterns.creational.factory_method.products.Product;

public class ConcreteCreatorA extends Creator {
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
