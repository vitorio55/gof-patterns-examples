package com.learning.gofpatterns.creational.prototype.deepcopy_abstractclass;

public class SecondLevelInnerClass implements Cloneable {
    String name;

    public SecondLevelInnerClass(String name) {
        this.name = name;
    }

    @Override
    public SecondLevelInnerClass clone() throws CloneNotSupportedException {
        return (SecondLevelInnerClass) super.clone();
    }

    @Override
    public String toString() {
        return "SecondLevelInnerClass{" +
                "name='" + name + '\'' +
                '}';
    }
}
