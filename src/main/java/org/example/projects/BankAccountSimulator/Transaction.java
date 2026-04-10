package org.example.projects.BankAccountSimulator;

public class Transaction {
    private String type;
    private double amount;
    private double balanceAfter;
    private String description;

    public Transaction(String type, double amount, double balanceAfter, String description) {
        this.type = type;
        this.amount = amount;
        this.balanceAfter = balanceAfter;
        this.description = description;
    }
    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalanceAfter() {
        return balanceAfter;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "[" + type + "] " + amount + " |" + " Balance after: " + balanceAfter + " |" + description;
    }
}
