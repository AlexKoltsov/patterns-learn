package com.learn.patterns.abstractfactory.factories;

import com.learn.patterns.abstractfactory.buttons.Button;
import com.learn.patterns.abstractfactory.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
