package com.learning.gofpatterns.structural.composite;

public abstract class PricedItem {
    String id;
    float price;

    public PricedItem(String id, float price) {
        this.id = id;
        this.price = price;
    }

    public abstract float getPrice();
    public abstract void printItem(int indentation);
}
