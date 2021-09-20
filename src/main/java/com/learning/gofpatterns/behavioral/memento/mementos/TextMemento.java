package com.learning.gofpatterns.behavioral.memento.mementos;

import com.learning.gofpatterns.behavioral.memento.ConcreteOriginator;
import com.learning.gofpatterns.behavioral.memento.Originator;

public record TextMemento(Originator originator, String text) implements Memento {

    @Override
    public void restore() {
        ((ConcreteOriginator) this.originator).setText(this.text);
    }
}
