package com.learn.patterns.abstractfactory.buttons;

public class WinowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}
