package com.learning.gofpatterns.structural.bridge.using_functional_interface.abstraction;

import com.learning.gofpatterns.structural.bridge.using_functional_interface.implementation.Logger;

public class SimpleAccount extends AbstractAccount {
    private int balance;

    public SimpleAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public boolean isBalanceLow() {
        return this.balance < 50;
    }

    public void deposit(int amount) {
        if (amount < 0) {
            this.withdraw(amount);
            return;
        }
        this.balance += amount;

        if (!isBalanceLow()) {
            setLogLevel(Logger.info());
        }
        inform("deposited " + amount);
    }

    public void withdraw(int amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            inform("withdraw " + amount);
            return;
        }
        setLogLevel(Logger.warning());
        inform("not enough balance (" + this.balance + ") to withdraw " + amount);
    }
}