package com.learning.gofpatterns.structural.adapter.using_inheritance.power_plugs;

import com.learning.gofpatterns.structural.adapter.using_inheritance.power_sockets.EUPowerSocket;
import com.learning.gofpatterns.structural.adapter.using_inheritance.power_sockets.PowerSocket;

public class EUPowerPlug {
    String className;
    EUPowerSocket connectedTo;

    public EUPowerPlug() {
        this.className = this.getClass().getSimpleName();
    }

    public void connectEUPowerPlug(PowerSocket socket) {
        if (!(socket instanceof EUPowerSocket)) {
            throw new IllegalStateException("Cannot connect EU power plug to a socket that is not and EU power socket!");
        }
        this.connectedTo = (EUPowerSocket) socket;
        System.out.printf("[%s] now connected to EU power socket!\n", this.className);
    }
}
