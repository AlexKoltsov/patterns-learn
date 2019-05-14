package com.learn.patterns.factory.method.factory;

import com.learn.patterns.factory.method.button.Button;
import com.learn.patterns.factory.method.button.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button creteButton() {
        return new HtmlButton();
    }
}
