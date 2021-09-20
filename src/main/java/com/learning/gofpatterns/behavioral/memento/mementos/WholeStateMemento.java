package com.learning.gofpatterns.behavioral.memento.mementos;

import com.learning.gofpatterns.behavioral.memento.ConcreteOriginator;
import com.learning.gofpatterns.behavioral.memento.Originator;

public record WholeStateMemento(Originator originator, String text, int valA, int valB) implements Memento {

    @Override
    public void restore() {
        ((ConcreteOriginator) this.originator)
            .setText(this.text)
            .setValA(this.valA)
            .setValB(this.valB);
    }
}
