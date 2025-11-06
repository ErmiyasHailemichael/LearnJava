package com.pluralsight.OOPReview.classReview;

public class BankAccountApp {
    public static void main(String[] args) {
        BankAccount becu = new BankAccount(100010,34000,"Solomon");
        BankAccount becu1 = new BankAccount(100011,85000,"Yemane");
        BankAccount becu2 = new BankAccount(100012,87666,"Ermiyas");

        System.out.println("*************************** GET BALANCE ***************************");

        System.out.println("You current balance " + becu.getBalance());
        System.out.println("You current balance " + becu1.getBalance());
        System.out.println( "You current balance " + becu2.getBalance());

        System.out.println("*************************** Withdrawal  ***************************");
        becu.withdraw(35000);
        becu1.withdraw(5000);
        becu2.withdraw(7666);

        System.out.println("*************************** Display Info  ***************************");
        becu.displayInfo();
        becu1.displayInfo();
        becu2.displayInfo();

        System.out.println("*************************** Deposit ***************************");
        becu.deposit(1000);
        becu1.deposit(2000);
        becu2.deposit(3000);
    }
}
