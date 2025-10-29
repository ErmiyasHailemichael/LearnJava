package com.pluralsight.OOPReview;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Car("Honda", "Civic");
        Car car1 = new Car("Toyota","RAV4");
        System.out.println(car.startEngine());
//        System.out.println(car1);
    }
}
