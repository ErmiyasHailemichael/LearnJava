package com.pluralsight.OOPReview.classReview;

public class CalculatorsApp {
    public static void main(String[] args) {
        Calculators addingTwoInt = new Calculators(4,5);

        System.out.println("********************ADDING TWO INTEGERS");
//        addingTwoInt.add(4,5);
        System.out.println(addingTwoInt.add(4,5));
        System.out.println("********************ADDING TWO DOUBLE");
        addingTwoInt.add(4.5,6.7);
        System.out.println(addingTwoInt.add(4.5,6.7));
        System.out.println("********************ADDING THREE INTEGERS");
        addingTwoInt.add(4,5,6);
        System.out.println(addingTwoInt.add(4,5,6));

// byte → short → int → long → float → double promotion order
        // type promotion
        System.out.println("********************Mixed int and double");
        System.out.println(addingTwoInt.add(5, 5.5));
        System.out.println(addingTwoInt.add(5.5, 5));
    }
}
