package org.example.projects.BankAccountSimulator;

import java.util.ArrayList;

public abstract class BankAccount {
    private static int accountCounter = 1000;
    private String accountNumber;
    private String accountHolderName;
    private String contactNumber;
    private double balance;
    private ArrayList<Transaction> transactions;

    public BankAccount(String accountHolderName, String contactNumber) {
        this.accountNumber = generateAccountNumber();
        this.accountHolderName = accountHolderName;
        this.contactNumber = contactNumber;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    public static String generateAccountNumber() {
        accountCounter++;
        return "ACC-" + accountCounter;
    }
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            transactions.add(new Transaction("DEPOSIT", amount, balance, "Deposit to account"));
            System.out.println("Amount: " + amount +  " deposited successfully");
        }else {
            System.out.println("Invalid amount. Please enter a value greater than 0.");
        }
    }

    public void withdraw(double amount) {
        if(amount > 0 && amount <= getWithdrawLimit()) {
            balance -= amount;
            transactions.add(new Transaction("WITHDRAW", amount, balance, "Withdraw from account"));
            System.out.println("Amount: " + amount + "withdrawn successfully");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void printTransactionHistory(){
        if(transactions.isEmpty()) {
            System.out.println("No transactions yet");
        }else {
            for(Transaction t : transactions) {
                System.out.println(t);
            }
        }
    }

    public abstract double getWithdrawLimit();
    public abstract String getAccountType();

    @Override
    public String toString() {
        return "Account Number: " + accountNumber
                + " Name: " + accountHolderName
                + " Type: " + getAccountType()
                + " Contact: " + contactNumber
                + " Balance: " + balance;
    }
}
