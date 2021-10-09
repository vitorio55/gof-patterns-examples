package com.learning.gofpatterns.behavioral.visitor.elements;

import com.learning.gofpatterns.behavioral.visitor.Visitor;

public record PrinterElement(String myPhrase) implements Element {

    public String getMyPhrase() {
        return myPhrase;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitPrinterElement(this);
    }

}
