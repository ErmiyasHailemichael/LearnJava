package com.pluralsight.OOPReview.classReview;

public class Mekina {
    // encapsulation - we are hiding the data here
    private String brand;
    private String color;
    private int year;

    // constructors - create a new car using the blueprint
    public Mekina(String brand, String color, int year) {
        this.brand = brand;
        this.color = color;
        this.year = year;
    }

    // getters and setters - modifier
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // methods -
    public String start(){
        return "car is starting ...";
    }

    public String drive(){
        return this.brand + " is driving";
    }
//    String trafficColor = "Green";
    public  String stop(String trafficColor){
        if (trafficColor.equals("red")){
            System.out.println("STOP");
        } else if (trafficColor.equals("yellow")) {
            System.out.println("Prepare to stop");
        } else {
            System.out.println("It is green and you good to go");
        }
        return "trafficColor is invalid";
    }

    public String changeColor(String newColor){
        this.color = newColor;
        System.out.println("the color is changing from it original color to a new one " + this.color);
        return newColor;
    }

    public void refuel(){
        System.out.println("The car is refueling...");
    }

    public String getCarInfo(){
        return "This car brand is " + this.brand + " and it is manufactured in the year " + this.year + " and has a color " + this.color;
    }

}
