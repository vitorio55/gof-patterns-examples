package com.learning.gofpatterns.structural.facade.api;

public class ShippingManager {
    String className;

    public ShippingManager() {
        this.className = this.getClass().getSimpleName();
    }

    public void registerShippingMethodsForItem(String itemCode) {
        System.out.printf("  [%s] Added supported shipping methods for the item %s\n", this.className, itemCode);
    }

    public void shipItem(String itemCode, String userName) {
        System.out.printf("  [%s] Shipped item %s to user %s's address\n", this.className, itemCode, userName);
    }
}
