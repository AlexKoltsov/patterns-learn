package com.learn.patterns.abstractfactory.factories;

import com.learn.patterns.abstractfactory.buttons.Button;
import com.learn.patterns.abstractfactory.buttons.WinowsButton;
import com.learn.patterns.abstractfactory.checkboxes.Checkbox;
import com.learn.patterns.abstractfactory.checkboxes.WindowsCheckbox;

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
