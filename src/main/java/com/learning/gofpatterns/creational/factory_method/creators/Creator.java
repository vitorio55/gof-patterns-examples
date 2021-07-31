package com.learning.gofpatterns.creational.factory_method.creators;

import com.learning.gofpatterns.creational.factory_method.products.Product;

abstract public class Creator {
    public void createProductAndDoStuff() {
        Product product = this.createProduct();
        product.doStuff();
    }

    abstract Product createProduct(); // This is the Factory Method
}
