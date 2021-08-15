package com.learning.gofpatterns.structural.adapter.using_inheritance.adapters;

import com.learning.gofpatterns.structural.adapter.using_inheritance.power_plugs.EUPowerPlug;
import com.learning.gofpatterns.structural.adapter.using_inheritance.power_plugs.USPowerPlug;
import com.learning.gofpatterns.structural.adapter.using_inheritance.power_sockets.EUPowerSocket;
import com.learning.gofpatterns.structural.adapter.using_inheritance.power_sockets.PowerSocket;
import com.learning.gofpatterns.structural.adapter.using_inheritance.power_sockets.USPowerSocket;

public class USToEUPowerPlugAdapter extends EUPowerPlug {
    String className;
    USPowerPlug inPowerPlug;

    USPowerSocket adapterSocket;
    EUPowerSocket outSocket;

    public USToEUPowerPlugAdapter(USPowerPlug usPowerPlug) {
        this.className = this.getClass().getSimpleName();
        this.inPowerPlug = usPowerPlug;
        this.adapterSocket = new USPowerSocket();
    }

    @Override
    public void connectEUPowerPlug(PowerSocket socket) {
        System.out.printf("[%s] connecting the US power plug to the adapter socket.\n", this.className);
        this.inPowerPlug.connectUSPowerPlug(this.adapterSocket);
        this.outSocket = (EUPowerSocket) socket;
        System.out.printf("[%s] connected the US->EU adapter to power socket.\n", this.className);
    }
}
