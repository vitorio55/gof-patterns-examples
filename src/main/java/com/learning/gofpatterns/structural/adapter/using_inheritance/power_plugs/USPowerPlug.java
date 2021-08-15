package com.learning.gofpatterns.structural.adapter.using_inheritance.power_plugs;

import com.learning.gofpatterns.structural.adapter.using_inheritance.power_sockets.PowerSocket;
import com.learning.gofpatterns.structural.adapter.using_inheritance.power_sockets.USPowerSocket;

public class USPowerPlug {
    String className;
    USPowerSocket connectedTo;

    public USPowerPlug() {
        this.className = this.getClass().getSimpleName();
    }

    public void connectUSPowerPlug(PowerSocket socket) {
        if (!(socket instanceof USPowerSocket)) {
            throw new IllegalStateException("Cannot connect EU power plug to a socket that is not and EU power socket!");
        }
        this.connectedTo = (USPowerSocket) socket;
        System.out.printf("[%s] now connected to US power socket!\n", this.className);
    }
}
