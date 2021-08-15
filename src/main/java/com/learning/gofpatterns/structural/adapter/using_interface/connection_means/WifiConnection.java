package com.learning.gofpatterns.structural.adapter.using_interface.connection_means;

public class WifiConnection implements AirWaveConnection {
    String className;
    boolean connected;

    public WifiConnection() {
        this.className = this.getClass().getSimpleName();
        this.connected = false;
    }

    @Override
    public void connect() {
        System.out.printf("[%s] now connected!\n", this.className);
        this.connected = true;
    }

    @Override
    public void transferDataThroughAir() {
        if (this.connected) {
            System.out.printf("[%s] data is being transferred through the air!\n", this.className);
        } else {
            System.out.printf("[%s] can't transfer data since air connection is not established.\n", this.className);
        }
    }

    @Override
    public String toString() {
        return "WifiConnection{" +
                "connected=" + connected +
                '}';
    }
}
