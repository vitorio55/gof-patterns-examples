package com.learning.gofpatterns.behavioral.template_method;

import com.learning.gofpatterns.BannerPrinter;
import com.learning.gofpatterns.Example;

public class TemplateMethodExample implements Example {

    @Override
    public void runExample() {
        BannerPrinter.printTemplateMethod();

        System.out.println("==> Running Template Method Example");

        System.out.println("""
            The Template Method Pattern provides a way of allowing parts of an algorithm to be customized through
            class extension. The pattern can be broken into:
              * A template method which indicates and order of operations that all sub classes must respect
              * Methods (that are called in the template method cited above) that will be implemented by the sub
              classes in any way that makes sense to the sub classes
            """);

        SumOperations sumOperations = new SumOperations();
        SubtractionOperations subtractionOperations = new SubtractionOperations();

        sumOperations.executeOperations();
        subtractionOperations.executeOperations();
    }

}