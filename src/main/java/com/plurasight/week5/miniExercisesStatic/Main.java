package com.plurasight.week5.miniExercisesStatic;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Cat cat1 = new Cat("Wero");
       Cat cat2 = new Cat("Demu");
       Cat cat3 = new Cat("Demet");

       int result = new MathHelper().add(3,5);



        System.out.println("Total cats created: " + Cat.catCount);
        System.out.println("The sum is: " + result);
        System.out.println("The square of the given number is: " + MathHelper.square(4));
        }
    }
