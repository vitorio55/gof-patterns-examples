package com.learning.gofpatterns.behavioral.memento.mementos;

import com.learning.gofpatterns.behavioral.memento.ConcreteOriginator;
import com.learning.gofpatterns.behavioral.memento.Originator;

public record ValuesMemento(Originator originator, int valA, int valB) implements Memento {

    @Override
    public void restore() {
        ((ConcreteOriginator) this.originator)
                .setValA(this.valA)
                .setValB(this.valB);
    }
}
