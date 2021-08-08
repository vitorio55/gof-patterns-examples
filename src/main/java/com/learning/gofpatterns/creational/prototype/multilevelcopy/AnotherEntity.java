package com.learning.gofpatterns.creational.prototype.multilevelcopy;

public class AnotherEntity implements Prototype {
    String firstString;
    String secondString;

    public AnotherEntity(String firstString, String secondString) {
        this.firstString = firstString;
        this.secondString = secondString;
    }

    private AnotherEntity(AnotherEntity copyFrom) {
        this.firstString = copyFrom.firstString;
        this.secondString = copyFrom.secondString;
    }

    @Override
    public Prototype clone() {
        return new AnotherEntity(this);
    }

    public void setFirstString(String firstString) {
        this.firstString = firstString;
    }

    @Override
    public String toString() {
        return "AnotherEntity{" +
                "firstString='" + firstString + '\'' +
                ", secondString='" + secondString + '\'' +
                '}';
    }
}
