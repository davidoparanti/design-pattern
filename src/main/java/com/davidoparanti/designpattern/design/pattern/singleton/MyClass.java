package com.davidoparanti.designpattern.design.pattern.singleton;

/**
 * Lazy initialization
 * Thread safe
 * Performance overhead.
 */
public class MyClass {

    private static MyClass myClassInstance;
    private static int count = 0;

    private MyClass() {
        System.out.println("Creating my class Instance " + ++count);
    }

    public static synchronized MyClass getInstance() {
        if (myClassInstance == null) {
            myClassInstance = new MyClass();
        }

        return myClassInstance;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "name='" +
                '}';
    }
}
