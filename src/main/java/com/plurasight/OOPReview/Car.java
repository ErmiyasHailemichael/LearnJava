package com.plurasight.OOPReview;

public class Car {
    // properties - what it has
    private String brand;
    private String model;
    private int yearOfManufactured;


    // constructors - how we create it
    public Car(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfManufactured() {
        return yearOfManufactured;
    }

    public void setYearOfManufactured(int yearOfManufactured) {
        this.yearOfManufactured = yearOfManufactured;
    }


    // Behaviors - what it can do
    public String startEngine(){
//        System.out.println("The" + brand + " " + model + "engine is starting ...");
        return "The " + brand + " " + model + "engine is starting ... and it is made in by the year " + yearOfManufactured;
    }
    public int yearOfManufactured(){
        // System.out.println("The " + brand + " " + model + "engine is starting ... and it is made in by the year" + yearOfManufactured);
        return yearOfManufactured;
    }

}

/*
* // The Class is the blueprint
public class Employee {
// Properties (what it has)
private String name;
private String jobTitle;
private double salary;
private String department;
// Constructor (how we create it)
public Employee(String name, String jobTitle) {
this.name = name;
this.jobTitle = jobTitle;
}
// Behaviors (what it can do)
public void work() {
System.out.println(name + " is working");
}
public void attendMeeting() {
System.out.println(name + " is in a meeting");
}
}
// Creating actual objects (instances)
Employee john = new Employee("John", "Developer");
Employee sarah = new Employee("Sarah", "Designer");
john.work(); // Output: John is working
* */