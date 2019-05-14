package com.learn.patterns.creational.method.factory;

import com.learn.patterns.creational.method.button.Button;

public abstract class Dialog {

    public void renderWindow() {
        Button button = creteButton();
        button.render();
    }

    public abstract Button creteButton();
}
