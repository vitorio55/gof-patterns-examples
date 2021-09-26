package com.learning.gofpatterns.behavioral.strategy;

import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
public interface NumbersStrategy {
    List<Integer> getNumbers(List<Integer> baseNumbers);

    static NumbersStrategy evenNumbersStrategy() {
        return baseNumbers -> baseNumbers.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
    }

    static NumbersStrategy oddNumbersStrategy() {
        return baseNumbers -> baseNumbers.stream()
                .filter(num -> num % 2 == 1)
                .collect(Collectors.toList());
    }
}
