package com.learning.gofpatterns.behavioral.template_method;

import java.util.List;

public class SumOperations extends BaseOperations {

    public SumOperations() {
        super("SumOperations");
    }

    @Override
    public void allNumbersOperation(List<Integer> numbers, int num) {
        System.out.println("  Adding " + num + " to all numbers");
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, numbers.get(i) + num);
        }
        System.out.println("  " + numbers);
    }

    @Override
    public void firstNumberOperation(List<Integer> numbers, int num) {
        System.out.println("  Adding " + num + " to first number");
        numbers.set(0, numbers.get(0) + num);
        System.out.println("  " + numbers);
    }

    @Override
    public void addResultToEndOfListOperation(List<Integer> numbers) {
        System.out.println("  Adding all numbers and placing result as last number on list");
        int sum = numbers.stream().mapToInt(n -> n).sum();
        numbers.add(sum);
        System.out.println("  " + numbers);
    }

}
