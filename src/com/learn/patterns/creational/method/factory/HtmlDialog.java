package com.learn.patterns.creational.method.factory;

import com.learn.patterns.creational.method.button.Button;
import com.learn.patterns.creational.method.button.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button creteButton() {
        return new HtmlButton();
    }
}
