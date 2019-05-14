package com.learn.patterns.creational.method.factory;

import com.learn.patterns.creational.method.button.Button;
import com.learn.patterns.creational.method.button.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button creteButton() {
        return new WindowsButton();
    }
}
