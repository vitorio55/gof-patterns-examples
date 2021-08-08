package com.learning.gofpatterns.creational.prototype.using_abstractclass;

public class ConcretePrototype1 extends Prototype {
    String stringZero;
    String stringOne;
    String stringTwo;
    int intZero;
    int intOne;
    int intTwo;

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void setStringZero(String stringZero) {
        this.stringZero = stringZero;
    }

    public void setStringOne(String stringOne) {
        this.stringOne = stringOne;
    }

    public void setStringTwo(String stringTwo) {
        this.stringTwo = stringTwo;
    }

    public void setIntZero(int intZero) {
        this.intZero = intZero;
    }

    public void setIntOne(int intOne) {
        this.intOne = intOne;
    }

    public void setIntTwo(int intTwo) {
        this.intTwo = intTwo;
    }

    @Override
    public String toString() {
        return "ConcretePrototype1{" +
                "stringZero='" + stringZero + '\'' +
                ", stringOne='" + stringOne + '\'' +
                ", stringTwo='" + stringTwo + '\'' +
                ", intZero=" + intZero +
                ", intOne=" + intOne +
                ", intTwo=" + intTwo +
                '}';
    }
}
