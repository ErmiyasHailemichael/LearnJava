package com.pluralsight.OOPReview.classReview;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String ownerName;

    public BankAccount(int accountNumber, double balance, String ownerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerName = ownerName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
// methods
    public void deposit(double amount){
         balance =  this.balance + amount;
        System.out.println("After depositing: " + balance);
    }
    public void withdraw(double amount){

        if (balance >= amount){
//            double amount = 0;
            balance = balance - amount;
            System.out.println("You withdraw " + amount + " amount from your balance");
        } else{
            System.out.println("Insufficient funds");
        }
    }

    public void displayInfo(){
        System.out.println("Account info: " + accountNumber + "\n" + balance + "\n" + ownerName);
    }
}
