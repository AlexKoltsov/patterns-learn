package com.learn.patterns.creational.abstractfactory;

import com.learn.patterns.creational.abstractfactory.factories.GUIFactory;
import com.learn.patterns.creational.abstractfactory.factories.MacOSFactory;
import com.learn.patterns.creational.abstractfactory.factories.WindowsFactory;

public class AbstractFactory {

    public static void main(String[] args) {
        String osName = System.getProperty("os.name").toLowerCase();
        GUIFactory guiFactory;
        if (osName.contains("mac")) {
            guiFactory = new MacOSFactory();
        } else {
            guiFactory = new WindowsFactory();
        }

        guiFactory.createButton().paint();
        guiFactory.createCheckbox().paint();
    }
}
