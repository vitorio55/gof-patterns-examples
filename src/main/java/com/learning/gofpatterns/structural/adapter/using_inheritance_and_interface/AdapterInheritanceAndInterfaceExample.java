package com.learning.gofpatterns.structural.adapter.using_inheritance_and_interface;

import com.learning.gofpatterns.Example;
import com.learning.gofpatterns.structural.adapter.using_inheritance_and_interface.adapters.Adapter;
import com.learning.gofpatterns.structural.adapter.using_inheritance_and_interface.entities.Client;
import com.learning.gofpatterns.structural.adapter.using_inheritance_and_interface.entities.ExistingSupportedClass;
import com.learning.gofpatterns.structural.adapter.using_inheritance_and_interface.entities.ExistingUnsupportedClass;

public class AdapterInheritanceAndInterfaceExample implements Example {

    @Override
    public void runExample() {
        System.out.println("==> Running Adapter Example (using inheritance and interface)");

        System.out.println("Say we have an already supported class that displays its information:");

        ExistingSupportedClass supported = new ExistingSupportedClass("abcde");
        supported.supportedShowData();

        System.out.println("\nA new unsupported class can also display its information, but in a different method:");

        ExistingUnsupportedClass unsupported = new ExistingUnsupportedClass("12345");
        unsupported.displayData();

        System.out.println("\nThe problem is our client code can only handle displaying data using the supported method:");

        Client.doPrintData(supported);

        System.out.println("\nHowever, we can use an adaptor to wrap the unsupported class to display its data:");

        Adapter adapter = new Adapter("678910");
        Client.doPrintData(adapter);
        System.out.println();
    }
}
