package com.davidoparanti.designpattern.design.pattern.factory.fullFactory;

public class Claim extends Transaction{
    private String type;

    public Claim() {
        this.type = "Claim";
    }

    @Override
    public Transaction createTransaction(String type) {
        return this;
    }

    @Override
    public String toString() {
        return "Claim{" +
                "type='" + type + '\'' +
                '}';
    }
}
