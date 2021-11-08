package com.davidoparanti.designpattern.design.pattern.singleton;

/**
 * Lazy initialization with double-checking. This increase performance considerably.
 */
public class MyClass3 {
    /**The volatile keyword ensures that multiple threads
    handle the uniqueInstance variable correctly when it
    is being initialized to the Singleton instance. */
    private volatile static MyClass3 myClassInstance;
    private static int count = 0;

    private MyClass3() {
        System.out.println("Creating my class Instance " + ++count);
    }

    /** Check for an instance and if there isn’t one, enter a synchronized block.
     Note we only synchronize the first time through! */
    public static MyClass3 getInstance() {
        if (myClassInstance == null) {
            synchronized (MyClass3.class) {
                if (myClassInstance == null) {
                    myClassInstance = new MyClass3();
                }
            }
        }
        return myClassInstance;
    }

    @Override
    public String toString() {
        return "MyClass3{" +
                "name='" +
                '}';
    }
}
