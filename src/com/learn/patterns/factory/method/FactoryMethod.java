package com.learn.patterns.factory.method;

import com.learn.patterns.factory.method.factory.Dialog;
import com.learn.patterns.factory.method.factory.HtmlDialog;
import com.learn.patterns.factory.method.factory.WindowsDialog;

public class FactoryMethod {

    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    private static void configure() {
        if (System.getProperty("os.name").toLowerCase().contains("linux")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    private static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
