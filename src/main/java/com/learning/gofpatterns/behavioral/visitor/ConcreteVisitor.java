package com.learning.gofpatterns.behavioral.visitor;

import com.learning.gofpatterns.behavioral.visitor.elements.FactorialElement;
import com.learning.gofpatterns.behavioral.visitor.elements.IncrementThreeTimesElement;
import com.learning.gofpatterns.behavioral.visitor.elements.PrinterElement;

public class ConcreteVisitor implements Visitor {
    @Override
    public void visitPrinterElement(PrinterElement element) {
        System.out.println("Concrete visitor displaying PrinterElement's message!");
        System.out.println("   " + element.getMyPhrase());
    }

    @Override
    public void visitIncrementThreeTimesElement(IncrementThreeTimesElement element) {
        System.out.println("Concrete visitor incrementing IncrementThreeTimesElement element!");
        int num = element.getBaseNumber();
        num += element.getStep();
        num += element.getStep();
        num += element.getStep();
        System.out.println("   Final number: " + num);
    }

    @Override
    public void visitFactorialElement(FactorialElement element) {
        System.out.println("Concrete visitor executing factorial for FactorialElement!");
        int result = this.doFactorial(element.getNumber());
        System.out.println("   Result is: " + result);
    }

    private int doFactorial(int val) {
        if (val == 0) {
            return 1;
        } else {
            return val * this.doFactorial(val - 1);
        }
    }

}
