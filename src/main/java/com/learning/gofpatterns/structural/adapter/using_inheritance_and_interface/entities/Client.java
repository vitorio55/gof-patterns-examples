package com.learning.gofpatterns.structural.adapter.using_inheritance_and_interface.entities;

import com.learning.gofpatterns.structural.adapter.using_inheritance_and_interface.interfaces.SupportedInterface;

public class Client {

    public static void doPrintData(SupportedInterface supported) {
        supported.supportedShowData();
    }
}
