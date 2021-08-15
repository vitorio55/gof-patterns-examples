package com.learning.gofpatterns.structural.adapter.using_interface.connection_means;

public class CopperCableConnection implements CableConnection {
    String className;
    boolean connected;

    public CopperCableConnection() {
        this.className = this.getClass().getSimpleName();
        this.connected = false;
    }

    @Override
    public void connect() {
        System.out.printf("[%s] now connected!\n", this.className);
        this.connected = true;
    }

    @Override
    public void transferDataUsingCable() {
        if (this.connected) {
            System.out.printf("[%s] data is being transferred through cable!\n", this.className);
        } else {
            System.out.printf("[%s] can't transfer data since cable is not connected.\n", this.className);
        }
    }

    @Override
    public String toString() {
        return "CopperCableConnection{" +
                "connected=" + connected +
                '}';
    }
}
