package com.learning.gofpatterns.behavioral.mediator.entities.ui_buttons;

import com.learning.gofpatterns.behavioral.mediator.enums.EventType;
import com.learning.gofpatterns.behavioral.mediator.entities.Mediator;

import java.util.Arrays;
import java.util.stream.Collectors;

public class NumberButton extends Button {
    private final EventType numberEvent;

    public NumberButton(Mediator mediator, EventType numberEvent) {
        super(mediator);
        this.checkInvalidNumberEvent(numberEvent);
        this.numberEvent = numberEvent;
    }

    @Override
    public void push() {
        this.mediator.triggerEvent(this.numberEvent);
    }

    private void checkInvalidNumberEvent(EventType numberEvent) {
        boolean invalid = !Arrays.stream(EventType.values())
            .filter(e -> e.ordinal() < 9) // Here we only want events related to number buttons
            .collect(Collectors.toList())
            .contains(numberEvent);

        if (invalid) {
            throw new IllegalStateException("Invalid number for number button: " + numberEvent);
        }
    }
}
