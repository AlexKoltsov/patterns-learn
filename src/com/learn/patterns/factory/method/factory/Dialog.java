package com.learn.patterns.factory.method.factory;

import com.learn.patterns.factory.method.button.Button;

public abstract class Dialog {

    public void renderWindow() {
        Button button = creteButton();
        button.render();
    }

    public abstract Button creteButton();
}
