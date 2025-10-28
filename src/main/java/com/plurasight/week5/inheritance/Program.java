package com.plurasight.week5.inheritance;

public class Program {
    public static void main(String[] args) {
        // create a new mop
        Moped moped = new Moped();
        moped.setColor("Red");
        moped.setFuelCapacity(5);
        moped.setNumberOfPassengers(2);
        moped.setCargoCapacity(5);

        Car car = new Car();
        car.setColor("Blue");
        car.setFuelCapacity(15);
        car.setNumberOfPassengers(5);
        car.setCargoCapacity(300);

        //
        SemiTruck semiTruck = new SemiTruck();
        semiTruck.setColor("Silver");
        semiTruck.setFuelCapacity(200);
        semiTruck.setNumberOfPassengers(2);
        semiTruck.setCargoCapacity(5000);

        //
        Hovercraft hovercraft = new Hovercraft();
        hovercraft.setColor("White");
        hovercraft.setFuelCapacity(100);
        hovercraft.setNumberOfPassengers(10);
        hovercraft.setCargoCapacity(1000);

        System.out.println("\nMoped color: " + moped.getColor());
        System.out.println("Moped fuel capacity: " +moped.getFuelCapacity());

        System.out.println("\nCar color: " + car.getColor());
        System.out.println("Car passengers: " + car.getNumberOfPassengers());

        System.out.println("\nSemi truck cargo capacity: " + semiTruck.getCargoCapacity());

    }
}
