package com.davidoparanti.designpattern.design.pattern.singleton;


/**
 * Eager initialization.
 * Highly performance but has the downside of pre-creating object we might never use.
 */
public class MyClass2 {

    private static final MyClass2 myClassInstance = new MyClass2();
    private static int count = 0;

    private MyClass2() {
        System.out.println("Creating my class Instance " + ++count);
    }

    public static  MyClass2 getInstance() {
        return myClassInstance;
    }

    @Override
    public String toString() {
        return "MyClass2{" +
                "name='" +
                '}';
    }
}
