package com.learning.gofpatterns.structural.adapter.using_interface.adapters;

import com.learning.gofpatterns.structural.adapter.using_interface.connection_means.AirWaveConnection;
import com.learning.gofpatterns.structural.adapter.using_interface.connection_means.CableConnection;

public class Modem implements AirWaveConnection {
    CableConnection cable;
    String className;

    public Modem(CableConnection cable) {
        this.className = this.getClass().getSimpleName();
        this.cable = cable;
    }

    @Override
    public void connect() {
        System.out.printf("[%s] connecting cable...\n", this.className);
        this.cable.connect();
        System.out.printf("[%s] starting wifi network...\n", this.className);
        System.out.printf("[%s] wifi started!\n", this.className);
    }

    @Override
    public void transferDataThroughAir() {
        System.out.printf("[%s] receiving data from cable...\n", this.className);
        this.cable.transferDataUsingCable();
        System.out.printf("[%s] propagating data through the air!\n", this.className);
    }
}
