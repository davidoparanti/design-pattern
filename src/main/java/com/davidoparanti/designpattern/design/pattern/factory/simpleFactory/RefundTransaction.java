package com.davidoparanti.designpattern.design.pattern.factory.simpleFactory;

public class RefundTransaction extends Transaction {
    private String type;

    public RefundTransaction(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "RefundTransaction{" +
                "type='" + type + '\'' +
                '}';
    }
}
