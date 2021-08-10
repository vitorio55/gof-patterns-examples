package com.learning.gofpatterns.creational.singleton;

public final class Singleton {
    static Singleton instance;
    private String value;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "value='" + value + '\'' +
                '}';
    }
}