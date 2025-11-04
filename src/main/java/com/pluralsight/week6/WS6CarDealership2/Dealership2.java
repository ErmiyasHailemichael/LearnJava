package com.pluralsight.week6.WS6CarDealership2;

import java.util.ArrayList;
import java.util.List;

public class Dealership2 {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle2> inventory;

    public Dealership2(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();
    }

    public ArrayList<Vehicle2> getInventory() {
        return inventory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void addVehicle(Vehicle2 vehicle2){
        inventory.add(vehicle2);
    }
//ArrayList // List - ArraylIST CAN be implementation of the list, list the specific
    // search methods
    public List<Vehicle2> getVehiclesByPrice(double min, double max){
        return null;
    }

    public List<Vehicle2> getVehiclesByMakeModel(String make, String model){
        return null;
    }

    public List<Vehicle2> getVehiclesByYear(int min, int max){
        return null;
    }

    public  List<Vehicle2> getVehiclesByColor(String color){
        return null;
    }

    public List<Vehicle2> getVehiclesByMileage(int min, int max){
        return null;
    }
    public List<Vehicle2> getVehiclesByType(String vehicleType){
        return null;
    }

}
