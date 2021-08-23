package com.learning.gofpatterns.structural.facade.api;

public class PaymentsManager {
    String className;

    public PaymentsManager() {
        this.className = this.getClass().getSimpleName();
    }

    public void addPaymentMethodsForItem(String itemCode) {
        System.out.printf("  [%s] Added supported payment methods for item %s\n", this.className, itemCode);
    }

    public boolean hasUserFunds(String userName, float price) {
        System.out.printf("  [%s] Checking if user %s has funds...\n", this.className, userName);
        System.out.printf("  [%s] User %s has funds for the amount of %.2f!\n", this.className, userName, price);
        return true;
    }

    public void executeUserPayment(String userName, float price) {
        System.out.printf("  [%s] User %s just made a payment of %.2f!\n", this.className, userName, price);
    }
}
