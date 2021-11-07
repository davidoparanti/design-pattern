package com.davidoparanti.designpattern.design.pattern.factory.simpleFactory;

public class ClaimTransaction extends Transaction {
    private String type;

    public ClaimTransaction(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ClaimTransaction{" +
                "type='" + type + '\'' +
                '}';
    }
}
