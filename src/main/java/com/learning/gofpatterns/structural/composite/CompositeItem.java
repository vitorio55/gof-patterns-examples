package com.learning.gofpatterns.structural.composite;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class CompositeItem extends PricedItem {
    List<PricedItem> items;

    public CompositeItem(String id) {
        // Here our composite item itself doesn't have a price, only its children
        super(id, 0);
    }

    public CompositeItem(String id, List<PricedItem> children) {
        super(id, 0);
        this.items = children;
    }

    public void setItems(List<PricedItem> items) {
        this.items = items;
    }

    @Override
    public float getPrice() {
        AtomicReference<Float> total = new AtomicReference<>((float) 0);
        items.forEach(item -> total.updateAndGet(v -> (v + item.getPrice())));
        return total.get();
    }

    @Override
    public void printItem(int indentation) {
        StringBuilder spaces = new StringBuilder();

        for (int i = 0; i < indentation; i++) {
            spaces.append("  | ");
        }

        System.out.printf(spaces + "Composite Item %s (total $ %.2f)\n", this.id, this.getPrice());

        if (items == null) return;

        items.forEach(item -> item.printItem(indentation + 1));
    }
}
