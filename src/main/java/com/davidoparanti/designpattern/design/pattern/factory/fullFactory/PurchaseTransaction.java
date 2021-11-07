package com.davidoparanti.designpattern.design.pattern.factory.fullFactory;

public class PurchaseTransaction extends Transaction {
    private final String type = "Purchase";



    @Override
    public Transaction createTransaction(String type) {
        return this;
    }

    @Override
    public String toString() {
        return "PurchaseTransaction{" +
                "type='" + type + '\'' +
                '}';
    }
}
