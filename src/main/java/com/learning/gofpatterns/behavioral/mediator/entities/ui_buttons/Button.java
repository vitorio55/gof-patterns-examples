package com.learning.gofpatterns.behavioral.mediator.entities.ui_buttons;

import com.learning.gofpatterns.behavioral.mediator.entities.Mediator;
import com.learning.gofpatterns.behavioral.mediator.entities.UIElement;

public abstract class Button extends UIElement {

    public Button(Mediator mediator) {
        super(mediator);
    }

    public abstract void push();
}
