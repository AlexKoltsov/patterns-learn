package com.learn.patterns.abstractfactory.factories;

import com.learn.patterns.abstractfactory.buttons.Button;
import com.learn.patterns.abstractfactory.buttons.MacOSButton;
import com.learn.patterns.abstractfactory.checkboxes.Checkbox;
import com.learn.patterns.abstractfactory.checkboxes.WindowsCheckbox;

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
