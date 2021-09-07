package com.learning.gofpatterns.behavioral.chain_of_responsibility.functional_interface;

import com.learning.gofpatterns.behavioral.chain_of_responsibility.Levels;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.function.Consumer;

@FunctionalInterface
public interface LevelHandler {
    void handle(Levels level);

    default LevelHandler nextHandler(LevelHandler nextHandler) {
        return (level) -> {
            handle(level);
            nextHandler.handle(level);
        };
    }

    static LevelHandler defineHandling(Levels[] levels, Consumer<String> stringConsumer) {
        EnumSet<Levels> set = EnumSet.copyOf(Arrays.asList(levels));
        return (level) -> {
            if (set.contains(level)) {
                stringConsumer.accept(null);
            }
        };
    }

    static LevelHandler levelZeroHandler(Levels... levels) {
        return defineHandling(levels, dummy -> System.out.println("  [ZERO HANDLER TRIGGERED]"));
    }

    static LevelHandler evenLevelsHandler(Levels... levels) {
        return defineHandling(levels, dummy -> System.out.println("  [EVEN HANDLER TRIGGERED]"));
    }

    static LevelHandler oddLevelsHandler(Levels... levels) {
        return defineHandling(levels, dummy -> System.out.println("  [ODD HANDLER TRIGGERED]"));
    }

    static LevelHandler lessThanThreeHandler(Levels... levels) {
        return defineHandling(levels, dummy -> System.out.println("  [<3 HANDLER TRIGGERED]"));
    }
}
