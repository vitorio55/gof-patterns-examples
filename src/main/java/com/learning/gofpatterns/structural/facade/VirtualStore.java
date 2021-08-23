package com.learning.gofpatterns.structural.facade;

import com.learning.gofpatterns.structural.facade.api.InventoryManager;
import com.learning.gofpatterns.structural.facade.api.PaymentsManager;
import com.learning.gofpatterns.structural.facade.api.ShippingManager;
import com.learning.gofpatterns.structural.facade.api.UserAccountsManager;

public class VirtualStore implements MarketPlaceOperations {
    String className;

    public VirtualStore() {
        this.className = this.getClass().getSimpleName();
    }

    @Override
    public void buyItem(String userName, String itemCode, float price) {
        UserAccountsManager userAccountsManager = new UserAccountsManager();
        InventoryManager inventoryManager = new InventoryManager();
        PaymentsManager paymentsManager = new PaymentsManager();
        ShippingManager shippingManager = new ShippingManager();

        System.out.printf("[%s] Facade executing inner logic: buy operation\n", this.className);

        if (!userAccountsManager.isUserLoggedIn(userName)) {
            System.out.printf("[%s] User %s is not logged in, therefore cannot buy\n", this.className, userName);
            return;
        }

        if (!inventoryManager.isItemInStock(itemCode)) {
            System.out.printf("[%s] Item %s is unavailable at the moment\n", this.className, itemCode);
            return;
        }

        if (!paymentsManager.hasUserFunds(userName, price)) {
            System.out.printf("[%s] User %s doesn't have enough funds to buy item of price %.2f\n", this.className, userName, price);
            return;
        }

        paymentsManager.executeUserPayment(userName, price);
        shippingManager.shipItem(itemCode, userName);

        System.out.printf("[%s] Exiting facade inner logic\n", this.className);
    }

    @Override
    public void listItemForSale(String userName, String itemCode, float price) {
        UserAccountsManager userAccountsManager = new UserAccountsManager();
        InventoryManager inventoryManager = new InventoryManager();
        PaymentsManager paymentsManager = new PaymentsManager();
        ShippingManager shippingManager = new ShippingManager();

        System.out.printf("[%s] Facade executing inner logic: list item for sale operation\n", this.className);

        if (!userAccountsManager.isUserLoggedIn(userName)) {
            System.out.printf("[%s] User %s is not logged in, therefore cannot sell\n", this.className, userName);
            return;
        }

        if (!userAccountsManager.isUserSeller(userName)) {
            System.out.printf("[%s] User %s is not a registered seller, therefore cannot sell\n", this.className, userName);
            return;
        }

        inventoryManager.addItem(itemCode);
        paymentsManager.addPaymentMethodsForItem(itemCode);
        shippingManager.registerShippingMethodsForItem(itemCode);

        System.out.printf("[%s] Exiting facade inner logic\n", this.className);
    }
}
