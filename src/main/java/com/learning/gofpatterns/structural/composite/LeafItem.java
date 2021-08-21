package com.learning.gofpatterns.structural.composite;

public class LeafItem extends PricedItem {
    public LeafItem(String id, float price) {
        super(id, price);
    }

    @Override
    public float getPrice() {
        return this.price;
    }

    @Override
    public void printItem(int indentation) {
        StringBuilder spaces = new StringBuilder();

        for (int i = 0; i < indentation; i++) {
            spaces.append("  | ");
        }
        System.out.printf(spaces + "Item %s -> $%.2f\n", this.id, this.price);
    }
}
