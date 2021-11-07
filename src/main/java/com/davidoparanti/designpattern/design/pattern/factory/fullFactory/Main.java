package com.davidoparanti.designpattern.design.pattern.factory.fullFactory;

public class Main {

    public static void main(String[] args) {
        Transaction transaction = new Refund();
        System.out.println(transaction.performTransaction("refund"));
    }
}
