package com.learning.gofpatterns.structural.adapter.using_interface;

import com.learning.gofpatterns.Example;
import com.learning.gofpatterns.structural.adapter.using_inheritance_and_interface.adapters.Adapter;
import com.learning.gofpatterns.structural.adapter.using_inheritance_and_interface.entities.Client;
import com.learning.gofpatterns.structural.adapter.using_inheritance_and_interface.entities.ExistingSupportedClass;
import com.learning.gofpatterns.structural.adapter.using_inheritance_and_interface.entities.ExistingUnsupportedClass;
import com.learning.gofpatterns.structural.adapter.using_interface.adapters.Modem;
import com.learning.gofpatterns.structural.adapter.using_interface.connection_means.CopperCableConnection;
import com.learning.gofpatterns.structural.adapter.using_interface.connection_means.WifiConnection;

public class AdapterInterfaceExample implements Example {

    @Override
    public void runExample() {
        System.out.println("==> Running Adapter Example (using only interface)");

        System.out.println("We have 2 types of connection here: copper cable and wifi");

        CopperCableConnection cable = new CopperCableConnection();
        WifiConnection wifi = new WifiConnection();

        System.out.println(cable);
        System.out.println(wifi);
        System.out.println();

        System.out.println("If in our client code we know only how to use a connection through the air:");
        wifi.connect();
        wifi.transferDataThroughAir();
        System.out.println();

        System.out.println("Then to get a connection from cable and propagate it in the air we could use a Modem (our adapter):");

        Modem modem = new Modem(cable);
        modem.connect();
        modem.transferDataThroughAir();
        System.out.println();
    }
}
