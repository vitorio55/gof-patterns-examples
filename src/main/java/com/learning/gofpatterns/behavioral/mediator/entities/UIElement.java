package com.learning.gofpatterns.behavioral.mediator.entities;

public abstract class UIElement {
    protected Mediator mediator;

    public UIElement(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
