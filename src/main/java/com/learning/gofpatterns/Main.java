package com.learning.gofpatterns;

import com.learning.gofpatterns.creational.abstract_factory.AbstractFactoryExample;
import com.learning.gofpatterns.creational.factory_method.FactoryMethodExample;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Example> examples = List.of(
                // Creational Patterns
                new FactoryMethodExample(),
                new AbstractFactoryExample()
        );
        examples.forEach(Example::runExample);
    }
}
