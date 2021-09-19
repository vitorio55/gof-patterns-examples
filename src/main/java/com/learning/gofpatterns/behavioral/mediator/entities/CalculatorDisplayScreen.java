package com.learning.gofpatterns.behavioral.mediator.entities;

import com.learning.gofpatterns.behavioral.mediator.enums.EventType;

public class CalculatorDisplayScreen extends UIElement {

    public CalculatorDisplayScreen(Mediator mediator) {
        super(mediator);
    }

    public void showScreenContents() {
        this.mediator.triggerEvent(EventType.SHOW_DISPLAY);
    }
}
