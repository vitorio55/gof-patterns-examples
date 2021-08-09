package com.learning.gofpatterns.creational.prototype.deepcopy_abstractclass;


public class FirstLevelInnerClass implements Cloneable {
    SecondLevelInnerClass secondLevel;
    int number;

    public FirstLevelInnerClass(SecondLevelInnerClass secondLevel, int number) {
        this.secondLevel = secondLevel;
        this.number = number;
    }

    @Override
    public FirstLevelInnerClass clone() throws CloneNotSupportedException {
        FirstLevelInnerClass clone = (FirstLevelInnerClass) super.clone();
        clone.setSecondLevel(this.getSecondLevel().clone()); // Manual deep copying
        return clone;
    }

    public SecondLevelInnerClass getSecondLevel() {
        return secondLevel;
    }

    public void setSecondLevel(SecondLevelInnerClass secondLevel) {
        this.secondLevel = secondLevel;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "FirstLevelInnerClass{" +
                "secondLevel=" + secondLevel +
                ", number=" + number +
                '}';
    }
}
