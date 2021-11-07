package com.davidoparanti.designpattern.design.pattern.factory.simpleFactory;

public class Main {

    public static void main(String[] args) {
        TransactionFactory transactionFactory = new TransactionFactory();
        Transaction transaction = new Transaction(transactionFactory);
        System.out.println(transaction.performTransaction("claim"));
    }
}
