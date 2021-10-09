package com.learning.gofpatterns.behavioral.visitor;

import com.learning.gofpatterns.behavioral.visitor.elements.FactorialElement;
import com.learning.gofpatterns.behavioral.visitor.elements.IncrementThreeTimesElement;
import com.learning.gofpatterns.behavioral.visitor.elements.PrinterElement;

public interface Visitor {
    void visitPrinterElement(PrinterElement element);
    void visitIncrementThreeTimesElement(IncrementThreeTimesElement element);
    void visitFactorialElement(FactorialElement element);
}
