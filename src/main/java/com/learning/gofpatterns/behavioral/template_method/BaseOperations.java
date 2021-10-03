package com.learning.gofpatterns.behavioral.template_method;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseOperations {
    private static final int MAX = 15;
    private static final int MIN = 0;
    protected String currentEntityName;

    public BaseOperations(String currentEntityName) {
        this.currentEntityName = currentEntityName;
    }

    // The template method
    public final void executeOperations() {
        printMsg("Generating random numbers:");
        List<Integer> numbers = new ArrayList<>();
        numbers.add(generateRandomNumber());
        numbers.add(generateRandomNumber());
        numbers.add(generateRandomNumber());
        System.out.println("  " + numbers);

        printMsg("Executing first numbers only operation:");
        this.firstNumberOperation(numbers, generateRandomNumber());

        printMsg("Executing operation involving all numbers:");
        this.allNumbersOperation(numbers, generateRandomNumber());

        printMsg("Executing common multiplication operation:");
        this.multiplyAllBy(generateRandomNumber(), numbers);

        printMsg("Executing add-to-end-of-list operation:");
        this.addResultToEndOfListOperation(numbers);
        System.out.println();
    }

    private int generateRandomNumber() {
        return (int) (Math.random() * ((MAX - MIN) + 1)) + MIN;
    }

    // General operations that are shared
    public void multiplyAllBy(int num, List<Integer> numbers) {
        System.out.println("  Multiplying all numbers by " + num);
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, numbers.get(i) * num);
        }
        System.out.println("  " + numbers);
    }

    private void printMsg(String msg) {
        System.out.printf("[%s] %s\n", this.currentEntityName, msg);
    }

    // Specific operations
    public abstract void allNumbersOperation(List<Integer> numbers, int num);
    public abstract void firstNumberOperation(List<Integer> numbers, int num);
    public abstract void addResultToEndOfListOperation(List<Integer> numbers);
}
