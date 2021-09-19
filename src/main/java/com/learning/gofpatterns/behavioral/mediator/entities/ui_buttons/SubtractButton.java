package com.learning.gofpatterns.behavioral.mediator.entities.ui_buttons;

import com.learning.gofpatterns.behavioral.mediator.enums.EventType;
import com.learning.gofpatterns.behavioral.mediator.entities.Mediator;

public class SubtractButton extends Button {

    public SubtractButton(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void push() {
        mediator.triggerEvent(EventType.SET_SUB_OPERATION);
    }
}
