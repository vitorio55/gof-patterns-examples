package com.learning.gofpatterns.structural.facade;

import com.learning.gofpatterns.BannerPrinter;
import com.learning.gofpatterns.Example;

public class FacadeExample implements Example {

    @Override
    public void runExample() {
        BannerPrinter.printFacadeBanner();

        System.out.println("==> Running Facade Example");

        System.out.println("""
            The Facade Pattern provides a simplified way of accessing complex subsystem of entities (eg. a lib) so
            that the client code only needs to know how to interact with the facade, and not the subsystem.
            A notable advantage of the Facade Pattern also is that the subsystem is decoupled from the client code.
            If significant alterations are made to the subsystem (eg. major lib version change), only the facade
            usually requires reworking.

            Here we have a VirtualStore class that is our facade. It encapsulates all the interaction with a
            subsystem of entities, and provides only the necessary operations to the client code.
            """);

        VirtualStore virtualStore = new VirtualStore();

        String itemCode = "0004325566";
        String userName = "seller_user@somemail.com";
        float price = 150.45f;

        virtualStore.listItemForSale(userName, itemCode, price);

        itemCode = "0004325566";
        userName = "buyer_user@somemail.com";

        virtualStore.buyItem(userName, itemCode, price);
        System.out.println();
    }
}
