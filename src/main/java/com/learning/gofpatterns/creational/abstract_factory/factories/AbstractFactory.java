package com.learning.gofpatterns.creational.abstract_factory.factories;

import com.learning.gofpatterns.creational.abstract_factory.products.ProductA;
import com.learning.gofpatterns.creational.abstract_factory.products.ProductB;
import com.learning.gofpatterns.creational.abstract_factory.products.ProductC;

public interface AbstractFactory {
    ProductA createProductA();
    ProductB createProductB();
    ProductC createProductC();
}
