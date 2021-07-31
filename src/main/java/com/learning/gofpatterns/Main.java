package com.learning.gofpatterns;

import com.learning.gofpatterns.creational.factory_method.FactoryMethodExample;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Example> examples = List.of(
                new FactoryMethodExample()
        );
        examples.forEach(Example::runExample);
    }
}
