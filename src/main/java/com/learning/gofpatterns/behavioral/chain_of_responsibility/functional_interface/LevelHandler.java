package com.learning.gofpatterns.behavioral.chain_of_responsibility.functional_interface;

import com.learning.gofpatterns.behavioral.chain_of_responsibility.Levels;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.function.Consumer;

import static com.learning.gofpatterns.behavioral.chain_of_responsibility.Levels.*;

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

    static LevelHandler levelZeroHandler() {
        return defineHandling(new Levels[] { LEVEL_0 }, dummy -> System.out.println("  [ZERO HANDLER TRIGGERED]"));
    }

    static LevelHandler evenLevelsHandler() {
        return defineHandling(new Levels[] { LEVEL_0, LEVEL_2 }, dummy -> System.out.println("  [EVEN HANDLER TRIGGERED]"));
    }

    static LevelHandler oddLevelsHandler() {
        return defineHandling(new Levels[] { LEVEL_1, LEVEL_3 }, dummy -> System.out.println("  [ODD HANDLER TRIGGERED]"));
    }

    static LevelHandler lessThanThreeHandler() {
        return defineHandling(new Levels[] { LEVEL_0, LEVEL_1, LEVEL_2 }, dummy -> System.out.println("  [<3 HANDLER TRIGGERED]"));
    }

    static LevelHandler customLevelsHandler(Levels... levels) {
        return defineHandling(levels, dummy -> System.out.println("  [CUSTOM HANDLER TRIGGERED]"));
    }
}
