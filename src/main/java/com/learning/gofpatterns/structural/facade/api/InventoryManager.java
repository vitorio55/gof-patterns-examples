package com.learning.gofpatterns.structural.facade.api;

public class InventoryManager {
    String className;

    public InventoryManager() {
        this.className = this.getClass().getSimpleName();
    }

    public void addItem(String itemCode) {
        System.out.printf("  [%s] Added item %s to virtual store's inventory of selling goods\n", this.className, itemCode);
    }

    public boolean isItemInStock(String itemCode) {
        System.out.printf("  [%s] Checking if item %s is in stock...\n", this.className, itemCode);
        System.out.printf("  [%s] Item %s is available!\n", this.className, itemCode);
        return true;
    }
}
