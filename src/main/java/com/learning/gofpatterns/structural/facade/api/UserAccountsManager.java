package com.learning.gofpatterns.structural.facade.api;

public class UserAccountsManager {
    String className;

    public UserAccountsManager() {
        this.className = this.getClass().getSimpleName();
    }

    public boolean isUserLoggedIn(String userName) {
        System.out.printf("  [%s] User %s is logged in!\n", this.className, userName);
        return true;
    }

    public boolean isUserSeller(String userName) {
        System.out.printf("  [%s] User %s is a seller!\n", this.className, userName);
        return true;
    }
}
