package com.learning.gofpatterns.behavioral.memento;

import com.learning.gofpatterns.behavioral.memento.mementos.Memento;
import com.learning.gofpatterns.behavioral.memento.mementos.TextMemento;
import com.learning.gofpatterns.behavioral.memento.mementos.ValuesMemento;
import com.learning.gofpatterns.behavioral.memento.mementos.WholeStateMemento;

public class ConcreteOriginator implements Originator {
    private String text;
    private int valA;
    private int valB;

    public ConcreteOriginator(String text, int valA, int valB) {
        this.text = text;
        this.valA = valA;
        this.valB = valB;
    }

    public ConcreteOriginator setText(String text) {
        this.text = text;
        return this;
    }

    public ConcreteOriginator setValA(int valA) {
        this.valA = valA;
        return this;
    }

    public ConcreteOriginator setValB(int valB) {
        this.valB = valB;
        return this;
    }

    @Override
    public Memento saveWholeState() {
        return new WholeStateMemento(this, this.text, this.valA, this.valB);
    }

    @Override
    public Memento saveTextState() {
        return new TextMemento(this, this.text);
    }

    @Override
    public Memento saveValuesState() {
        return new ValuesMemento(this, this.valA, this.valB);
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "ConcreteOriginator{" +
                "text='" + text + '\'' +
                ", valA=" + valA +
                ", valB=" + valB +
                '}';
    }
}
