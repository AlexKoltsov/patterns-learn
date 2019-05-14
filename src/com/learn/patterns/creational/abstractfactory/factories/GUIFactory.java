package com.learn.patterns.creational.abstractfactory.factories;

import com.learn.patterns.creational.abstractfactory.buttons.Button;
import com.learn.patterns.creational.abstractfactory.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
