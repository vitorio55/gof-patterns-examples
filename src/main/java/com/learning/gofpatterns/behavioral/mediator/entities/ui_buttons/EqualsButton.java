package com.learning.gofpatterns.behavioral.mediator.entities.ui_buttons;

import com.learning.gofpatterns.behavioral.mediator.enums.EventType;
import com.learning.gofpatterns.behavioral.mediator.entities.Mediator;

public class EqualsButton extends Button {

    public EqualsButton(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void push() {
        mediator.triggerEvent(EventType.EXECUTE_OPERATION);
    }
}
