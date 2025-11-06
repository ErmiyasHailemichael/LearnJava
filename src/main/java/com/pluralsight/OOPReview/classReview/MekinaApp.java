package com.pluralsight.OOPReview.classReview;

public class MekinaApp {
    public static void main(String[] args) {
        Mekina car1 = new Mekina("Honda","Gray", 2019,false);
        Mekina car2 = new Mekina("Toyota", "Silver", 2014,true);

        car1.start();
        car1.drive();
        car1.stop("yellow");
        car1.changeColor("YELLOW");
        car2.refuel();
        car2.getCarInfo();

        System.out.println(car2.getCarInfo());

        System.out.println(car1.start());
        System.out.println(car1.drive());


    }
}
