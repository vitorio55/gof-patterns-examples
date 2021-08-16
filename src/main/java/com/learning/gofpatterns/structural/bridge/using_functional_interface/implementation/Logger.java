package com.learning.gofpatterns.structural.bridge.using_functional_interface.implementation;

@FunctionalInterface
public interface Logger {
    void log(String message);

    static Logger info() {
        return message -> System.out.println("[INFO] " + message);
    }
    static Logger warning() {
        return message -> System.out.println("[WARN] " + message);
    }
}
