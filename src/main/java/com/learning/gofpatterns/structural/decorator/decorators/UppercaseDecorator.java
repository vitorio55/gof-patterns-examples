package com.learning.gofpatterns.structural.decorator.decorators;

import com.learning.gofpatterns.structural.decorator.TextComponent;

import java.util.Locale;

public class UppercaseDecorator extends TextComponentDecorator {
    public UppercaseDecorator(TextComponent wrapped) {
        super(wrapped);
    }

    @Override
    public void setText(String text) {
        this.wrapped.setText(text.toUpperCase(Locale.ROOT));
    }
}
