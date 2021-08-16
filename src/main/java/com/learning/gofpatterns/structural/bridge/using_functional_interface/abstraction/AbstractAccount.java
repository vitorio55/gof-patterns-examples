package com.learning.gofpatterns.structural.bridge.using_functional_interface.abstraction;

import com.learning.gofpatterns.structural.bridge.using_functional_interface.implementation.Logger;

public abstract class AbstractAccount {
    private Logger logger = Logger.info();

    public void setLogLevel(Logger logger) {
        this.logger = logger;
    }

    protected void inform(String message) {
        // The implementation of the Account entity is not aware of the Logger specifics
        logger.log(message);
    }
}
