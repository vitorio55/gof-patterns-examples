package com.learning.gofpatterns.creational.factory_method.creators;

import com.learning.gofpatterns.creational.factory_method.products.ConcreteProductB;
import com.learning.gofpatterns.creational.factory_method.products.Product;

public class ConcreteCreatorB extends Creator {
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
