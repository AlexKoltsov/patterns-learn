package com.learn.patterns.structural.bridge;

import com.learn.patterns.structural.bridge.devices.Device;
import com.learn.patterns.structural.bridge.devices.Radio;
import com.learn.patterns.structural.bridge.devices.TV;
import com.learn.patterns.structural.bridge.remotes.AdvancedRemote;
import com.learn.patterns.structural.bridge.remotes.BasicRemote;

public class Demo {

    public static void main(String[] args) {
        testDevice(new TV());
        testDevice(new Radio());
    }

    private static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
