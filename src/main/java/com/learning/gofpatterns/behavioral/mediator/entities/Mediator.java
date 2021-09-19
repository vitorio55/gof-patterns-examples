package com.learning.gofpatterns.behavioral.mediator.entities;

import com.learning.gofpatterns.behavioral.mediator.enums.EventType;

public interface Mediator {
    void triggerEvent(EventType eventType);
    void setOperator(Integer operator);
    void addObserver(EventType eventType, Runnable observer);
    void notifyObservers(EventType eventType);
}
