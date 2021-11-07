package com.davidoparanti.designpattern.design.pattern.factory.simpleFactory;

public class PurchaseTransaction extends Transaction {
    private String type;

    public PurchaseTransaction(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "PurchaseTransaction{" +
                "type='" + type + '\'' +
                '}';
    }
}
