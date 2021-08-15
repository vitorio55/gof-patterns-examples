package com.learning.gofpatterns.structural.adapter.using_inheritance_and_interface.entities;

import com.learning.gofpatterns.structural.adapter.using_inheritance_and_interface.interfaces.SupportedInterface;

public class ExistingSupportedClass implements SupportedInterface {
    String className;
    String data;

    public ExistingSupportedClass(String data) {
        this.className = this.getClass().getSimpleName();
        this.data = data;
    }

    @Override
    public void supportedShowData() {
        System.out.printf("[%s] showing data: %s\n", this.className, this.data);
    }
}
