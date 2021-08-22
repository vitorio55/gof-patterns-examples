package com.learning.gofpatterns.structural.decorator.decorators;

import com.learning.gofpatterns.structural.decorator.TextComponent;

public class TextComponentDecorator implements TextComponent {
    TextComponent wrapped;

    public TextComponentDecorator(TextComponent wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void setText(String text) {
        this.wrapped.setText(text);
    }

    @Override
    public String getText() {
        return wrapped.getText();
    }
}
