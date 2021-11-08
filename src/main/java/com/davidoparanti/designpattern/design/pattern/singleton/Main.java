package com.davidoparanti.designpattern.design.pattern.singleton;

public class Main {

    public static void main(String[] args) {
        MyClass myClass =  MyClass.getInstance();
        System.out.println(myClass);
        MyClass myClass1 = MyClass.getInstance();
        System.out.println(myClass1);

        MyClass2 myClass3 =  MyClass2.getInstance();
        System.out.println(myClass3);
        MyClass2 myClass4 = MyClass2.getInstance();
        System.out.println(myClass4);

    }
}
