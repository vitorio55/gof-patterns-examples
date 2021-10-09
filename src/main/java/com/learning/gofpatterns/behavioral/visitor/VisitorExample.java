package com.learning.gofpatterns.behavioral.visitor;

import com.learning.gofpatterns.BannerPrinter;
import com.learning.gofpatterns.Example;
import com.learning.gofpatterns.behavioral.visitor.elements.Element;
import com.learning.gofpatterns.behavioral.visitor.elements.FactorialElement;
import com.learning.gofpatterns.behavioral.visitor.elements.IncrementThreeTimesElement;
import com.learning.gofpatterns.behavioral.visitor.elements.PrinterElement;

import java.util.List;

public class VisitorExample implements Example {

    @Override
    public void runExample() {
        BannerPrinter.printVisitorBanner();

        System.out.println("==> Running Visitor Example");

        System.out.println("""
            The Visitor Pattern describes a way of decoupling some code logic from the object upon which it operates.
            It is composed of the base Element and Visitor interfaces. The Element must describe an accept operation,
            which receives a Visitor as argument. The Concrete Element then implements it, which consists of calling
            the appropriate Visitor's method (specific visit operation). The Concrete Visitor then implements the
            actual logic (specific visit operation) for each of the Elements.
            
            In the future, when we need to expand an operation, all we have to to is create a new Concrete Element
            and add the new algorithm to the Concrete Visitor class.
            
            In this example, we have three very different simple algorithms that can all be executed in a simple
            forEach loop. This is possible due to the actual code of the logic being implemented inside the concrete
            visitor, and not the elements themselves.
            """);

        PrinterElement printerElement = new PrinterElement("This is the text of the PrinterElement!");
        IncrementThreeTimesElement incrementThreeTimesElement = new IncrementThreeTimesElement(5, 10);
        FactorialElement factorialElement = new FactorialElement(6);

        List<Element> elements = List.of(
            printerElement,
            incrementThreeTimesElement,
            factorialElement
        );

        ConcreteVisitor concreteVisitor = new ConcreteVisitor();

        elements.forEach(e -> e.accept(concreteVisitor));
    }

}