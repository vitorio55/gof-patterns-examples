package com.learning.gofpatterns.structural.adapter.using_inheritance;

import com.learning.gofpatterns.BannerPrinter;
import com.learning.gofpatterns.Example;
import com.learning.gofpatterns.structural.adapter.using_inheritance.adapters.USToEUPowerPlugAdapter;
import com.learning.gofpatterns.structural.adapter.using_inheritance.power_plugs.EUPowerPlug;
import com.learning.gofpatterns.structural.adapter.using_inheritance.power_plugs.USPowerPlug;
import com.learning.gofpatterns.structural.adapter.using_inheritance.power_sockets.EUPowerSocket;
import com.learning.gofpatterns.structural.adapter.using_inheritance.power_sockets.USPowerSocket;

import java.io.PrintWriter;
import java.io.StringWriter;

public class AdapterInheritanceExample implements Example {
    @Override
    public void runExample() {
        BannerPrinter.printAdapterBanner();

        System.out.println("==> Running Adapter Example (using only inheritance)");

        // Power plugs
        EUPowerPlug euPowerPlug = new EUPowerPlug();
        USPowerPlug usPowerPlug = new USPowerPlug();

        // Power sockets
        EUPowerSocket euSocket = new EUPowerSocket();
        USPowerSocket usSocket = new USPowerSocket();

        System.out.println("\nWe can connect an EU power plug directly to and EU power socket:");
        euPowerPlug.connectEUPowerPlug(euSocket);

        System.out.println("\nWe can connect an US power plug directly to and US power socket:");
        usPowerPlug.connectUSPowerPlug(usSocket);

        System.out.println("\nWe can't connect an US power plug to an EU power socket:");
        try {
            usPowerPlug.connectUSPowerPlug(euSocket);
        } catch (IllegalStateException ex) {
            StringWriter sw = new StringWriter();
            ex.printStackTrace(new PrintWriter(sw));
            System.out.println(sw);
        }

        System.out.println("We also can't connect an EU power plug to an US power socket:");
        try {
            euPowerPlug.connectEUPowerPlug(usSocket);
        } catch (IllegalStateException ex) {
            StringWriter sw = new StringWriter();
            ex.printStackTrace(new PrintWriter(sw));
            System.out.println(sw);
        }

        System.out.println("However, we can connect an US power plug to and EU power socket using the adapter:");

        // Adapter
        USToEUPowerPlugAdapter usToEUPowerPlugAdapter = new USToEUPowerPlugAdapter(usPowerPlug);
        usToEUPowerPlugAdapter.connectEUPowerPlug(euSocket);

        System.out.println();
    }
}
