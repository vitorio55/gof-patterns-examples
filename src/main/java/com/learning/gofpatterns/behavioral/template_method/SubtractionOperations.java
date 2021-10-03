package com.learning.gofpatterns.behavioral.template_method;

import java.util.List;

public class SubtractionOperations extends BaseOperations {

    public SubtractionOperations() {
        super("SubtractionOperations");
    }

    @Override
    public void allNumbersOperation(List<Integer> numbers, int num) {
        System.out.println("  Subtracting " + num + " from all numbers");
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, numbers.get(i) - num);
        }
        System.out.println("  " + numbers);
    }

    @Override
    public void firstNumberOperation(List<Integer> numbers, int num) {
        System.out.println("  Subtracting " + num + " from first number");
        numbers.set(0, numbers.get(0) - num);
        System.out.println("  " + numbers);
    }

    @Override
    public void addResultToEndOfListOperation(List<Integer> numbers) {
        System.out.println("  Subtracting all numbers and placing result as last number on list");
        int sub = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            sub -= numbers.get(i);
        }
        numbers.add(sub);
        System.out.println("  " + numbers);
    }

}
