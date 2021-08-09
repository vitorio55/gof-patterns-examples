package com.learning.gofpatterns.creational.prototype.deepcopy_abstractclass;

public class ConcretePrototype1 extends Prototype {
    FirstLevelInnerClass firstLevel;
    String stringOne;
    String stringTwo;
    int intZero;
    int intOne;
    int intTwo;

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        ConcretePrototype1 clone = (ConcretePrototype1) super.clone();
        clone.setFirstLevel(this.firstLevel.clone()); // Manual deep copying
        return clone;
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

    public FirstLevelInnerClass getFirstLevel() {
        return firstLevel;
    }

    public void setFirstLevel(FirstLevelInnerClass firstLevel) {
        this.firstLevel = firstLevel;
    }

    @Override
    public String toString() {
        return "ConcretePrototype1{" +
                "firstLevel=" + firstLevel +
                ", stringOne='" + stringOne + '\'' +
                ", stringTwo='" + stringTwo + '\'' +
                ", intZero=" + intZero +
                ", intOne=" + intOne +
                ", intTwo=" + intTwo +
                '}';
    }
}
