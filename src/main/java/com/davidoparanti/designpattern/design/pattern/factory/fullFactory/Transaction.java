package com.davidoparanti.designpattern.design.pattern.factory.fullFactory;


public abstract class Transaction {
    private Transaction transaction;

    public Transaction performTransaction(String type) {
        transaction = createTransaction(type);

        transaction.processTransaction();
        transaction.verifyTransaction();
        transaction.approveTransaction();

        return transaction;
    }

    private void processTransaction() {
        System.out.println("Processing Transaction");
    }

    private void verifyTransaction() {
        System.out.println("Verifying Transaction");
    }

    private void approveTransaction() {
        System.out.println("Transaction Approved and closed.");
    }

    public abstract Transaction createTransaction(String type);
}
