package com.learn.patterns.creational.singleton.thread_safe;

public class ThreadSafeSingleton {

    // The field must be declared volatile so that double check lock would work.\
    private static volatile ThreadSafeSingleton instance;

    private String value;

    private ThreadSafeSingleton(String value) {
        // Following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static ThreadSafeSingleton getInstance(String value) {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton(value);
                }
            }
        }
        return instance;
    }

    public String getValue() {
        return value;
    }
}
