package org.example.projects.BankAccountSimulator;

public class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(double interestRate, String accountHolderName, String contactNumber) {
        super(accountHolderName, contactNumber);
        this.interestRate = interestRate;
    }

    @Override
    public double getWithdrawLimit() {
        return getBalance();
    }

    @Override
    public String getAccountType() {
        return "SAVINGS";
    }
    public void applyInterest() {
        double interest = getBalance() * (interestRate/100);
        deposit(interest);
    }

    @Override
    public String toString() {
        return super.toString() + " interest rate: " + interestRate;
    }
}
