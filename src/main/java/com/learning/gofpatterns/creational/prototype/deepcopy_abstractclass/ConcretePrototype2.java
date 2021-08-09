package com.learning.gofpatterns.creational.prototype.deepcopy_abstractclass;

public class ConcretePrototype2 extends Prototype {
    float someFloat;

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void setSomeFloat(float someFloat) {
        this.someFloat = someFloat;
    }

    @Override
    public String toString() {
        return "ConcretePrototype2{" +
                "someFloat=" + someFloat +
                '}';
    }
}
