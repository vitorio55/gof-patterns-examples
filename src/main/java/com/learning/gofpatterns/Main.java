package com.learning.gofpatterns;

import com.learning.gofpatterns.creational.abstract_factory.AbstractFactoryExample;
import com.learning.gofpatterns.creational.builder.bloch.JoshuaBlochBuilderExample;
import com.learning.gofpatterns.creational.factory_method.FactoryMethodExample;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Example> examples = List.of(
                // Creational Patterns
                new FactoryMethodExample(),
                new AbstractFactoryExample(),
                // I created 2 Builder Pattern examples, they are slightly different
                new com.learning.gofpatterns.creational.builder.first.BuilderExample(), // This builds a mutable Structure object
                new com.learning.gofpatterns.creational.builder.second.BuilderExample(), // This builds an immutable House object
                new JoshuaBlochBuilderExample() // Extra builder example (which is not a GoF Pattern)
        );
        examples.forEach(Example::runExample);
    }
}
