package com.pluralsight.Portfolio;
/**
 * A Credit Card is a Valuable that is not a Fixed Asset since its value changes
 * based off of its transactions. It contains the account holder's name, an account
 * number, and a balance. The balance can be modified via payments and charges to the
 * Credit Card. The balance of the Credit Card is used to determine its value.
 *
 * @author Ravi Spigner
 */
public class CreditCard implements Valuable {
    private String name;
    private String accountNumber;
    private double balance;
    public CreditCard(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void pay(double amount) {
        balance += amount;
    }
    public void charge(double amount) {
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
