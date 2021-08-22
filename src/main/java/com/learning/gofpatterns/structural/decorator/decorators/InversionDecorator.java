package com.learning.gofpatterns.structural.decorator.decorators;

import com.learning.gofpatterns.structural.decorator.TextComponent;

import java.nio.charset.StandardCharsets;

public class InversionDecorator extends TextComponentDecorator {
    public InversionDecorator(TextComponent wrapped) {
        super(wrapped);
    }

    @Override
    public void setText(String text) {
        StringBuilder textBuilder = new StringBuilder();
        byte[] strBytes = text.getBytes(StandardCharsets.UTF_8);
        for (int i = strBytes.length - 1; i >= 0; i--) {
            textBuilder.append((char) strBytes[i]);
        }
        this.wrapped.setText(textBuilder.toString());
    }
}
