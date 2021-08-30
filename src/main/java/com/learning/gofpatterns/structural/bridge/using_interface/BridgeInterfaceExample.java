package com.learning.gofpatterns.structural.bridge.using_interface;

import com.learning.gofpatterns.Example;
import com.learning.gofpatterns.structural.bridge.using_interface.implementation.Playstation;
import com.learning.gofpatterns.structural.bridge.using_interface.implementation.XBox;
import com.learning.gofpatterns.structural.bridge.using_interface.abstraction.WiredController;
import com.learning.gofpatterns.structural.bridge.using_interface.abstraction.WirelessController;

public class BridgeInterfaceExample implements Example {

    @Override
    public void runExample() {
        System.out.println("==> Running Bridge Example (using interface)");

        System.out.println("""
            Given that we have 2 videogame console types: XBox and Playstation
            And each of them can have 2 types of controllers: Wired and Wireless
            If we add more videogames and or controllers, our hierarchy would grow exponentially
            Instead of creating for instance PlaystationWiredController or XBoxWirelessController etc
            We can use the Bridge pattern to separate our problem into 2 different but related hierarchies
            """);

        Playstation playstation = new Playstation();
        XBox xbox = new XBox();

        WiredController wiredController = new WiredController(playstation);
        WirelessController wirelessController = new WirelessController(xbox);

        System.out.println("The controllers don't know (and don't need to know) which videogame they're connected to\n");
        System.out.println("---> Wired Controller");
        wiredController.moveUp();
        wiredController.moveDown();
        wiredController.moveLeft();
        wiredController.moveRight();

        System.out.println("---> Wireless Controller");
        wirelessController.pressFirstActionButton();
        wirelessController.pressSecondActionButton();
        wirelessController.pressThirdActionButton();
        wirelessController.pressFourthActionButton();
        System.out.println();
    }
}
