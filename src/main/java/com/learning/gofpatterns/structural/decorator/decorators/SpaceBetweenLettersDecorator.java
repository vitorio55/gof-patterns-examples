package com.learning.gofpatterns.structural.decorator.decorators;

import com.learning.gofpatterns.structural.decorator.TextComponent;

import java.nio.charset.StandardCharsets;

public class SpaceBetweenLettersDecorator extends TextComponentDecorator {
    public SpaceBetweenLettersDecorator(TextComponent wrapped) {
        super(wrapped);
    }

    @Override
    public void setText(String text) {
        StringBuilder textBuilder = new StringBuilder();
        byte[] strBytes = text.getBytes(StandardCharsets.UTF_8);
        for (int i = 0; i < strBytes.length; i++) {
            textBuilder.append((char) strBytes[i] + " ");
        }
        this.wrapped.setText(textBuilder.toString());
    }
}
