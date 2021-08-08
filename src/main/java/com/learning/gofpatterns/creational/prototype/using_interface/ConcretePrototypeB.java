package com.learning.gofpatterns.creational.prototype.using_interface;

public class ConcretePrototypeB implements Prototype {
    String someString;

    public ConcretePrototypeB() {
    }

    private ConcretePrototypeB(ConcretePrototypeB copyFrom) {
        this.someString = copyFrom.someString;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototypeB(this);
    }

    public void setSomeString(String someString) {
        this.someString = someString;
    }

    @Override
    public String toString() {
        return "ConcretePrototypeB{" +
                "someString='" + someString + '\'' +
                '}';
    }
}
