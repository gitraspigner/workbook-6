package com.pluralsight.Portfolio;
/**
 * A Bank Account is a Valuable that is not a Fixed Asset since its value changes
 * based off of its transactions. It contains the account holder's name, an account
 * number, and a balance. The balance can be modified via deposits and withdrawals.
 * The balance of the Bank Account is used to determine its value.
 *
 * @author Ravi Spigner
 */
public class BankAccount implements Valuable {
    private String name;
    private String accountNumber;
    private double balance;
    public BankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        balance -= amount;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    @Override
    public double getValue() {
        return balance;
    }
}
