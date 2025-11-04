package com.pluralsight.week7.Portfolio;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(123, "Pam", 12500);
        Valuable account2 = new BankAccount(456, "Gary", 1500);

        // Try to deposit money into both accounts
        account1.deposit(100);
        // account2.deposit(100);  // This won't compile!

        System.out.println("account1 balance: " + account1.getBalance());
        System.out.println("account2 value: " + account2.getValue());
    }
}