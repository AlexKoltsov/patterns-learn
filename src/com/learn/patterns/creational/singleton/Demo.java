package com.learn.patterns.creational.singleton;


import com.learn.patterns.creational.singleton.non_thread_safe.Singleton;
import com.learn.patterns.creational.singleton.thread_safe.ThreadSafeSingleton;

public class Demo {

    public static void main(String[] args) {
        // Comment/uncomment examples
//        naiveSingletonOneThreadExample();
//        naiveSingletonMultyThreadExample();
        threadSafeSingletonExample();
    }

    private static void naiveSingletonMultyThreadExample() {
        Thread threadFoo = new Thread(() -> System.out.println(Singleton.getInstance("FOO").getValue()));
        Thread threadBar = new Thread(() -> System.out.println(Singleton.getInstance("BAR").getValue()));
        threadFoo.start();
        threadBar.start();
    }

    private static void naiveSingletonOneThreadExample() {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:");
        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");
        System.out.println(singleton.getValue());
        System.out.println(anotherSingleton.getValue());
    }

    private static void threadSafeSingletonExample() {
        Thread threadFoo = new Thread(() -> System.out.println(ThreadSafeSingleton.getInstance("FOO").getValue()));
        Thread threadBar = new Thread(() -> System.out.println(ThreadSafeSingleton.getInstance("BAR").getValue()));
        threadFoo.start();
        threadBar.start();
    }
}
