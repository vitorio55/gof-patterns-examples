package com.learning.gofpatterns.structural.bridge.using_functional_interface;

import com.learning.gofpatterns.BannerPrinter;
import com.learning.gofpatterns.Example;
import com.learning.gofpatterns.structural.bridge.using_functional_interface.abstraction.SimpleAccount;
import com.learning.gofpatterns.structural.bridge.using_functional_interface.implementation.Logger;

public class BridgeFunctionalInterfaceExample implements Example {

    @Override
    public void runExample() {
        BannerPrinter.printBridgeBanner();

        System.out.println("==> Running Bridge Example (using functional interface in Implementation hierarchy)");

        // Adapted from Wikipedia's EN Bridge Pattern example

        System.out.println("Given we have a bank account (our abstraction) with initial balance of 100");
        System.out.println("And that it contains a logger which is provided as a functional interface (implementation)\n");

        SimpleAccount account = new SimpleAccount(100);
        System.out.println("Initial account balance: " + account.getBalance() + "\n");

        System.out.println("By default the inner logger is set to info level");
        account.withdraw(75);


        if (account.isBalanceLow()) {
            System.out.println("\n(optional) we can change the logger implementation since it is decoupled from our bank account with our bank account\n");
            account.setLogLevel(Logger.warning());
        }

        account.withdraw(10);
        account.withdraw(100);

        account.deposit(1000);

        System.out.println();
    }
}
