package com.learning.gofpatterns.behavioral.memento;

import com.learning.gofpatterns.behavioral.memento.mementos.Memento;

public interface Originator {
    Memento saveWholeState();
    Memento saveTextState();
    Memento saveValuesState();
}
