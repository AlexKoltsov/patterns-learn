package com.learn.patterns.creational.abstractfactory.factories;

import com.learn.patterns.creational.abstractfactory.buttons.Button;
import com.learn.patterns.creational.abstractfactory.buttons.MacOSButton;
import com.learn.patterns.creational.abstractfactory.checkboxes.Checkbox;
import com.learn.patterns.creational.abstractfactory.checkboxes.WindowsCheckbox;

public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
