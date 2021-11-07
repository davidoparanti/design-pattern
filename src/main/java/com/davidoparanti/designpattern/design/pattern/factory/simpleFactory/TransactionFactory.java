package com.davidoparanti.designpattern.design.pattern.factory.simpleFactory;

public class TransactionFactory extends Transaction{
    private Transaction transaction;

    public Transaction createTransaction(String type) {
        if (type.equals("purchase")) {
            transaction = new PurchaseTransaction(type);
        } else if (type.equals("refund")) {
            transaction = new RefundTransaction(type);
        } else if (type.equals("claim")) {
            transaction = new ClaimTransaction(type);
        }

        return transaction;
    }
}
