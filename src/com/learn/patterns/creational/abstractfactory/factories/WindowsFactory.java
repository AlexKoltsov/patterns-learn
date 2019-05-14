package com.learn.patterns.creational.abstractfactory.factories;

import com.learn.patterns.creational.abstractfactory.buttons.Button;
import com.learn.patterns.creational.abstractfactory.buttons.WinowsButton;
import com.learn.patterns.creational.abstractfactory.checkboxes.Checkbox;
import com.learn.patterns.creational.abstractfactory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WinowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
