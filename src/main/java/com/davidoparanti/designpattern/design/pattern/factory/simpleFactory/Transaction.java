package com.davidoparanti.designpattern.design.pattern.factory.simpleFactory;

public class Transaction {

    private Transaction transaction;
    private TransactionFactory transactionFactory;

    public Transaction() {
    }

    public Transaction(TransactionFactory transactionFactory) {
        this.transactionFactory = transactionFactory;
    }

    public Transaction performTransaction(String type) {
        transaction = transactionFactory.createTransaction(type);

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

}