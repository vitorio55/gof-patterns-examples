package com.learning.gofpatterns.behavioral.visitor.elements;

import com.learning.gofpatterns.behavioral.visitor.Visitor;

public interface Element {
    void accept(Visitor visitor);
}
