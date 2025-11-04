package com.pluralsight.Portfolio;
/**
 * This class only contains tests from workbook 6 - portfolio exercise - part 2.
 * It tests classes and the interface Valuable implemented as part of the (financial)
 * Portfolio exercise.
 *
 * @author Ravi Spigner
 */
public class FinanceApplication {
    public static void main(String[] args) {
        //"add the following code to the main method"
        BankAccount account1 = new BankAccount("Pam", "123", 12500);
        //below fails since account2 is of type Valuable which is an interface
        //and cannot be instantiated
        //Valuable account2 = new BankAccount(456, "Gary", 1500);
        //"try to deposit money into both accounts"
        System.out.println("account 1 name: " + account1.getName() +
                " account number: " + account1.getAccountNumber() +
                "balance: " + account1.getValue());
        account1.deposit(100);
        System.out.println("****Deposited $100 to account 1.****");
        System.out.println("account 1 name: " + account1.getName() +
                " account number: " + account1.getAccountNumber() +
                "balance: " + account1.getValue());
        //below fails since account2 is of type Valuable which is an interface
        //and does not have a deposit method implemented
        //account2.deposit(100);
    }
}
