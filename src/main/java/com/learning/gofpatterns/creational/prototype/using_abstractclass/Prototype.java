package com.learning.gofpatterns.creational.prototype.using_abstractclass;

public abstract class Prototype implements Cloneable {
    public Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }
}
