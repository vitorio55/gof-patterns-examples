package com.learning.gofpatterns.structural.adapter.using_inheritance_and_interface.adapters;

import com.learning.gofpatterns.structural.adapter.using_inheritance_and_interface.entities.ExistingUnsupportedClass;
import com.learning.gofpatterns.structural.adapter.using_inheritance_and_interface.interfaces.SupportedInterface;

public class Adapter extends ExistingUnsupportedClass implements SupportedInterface {
    String className;

    public Adapter(String someData) {
        super(someData);
        this.className = this.getClass().getSimpleName();
    }

    @Override
    public void supportedShowData() {
        System.out.printf("[%s] in supportedShowData(), adapter is calling the previously unsupported displayData() operation...\n", this.className);
        displayData();
    }
}
