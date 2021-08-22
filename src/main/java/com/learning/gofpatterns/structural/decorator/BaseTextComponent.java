package com.learning.gofpatterns.structural.decorator;

public class BaseTextComponent implements TextComponent {
    String text;

    public BaseTextComponent(String text) {
        this.text = text;
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return this.text;
    }
}
