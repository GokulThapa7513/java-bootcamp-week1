package org.example.projects.BankAccountSimulator;

public class CurrentAccount extends BankAccount{
    private double overdraftLimit;
    public CurrentAccount(double overdraftLimit, String accountHolderName, String contactNumber){
        super(accountHolderName, contactNumber);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double getWithdrawLimit() {
        return getBalance() + overdraftLimit;
    }
    @Override
    public String getAccountType() {
        return "Current";
    }

    @Override
    public String toString() {
        return super.toString() + " overdraft limit: " + overdraftLimit;
    }
}
