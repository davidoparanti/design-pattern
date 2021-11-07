package com.davidoparanti.designpattern.design.pattern.factory.fullFactory;

public class Refund extends Transaction{
    private String type;

    public Refund() {
        this.type = "Refund";
    }

    @Override
    public Transaction createTransaction(String type) {
        return this;
    }

    @Override
    public String toString() {
        return "Refund{" +
                "type='" + type + '\'' +
                '}';
    }
}
