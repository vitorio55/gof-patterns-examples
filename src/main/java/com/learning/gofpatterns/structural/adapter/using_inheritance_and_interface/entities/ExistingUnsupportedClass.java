package com.learning.gofpatterns.structural.adapter.using_inheritance_and_interface.entities;

public class ExistingUnsupportedClass {
    String className;
    String data;

    public ExistingUnsupportedClass(String data) {
        this.data = data;
        this.className = this.getClass().getSimpleName();
    }

    public void displayData() {
        System.out.printf("[%s] displaying data inside unsupported operation: %s\n", this.className, this.data);
    }
}
