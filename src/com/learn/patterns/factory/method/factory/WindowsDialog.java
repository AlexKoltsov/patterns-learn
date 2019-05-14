package com.learn.patterns.factory.method.factory;

import com.learn.patterns.factory.method.button.Button;
import com.learn.patterns.factory.method.button.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button creteButton() {
        return new WindowsButton();
    }
}
