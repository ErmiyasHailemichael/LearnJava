package com.pluralsight.week7.Portfolio;

public class BankAccount implements Valuable{
    private String name;
    private String accountNumber;
    private double balance;

    public BankAccount(int accountNumber, String name, double balance) {
        this.accountNumber = String.valueOf(accountNumber);
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    @Override
    public double getValue() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
}
