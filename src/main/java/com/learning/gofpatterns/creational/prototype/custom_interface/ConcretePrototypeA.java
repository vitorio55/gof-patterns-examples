package com.learning.gofpatterns.creational.prototype.custom_interface;

public class ConcretePrototypeA implements Prototype {
    int number;

    public ConcretePrototypeA() {
    }

    private ConcretePrototypeA(ConcretePrototypeA copyFrom) {
        this.number = copyFrom.number;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototypeA(this);
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "ConcretePrototypeA{" +
                "number=" + number +
                '}';
    }
}
